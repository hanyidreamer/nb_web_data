package com.elong.nb.service.impl;

import java.text.MessageFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.annotation.Resource;

import org.apache.http.client.utils.DateUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.elong.nb.bookingdata.thread.InventoryThread;
import com.elong.nb.bookingdata.thread.RatePlanThread;
import com.elong.nb.bookingdata.thread.RateThread;
import com.elong.nb.bookingdata.thread.RealTimeInvCheckThread;
import com.elong.nb.cache.ICacheKey;
import com.elong.nb.cache.RedisManager;
import com.elong.nb.common.gson.DateTypeAdapter;
import com.elong.nb.common.gson.GsonUtil;
import com.elong.nb.common.model.ErrorCode;
import com.elong.nb.common.model.RedisKeyConst;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.common.util.CommonsUtil;
import com.elong.nb.dao.adapter.repository.EffectiveStatusRepository;
import com.elong.nb.dao.adapter.repository.ProductForMisServiceRepository;
import com.elong.nb.dao.adapter.repository.RatePlanRepository;
import com.elong.nb.model.HotelDetailRequest;
import com.elong.nb.model.HotelListResponse;
import com.elong.nb.model.bean.BookingRule;
import com.elong.nb.model.bean.DrrRule;
import com.elong.nb.model.bean.GuaranteeRule;
import com.elong.nb.model.bean.Hotel;
import com.elong.nb.model.bean.Inventory;
import com.elong.nb.model.bean.ListRatePlan;
import com.elong.nb.model.bean.PrepayRule;
import com.elong.nb.model.bean.ValueAdd;
import com.elong.nb.model.bean.base.BaseBookingRule;
import com.elong.nb.model.bean.detail.NightlyRate;
import com.elong.nb.model.bean.enums.EnumPaymentType;
import com.elong.nb.model.bookingdata.BookingDataCondition;
import com.elong.nb.model.bookingdata.BookingDataResult;
import com.elong.nb.model.bookingdata.CheckMinitor;
import com.elong.nb.model.bookingdata.ObjectEffectiveStatus;
import com.elong.nb.model.bookingdata.OrderFromResult;
import com.elong.nb.model.effectivestatuscheck.EffectiveStatus;
import com.elong.nb.model.rate.bean.Rate;
import com.elong.nb.model.rateplan.GiftForRP;
import com.elong.nb.model.rateplan.HotelRatePlan;
import com.elong.nb.model.rateplan.RatePlan;
import com.elong.nb.service.IBookingDataService;
import com.elong.nb.service.IInventoryService;
import com.elong.nb.service.IRatePlansService;
import com.elong.nb.util.DateUtil;
import com.elong.nb.util.HttpUtil;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

@Service
public class BookingDataService implements IBookingDataService {

	private static Logger logger = LogManager.getLogger("biglog");
	private Gson gson = new Gson();
	private static final RedisManager redis = RedisManager.getInstance("redis_job", "redis_job");

	@Resource
	private EffectiveStatusRepository effectiveStatusRepository;
	@Resource
	private IRatePlansService ratePlanService;
	@Resource
	private ProductForMisServiceRepository productForMisServiceRepository;
	@Resource
	private RateService rateService;
	@Resource
	private IInventoryService inventoryService;

	@Override
	public RestResponse<BookingDataResult> getBookingData(RestRequest<BookingDataCondition> request) {
		RestResponse<BookingDataResult> result = new RestResponse<BookingDataResult>(request.getGuid());
		result.setResult(new BookingDataResult());

		try {
			boolean isUseRPInSearch = CommonsUtil.CONFIG_PROVIDAR.getProperty("hotel.data.validate.use_detail").equals("1");

			boolean isInstantConfirmInSearch = true;
			boolean isHaveSearchResult = true;

			// #region 参数校验
			StringBuilder errorCode = new StringBuilder();

			Date now=DateUtil.getDate(new Date());
			Calendar cdDeparture = Calendar.getInstance();
			cdDeparture.add(Calendar.DATE, 1);

			if (request.getVersion() < 1.13) {
				errorCode.append(MessageFormat.format(ErrorCode.Common_VersionToLow, 1.13));
			} else if (request.getRequest().getPaymentType() == EnumPaymentType.All) {
				errorCode.append(ErrorCode.Common_PaymentTypeRequired);
			} else if (request.getRequest().getArrivalDate().getTime()<DateUtil.addDays(now, -1).getTime()) {
				errorCode.append(ErrorCode.Search_ArrivalDateRangeInvalid);
			} else if (request.getRequest().getDepartureDate().getTime()<DateUtil.addDays(request.getRequest().getArrivalDate(),1).getTime()) {
				errorCode.append(ErrorCode.Search_DepartureDateRangeInvalid);
			}

			if (errorCode != null && !errorCode.toString().isEmpty()) {
				result.setCode(errorCode.toString());
				result.setResult(null);
				return result;
			}
			// #endregion 参数校验

			ExecutorService taskFactory = Executors.newFixedThreadPool(10);
			Hotel hotelInfoFromSearch = null;
			ListRatePlan rpOfSearch = null;

			// #region 调用detail接口, 判断产品是否存在，并有关联
			// #region 转化为detail参数
			RestRequest<HotelDetailRequest> detailreq = new RestRequest<HotelDetailRequest>();

			detailreq.setGuid(request.getGuid());
			detailreq.setLocal(request.getLocal());
			detailreq.setVersion(request.getVersion());
			detailreq.setProxyInfo(request.getProxyInfo());

			// Request = new HotelDetailCondition
			HotelDetailRequest Request = new HotelDetailRequest();

			Request.setArrivalDate(request.getRequest().getArrivalDate());
			Request.setDepartureDate(request.getRequest().getDepartureDate());
			Request.setHotelIds(request.getRequest().getHotelId());
			Request.setOptions("0");// （仅单酒店有效）0.无1.酒店详情2.房型3.图片
			Request.setRatePlanId(request.getRequest().getRatePlanId());
			Request.setRoomTypeId(request.getRequest().getRoomTypeId());
			Request.setPaymentType(request.getRequest().getPaymentType());
			detailreq.setRequest(Request);
			// #endregion

			RestResponse<HotelListResponse> detailres = new RestResponse<HotelListResponse>(request.getGuid());
			int time = 2;
			// 遇到搜索不返回产品的时候，如果是异常，则重试一次。
			while (time > 0) {
				// detailres = IHotelManager.GetHotelDetailFromWCF(detailreq);

				// String url
				// ="http://nbapi-searchhd.vip.elong.com/OpenApiWeb/api/Hotel/InnerDetail";
				String url = CommonsUtil.CONFIG_PROVIDAR.getProperty("InnerDetail.url");

				// String data = gson.toJson(detailreq, new
				// TypeToken<RestRequest<HotelDetailRequest>>(){}.getType());
				String data = GsonUtil.toJson(detailreq, 1.26);
				String responseStr ="";
				try{
					responseStr = HttpUtil.httpPost(url, data);
				}catch(Exception ex){
					time--;
					if(time>0){
						continue;
					}else{
						throw new RuntimeException(ex);
					}
				}
				// detailres = gson.fromJson(responseStr, new
				// TypeToken<RestResponse<HotelListResponse>>() { }.getType());

				Map<Class, TypeAdapter> m = new HashMap<Class, TypeAdapter>();
				m.put(Date.class, new DateTypeAdapter());
				detailres = GsonUtil.toResponse(responseStr, new TypeToken<RestResponse<HotelListResponse>>() {
				}.getType(), m);

				if (detailres != null && detailres.getCode().equals("0")) {
					break;
				}
				time--;
			}

			if (detailres == null || !detailres.getCode().equals("0")) {
				if (detailres != null)
					result.setCode(detailres.getCode());
				result.setResult(null);
				return result;
			} else {
				if (detailres != null && detailres.getResult() != null && detailres.getResult().getCount() > 0
						&& detailres.getResult().getHotels() != null && detailres.getResult().getHotels().size() > 0
						&& detailres.getResult().getHotels().get(0).getRooms() != null
						&& detailres.getResult().getHotels().get(0).getRooms().size() > 0
						&& detailres.getResult().getHotels().get(0).getRooms().get(0).getRatePlans() != null
						&& detailres.getResult().getHotels().get(0).getRooms().get(0).getRatePlans().size() > 0
						&& detailres.getResult().getHotels().get(0).getRooms().get(0).getRatePlans().get(0).getAverageRate() > 0 // 平均价格大于0这个条件还是必要的
				) {
					hotelInfoFromSearch = detailres.getResult().getHotels().get(0);
					isInstantConfirmInSearch = detailres.getResult().getHotels().get(0).getRooms().get(0).getRatePlans().get(0)
							.isInstantConfirmation();
					rpOfSearch = hotelInfoFromSearch.getRooms().get(0).getRatePlans().get(0);
				} else {
					// 如果是找不到产品，则请求酒店组的对象接口
					isHaveSearchResult = false;
					EffectiveStatus effectiveStatus = effectiveStatusRepository.GetEffectiveStatus(request.getRequest().getHotelId(),
							request.getRequest().getRoomTypeId(), request.getRequest().getRatePlanId(), request.getRequest()
									.getArrivalDate(), request.getRequest().getDepartureDate(), errorCode, 1);// ref
																												// errorCode);

					if (errorCode.toString().equals("0") && effectiveStatus != null) {
						ObjectEffectiveStatus objectStatus = new ObjectEffectiveStatus();
						{
							objectStatus.setHotelIdStatus(effectiveStatus.getMhotelStatus() == 0);
							objectStatus.setHotelCodeStatus(effectiveStatus.getShotelStatus() == 0);
							objectStatus.setRoomTypeStatus(effectiveStatus.getSroomStatus() == 1);
							objectStatus.setRoomStatus(effectiveStatus.getMroomStatus() == 1);
							objectStatus.setProductRelation(effectiveStatus.getSroomRatePlanRelation() == 1);
							objectStatus.setRatePlanStaus(effectiveStatus.getRatePlanStaus() == 1);
						}
						;

						if (result.getResult() == null)
							result.setResult(new BookingDataResult());
						result.getResult().setObjectEffectiveStatus(objectStatus);

						if (effectiveStatus.getMhotelStatus() != 0 || effectiveStatus.getMroomStatus() != 1
								|| effectiveStatus.getRatePlanStaus() != 1 || effectiveStatus.getShotelStatus() != 0
								|| effectiveStatus.getSroomStatus() != 1 || effectiveStatus.getSroomRatePlanRelation() != 1) {
							result.setCode(ErrorCode.Order_ObjectStatusInvalid);
							return result;
						}
						// if (isUseRPInSearch)
						// {
						// result.Code = ErrorCode.Order_HotelNotInService +
						// "(S)";
						// result.Result = null;
						// return result;
						// }
					} else {
						result.setCode(ErrorCode.Order_ObjectRelationError);
						return result;
					}
				}
			}
			// #endregion

			// RatePlan
			// 使用搜索的返回结果,如果搜索返回结果是空则查询rp接口
			Future<Object> rateplanTask = null;
			if (!isUseRPInSearch || !isHaveSearchResult) {
				rateplanTask = taskFactory.submit(new RatePlanThread(request, ratePlanService));
			}

			// Inventory
			Future<Object> invTask = taskFactory.submit(new InventoryThread(request, inventoryService, isInstantConfirmInSearch));

			// end Inventory

			// Inventory Realtime Check
			boolean realtimeInvAvailable = true;
			// string realtimeInvCheckSwitcher =
			// ConfigService.GetAppServerConfig("hotel.booking.realtime.checkinv",
			// "0");
			String realtimeInvCheckSwitcher = CommonsUtil.CONFIG_PROVIDAR.getProperty("hotel.booking.realtime.checkinv");
			Future<Object> invRealTimeTask = null;
			if (realtimeInvCheckSwitcher.equals("1")) {
				invRealTimeTask = taskFactory.submit(new RealTimeInvCheckThread(request, productForMisServiceRepository));
			}
			// #region Rate
			// 如果是返回drr计算后的价格，从detail接口拿rate数据
			Future<Object> rateTask = null;
			if (request.getRequest().isIsRatesWithDRR()) {
				// 放在下面处理
			} else {
				rateTask = taskFactory.submit(new RateThread(request, rateService));
			}
			// #region 产品、库存和价格的结果处理
			List<Exception> exceptions = new LinkedList<Exception>();
			taskFactory.shutdown();
			if (rateTask != null) {
				Object obj = rateTask.get();
				if (obj != null)
					result.getResult().setRates((List<Rate>) obj);
			}
			if (invTask != null) {
				Object obj = invTask.get();
				if (obj != null)
					result.getResult().setInventories((List<com.elong.nb.model.bean.Inventory>) obj);
			}
			if (invRealTimeTask != null) {
				Object obj = invRealTimeTask.get();
				if (obj != null)
					realtimeInvAvailable = (boolean) obj;
			}

			if (rateplanTask != null) {
				Object obj = rateplanTask.get();
				if (obj != null) {
					HotelRatePlan hotel = (HotelRatePlan) obj;
					if (hotel != null && hotel.getRatePlans() != null && hotel.getRatePlans().size() > 0) {
						try {
							for (RatePlan x : hotel.getRatePlans()) {
								if (x.getRatePlanId() == request.getRequest().getRatePlanId()) {
									result.getResult().setRatePlan(x);
								}
							}

							if (result.getResult().getRatePlan() != null && hotel.getSuppliers() != null && hotel.getSuppliers().size() > 0) {
								result.getResult().setBookingRules(hotel.getSuppliers().get(0).getBookingRules());
								result.getResult().setWeekendStart(hotel.getSuppliers().get(0).getWeekendStart());
								result.getResult().setWeekendEnd(hotel.getSuppliers().get(0).getWeekendEnd());
							}
						} catch (Exception ex) {
							logger.error(ex.getMessage());
						}
					}
				}
			}

			// #region 产品信息
			if (isUseRPInSearch && isHaveSearchResult && rpOfSearch != null) {
				RatePlan rp = new RatePlan();
				{
					rp.setBookingChannels(rpOfSearch.getBookingChannels());
					rp.setCoupon(null);
					rp.setCustomerType(rpOfSearch.getCustomerType());
					rp.setDrrRules(new LinkedList<com.elong.nb.model.bean.base.BaseDrrRule>());
					rp.setEndTime(rpOfSearch.getEndTime());
					rp.setGifts(new LinkedList<GiftForRP>());
					rp.setGuaranteeRules(new LinkedList<com.elong.nb.model.bean.base.BaseGuaranteeRule>());
					rp.setHotelCode(rpOfSearch.getHotelCode());
					rp.setIsLimitTimeSale(rpOfSearch.isIsLastMinuteSale());

					Integer max = rpOfSearch.getMaxAdvHours();
					if (max == null)
						max = 0;
					rp.setMaxAdvHours(max > 0 ? rpOfSearch.getMaxAdvHours() : 365 * 24);
					rp.setMaxDays(rpOfSearch.getMaxDays());

					Integer min = rpOfSearch.getMinAdvHours();
					if (min == null)
						min = 0;
					rp.setMinAdvHours(min > 0 ? rpOfSearch.getMinAdvHours() : 0);

					rp.setMinAmount(rpOfSearch.getMinAmount());
					rp.setMinDays(rpOfSearch.getMinDays());
					rp.setPaymentType(rpOfSearch.getPaymentType());
					rp.setPrepayRules(new LinkedList<com.elong.nb.model.bean.base.BasePrepayRule>());
					rp.setProductTypes(rpOfSearch.getProductTypes());
					rp.setRatePlanId(rpOfSearch.getRatePlanId());
					rp.setRatePlanName(rpOfSearch.getRatePlanName());
					rp.setRoomTypeIds(rpOfSearch.getRoomTypeId());
					rp.setStartTime(rpOfSearch.getStartTime());
					rp.setValueAdds(new LinkedList<com.elong.nb.model.bean.base.BaseValueAddRule>());

				}
				;

				// #region rules

				// GuaranteeRules
				if (rpOfSearch.getPaymentType() == EnumPaymentType.SelfPay) {
					if (rpOfSearch.getGuaranteeRuleIds() != null && !rpOfSearch.getGuaranteeRuleIds().isEmpty()) {
						GuaranteeRule g = null;
						// hotelInfoFromSearch.GuaranteeRules.FirstOrDefault(x
						// => x.GuranteeRuleId ==
						// int.Parse(rpOfSearch.GuaranteeRuleIds));
						for (GuaranteeRule ru : hotelInfoFromSearch.getGuaranteeRules()) {
							if (ru.getGuranteeRuleId() == Integer.parseInt(rpOfSearch.getGuaranteeRuleIds()))
								g = ru;
						}
						if (g != null) {
							rp.getGuaranteeRules().add(g);
						}
					}
				} else if (rpOfSearch.getPrepayRuleIds() != null && !rpOfSearch.getPrepayRuleIds().isEmpty()) // PrepayRules
				{
					PrepayRule g = null;
					// hotelInfoFromSearch.PrepayRules.FirstOrDefault(x =>
					// x.PrepayRuleId == int.Parse(rpOfSearch.PrepayRuleIds));
					for (PrepayRule pr : hotelInfoFromSearch.getPrepayRules()) {
						if (pr.getPrepayRuleId() == Integer.parseInt(rpOfSearch.getPrepayRuleIds()))
							g = pr;
					}
					if (g != null) {
						rp.getPrepayRules().add(g);
					}
				}

				// ValueAdds
				if (rpOfSearch.getValueAddIds() != null && !rpOfSearch.getValueAddIds().isEmpty()) {
					String[] ids = rpOfSearch.getValueAddIds().split(",");// new
																			// char[]
																			// {
																			// ','
																			// },
																			// StringSplitOptions.RemoveEmptyEntries);
					for (String id : ids) {
						ValueAdd v = null;
						// hotelInfoFromSearch.ValueAdds.FirstOrDefault(x =>
						// x.ValueAddId == id);
						for (ValueAdd va : hotelInfoFromSearch.getValueAdds()) {
							if (va.getValueAddId() == id)
								v = va;
						}
						if (v != null) {
							rp.getValueAdds().add(v);
						}
					}
				}

				// BookingRules
				List<BaseBookingRule> bookingRules = new LinkedList<BaseBookingRule>();
				if (rpOfSearch.getBookingRuleIds() != null && !rpOfSearch.getBookingRuleIds().isEmpty()) {
					String[] ids = rpOfSearch.getBookingRuleIds().split(",");// new
																				// char[]
																				// {
																				// ','
																				// },
																				// StringSplitOptions.RemoveEmptyEntries);
					for (String id : ids) {
						BookingRule v = null;
						// hotelInfoFromSearch.BookingRules.FirstOrDefault(x =>
						// x.BookingRuleId == long.Parse(id));
						for (BookingRule br : hotelInfoFromSearch.getBookingRules()) {
							if (br.getBookingRuleId() == Long.parseLong(id))
								v = br;
						}
						if (v != null) {
							bookingRules.add(v);
						}
					}
				}

				// DrrRules
				if (rpOfSearch.getDrrRuleIds() != null && !rpOfSearch.getDrrRuleIds().isEmpty()) {
					String[] ids = rpOfSearch.getDrrRuleIds().split(",");// new
																			// char[]
																			// {
																			// ','
																			// },
																			// StringSplitOptions.RemoveEmptyEntries);
					for (String id : ids) {
						DrrRule v = null;
						// hotelInfoFromSearch.DrrRules.FirstOrDefault(x =>
						// x.DrrRuleId == int.Parse(id));
						for (DrrRule dr : hotelInfoFromSearch.getDrrRules()) {
							if (dr.getDrrRuleId() == Integer.parseInt(id))
								v = dr;
						}
						if (v != null) {
							rp.getDrrRules().add(v);
						}
					}
				}

				// #endregion

				result.getResult().setRatePlan(rp);
				result.getResult().setBookingRules(bookingRules);

				Integer WeekendStart = rpOfSearch.getWeekendStart();
				if (WeekendStart == null)
					WeekendStart = 0;
				result.getResult().setWeekendStart(WeekendStart);

				Integer WeekendEnd = rpOfSearch.getWeekendEnd();
				if (WeekendEnd == null)
					WeekendEnd = 0;
				result.getResult().setWeekendEnd(WeekendEnd);
			}
			// #endregion 产品信息

			if (taskFactory.isTerminated()) {
				if (exceptions.size() > 0) {
					result.setResult(null);
					result.setCode(ErrorCode.Common_SystemException + exceptions.get(0).getMessage());
				} else if (result.getResult().getRatePlan() == null) {
					result.setCode(ErrorCode.Order_CanNotFindRatePlan);
				} else {
					if (!realtimeInvAvailable) {
						if (result.getResult().getInventories() != null && result.getResult().getInventories().size() > 0) {
							int count = 0;
							for (Inventory inv : result.getResult().getInventories()) {
								if (!inv.isStatus()) {
									count++;
								}
							}

							if (count == 0) {
								result.getResult().getInventories().get(0).setStatus(false);
								result.getResult().getInventories().get(0).setAvailableAmount(-1);
							}
						}
					}

					// #region 价格对象处理
					if (request.getRequest().isIsRatesWithDRR() && isHaveSearchResult && rpOfSearch != null) {
						// 检查库存是否可用
						boolean inventoryAvailable = false;
						if (result.getResult().getInventories() != null && result.getResult().getInventories().size() > 0) {
							int count = 0;
							for (Inventory inv : result.getResult().getInventories()) {
								if (!inv.isStatus()) {
									count++;
								}
							}
							if (count == 0)
								inventoryAvailable = true;
						}

						List<Rate> rateList = new LinkedList<Rate>();
						for (NightlyRate nr : rpOfSearch.getNightlyRates()) {
							Rate r = new Rate();
							r.setAddBed(nr.getAddBed());
							r.setCurrencyCode(rpOfSearch.getCurrencyCode().getValue() + "");
							r.setEndDate(nr.getDate());
							r.setHotelCode(rpOfSearch.getHotelCode());
							r.setHotelID(hotelInfoFromSearch.getHotelId());
							r.setMember(nr.getMember());
							r.setMemberCost(nr.getCost());
							r.setPriceID(0l);
							r.setRateplanId(rpOfSearch.getRatePlanId());
							r.setRoomTypeId(rpOfSearch.getRoomTypeId());
							r.setStartDate(nr.getDate());
							r.setStatus(inventoryAvailable ? nr.isStatus() : true);
							r.setWeekend(nr.getMember());
							r.setWeekendCost(nr.getCost());
							rateList.add(r);
						}
						result.getResult().setRates(rateList);
					}
					// #endregion
				}
			} else {
				result.setCode(ErrorCode.Common_SystemException + ": 内部请求数据超时,请重试");
			}
			// #endregion 产品、库存和价格的结果处理
		} catch (Exception ex) {
			result.setCode(ErrorCode.Common_SystemException + ": " + ex.getMessage());
		} finally {
			// 可定性检查
			int roomNightsCount = 0;
			if (request.getRequest() != null && request.getRequest().getArrivalDate() != null
					&& request.getRequest().getDepartureDate() != null) {
				Calendar nowDate = Calendar.getInstance();
				Calendar oldDate = Calendar.getInstance();
				nowDate.setTime(request.getRequest().getDepartureDate());// 设置为当前系统时间
				oldDate.setTime(request.getRequest().getArrivalDate());// 设置为1990年（6）月29日
				long timeNow = nowDate.getTimeInMillis();
				long timeOld = oldDate.getTimeInMillis();
				long days = (timeNow - timeOld) / (1000 * 60 * 60 * 24);// 化为天
				roomNightsCount = (int) days * 1;
			}
			bookingOrderCheckMinitor(request, result, roomNightsCount);
		}
		return result;
	}

	public void CheckBookingDataResult(RestResponse<BookingDataResult> result, StringBuilder checkOrderResult) {
		if (result != null && result.getResult() != null) {
			boolean isAvaliableInv = true;
			boolean isAvaliableRate = true;
			if (result.getResult().getInventories() != null && result.getResult().getInventories().size() > 0) {
				for (Inventory inv : result.getResult().getInventories()) {
					if (inv.isStatus() == false)
						isAvaliableInv = false;
				}
			}
			if (result.getResult().getRates() != null && result.getResult().getRates().size() > 0) {
				for (Rate rate : result.getResult().getRates()) {
					if (rate.getStatus() == false)
						isAvaliableRate = false;
				}
			}
			if (result.getResult().getRatePlan() == null) {
				checkOrderResult.append(ErrorCode.Order_CanNotFindRatePlan);
			} else if (result.getResult().getInventories() == null || result.getResult().getInventories().size() == 0 || !isAvaliableInv) {
				checkOrderResult.append(ErrorCode.Order_CheckInventory);
			} else if (result.getResult().getRates() == null || result.getResult().getRates().size() == 0 || !isAvaliableRate) {
				checkOrderResult.append(ErrorCode.Order_CheckRate);
			}
		}
	}

	public void bookingOrderCheckMinitor(RestRequest<BookingDataCondition> request, RestResponse<BookingDataResult> result, int count) {
		OrderCheckMinitor(request, result, count);
	}

	public void OrderCheckMinitor(RestRequest<BookingDataCondition> request, RestResponse<BookingDataResult> result, int roomNightsCount) {
		// 开关控制可定性检查
		String minitor = CommonsUtil.CONFIG_PROVIDAR.getProperty("hotel.order.minitor");
		if (minitor.equals("1")) {
			{
				try {
					StringBuilder checkResult = new StringBuilder();

					RestResponse<BookingDataResult> bookingDataResult = new RestResponse<BookingDataResult>(request.getGuid());
					bookingDataResult = result;
					CheckBookingDataResult(bookingDataResult, checkResult);

					CheckMinitor checkMinitor = new CheckMinitor();
					checkMinitor.setAgentId(request.getProxyInfo().getOrderFrom().toString());
					checkMinitor.setAgentName(GetOrderFromProjectName(request.getProxyInfo().getOrderFrom()));
					checkMinitor.setOrderCheckTime(DateUtils.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
					checkMinitor.setRoomNightsCount(roomNightsCount + "");
					String checkJson;
					if (result.getCode() != "0" || !checkResult.toString().isEmpty()) {
						checkMinitor.setOrderCheckStatus("N");
						if (result.getCode() != "0") {
							checkMinitor.setOrderCheckCode(result.getCode().split("\\|")[0]);
							checkMinitor.setCheckFailureReason(result.getCode());
						} else {
							checkMinitor.setOrderCheckCode(checkResult.toString().split("\\|")[0]);
							checkMinitor.setCheckFailureReason(checkResult.toString());
						}
					} else {
						checkMinitor.setOrderCheckStatus("Y");
					}
					checkJson = gson.toJson(checkMinitor);
					logger.info(checkJson);
				} catch (Exception e) {
					logger.error(e.getMessage());
				}
			}
		}
	}

	public String GetOrderFromProjectName(int orderFromId) {
		String projectName = "";
		String key = String.format(RedisKeyConst.KEY_Minitor_OrderFrom_ProjectName, orderFromId + "");
		ICacheKey cacheKey = RedisManager.getCacheKey(key);
		if (redis.exists(cacheKey)) {
			projectName = redis.get(cacheKey);
			return projectName;
		}

		String orderFromNameUrl = CommonsUtil.CONFIG_PROVIDAR.getProperty("orderFromNameUrl");
		if (orderFromNameUrl == null || orderFromNameUrl.isEmpty()) {
			orderFromNameUrl = "http://api.vip.elong.com/admin.php/Api/getprojectname";
		}
		orderFromNameUrl += "?orderFromId=%s";

		String url = String.format(orderFromNameUrl, orderFromId);
		OrderFromResult orderFromResult = new OrderFromResult();
		try {
			String res = HttpUtil.httpGetData(url);
			orderFromResult = gson.fromJson(res, new TypeToken<OrderFromResult>() {
			}.getType());
		} catch (Exception ex) {
			orderFromResult.setCode(0);
			orderFromResult.setData(null);
			orderFromResult.setMsg("反序列化出现错误");
		}
		if (orderFromResult.getCode() == 200 && orderFromResult.getData() != null && orderFromResult.getData().getProjectName() != null
				&& orderFromResult.getData().getProjectName().isEmpty()) {
			projectName = orderFromResult.getData().getProjectName();
			redis.put(cacheKey, projectName);
		}
		return projectName;
	}

}
