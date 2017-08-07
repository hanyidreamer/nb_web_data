package com.elong.nb.dao.adapter.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.joda.time.DateTime;
import org.springframework.stereotype.Repository;

import com.elong.common.util.StringUtils;
import com.elong.hotel.searchagent.thrift.dss.GetInvAndInstantConfirmRequest;
import com.elong.hotel.searchagent.thrift.dss.GetInvAndInstantConfirmResponse;
import com.elong.hotel.searchagent.thrift.dss.InvDetail;
import com.elong.hotel.searchagent.thrift.dss.MhotelAttr;
import com.elong.hotel.searchagent.thrift.dss.MhotelDetail;
import com.elong.hotel.searchagent.thrift.dss.ShotelAttr;
import com.elong.hotel.searchagent.thrift.dss.ShotelDetail;
import com.elong.hotel.searchagent.thrift.dss.SroomDetail;
import com.elong.nb.agent.ProductForPartnerServiceContract.GetInvChangeAndInstantConfirmRequest;
import com.elong.nb.agent.ProductForPartnerServiceContract.GetInvChangeAndInstantConfirmResponse;
import com.elong.nb.agent.ProductForPartnerServiceContract.GetInventoryChangeDetailRequest;
import com.elong.nb.agent.ProductForPartnerServiceContract.GetInventoryChangeDetailResponse;
import com.elong.nb.agent.ProductForPartnerServiceContract.IProductForPartnerServiceContract;
import com.elong.nb.agent.ProductForPartnerServiceContract.ResourceInvAndInstantConfirmState;
import com.elong.nb.agent.ProductForPartnerServiceContract.ResourceInventoryState;
import com.elong.nb.agent.thrift.utils.ThriftUtils;
import com.elong.nb.checklist.CheckListUtil;
import com.elong.nb.common.util.CommonsUtil;
import com.elong.nb.common.util.SafeConvertUtils;
import com.elong.nb.data.biglog.BigLog;
import com.elong.nb.model.bean.Inventory;
import com.elong.nb.util.DateUtil;
import com.google.gson.Gson;

@Repository
public class InventoryRepository {

	@Resource(name = "webProductForPartnerServiceContract")
	private IProductForPartnerServiceContract webProductForPartnerServiceContract;

	private static final String server_ip = CommonsUtil.CONFIG_PROVIDAR.getProperty("goods.server_ip");
	private static final int server_port = Integer.valueOf(CommonsUtil.CONFIG_PROVIDAR.getProperty("goods.server_port"));
	private static final int server_timeout = Integer.valueOf(CommonsUtil.CONFIG_PROVIDAR.getProperty("goods.inv.server_timeout"));

	/**
	 * 获取库存
	 * @param mHotelId
	 * @param sHotelId
	 * @param roomTypeId
	 * @param startDate
	 * @param endDate
	 * @param isNeedInstantConfirm
	 * @return
	 */
	public List<Inventory> getInventorys(String mHotelId, String sHotelId, String roomTypeId, Date startDate, Date endDate,
			boolean isNeedInstantConfirm, boolean isForBooking, String guid) {
		List<Inventory> inventorys = new LinkedList<Inventory>();

		BigLog log = new BigLog();
		try {
			log.setUserLogType(guid);
			log.setAppName("IProductForPartnerServiceContract");
			log.setTraceId(UUID.randomUUID().toString());
			log.setSpan("1.1");
			// 需要即时确认的库存
			if (isNeedInstantConfirm) {
				GetInvChangeAndInstantConfirmRequest request = new GetInvChangeAndInstantConfirmRequest();
				request.setHotelID(sHotelId);
				request.setBeginTime(DateUtil.toDateTime(startDate));
				request.setEndTime(DateUtil.toDateTime(endDate));
				if (StringUtils.isNotBlank(roomTypeId)) {
					request.setRoomTypeIDs(roomTypeId);
				}
				request.setOperatorTime(new DateTime());
				request.setIsNeedInstantConfirm(!isForBooking);
				log.setServiceName("getInventoryChangeDetailAndInstantConfirm");
				long start = System.currentTimeMillis();
				GetInvChangeAndInstantConfirmResponse response = this.webProductForPartnerServiceContract
						.getInventoryChangeDetailAndInstantConfirm(request);
				log.setElapsedTime(String.valueOf(System.currentTimeMillis() - start));
				if (response != null && response.getResourceInvAndInstantConfirmStateList() != null
						&& response.getResourceInvAndInstantConfirmStateList().getResourceInvAndInstantConfirmState() != null
						&& response.getResourceInvAndInstantConfirmStateList().getResourceInvAndInstantConfirmState().size() > 0) {
					log.setBusinessErrorCode("0");
					log.setResponseBody("IP:" + response.getResult().getApplicationServerIP() + "time:"
							+ response.getResult().getUsedMillionSecond());
					for (ResourceInvAndInstantConfirmState item : response.getResourceInvAndInstantConfirmStateList()
							.getResourceInvAndInstantConfirmState()) {
						Inventory inv = new Inventory();
						inv.setHotelID(mHotelId);
						inv.setStartDate(item.getBeginDate().toDate());
						inv.setEndDate(item.getEndDate().toDate());
						inv.setStartTime(item.getBeginTime());
						inv.setEndTime(item.getEndTime());
						inv.setAvailableAmount(item.getAvailableAmount());
						inv.setAvailableDate(item.getAvailableTime().toDate());
						inv.setRoomTypeID(item.getRoomTypeID());
						inv.setStatus(item.getStatus() == 0);
						inv.setOverBooking(item.getIsOverBooking());
						inv.setHotelCode(item.getHotelID());
						inv.setIsInstantConfirm(item.isIsInstantConfirm());
						inv.setIC_BeginTime(item.getICBeginTime());
						inv.setIC_EndTime(item.getICEndTime());
						convertInventory(inv);
						inventorys.add(inv);
					}
				} else {
					inventorys = new ArrayList<Inventory>();
				}

			} else {
				GetInventoryChangeDetailRequest request = new GetInventoryChangeDetailRequest();
				request.setHotelID(sHotelId);
				request.setBeginTime(DateUtil.toDateTime(startDate));
				request.setEndTime(DateUtil.toDateTime(endDate));
				if (StringUtils.isNotBlank(roomTypeId)) {
					request.setRoomTypeIDs(roomTypeId);
				}
				request.setOperatorTime(new DateTime());
				log.setServiceName("getInventoryChangeDetail");
				long start = System.currentTimeMillis();
				GetInventoryChangeDetailResponse response = this.webProductForPartnerServiceContract.getInventoryChangeDetail(request);
				long end = System.currentTimeMillis();
				log.setElapsedTime(String.valueOf(end - start));
				if (response != null && response.getResourceInventoryStateList() != null
						&& response.getResourceInventoryStateList().getResourceInventoryState() != null
						&& response.getResourceInventoryStateList().getResourceInventoryState().size() > 0) {
					log.setBusinessErrorCode("0");
					if (response.getResult() != null) {
						log.setResponseBody("IP:" + response.getResult().getApplicationServerIP() + "time:"
								+ response.getResult().getUsedMillionSecond());
					}
					for (ResourceInventoryState item : response.getResourceInventoryStateList().getResourceInventoryState()) {
						Inventory inv = new Inventory();
						inv.setHotelID(mHotelId);
						inv.setStartDate(item.getBeginDate().toDate());
						inv.setEndDate(item.getEndDate().toDate());
						inv.setStartTime(item.getBeginTime());
						inv.setEndTime(item.getEndTime());
						inv.setAvailableDate(item.getAvailableTime().toDate());
						inv.setRoomTypeID(item.getRoomTypeID());
						inv.setStatus(item.getStatus() == 0);
						inv.setAvailableAmount(item.getAvailableAmount());
						inv.setOverBooking(item.getIsOverBooking());
						inv.setHotelCode(item.getHotelID());
						convertInventory(inv);
						inventorys.add(inv);
					}
				} else {
					inventorys = new ArrayList<Inventory>();
				}
			}
		} catch (Exception ex) {
			log.setException(ex);
			log.setExceptionMsg(ex.getMessage());
			CheckListUtil.error(log);
			throw new RuntimeException("Inventory", ex);
		}
		CheckListUtil.info(log);
		return inventorys;
	}

	/**
	 * 获取库存接口(商品库)
	 * @param hotelIdMap
	 * @param roomTypeIds
	 * @param startDate
	 * @param endDate
	 * @param isNeedInstantConfirm
	 * @param orderFrom
	 * @param guid
	 * @return
	 */
	public List<Inventory> getInventorys(Map<String, List<String>> hotelIdMap, List<String> roomTypeIds, Date startDate, Date endDate,
			boolean isNeedInstantConfirm, int orderFrom, String guid) {
		BigLog log = new BigLog();
		log.setUserLogType(guid);
		log.setAppName("InventoryRepository");
		log.setTraceId(guid);
		log.setSpan("1.1");
		log.setServiceName("getInventorys");
		List<Inventory> inventorys = new LinkedList<Inventory>();
		GetInvAndInstantConfirmRequest request = new GetInvAndInstantConfirmRequest();
		request.setStart_date(startDate.getTime());
		// //商品库时间需要逻辑结束时间+1天(商品库逻辑已修改)
		// request.setEnd_date(DateUtil.addDays(endDate, 1).getTime());
		request.setEnd_date(endDate.getTime());
		request.setNeed_instant_confirm(isNeedInstantConfirm);
		request.setOrder_from(orderFrom);
		request.setSearch_from(3);// 3：NBAPI
		List<MhotelAttr> mhotel_attr = new ArrayList<MhotelAttr>();
		for (String hotelId : hotelIdMap.keySet()) {
			MhotelAttr mhotel = new MhotelAttr();
			mhotel.setMhotel_id(Integer.valueOf(hotelId));
			if (hotelIdMap.get(hotelId) != null) {
				List<ShotelAttr> shotels = new LinkedList<ShotelAttr>();
				for (String hotelCode : hotelIdMap.get(hotelId)) {
					ShotelAttr shotel = new ShotelAttr();
					shotel.setShotel_id(Integer.valueOf(hotelCode));
					if (roomTypeIds != null && roomTypeIds.size() > 0) {
						List<Integer> sroomIds = new LinkedList<Integer>();
						for (String roomTypeId : roomTypeIds) {
							sroomIds.add(Integer.valueOf(roomTypeId));
						}
						shotel.setSroom_ids(sroomIds);
					}
					shotels.add(shotel);
				}
				mhotel.setShotel_attr(shotels);
			}
			mhotel_attr.add(mhotel);
		}
		request.setMhotel_attr(mhotel_attr);
		try {
			long start = System.currentTimeMillis();
			GetInvAndInstantConfirmResponse response = ThriftUtils.getInventory(request, server_ip, server_port, server_timeout);
			long end = System.currentTimeMillis();
			log.setElapsedTime(String.valueOf(end - start));
			if (response != null) {
				if (response.getReturn_code() == 0) {
					log.setBusinessErrorCode("0");
					if (response.getMhotel_detail() != null && response.getMhotel_detail().size() > 0) {
						for (MhotelDetail mhotel : response.getMhotel_detail()) {
							if (mhotel != null && mhotel.getShotel_detail() != null && mhotel.getShotel_detail().size() > 0) {
								for (ShotelDetail shotel : mhotel.getShotel_detail()) {
									if (shotel != null && shotel.getSroom_detail() != null && shotel.getSroom_detail().size() > 0) {
										for (SroomDetail sroom : shotel.getSroom_detail()) {
											if (sroom != null && sroom.getInv_detail() != null && sroom.getInv_detail().size() > 0) {
												for (InvDetail item : sroom.getInv_detail()) {
													Inventory inv = new Inventory();
													inv.setHotelID(SafeConvertUtils.ToHotelId(mhotel.getMhotel_id()));
													inv.setStartDate(new Date(item.getBegin_date()));
													inv.setEndDate(new Date(item.getEnd_date()));
													inv.setStartTime(item.getBegin_time());
													inv.setEndTime(item.getEnd_time());
													inv.setAvailableAmount(item.getAvailable_amount());
													inv.setAvailableDate(new Date(item.getAvailable_date()));
													inv.setRoomTypeID(SafeConvertUtils.ToRoomId(sroom.sroom_id));
													inv.setStatus(item.getStatus() == 0);// 0:有效
													inv.setOverBooking(item.getIs_over_booking());// 0:可超售 1:不可超售
													inv.setHotelCode(SafeConvertUtils.ToHotelId(shotel.shotel_id));
													if (isNeedInstantConfirm) {
														inv.setIsInstantConfirm(item.instant_confirm);
														String icBeginTime = item.getIc_begin_time();
														String icEndTime = item.getIc_end_time();
														// 不是立即确认情况下的兼容
														if (!item.instant_confirm) {
															if (inv.isStatus()) {
																if (StringUtils.isEmpty(icBeginTime)) {
																	icBeginTime = "00:00";
																}
																if (StringUtils.isEmpty(icEndTime)) {
																	icEndTime = "23:59";
																}
															} else {
																if (StringUtils.isEmpty(icBeginTime)) {
																	icBeginTime = "23:59";
																}
																if (StringUtils.isEmpty(icEndTime)) {
																	icEndTime = "00:00";
																}
															}
														}
														inv.setIC_BeginTime(icBeginTime);
														inv.setIC_EndTime(icEndTime);
													}
													convertInventory(inv);
													inventorys.add(inv);
												}
											}
										}
									}
								}
							}
						}
					}
				} else if (response.getReturn_code() < 0) {// 系统异常
					throw new RuntimeException(response.getReturn_msg());
				} else {
					Gson gson = new Gson();
					log.setRequestBody(gson.toJson(request));
					log.setBusinessErrorCode(String.valueOf(response.return_code));
					log.setExceptionMsg(response.getReturn_msg());
				}
			} else {
				throw new RuntimeException("获取商品库库存信息异常");
			}
		} catch (Exception ex) {
			Gson gson = new Gson();
			log.setRequestBody(gson.toJson(request));
			log.setException(ex);
			log.setExceptionMsg(ex.getMessage());
			CheckListUtil.error(log);
			throw new RuntimeException("Inventory:" + ex.getMessage(), ex);
		}
		CheckListUtil.info(log);
		return inventorys;
	}

	// 超售状态转换
	private void convertInventory(Inventory inv) {
		Date minDate = DateUtil.getMinValue();
		if (inv.getAvailableAmount() > 3) {
			inv.setAvailableAmount(3);
			inv.setOverBooking(0);
		}
		if (inv.getEndDate().getTime() < minDate.getTime()) {
			inv.setEndDate(minDate);
		}
		if (inv.getStartDate().getTime() < minDate.getTime()) {
			inv.setStartDate(minDate);
		}
	}
}
