package com.elong.nb.dao.adapter.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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

	private static final String server_ip = CommonsUtil.CONFIG_PROVIDAR.getProperty("goods.server_ip");
	private static final int server_port = Integer.valueOf(CommonsUtil.CONFIG_PROVIDAR.getProperty("goods.server_port"));
	private static final int server_timeout = Integer.valueOf(CommonsUtil.CONFIG_PROVIDAR.getProperty("goods.inv.server_timeout"));

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
