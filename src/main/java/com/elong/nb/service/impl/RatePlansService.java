package com.elong.nb.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.elong.nb.agent.ProductForNBServiceContract.GetRatePlanBaseInfoRequest;
import com.elong.nb.agent.ProductForNBServiceContract.GetRatePlanBaseInfoResponse2;
import com.elong.nb.agent.SupplierService.GetSupplierInfoBySupplierIDRequest;
import com.elong.nb.agent.SupplierService.GetSupplierInfoBySupplierIDResponse;
import com.elong.nb.agent.SupplierService.InvoiceMode;
import com.elong.nb.common.model.EnumBookingChannel;
import com.elong.nb.common.model.EnumLocal;
import com.elong.nb.common.model.EnumMemberLevel;
import com.elong.nb.common.model.EnumSellChannel;
import com.elong.nb.common.model.ErrorCode;
import com.elong.nb.common.model.ProxyAccount;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.common.util.HowSwitchUtil;
import com.elong.nb.common.util.ProductTypeUtils;
import com.elong.nb.dao.adapter.cache.M_SRelationCache;
import com.elong.nb.dao.adapter.repository.HotelGiftRepository;
import com.elong.nb.dao.adapter.repository.ProductForNBServiceRepository;
import com.elong.nb.dao.adapter.repository.RatePlanRepository;
import com.elong.nb.dao.adapter.repository.SupplierServiceRepository;
import com.elong.nb.model.HotelIdAttr;
import com.elong.nb.model.bean.enums.EnumBookingRule;
import com.elong.nb.model.bean.enums.EnumDateType;
import com.elong.nb.model.bean.enums.EnumDrrFeeType;
import com.elong.nb.model.bean.enums.EnumDrrPreferential;
import com.elong.nb.model.bean.enums.EnumDrrRuleCode;
import com.elong.nb.model.bean.enums.EnumGuaranteeChangeRule;
import com.elong.nb.model.bean.enums.EnumGuaranteeMoneyType;
import com.elong.nb.model.bean.enums.EnumGuestTypeCode;
import com.elong.nb.model.bean.enums.EnumInvoiceMode;
import com.elong.nb.model.bean.enums.EnumPaymentType;
import com.elong.nb.model.bean.enums.EnumPrepayChangeRule;
import com.elong.nb.model.bean.enums.EnumPrepayCutPayment;
import com.elong.nb.model.bean.enums.EnumValueAddPriceOption;
import com.elong.nb.model.rateplan.HotelGift;
import com.elong.nb.model.rateplan.HotelRatePlan;
import com.elong.nb.model.rateplan.MSRoomRelation;
import com.elong.nb.model.rateplan.RatePlan;
import com.elong.nb.model.rateplan.RatePlanCondition;
import com.elong.nb.model.rateplan.RatePlanResult;
import com.elong.nb.model.rateplan.SupplierRatePlan;
import com.elong.nb.model.rateplan.fornb.AddValueInfoSimple;
import com.elong.nb.model.rateplan.fornb.AddValuePolicyInfo;
import com.elong.nb.model.rateplan.fornb.DRRInfo;
import com.elong.nb.model.rateplan.fornb.EnumPrepayRule;
import com.elong.nb.model.rateplan.fornb.HotelBookingRule;
import com.elong.nb.model.rateplan.fornb.HotelDetail;
import com.elong.nb.model.rateplan.fornb.PrePayInfo;
import com.elong.nb.model.rateplan.fornb.RatePlanBaseInfo;
import com.elong.nb.model.rateplan.fornb.RoomTypeInfo;
import com.elong.nb.model.rateplan.fornb.SearchHotelRatePlanListReq;
import com.elong.nb.model.rateplan.fornb.SearchHotelRatePlanListResp;
import com.elong.nb.model.rateplan.fornb.VouchInfo;
import com.elong.nb.ms.agent.HotelDataServiceAgent;
import com.elong.nb.service.IRatePlansService;
import com.elong.nb.service.task.RatePlanTask;
import com.elong.nb.util.DateUtil;

@Service
public class RatePlansService implements IRatePlansService {

	private static Logger LocalMsg = LogManager.getLogger(RatePlansService.class);

	@Resource
	private RatePlanRepository ratePlanRepository;
	@Resource
	private M_SRelationCache m_SRelationCache;
	@Resource
	private ProductForNBServiceRepository productForNBServiceRepository;
	@Resource
	private SupplierServiceRepository supplierServiceRepository;
	@Resource
	HotelGiftRepository hotelGiftRepository;
	@Resource
	private CommonRepository commonRepository;
	private static final int rpThreadSize = 100;

	public List<HotelRatePlan> getRatePlans(RestRequest<RatePlanCondition> request, ProxyAccount proxyAccount) {
		List<HotelRatePlan> result = new LinkedList<HotelRatePlan>();
		if (!proxyAccount.getEnabledPrepayProducts()) {
			if (request.getRequest().getPaymentType() == EnumPaymentType.Prepay) {
				return result;
			} else if (request.getRequest().getPaymentType() == EnumPaymentType.All) {
				request.getRequest().setPaymentType(EnumPaymentType.SelfPay);
			}
		}
		String[] mHotelArrays = request.getRequest().getHotelIds().replaceAll(" ", "").split(",");
		List<String[]> sHotelIdArrays = m_SRelationCache.getSHotelIds(mHotelArrays);

		int rpFrom = HowSwitchUtil.getValue("rp.from", Integer.class, 1);
		if (rpFrom == 1) {
			result = getRatePlansFromGoods(request.getLocal(), Arrays.asList(mHotelArrays), sHotelIdArrays, request.getRequest()
					.getPaymentType(), proxyAccount, request.getVersion(), request.getRequest().getOptions(), request.getGuid());
		} else {
			List<String> sHotelIds = new ArrayList<String>();
			for (String[] ids : sHotelIdArrays) {
				if (ids == null || ids.length <= 0 || ids[0] == null)
					continue;
				for (String shotelId : ids) {
					if (proxyAccount.isIsOnlyStraight()) {
						// 只保留艺龙直签，其他供应商的rp都过滤
						Map<String, String> hotelCodeCoopTypeMap = HotelDataServiceAgent
								.getCooperationTypeByHotelCode(new String[] { shotelId });
						String cooperationTypeStr = hotelCodeCoopTypeMap.get(shotelId);
						if (StringUtils.isNotEmpty(cooperationTypeStr)) {
							int cooperationType = Integer.valueOf(cooperationTypeStr);
							// CooperationType=1为直签，2为非直签，0为未知
							if (cooperationType == 2) {
								continue;
							}
						}
					}
					sHotelIds.add(shotelId);
				}
			}
			HashMap<String, HotelRatePlan> hashHotel = new HashMap<String, HotelRatePlan>();
			if (sHotelIds.size() <= 0) {
				return result;
			}
			MergeHotelRatePlans(
					result,
					hashHotel,
					getRatePlans(request.getLocal(), null, StringUtils.join(sHotelIds, ','), request.getRequest().getPaymentType(),
							proxyAccount, request.getVersion(), request.getRequest().getOptions(), request.getGuid()));
			if (request.getVersion() > 1.10) {
				// 获取礼品相关信息
				for (HotelRatePlan hotel : result) {
					hotel.setGifts(new LinkedList<HotelGift>());
					for (SupplierRatePlan s : hotel.getSuppliers()) {
						List<HotelGift> list = hotelGiftRepository.getHotelGiftBySHotelId(s.getHotelCode());
						if (list != null && list.size() > 0)
							hotel.getGifts().addAll(list);
					}
				}
			}
		}

		return result;
	}

	// 将MHotel对应的多个HotelCode的SHotel合并起来
	private void MergeHotelRatePlans(List<HotelRatePlan> result, HashMap<String, HotelRatePlan> hashHotel, List<HotelRatePlan> hotels) {
		for (HotelRatePlan shotel : hotels) {
			HotelRatePlan mhotel = null;
			if (!hashHotel.containsKey(shotel.getHotelID())) {
				result.add(shotel);
				hashHotel.put(shotel.getHotelID(), shotel);
			} else {
				mhotel = hashHotel.get(shotel.getHotelID());

				if (shotel.getSuppliers() != null && shotel.getSuppliers().size() > 0) {
					for (SupplierRatePlan supplier : shotel.getSuppliers()) {
						SupplierRatePlan s = null;
						for (SupplierRatePlan mhotelSupp : mhotel.getSuppliers()) {
							if (mhotelSupp.getHotelCode() != null && mhotelSupp.getHotelCode().equals(supplier.getHotelCode()))
								s = mhotelSupp;
							break;
						}
						if (s == null) {
							if (mhotel.getSuppliers() == null) {
								List<SupplierRatePlan> suppList = new LinkedList<SupplierRatePlan>();
								mhotel.setSuppliers(suppList);
							}
							mhotel.getSuppliers().add(supplier);

						} else {
							for (com.elong.nb.model.bean.base.BaseBookingRule br : supplier.getBookingRules()) {
								com.elong.nb.model.bean.base.BaseBookingRule br2 = null;
								for (com.elong.nb.model.bean.base.BaseBookingRule ru : s.getBookingRules()) {
									if (ru.getDateType() == br.getDateType() && ru.getEndDate() == br.getEndDate()
											&& ru.getRoomTypeIds() == br.getRoomTypeIds() && ru.getStartDate() == br.getStartDate()
											&& ru.getTypeCode() == br.getTypeCode()) {
										br2 = ru;
									}
								}
								if (br2 == null) {
									if (s.getBookingRules() == null) {
										s.setBookingRules(new LinkedList<com.elong.nb.model.bean.base.BaseBookingRule>());
									}
									s.getBookingRules().add(br);
								}
							}
						}
					}
				}
				if (shotel.getRatePlans() != null && shotel.getRatePlans().size() > 0) {
					if (mhotel.getRatePlans() == null) {
						mhotel.setRatePlans(new LinkedList<RatePlan>());
					}
					mhotel.getRatePlans().addAll(shotel.getRatePlans());
				}
			}
		}
	}

	public List<HotelRatePlan> getRatePlansFromGoods(EnumLocal language, List<String> mHotelIds, List<String[]> shotelIdArrs,
			EnumPaymentType paymentType, ProxyAccount proxyInfo, double requestVersion, String options, String guid) {
		Map<String, EnumPaymentType> hotelCodeFilterType = new HashMap<String, EnumPaymentType>();
		List<HotelIdAttr> hotelIdAttrs = new LinkedList<HotelIdAttr>();
		Set<String> filteredSHotelIds = commonRepository.fillFilteredSHotelsIds();
		for (int i = 0; i < mHotelIds.size(); i++) {
			List<String> showHotelCode = new LinkedList<String>();
			String[] sHotelIds = shotelIdArrs.get(i);
			for (String hotelCode : sHotelIds) {
				if (proxyInfo.getOrderFrom() != null && proxyInfo.getOrderFrom().intValue() != 5931
						&& filteredSHotelIds.contains(hotelCode))
					continue;
				showHotelCode.add(hotelCode);
			}
			if (showHotelCode != null && showHotelCode.size() > 0) {
				HotelIdAttr hotelIdAttr = new HotelIdAttr();
				hotelIdAttr.setHotelId(mHotelIds.get(i));
				hotelIdAttr.setHotelCodes(showHotelCode);
				hotelIdAttrs.add(hotelIdAttr);
			}
		}
		if (hotelIdAttrs != null && hotelIdAttrs.size() > 0) {
			List<HotelRatePlan> ratePlans = this.ratePlanRepository.getRatePlans(proxyInfo, hotelIdAttrs, paymentType, hotelCodeFilterType,
					language == EnumLocal.zh_CN, options, guid);
			// supplier上发票模式，取该supplier下所有预付rateplan上数量多的发票模式
			boolean isBookingChannelEmpty = StringUtils.isEmpty(options) || !options.contains("1");
			Map<String, Integer> hotelCodeInvoiceModeMap = new HashMap<String, Integer>();
			for (HotelRatePlan hotelRatePlan : ratePlans) {
				List<RatePlan> ratePlanList = hotelRatePlan.getRatePlans();
				if (ratePlanList == null || ratePlanList.size() == 0)
					continue;
				Iterator<RatePlan> iter = ratePlanList.iterator();
				while (iter.hasNext()) {
					RatePlan ratePlan = iter.next();
					// 过滤直签
					if (proxyInfo.isIsOnlyStraight() && ratePlan.getCooperationType() == 2){
						iter.remove();
						continue;
					}
					if (isBookingChannelEmpty) {
						ratePlan.setBookingChannels(null);
					}

					if (EnumPaymentType.Prepay != ratePlan.getPaymentType())
						continue;
					String key = ratePlan.getHotelCode() + "_" + ratePlan.getInvoiceMode().toString();
					Integer count = hotelCodeInvoiceModeMap.get(key);
					count = (count == null) ? 0 : count;
					hotelCodeInvoiceModeMap.put(key, count + 1);
				}
			}
			for (HotelRatePlan hotelRatePlan : ratePlans) {
				List<SupplierRatePlan> supplierList = hotelRatePlan.getSuppliers();
				if (supplierList == null || supplierList.size() == 0)
					continue;
				for (SupplierRatePlan supplier : supplierList) {
					String hotelInvoiceKey = supplier.getHotelCode() + "_" + EnumInvoiceMode.Hotel.toString();
					Integer hotelInvoiceCount = hotelCodeInvoiceModeMap.get(hotelInvoiceKey);
					hotelInvoiceCount = (hotelInvoiceCount == null) ? 0 : hotelInvoiceCount;
					String elongInvoiceKey = supplier.getHotelCode() + "_" + EnumInvoiceMode.Elong.toString();
					Integer elongInvoiceCount = hotelCodeInvoiceModeMap.get(elongInvoiceKey);
					elongInvoiceCount = (elongInvoiceCount == null) ? 0 : elongInvoiceCount;
					supplier.setInvoiceMode(hotelInvoiceCount >= elongInvoiceCount ? EnumInvoiceMode.Hotel : EnumInvoiceMode.Elong);
				}
			}
			return ratePlans;
		} else {
			return new LinkedList<HotelRatePlan>();
		}
	}

	private List<HotelRatePlan> getRatePlans(EnumLocal language, String mHotelId, String shotelId, EnumPaymentType paymentType,
			ProxyAccount proxyInfo, double requestVersion, String options, String guid) {
		SearchHotelRatePlanListReq condition = new SearchHotelRatePlanListReq();
		if (paymentType != EnumPaymentType.All) {
			condition.setPaymentType(paymentType.getValue());
		}
		List<HotelRatePlan> result = new LinkedList<HotelRatePlan>();
		List<HotelDetail> list = new LinkedList<HotelDetail>();
		List<String> hotelCodes = Arrays.asList(shotelId.split(","));
		if (hotelCodes.size() <= rpThreadSize) {
			int preCount = 5;
			List<String> shotelIdsList = new LinkedList<String>();
			if (hotelCodes.size() >= preCount) {
				int count = hotelCodes.size() / preCount;
				if (hotelCodes.size() % preCount == 0) {
					count--;
				}
				for (int i = 0; i <= count; i++) {
					int size = (i + 1) * preCount < hotelCodes.size() ? (i + 1) * preCount : hotelCodes.size();
					shotelIdsList.add(StringUtils.join(hotelCodes.subList(i * preCount, size), ','));
				}
			} else {
				shotelIdsList.add(StringUtils.join(hotelCodes, ','));
			}
			for (String shotelIds : shotelIdsList) {
				condition.setShotelId(shotelIds);
				SearchHotelRatePlanListResp res = this.ratePlanRepository.getRatePlan(condition, guid);
				if (res != null && res.getResult() != null && res.getResult().size() > 0) {
					list.addAll(res.getResult());
				}
			}
		} else {
			RatePlanTask ratePlanTask = new RatePlanTask(hotelCodes, paymentType, ratePlanRepository, guid);
			ForkJoinPool forkJoinPool = new ForkJoinPool();
			forkJoinPool.execute(ratePlanTask);
			do {

			} while (!ratePlanTask.isDone());

			forkJoinPool.shutdown();
			try {
				list = ratePlanTask.get();
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
				throw new RuntimeException(e.getMessage());
			}
		}
		if (list == null || list.size() <= 0) {
			return result;
		}
		for (HotelDetail hotel : list) {
			HotelDetail filterHotel = filterHotel(hotel, proxyInfo.getSellChannel(), proxyInfo.getBookingChannel(),
					proxyInfo.getMemberLevel());
			if (filterHotel == null) {
				continue;
			}
			HotelRatePlan rp = new HotelRatePlan();
			if (filterHotel.getHotelBaseInfo() != null) {
				rp.setHotelID(mHotelId == null ? m_SRelationCache.getMHotelId(filterHotel.getHotelBaseInfo().getShotelId()) : mHotelId);
			}
			rp.setRatePlans(getRatePlans(filterHotel, language, proxyInfo, requestVersion, options));
			rp.setSuppliers(getSuppliers(filterHotel, language));
			result.add(rp);
		}

		return result;
	}

	private HotelDetail filterHotel(HotelDetail hotel, EnumSellChannel enumSellChannel, EnumBookingChannel enumBookingChannel,
			EnumMemberLevel enumMemberLevel) {
		HotelDetail hotelNew = null;
		boolean isHasCanShow = false;
		List<RoomTypeInfo> roomBaseInfos = new LinkedList<RoomTypeInfo>();
		for (int i = 0; i < hotel.getRoomBaseInfos().size(); i++) {
			List<RatePlanBaseInfo> ratePlanList = new LinkedList<RatePlanBaseInfo>();
			for (int j = 0; j < hotel.getRoomBaseInfos().get(i).getRatePlans().size(); j++) {
				// 预订渠道过滤
				int b = hotel.getRoomBaseInfos().get(i).getRatePlans().get(j).getBookingChannel();
				int eb = enumBookingChannel != null ? enumBookingChannel.getValue() : EnumBookingChannel.OnLine.getValue();
				// 销售渠道过滤
				int s = hotel.getRoomBaseInfos().get(i).getRatePlans().get(j).getRatePlanSellChannel();
				int es = enumSellChannel != null ? enumSellChannel.getValue() : EnumSellChannel.A.getValue();
				// 会员等级过滤
				int m = hotel.getRoomBaseInfos().get(i).getRatePlans().get(j).getCustomerLevel();
				int em = (int) Math.pow(2d,
						((enumMemberLevel != null ? enumMemberLevel.getValue() : EnumMemberLevel.Normal.getValue()) - 1));
				boolean isCanShow = ((b & eb) == eb) && ((s & es) == es) && ((m & em) == em);
				if (isCanShow) {
					if (!isHasCanShow) {
						isHasCanShow = true;
						hotelNew = new HotelDetail();
						hotelNew.setHotelBaseInfo(hotel.getHotelBaseInfo());
					}
					ratePlanList.add(hotel.getRoomBaseInfos().get(i).getRatePlans().get(j));
				}
			}
			if (ratePlanList.size() > 0) {
				RoomTypeInfo roomTypeInfo = hotel.getRoomBaseInfos().get(i);
				roomTypeInfo.setRatePlans(ratePlanList);
				roomBaseInfos.add(roomTypeInfo);
			}
		}
		if (isHasCanShow) {
			hotelNew.setRoomBaseInfos(roomBaseInfos);
			return hotelNew;
		}
		return null;
	}

	private List<RatePlan> getRatePlans(HotelDetail hotel, EnumLocal language, ProxyAccount proxyInfo, double requestVersion, String options) {
		List<RatePlan> result = new LinkedList<RatePlan>();

		List<Integer> levels = new LinkedList<Integer>();
		int cooperationType = 0;
		if (requestVersion >= 1.27) {
			if (proxyInfo.isIsOnlyStraight()) {
				cooperationType = 1;
			} else {
				if (hotel != null && hotel.getHotelBaseInfo() != null && hotel.getHotelBaseInfo().getShotelId() != null
						&& !hotel.getHotelBaseInfo().getShotelId().isEmpty()) {
					String hotelCode = hotel.getHotelBaseInfo().getShotelId();
					Map<String, String> hotelCodeCoopTypeMap = HotelDataServiceAgent
							.getCooperationTypeByHotelCode(new String[] { hotelCode });
					String cooperationTypeStr = hotelCodeCoopTypeMap.get(hotelCode);
					if (StringUtils.isNotEmpty(cooperationTypeStr)) {
						// CooperationType=1为直签，2为非直签，0为未知
						cooperationType = Integer.valueOf(cooperationType);
					}
				}
			}
		}
		if (hotel == null || hotel.getRoomBaseInfos() == null || hotel.getRoomBaseInfos() == null)
			return result;

		for (RoomTypeInfo roomType : hotel.getRoomBaseInfos()) {
			if (roomType == null || roomType.getRatePlans() == null || roomType.getRatePlans() == null)
				continue;

			for (RatePlanBaseInfo oldrp : roomType.getRatePlans()) {
				// 全部，仅用于检索All(0), 前台自付SelfPay(1), 预付Prepay(2);
				EnumPaymentType payType = EnumPaymentType.Prepay;
				if (oldrp.getSettlementType() == null || oldrp.getSettlementType().equals("") || oldrp.getSettlementType().equals("2"))
					payType = EnumPaymentType.Prepay;
				else if (oldrp.getSettlementType().equals("0"))
					payType = EnumPaymentType.All;
				else if (oldrp.getSettlementType().equals("1"))
					payType = EnumPaymentType.SelfPay;

				RatePlan rp = new RatePlan();
				{
					if (hotel.getHotelBaseInfo() != null)
						rp.setHotelCode(hotel.getHotelBaseInfo().getShotelId());
					rp.setRatePlanId(oldrp.getRatePlanID());
					// RatePlanCode = oldrp.RatePlanCode,
					rp.setRatePlanName(language == EnumLocal.zh_CN ? oldrp.getCNRatePlanName() : oldrp.getENRatePlanName());
					rp.setRoomTypeIds(oldrp.getRatePlanRoomTypeId());

					// 客人国籍类别：1-统一价；2-内宾；3-外宾；4-港澳台；5-日本
					EnumGuestTypeCode gtype = EnumGuestTypeCode.Chinese;
					if (oldrp.getPriceType().equals("1"))
						gtype = EnumGuestTypeCode.All;
					else if (oldrp.getPriceType().equals("2"))
						gtype = EnumGuestTypeCode.Chinese;
					else if (oldrp.getPriceType().equals("3"))
						gtype = EnumGuestTypeCode.OtherForeign;
					else if (oldrp.getPriceType().equals("4"))
						gtype = EnumGuestTypeCode.HongKong;
					else if (oldrp.getPriceType().equals("5"))
						gtype = EnumGuestTypeCode.Japanese;
					else if (oldrp.getPriceType().equals("6"))
						gtype = EnumGuestTypeCode.ChinaGuest;
					rp.setCustomerType(gtype);

					rp.setIsLimitTimeSale(oldrp.getIsLimitTimeSale() == 1);
					boolean isHourPayRoom = ProductTypeUtils.isHourPayRoom(oldrp.getCNRatePlanName());
					rp.setProductTypes(ParseProductType(oldrp.getProductType(), oldrp.getBookingChannel(), isHourPayRoom));
					if (oldrp.getStartTime() != null)
						rp.setStartTime(DateUtil.getTimeString(oldrp.getStartTime()));
					if (oldrp.getEndTime() != null)
						rp.setEndTime(DateUtil.getTimeString(oldrp.getEndTime()));
					rp.setMinAdvHours(oldrp.getMinAdvanceBookingDays());
					rp.setMaxAdvHours(oldrp.getMaxAdvanceBookingDays());
					rp.setMinDays(oldrp.getMinStayDays());
					rp.setMaxDays(oldrp.getMaxStayDays());
					rp.setMinAmount(oldrp.getMinCheckinRooms());
					rp.setPaymentType(payType);
					rp.setDrrRules(getDrrRules(oldrp, language));
					rp.setGuaranteeRules((payType == EnumPaymentType.SelfPay) ? getGuaranteeRules(oldrp, language) : null);
					rp.setPrepayRules((payType == EnumPaymentType.Prepay) ? getPrepayRules(oldrp, language) : null);
					rp.setValueAdds(getValueAddRules(oldrp, language));
					rp.setCooperationType(cooperationType);
				}
				;

				if (options != null && !options.isEmpty()) {
					String[] arr = options.split(",");
					LinkedList<String> alOptions = new LinkedList<String>();
					for (String s : arr) {
						alOptions.add(s);
					}

					if (alOptions.contains("1")) // BookingChannels
					{
						rp.setBookingChannels("1");

						GetRatePlanBaseInfoRequest req = new GetRatePlanBaseInfoRequest();
						if (hotel.getHotelBaseInfo() != null)
							req.setHotelID(hotel.getHotelBaseInfo().getShotelId());
						req.setRatePlanID(oldrp.getRatePlanID());
						GetRatePlanBaseInfoResponse2 r = productForNBServiceRepository.getRatePlanBaseInfo(req);

						if (r != null && r.getResult() != null && r.getResult().getResponseCode() == 0 && r.getRatePlanBaseInfo() != null) {
							int c = 0;
							if (r.getRatePlanBaseInfo().getRawBookingChannel() != null)
								c = r.getRatePlanBaseInfo().getRawBookingChannel();

							List<Integer> channels = new LinkedList<Integer>();
							if ((c & 2) == 2) {
								channels.add(1);
							}
							if ((c & 4) == 4)
								channels.add(2);
							if ((c & 16) == 16)
								channels.add(3);
							if (channels.size() > 0) {
								rp.setBookingChannels(StringUtils.join(channels, ','));
							}
						}
					}
				}
				// rp 会员等级
				levels = new LinkedList<Integer>();
				if ((oldrp.getCustomerLevel() & 1024) == 1024) {
					levels.add(0);
				}
				if ((oldrp.getCustomerLevel() & 1) == 1) {
					levels.add(1);
				}
				if ((oldrp.getCustomerLevel() & 2) == 2) {
					levels.add(2);
				}
				if ((oldrp.getCustomerLevel() & 4) == 4) {
					levels.add(3);
				}
				if ((oldrp.getCustomerLevel() & 8) == 8) {
					levels.add(4);
				}

				// levels.toArray(lev);
				int[] lev = new int[levels.size()];
				for (int i = 0; i < levels.size(); i++) {
					lev[i] = levels.get(i);
				}
				rp.setCustomerLevel(lev);

				result.add(rp);
			}
		}
		return result;
	}

	private List<com.elong.nb.model.bean.base.BaseDrrRule> getDrrRules(RatePlanBaseInfo oldrp, EnumLocal language) {
		List<com.elong.nb.model.bean.base.BaseDrrRule> result = new LinkedList<com.elong.nb.model.bean.base.BaseDrrRule>();

		if (oldrp == null || oldrp.getRatePlanDRRList() == null || oldrp.getRatePlanDRRList() == null)
			return result;

		for (DRRInfo rule : oldrp.getRatePlanDRRList()) {
			com.elong.nb.model.bean.base.BaseDrrRule brule = new com.elong.nb.model.bean.base.BaseDrrRule();
			{
				// Tools.ParseEnum<EnumDrrRuleCode>(rule.DRRRule.GetHashCode().ToString(),
				// EnumDrrRuleCode.DRRBookAhead)
				EnumDrrRuleCode drrRuleEnum = EnumDrrRuleCode.DRRBookAhead;
				if (rule.getDRRRule() == EnumDrrRuleCode.DRRBookAhead.getValue())
					drrRuleEnum = EnumDrrRuleCode.DRRBookAhead;
				else if (rule.getDRRRule() == EnumDrrRuleCode.DRRCheckInWeekDay.getValue())
					drrRuleEnum = EnumDrrRuleCode.DRRCheckInWeekDay;
				else if (rule.getDRRRule() == EnumDrrRuleCode.DRRStayLastNight.getValue())
					drrRuleEnum = EnumDrrRuleCode.DRRStayLastNight;
				else if (rule.getDRRRule() == EnumDrrRuleCode.DRRStayPerLastNight.getValue())
					drrRuleEnum = EnumDrrRuleCode.DRRStayPerLastNight;
				else if (rule.getDRRRule() == EnumDrrRuleCode.DRRStayPerRoomPerNight.getValue())
					drrRuleEnum = EnumDrrRuleCode.DRRStayPerRoomPerNight;
				else if (rule.getDRRRule() == EnumDrrRuleCode.DRRStayTheNightAndAfter.getValue())
					drrRuleEnum = EnumDrrRuleCode.DRRStayTheNightAndAfter;
				else if (rule.getDRRRule() == EnumDrrRuleCode.DRRStayWeekDay.getValue())
					drrRuleEnum = EnumDrrRuleCode.DRRStayWeekDay;
				else if (rule.getDRRRule() == EnumDrrRuleCode.None.getValue())
					drrRuleEnum = EnumDrrRuleCode.None;
				brule.setTypeCode(drrRuleEnum);

				// Tools.ParseEnum<EnumDrrPreferential>(rule.MoneyOrPercent.GetHashCode().ToString(),
				// EnumDrrPreferential.Scale)
				EnumDrrPreferential drrPre = EnumDrrPreferential.Scale;
				if (rule.getMoneyOrPercent() == EnumDrrPreferential.Cash.getValue())
					drrPre = EnumDrrPreferential.Cash;
				else if (rule.getMoneyOrPercent() == EnumDrrPreferential.Scale.getValue())
					drrPre = EnumDrrPreferential.Scale;
				brule.setCashScale(drrPre);
				brule.setDeductNum(rule.getMoneyOrPercentValue());

				// Tools.ParseEnum<EnumDateType>(rule.DateType.GetHashCode().ToString(),
				// EnumDateType.CheckInDay)
				EnumDateType dateType = EnumDateType.CheckInDay;
				if (rule.getDateType() == EnumDateType.BookDay.getValue())
					dateType = EnumDateType.BookDay;
				else if (rule.getDateType() == EnumDateType.CheckInDay.getValue())
					dateType = EnumDateType.CheckInDay;
				else if (rule.getDateType() == EnumDateType.StayDay.getValue())
					dateType = EnumDateType.StayDay;
				brule.setDateType(dateType);

				brule.setDescription(language == EnumLocal.zh_CN ? rule.getCNDescription() : rule.getENDescription());
				if (rule.getStartDate() != null)
					brule.setStartDate(rule.getStartDate());
				if (rule.getEndDate() != null)
					brule.setEndDate(rule.getEndDate());

				// Tools.ParseEnum<EnumDrrFeeType>(rule.FeeType.GetHashCode().ToString(),
				// EnumDrrFeeType.WeekendFee)
				EnumDrrFeeType drrFee = EnumDrrFeeType.WeekendFee;
				if (rule.getFeeType() == EnumDrrFeeType.WeekdayFee.getValue())
					drrFee = EnumDrrFeeType.WeekdayFee;
				else if (rule.getFeeType() == EnumDrrFeeType.WeekendFee.getValue())
					drrFee = EnumDrrFeeType.WeekendFee;
				brule.setFeeType(drrFee);

				if (rule.getIsWeekEffective() != null)
					brule.setWeekSet(getWeekSet(rule.getIsWeekEffective()));
				if (rule.getRuleValues() != null)
					brule.setCheckInNum(getRuleValue(rule.getRuleValues().entrySet(), "CheckInNum"));
				if (rule.getRuleValues() != null)
					brule.setDayNum(getRuleValue(rule.getRuleValues().entrySet(), "DayNum"));
				if (rule.getRuleValues() != null)
					brule.setLastDayNum(getRuleValue(rule.getRuleValues().entrySet(), "LastDayNum"));
				if (rule.getRuleValues() != null)
					brule.setEveryCheckInNum(getRuleValue(rule.getRuleValues().entrySet(), "EveryCheckInNum"));
				if (rule.getRuleValues() != null)
					brule.setWhichDayNum(getRuleValue(rule.getRuleValues().entrySet(), "WhichDayNum"));
				brule.setRoomTypeIds(rule.getRoomTypeIds());
			}
			result.add(brule);
		}
		return result;
	}

	private String getWeekSet(List<Integer> week) {
		List<Integer> result = new LinkedList<Integer>();
		if (week == null || week.size() <= 0) {
			return "";
		}
		for (int i = 1; i < 7; i++) {
			// 1=有效，0=无效
			if (week.get(i) == 1) {
				result.add(i);
			}
		}
		if (week.get(0) == 1) {
			result.add(7);
		}
		return StringUtils.join(result, ",");
	}

	private int getRuleValue(Set<Map.Entry<String, String>> rules, String key) {
		if (rules == null || rules.size() <= 0)
			return -1;

		int result;
		// var entry = rules.FirstOrDefault(item => item.Key.ToString() == key);
		Map.Entry<String, String> entry = null;
		for (Map.Entry<String, String> dictEntry : rules) {
			if (dictEntry.getKey() != null && dictEntry.getKey().toString().equals(key)) {
				entry = dictEntry;
			}
		}

		if (entry != null && entry.getKey() != null && entry.getValue() != null && !entry.getKey().toString().isEmpty()
				&& !entry.getValue().toString().isEmpty()) {

			try {
				result = Integer.parseInt(entry.getValue().toString());
			} catch (Exception e)// 若转换失败，则使用默认值返回 -1
			{
				LocalMsg.error(e.getMessage());
				result = -1;
			}
		} else {
			result = -1;
		}

		return result;
	}

	private Date getRuleValue_Date(Set<Map.Entry<String, String>> rules, String key) {
		if (rules == null || rules.size() <= 0)
			return DateUtil.getMinValue();

		Date result;
		// var entry = rules.FirstOrDefault(item => item.Key.ToString() == key);
		Map.Entry<String, String> entry = null;
		for (Map.Entry<String, String> dictEntry : rules) {
			if (dictEntry.getKey() != null && dictEntry.getKey().toString().equals(key)) {
				entry = dictEntry;
			}
		}

		if (entry != null && entry.getKey() != null && entry.getValue() != null && !entry.getKey().toString().isEmpty()
				&& !entry.getValue().toString().isEmpty()) {

			try {
				result = DateUtil.toDate(entry.getValue().toString());
			} catch (Exception e)// 若转换失败，则使用默认值返回 -1
			{
				LocalMsg.error(e.getMessage());
				result = DateUtil.getMinValue();
			}
		} else {
			result = DateUtil.getMinValue();
		}

		return result;
	}

	private String getRuleValue_String(Set<Map.Entry<String, String>> rules, String key) {
		if (rules == null || rules.size() <= 0)
			return "";

		String result;
		// var entry = rules.FirstOrDefault(item => item.Key.ToString() == key);
		Map.Entry<String, String> entry = null;
		for (Map.Entry<String, String> dictEntry : rules) {
			if (dictEntry.getKey() != null && dictEntry.getKey().toString().equals(key)) {
				entry = dictEntry;
			}
		}

		if (entry != null && entry.getKey() != null && entry.getValue() != null && !entry.getKey().toString().isEmpty()
				&& !entry.getValue().toString().isEmpty()) {

			try {
				result = entry.getValue().toString();
			} catch (Exception e)// 若转换失败，则使用默认值返回 -1
			{
				LocalMsg.error(e.getMessage());
				result = "";
			}
		} else {
			result = "";
		}

		return result;
	}

	private boolean getRuleValue_bool(Set<Map.Entry<String, String>> rules, String key) {
		if (rules == null || rules.size() <= 0)
			return false;

		boolean result;
		// var entry = rules.FirstOrDefault(item => item.Key.ToString() == key);
		Map.Entry<String, String> entry = null;
		for (Map.Entry<String, String> dictEntry : rules) {
			if (dictEntry.getKey() != null && dictEntry.getKey().toString().equals(key)) {
				entry = dictEntry;
			}
		}

		if (entry != null && entry.getKey() != null && entry.getValue() != null && !entry.getKey().toString().isEmpty()
				&& !entry.getValue().toString().isEmpty()) {

			try {
				result = ("1".equals(entry.getValue()));
			} catch (Exception e)// 若转换失败，则使用默认值返回 -1
			{
				LocalMsg.error(e.getMessage());
				result = false;
			}
		} else {
			result = false;
		}

		return result;
	}

	// private static Regex _hourPayRegex = new Regex("(\\d点)|(\\d:\\d)",
	// RegexOptions.Compiled);
	public boolean isHourPayRoom(String name) {
		if (name == null || name.isEmpty())
			return false;

		// 钟点、小时、半日房
		// \d点、8:0
		// boolean isRegex = name.matches("(//d点)|(//d://d)");
		boolean isRegex = name.matches("(\\d点)|(\\d:\\d)");
		if (name.contains("小时") || name.contains("钟点") || name.contains("半日房") || isRegex)
			return true;

		return false;
	}

	/**
	 * 3---限时抢购
	 * 4--钟点房
	 * @param strProductType 16---限时抢购,32--钟点房
	 * @param bookingchanel
	 * @param isHourPayRoom
	 * @return
	 */
	public String ParseProductType(String strProductType, int bookingchanel, boolean isHourPayRoom) {
		String productTypes = "";
		List<String> productTypeList = new LinkedList<String>();
		int pt = Integer.parseInt("0" + strProductType);
		if ((pt & 16) == 16)
			productTypeList.add("3");
		// productTypes += "3,";
		if (isHourPayRoom || (pt & 32) == 32)
			productTypeList.add("4");
		if ((bookingchanel & 2) == 0 && (bookingchanel & 16) == 16)
			productTypeList.add("5");
		// 买一送一 productType值是2的14次方
		if ((pt & 16384) == 16384) {
			productTypeList.add("101");
		}
		if (productTypeList.size() > 0) {
			productTypes = StringUtils.join(productTypeList, ",");
		} else {
			productTypes = null;
		}
		return productTypes;
	}

	/**
	 * 担保规则转换
	 * @param oldrp
	 * @param language
	 * @return
	 */
	private List<com.elong.nb.model.bean.base.BaseGuaranteeRule> getGuaranteeRules(RatePlanBaseInfo oldrp, EnumLocal language) {
		List<com.elong.nb.model.bean.base.BaseGuaranteeRule> result = new LinkedList<com.elong.nb.model.bean.base.BaseGuaranteeRule>();

		if (oldrp == null || oldrp.getRatePlanVouchRuleList() == null || oldrp.getRatePlanVouchRuleList() == null)
			return result;

		for (VouchInfo rule : oldrp.getRatePlanVouchRuleList()) {
			com.elong.nb.model.bean.base.BaseGuaranteeRule temp = new com.elong.nb.model.bean.base.BaseGuaranteeRule();

			if (rule.getStartDate() != null)
				temp.setStartDate(rule.getStartDate());
			if (rule.getEndDate() != null)
				temp.setEndDate(rule.getEndDate());
			temp.setStartTime(rule.getArriveStartTime() != null ? rule.getArriveStartTime() : "");
			temp.setEndTime(rule.getArriveEndTime() != null ? rule.getArriveEndTime() : "");
			temp.setAmount(rule.getRoomCount());

			// Tools.ParseEnum<EnumGuaranteeChangeRule>(rule.VouchChangeRule.GetHashCode().ToString(),
			// EnumGuaranteeChangeRule.NoChange)
			EnumGuaranteeChangeRule gcrule = EnumGuaranteeChangeRule.NoChange;
			if (rule.getVouchChangeRule() == EnumGuaranteeChangeRule.NeedCheckin24hour.getValue())
				gcrule = EnumGuaranteeChangeRule.NeedCheckin24hour;
			else if (rule.getVouchChangeRule() == EnumGuaranteeChangeRule.NeedCheckinTime.getValue())
				gcrule = EnumGuaranteeChangeRule.NeedCheckinTime;
			else if (rule.getVouchChangeRule() == EnumGuaranteeChangeRule.NeedSomeDay.getValue())
				gcrule = EnumGuaranteeChangeRule.NeedSomeDay;
			temp.setChangeRule(gcrule);

			// Tools.ParseEnum<com.elong.api.hotel.model.rest.enums.EnumDateType>(rule.DateType.GetHashCode().ToString(),
			// model.rest.enums.EnumDateType.StayDay)
			EnumDateType dateType = EnumDateType.CheckInDay;
			if (rule.getDateType() == EnumDateType.BookDay.getValue())
				dateType = EnumDateType.BookDay;
			else if (rule.getDateType() == EnumDateType.CheckInDay.getValue())
				dateType = EnumDateType.CheckInDay;
			else if (rule.getDateType() == EnumDateType.StayDay.getValue())
				dateType = EnumDateType.StayDay;
			temp.setDateType(dateType);

			temp.setDescription(language == EnumLocal.zh_CN ? rule.getCNDescription() : rule.getENDescription());
			temp.setIsAmountGuarantee(rule.isRoomCountVouch());
			temp.setIsTimeGuarantee(rule.isArriveTimeVouch());

			// Tools.ParseEnum<EnumGuaranteeMoneyType>(rule.VouchMoneyType.GetHashCode().ToString(),
			// EnumGuaranteeMoneyType.FullNightCost)
			EnumGuaranteeMoneyType moneyType = EnumGuaranteeMoneyType.FullNightCost;
			if (rule.getVouchMoneyType() == EnumGuaranteeMoneyType.FirstNightCost.getValue())
				moneyType = EnumGuaranteeMoneyType.FirstNightCost;
			temp.setGuaranteeType(moneyType);

			if (rule.getIsWeekEffective() != null)
				temp.setWeekSet(getWeekSet(rule.getIsWeekEffective()));

			if (rule.getRuleValues() != null) {
				temp.setDay(getRuleValue_Date(rule.getRuleValues().entrySet(), "DayNum"));
				temp.setHour(getRuleValue(rule.getRuleValues().entrySet(), "HourNum"));
				temp.setTime(getRuleValue_String(rule.getRuleValues().entrySet(), "TimeNum"));
				temp.setIsTomorrow(getRuleValue_bool(rule.getRuleValues().entrySet(), "IsTomorrow"));
			}

			// 如果是无条件担保，需要将取消条款中的 最早到店时间前N小时修改成
			// 到店日24点前N+10小时---这样就是将最早到店时间默认为14点
			if (!temp.getIsAmountGuarantee() && !temp.getIsTimeGuarantee()
					&& temp.getChangeRule() == EnumGuaranteeChangeRule.NeedCheckinTime) {
				temp.setChangeRule(EnumGuaranteeChangeRule.NeedCheckin24hour);
				temp.setHour(temp.getHour() + 10);
				temp.setDescription(temp.BuildDescription(language == EnumLocal.zh_CN));
			}

			result.add(temp);
		}
		return result;
	}

	/**
	 * 预付规则转换(reviewed)
	 * 
	 * @param oldrp
	 * @param language
	 * @return
	 */
	private List<com.elong.nb.model.bean.base.BasePrepayRule> getPrepayRules(RatePlanBaseInfo oldrp, EnumLocal language) {
		List<com.elong.nb.model.bean.base.BasePrepayRule> result = new LinkedList<com.elong.nb.model.bean.base.BasePrepayRule>();
		if (oldrp == null || oldrp.getRatePlanPrePayRuleList() == null || oldrp.getRatePlanPrePayRuleList() == null)
			return result;

		for (PrePayInfo rule : oldrp.getRatePlanPrePayRuleList()) {
			// 给酒店的预付规则不需要返回给合作伙伴
			if (rule.getTarget() == 1) {
				continue;
			}

			com.elong.nb.model.bean.base.BasePrepayRule basePrepay = new com.elong.nb.model.bean.base.BasePrepayRule();
			EnumPrepayChangeRule prepayrule = EnumPrepayChangeRule.PrepayNoChange;
			if (rule.getPrepayChangeRule() == EnumPrepayRule.PrepayNeedOneTime.value())
				prepayrule = EnumPrepayChangeRule.PrepayNeedOneTime;
			else if (rule.getPrepayChangeRule() == EnumPrepayRule.PrepayNeedSomeDay.value())
				prepayrule = EnumPrepayChangeRule.PrepayNeedSomeDay;
			basePrepay.setChangeRule(prepayrule);

			EnumDateType dateType = EnumDateType.CheckInDay;
			if (rule.getDateType() != 0) {
				dateType = EnumDateType.forValue(rule.getDateType());
			}
			basePrepay.setDateType(dateType);

			if (rule.getStartDate() != null)
				basePrepay.setStartDate(rule.getStartDate());
			if (rule.getEndDate() != null)
				basePrepay.setEndDate(rule.getEndDate());
			EnumPrepayCutPayment after = EnumPrepayCutPayment.FristNight;
			if (rule.getCutTypeAfter() > 0) {
				after = EnumPrepayCutPayment.forValue(rule.getCutTypeAfter());
			}
			basePrepay.setCashScaleFirstAfter(after);
			EnumPrepayCutPayment before = EnumPrepayCutPayment.FristNight;
			if (rule.getCutTypeBefor() > 0) {
				before = EnumPrepayCutPayment.forValue(rule.getCutTypeBefor());
			}
			basePrepay.setCashScaleFirstBefore(before);

			basePrepay.setDeductFeesAfter(rule.isCutAfterChangeTime() ? 1 : 0);
			basePrepay.setDeductFeesBefore(rule.isCutBeforChangeTime() ? 1 : 0);

			basePrepay.setDeductNumAfter(rule.getCutNumAfter());
			basePrepay.setDeductNumBefore(rule.getCutNumBefor());
			basePrepay.setDescription(language == EnumLocal.zh_CN ? rule.getCNDescription() : rule.getENDescription());
			if (rule.getIsWeekEffective() != null)
				basePrepay.setWeekSet(getWeekSet(rule.getIsWeekEffective()));

			if (rule.getRuleValues() != null) {
				basePrepay.setHour(getRuleValue(rule.getRuleValues().entrySet(), "HourNum"));
				basePrepay.setHour2(getRuleValue(rule.getRuleValues().entrySet(), "HourNum2"));
				basePrepay.setTime(getRuleValue_String(rule.getRuleValues().entrySet(), "TimeNum"));
				basePrepay.setDateNum(getRuleValue_Date(rule.getRuleValues().entrySet(), "DateNum"));
			}

			result.add(basePrepay);
		}
		// 如果没有预付规则，则加入一条默认的‘不允许变更取消’
		if (result.size() == 0) {
			com.elong.nb.model.bean.base.BasePrepayRule base = new com.elong.nb.model.bean.base.BasePrepayRule();

			base.setChangeRule(EnumPrepayChangeRule.PrepayNoChange);
			base.setDateType(EnumDateType.CheckInDay);

			Date today = DateUtil.getDate(new Date());
			base.setStartDate(DateUtil.addDays(today, -1));
			base.setEndDate(DateUtil.addYears(today, 1));
			base.setCashScaleFirstAfter(EnumPrepayCutPayment.Percent);
			base.setCashScaleFirstBefore(EnumPrepayCutPayment.Percent);
			base.setDeductFeesAfter(100);
			base.setDeductFeesBefore(100);
			List<Integer> intList = new LinkedList<Integer>();
			intList.add(1);
			intList.add(1);
			intList.add(1);
			intList.add(1);
			intList.add(1);
			intList.add(1);
			intList.add(1);
			base.setWeekSet(getWeekSet(intList));
			base.setDescription(language == EnumLocal.zh_CN ? "一经预订成功不可变更/取消。"
					: "Once the order has been submitted successfully,  it won't be possible to change or cancel it.");
			base.setDeductNumAfter(100);
			base.setDeductNumBefore(100);
			base.setDateNum(DateUtil.addDays(today, -1));
			base.setHour(0);
			base.setHour2(0);
			base.setTime("18:00:00");
			result.add(base);
		}

		return result;
	}

	private List<com.elong.nb.model.bean.base.BaseValueAddRule> getValueAddRules(RatePlanBaseInfo oldrp, EnumLocal language) {
		List<com.elong.nb.model.bean.base.BaseValueAddRule> result = new LinkedList<com.elong.nb.model.bean.base.BaseValueAddRule>();

		if (oldrp == null || oldrp.getRateplanRelationAddValue() == null || oldrp.getRateplanRelationAddValue() == null)
			return result;

		for (AddValueInfoSimple rule : oldrp.getRateplanRelationAddValue()) {
			com.elong.nb.model.bean.base.BaseValueAddRule baserule = new com.elong.nb.model.bean.base.BaseValueAddRule();

			baserule.setDescription(getAdditionalServiceRDisciption(rule, language));
			baserule.setTypeCode(rule.getBusinessCode());
			baserule.setIsInclude(rule.getIsInclude() == 1);
			// 无None(0),金额Money(1),比例Percent(2)
			EnumValueAddPriceOption priceOpt = EnumValueAddPriceOption.Percent;
			if (rule.getPriceDefaultOption() == 0)
				priceOpt = EnumValueAddPriceOption.None;
			else if (rule.getPriceDefaultOption() == 1)
				priceOpt = EnumValueAddPriceOption.Money;
			baserule.setPriceOption(priceOpt);
			baserule.setPrice(rule.getPrice());
			// 无None(0),金额Money(1),比例Percent(2)
			EnumValueAddPriceOption addPrice = EnumValueAddPriceOption.Percent;
			if (rule.getSinglePriceDefaultOption() == 1)
				addPrice = EnumValueAddPriceOption.Money;
			else if (rule.getSinglePriceDefaultOption() == 0)
				addPrice = EnumValueAddPriceOption.None;
			baserule.setExtOption(addPrice);

			baserule.setExtPrice(rule.getSinglePrice());
			baserule.setIsExtAdd(rule.isAdd());
			baserule.setAmount(rule.getShare());
			result.add(baserule);
		}

		if (oldrp == null || oldrp.getAddValuePolicyList() == null || oldrp.getAddValuePolicyList() == null)
			return result;

		for (AddValuePolicyInfo rule : oldrp.getAddValuePolicyList()) {
			String cnDescription = "";
			String enDescription = "";
			if (rule.getStartDate() != null && rule.getEndDate() != null) {
				cnDescription = DateUtil.getDateString(rule.getStartDate()) + " - " + DateUtil.getDateString(rule.getEndDate())
						+ ((rule.getIsInclude() == 0) ? " 不含早餐" : " 包含 " + rule.getShare() + " 份早餐");
				enDescription = DateUtil.getDateString(rule.getStartDate()) + " - " + DateUtil.getDateString(rule.getEndDate())
						+ ((rule.getIsInclude() == 0) ? " no breakfast" : " includes " + rule.getShare() + " breakfast");
			}

			com.elong.nb.model.bean.base.BaseValueAddRule base = new com.elong.nb.model.bean.base.BaseValueAddRule();

			base.setDescription(language == EnumLocal.zh_CN ? cnDescription : enDescription);
			base.setTypeCode("99");
			base.setIsInclude(rule.getIsInclude() == 1);
			// 无None(0),金额Money(1),比例Percent(2)
			EnumValueAddPriceOption priceOpt = EnumValueAddPriceOption.Percent;
			if (rule.getPriceDefaultOption() == 0)
				priceOpt = EnumValueAddPriceOption.None;
			else if (rule.getPriceDefaultOption() == 1)
				priceOpt = EnumValueAddPriceOption.Money;
			base.setPriceOption(priceOpt);
			base.setPrice(rule.getPrice());
			// 无None(0),金额Money(1),比例Percent(2)
			EnumValueAddPriceOption addPrice = EnumValueAddPriceOption.Percent;
			if (rule.getSinglePriceDefaultOption() == 1)
				addPrice = EnumValueAddPriceOption.Money;
			else if (rule.getSinglePriceDefaultOption() == 0)
				addPrice = EnumValueAddPriceOption.None;
			base.setExtOption(addPrice);

			base.setExtPrice(rule.getSinglePrice());
			base.setIsExtAdd(rule.getIsAdd() == 1);
			base.setAmount(rule.getShare());
			if (rule.getStartDate() != null)
				base.setStartDate(rule.getStartDate());
			if (rule.getEndDate() != null)
				base.setEndDate(rule.getEndDate());
			base.setCurrencyCode(rule.getCurrencyCode());
			if (rule.getIsWeekEffective() != null)
				base.setWeekSet(getWeekSet(rule.getIsWeekEffective()));

			result.add(base);
		}
		return result;
	}

	private String getAdditionalServiceRDisciption(AddValueInfoSimple addValue, EnumLocal language) {
		if (addValue == null)
			return "";

		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = new StringBuilder();

		if (true) {
			if (addValue.getIsInclude() == 1) {
				if (addValue.getShare() > 0)
					if (language == EnumLocal.zh_CN) {
						sb1.append(addValue.getShare() + "份" + addValue.getAddValueCNName() + ",");
					} else {
						sb1.append(" " + addValue.getShare() + " " + addValue.getAddValueENName() + ",");
					}
				else if (language == EnumLocal.zh_CN) {
					sb1.append(addValue.getAddValueCNName() + ",");
				} else {
					sb1.append(addValue.getAddValueENName() + ",");
				}

			}
			if (addValue.isAdd()) {
				if (language == EnumLocal.zh_CN) {
					sb2.append("1份" + addValue.getAddValueCNName());
				} else {
					sb2.append(" 1 " + addValue.getAddValueENName());
				}

				if (addValue.getSinglePriceDefaultOption() == 1) {
					if (language == EnumLocal.zh_CN) {
						sb2.append(" " + addValue.getSinglePrice() + " 元,");
					} else {
						sb2.append(" RMB " + addValue.getSinglePrice() + " ,");
					}

				} else {
					if (language == EnumLocal.zh_CN) {
						sb2.append("首晚房费的" + addValue.getSinglePrice() + "%,");
					} else {
						sb2.append(addValue.getSinglePrice() + "%" + " of the first night room rate. ,");
					}
				}
			}
		}

		if (language == EnumLocal.zh_CN) {
			if (sb1.length() != 0) {
				String temp1 = "";
				if (sb1.toString().contains(","))
					temp1 = sb1.toString().substring(0, sb1.toString().lastIndexOf(","));
				else
					temp1 = sb1.toString();
				sb3.append("包含" + temp1 + ";");
			}
			if (sb2.length() != 0) {
				// "单加" + sb2.ToString().TrimEnd(',')
				String temp1 = "";
				if (sb2.toString().contains(","))
					temp1 = sb2.toString().substring(0, sb2.toString().lastIndexOf(","));
				else
					temp1 = sb2.toString();

				sb3.append("单加" + temp1);
			}
		} else {
			if (sb1.length() != 0) {
				String temp1 = "";
				if (sb1.toString().contains(","))
					temp1 = sb1.toString().substring(0, sb1.toString().lastIndexOf(","));
				else
					temp1 = sb1.toString();

				sb3.append(" Including " + temp1 + ";");
			}
			if (sb2.length() != 0) {
				String temp1 = "";
				if (sb2.toString().contains(","))
					temp1 = sb2.toString().substring(0, sb2.toString().lastIndexOf(","));
				else
					temp1 = sb2.toString();

				sb3.append(" every additional one costs " + temp1);
			}
		}

		if (language == EnumLocal.zh_CN) {
			return sb3.toString().equals("") ? "" : "附加服务：" + sb3.toString();
		}
		return sb3.toString().equals("") ? "" : "Other service：" + sb3.toString();
	}

	private List<SupplierRatePlan> getSuppliers(HotelDetail hotel, EnumLocal language) {
		List<SupplierRatePlan> result = new LinkedList<SupplierRatePlan>();
		if (hotel == null || hotel.getHotelBaseInfo() == null)
			return result;

		EnumInvoiceMode InvoiceMode = EnumInvoiceMode.Hotel;
		String hotelCode = hotel.getHotelBaseInfo().getShotelId();
		Map<String, String> hotelCodeSupplierIdMap = HotelDataServiceAgent.getSupplierIdByShotelId(new String[] { hotelCode });
		String supplierIdStr = hotelCodeSupplierIdMap.get(hotelCode);
		if (StringUtils.isNotEmpty(supplierIdStr)) {
			InvoiceMode = getInvoiceMode(Integer.valueOf(supplierIdStr));
		}

		SupplierRatePlan suprp = new SupplierRatePlan();

		suprp.setBookingRules(getBookingRules(hotel, language));

		if (hotel.getHotelBaseInfo() != null) {
			suprp.setHotelCode(hotel.getHotelBaseInfo().getShotelId());
			suprp.setWeekendStart(hotel.getHotelBaseInfo().getWeekEndStart());
			suprp.setWeekendEnd(hotel.getHotelBaseInfo().getWeekEndEnd());
			List<MSRoomRelation> msList = m_SRelationCache.getMSRoomRelation(hotel.getHotelBaseInfo().getShotelId());
			suprp.setRooms(msList);
		}
		suprp.setInvoiceMode(InvoiceMode);

		result.add(suprp);

		if (result.size() > 0 && (result.get(0).getRooms() == null || result.get(0).getRooms().size() == 0)) {
			result.get(0).setRooms(new LinkedList<MSRoomRelation>());
			List<MSRoomRelation> rooms = new LinkedList<MSRoomRelation>();

			List<String> ids = new LinkedList<String>();
			if (hotel.getRoomBaseInfos() != null && hotel.getRoomBaseInfos() != null) {
				for (RoomTypeInfo room : hotel.getRoomBaseInfos()) {
					if (room.getRoomTypeId() != null && !room.getRoomTypeId().isEmpty()) {
						for (String str : room.getRoomTypeId().split(",")) {
							ids.add(str);
							MSRoomRelation ro = new MSRoomRelation();
							ro.setRoomId(str);
							ro.setRoomTypeId(str);
							rooms.add(ro);
						}
					}
				}
			}
			result.get(0).setRooms(rooms);
		}

		return result;
	}

	/**
	 * 预订规则
	 * @param hotel
	 * @param language
	 * @return
	 */
	private List<com.elong.nb.model.bean.base.BaseBookingRule> getBookingRules(HotelDetail hotel, EnumLocal language) {
		HashMap<Long, HotelBookingRule> dict = new HashMap<Long, HotelBookingRule>();

		if (hotel != null && hotel.getHotelBaseInfo() != null && hotel.getHotelBaseInfo().getHotelBookingRuleList() != null
				&& hotel.getHotelBaseInfo().getHotelBookingRuleList() != null) {
			for (HotelBookingRule rule : hotel.getHotelBaseInfo().getHotelBookingRuleList()) {
				if (!dict.containsKey(rule.getID())) {
					dict.put(rule.getID(), rule);
				}
			}

		}
		if (hotel != null && hotel.getRoomBaseInfos() != null && hotel.getRoomBaseInfos() != null) {
			for (RoomTypeInfo room : hotel.getRoomBaseInfos()) {
				if (room.getRoomBookingRuleList() != null && room.getRoomBookingRuleList() != null) {
					for (HotelBookingRule rule : room.getRoomBookingRuleList()) {
						if (!dict.containsKey(rule.getID())) {
							dict.put(rule.getID(), rule);
						}
					}
				}
			}
		}

		List<com.elong.nb.model.bean.base.BaseBookingRule> result = new LinkedList<com.elong.nb.model.bean.base.BaseBookingRule>();
		for (HotelBookingRule rule : dict.values()) {

			com.elong.nb.model.bean.base.BaseBookingRule temp = new com.elong.nb.model.bean.base.BaseBookingRule();

			// Tools.ParseEnum<com.elong.api.hotel.model.rest.enums.EnumDateType>(rule.DateType.GetHashCode().ToString(),
			// model.rest.enums.EnumDateType.CheckInDay)
			EnumDateType dateType = EnumDateType.CheckInDay;
			if (rule.getDateType() == EnumDateType.BookDay.getValue())
				dateType = EnumDateType.BookDay;
			else if (rule.getDateType() == EnumDateType.CheckInDay.getValue())
				dateType = EnumDateType.CheckInDay;
			else if (rule.getDateType() == EnumDateType.StayDay.getValue())
				dateType = EnumDateType.StayDay;
			temp.setDateType(dateType);

			temp.setDescription(language == EnumLocal.zh_CN ? rule.getCNDescription() : rule.getENDescription());
			if (rule.getStartDate() != null)
				temp.setStartDate(rule.getStartDate());
			if (rule.getEndDate() != null)
				temp.setEndDate(rule.getEndDate());
			temp.setStartHour(rule.getStartHour());
			temp.setEndHour(rule.getEndHour());
			temp.setRoomTypeIds(rule.getRoomTypeID());
			EnumBookingRule br = EnumBookingRule.NeedPhoneNo;
			if (rule.getHotelBooKingRule() == EnumBookingRule.ForeignerNeedEnName.getValue())
				br = EnumBookingRule.ForeignerNeedEnName;
			else if (rule.getHotelBooKingRule() == EnumBookingRule.NeedNationality.getValue())
				br = EnumBookingRule.NeedNationality;
			else if (rule.getHotelBooKingRule() == EnumBookingRule.NoneRule.getValue())
				br = EnumBookingRule.NoneRule;
			else if (rule.getHotelBooKingRule() == EnumBookingRule.PerRoomPerName.getValue())
				br = EnumBookingRule.PerRoomPerName;
			else if (rule.getHotelBooKingRule() == EnumBookingRule.RejectCheckinTime.getValue())
				br = EnumBookingRule.RejectCheckinTime;
			temp.setTypeCode(br);

			temp.setDescription(temp.BuildDescription(language == EnumLocal.zh_CN));

			result.add(temp);
		}
		return result;
	}

	/**
	 * 发票模式
	 * @param SupplierID
	 * @return
	 */
	private EnumInvoiceMode getInvoiceMode(int SupplierID) {
		try {
			GetSupplierInfoBySupplierIDRequest req = new GetSupplierInfoBySupplierIDRequest();
			req.setSupplierID(SupplierID);

			GetSupplierInfoBySupplierIDResponse response = supplierServiceRepository.getSupplierInfoBySupplierID(req);
			if (response != null && response.getResult() != null && response.getResult().getResponseCode() == 0) {
				if (response.getSupplierBaseInfo() != null && response.getSupplierBaseInfo().getSupplierInvoiceInfo() != null) {
					EnumInvoiceMode invoiceMode = EnumInvoiceMode.Elong;
					if (response.getSupplierBaseInfo().getSupplierInvoiceInfo().getInvoiceMode() == InvoiceMode.ELONG_AFTER)
						invoiceMode = EnumInvoiceMode.Elong;
					else if (response.getSupplierBaseInfo().getSupplierInvoiceInfo().getInvoiceMode() == InvoiceMode.HOTEL)
						invoiceMode = EnumInvoiceMode.Hotel;
					else if (response.getSupplierBaseInfo().getSupplierInvoiceInfo().getInvoiceMode() == InvoiceMode.NO_SENSE)
						invoiceMode = EnumInvoiceMode.NoSense;
					return invoiceMode;
				}
			}

			return EnumInvoiceMode.Elong;
		} catch (Exception e) {
			LocalMsg.error(e.getMessage());
			return EnumInvoiceMode.Elong;
		}
	}

	@Override
	public RestResponse<RatePlanResult> GetRatePlans(RestRequest<RatePlanCondition> request, ProxyAccount proxyAccount) {
		RestResponse<RatePlanResult> response = new RestResponse<RatePlanResult>(request.getGuid());
		if (request.getRequest().getPaymentType() == EnumPaymentType.Prepay && !proxyAccount.getEnabledPrepayProducts()) {
			response.setCode(ErrorCode.Data_NoPrepayProducts);
		} else {
			RatePlanResult res = new RatePlanResult();
			response.setResult(res);
			response.getResult().setHotels(getRatePlans(request, proxyAccount));
		}
		return response;
	}

}
