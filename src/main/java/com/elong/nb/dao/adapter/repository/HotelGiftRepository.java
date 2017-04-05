package com.elong.nb.dao.adapter.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Repository;

import com.elong.nb.agent.HotelGiftService.GetHotelGiftListResponse;
import com.elong.nb.agent.HotelGiftService.HotelGiftModel;
import com.elong.nb.agent.HotelGiftService.HotelGiftRelationDate;
import com.elong.nb.agent.HotelGiftService.HotelGiftRelationProduct;
import com.elong.nb.agent.HotelGiftService.IHotelGiftServiceContract;
import com.elong.nb.checklist.CheckListUtil;
import com.elong.nb.data.biglog.BigLog;
import com.elong.nb.model.bean.enums.HotelGiftDateTypeEnum;
import com.elong.nb.model.bean.enums.HotelGiftHourTypeEnum;
import com.elong.nb.model.bean.enums.HotelGiftWayOfGivingEnum;
import com.elong.nb.model.rateplan.HotelGift;
import com.elong.nb.model.rateplan.HotelGiftDate;
import com.elong.nb.model.rateplan.HotelGiftProductRelation;
import com.elong.nb.util.DateUtil;

@Repository
public class HotelGiftRepository {
	@Resource(name = "hotelGiftServiceContract")
	IHotelGiftServiceContract hotelGiftServiceContract;

	/**
	 * 使用hotel3接口实现
	 * @param sHotelId
	 * @return
	 */
	public List<HotelGift> getHotelGiftBySHotelId(String shotelId) {
		List<HotelGift> list = new ArrayList<HotelGift>();
		GetHotelGiftListResponse res = null;
		BigLog log = new BigLog();
		try {
			log.setAppName("IHotelGiftServiceContract");
			log.setTraceId(UUID.randomUUID().toString());
			log.setSpan("1.1");
			log.setServiceName("getHotelGiftListByHotelID");
			log.setRequestBody(shotelId);
			long start = System.currentTimeMillis();
			res = hotelGiftServiceContract.getHotelGiftListByHotelID(shotelId);
			log.setElapsedTime(String.valueOf(System.currentTimeMillis()
					- start));
			//log.setRequestBody(res != null ? JSON.toJSONString(res) : "");
			if (res != null && res.getResult() != null) {
				log.setBusinessErrorCode(String.valueOf(res.getResult()
						.getResponseCode()));
				log.setExceptionMsg(res.getResult().getErrorMessage());
			} else {
				log.setResponseCode("1");
			}

		} catch (Exception ex) {
			log.setException(ex);
			log.setExceptionMsg(ex.getMessage());
			log.setResponseCode("1");
			CheckListUtil.error(log);
			throw new RuntimeException(ex.getMessage()+"|shotelId:"+shotelId,ex);
		}
		CheckListUtil.info(log);
		if (res != null && res.getResult() != null
				&& res.getResult().getResponseCode() == 0
				&& res.getHotelGiftList() != null
				&& res.getHotelGiftList().getHotelGiftModel() != null
				&& res.getHotelGiftList().getHotelGiftModel().size() > 0) {
			Date today = DateUtil.getDate(new Date());
			for (HotelGiftModel item : res.getHotelGiftList()
					.getHotelGiftModel()) {
				if (item.getStatus() == 0) {
					continue;
				}
				HotelGiftDateTypeEnum dateType = HotelGiftDateTypeEnum.CheckinDate;
				String weekSet = "";
				HotelGiftHourTypeEnum hourType = HotelGiftHourTypeEnum.Hours24;
				int hourNumber = -1;
				List<HotelGiftDate> dates = new ArrayList<HotelGiftDate>();
				if (item.getRelationDateList() != null) {
					for (HotelGiftRelationDate date : item
							.getRelationDateList().getHotelGiftRelationDate()) {
						if (date.getBeginDate().toDate().compareTo(today) <= 0
								&& date.getEndDate().toDate().compareTo(today) >= 0) {
							HotelGiftDateTypeEnum giftDateType = HotelGiftDateTypeEnum.CheckinDate;
							if (date.getDateType() == com.elong.nb.agent.HotelGiftService.HotelGiftDateTypeEnum.BOOKING_DATE)
								giftDateType = HotelGiftDateTypeEnum.BookingDate;
							dateType = giftDateType;

							weekSet = BitMaskIntToString(date.getBitSum4Week());
							HotelGiftHourTypeEnum giftHourType = HotelGiftHourTypeEnum.Hours24;
							if (date.getHourType() == com.elong.nb.agent.HotelGiftService.HotelGiftHourTypeEnum.X_HOUR_AFTER)
								giftHourType = HotelGiftHourTypeEnum.XHourAfter;
							else if (date.getHourType() == com.elong.nb.agent.HotelGiftService.HotelGiftHourTypeEnum.X_HOUR_BEFORE)
								giftHourType = HotelGiftHourTypeEnum.XHourBefore;
							hourType = giftHourType;

							hourNumber = date.getHourNumber();

							HotelGiftDate hg = new HotelGiftDate();
							hg.setEndDate(date.getEndDate().toDate());
							hg.setStartDate(date.getBeginDate().toDate());
							dates.add(hg);
						}
					}
				}
				if (dates.size() == 0) {
					continue;
				}
				List<HotelGiftProductRelation> products = new ArrayList<HotelGiftProductRelation>();
				if (item.isIsAllProductRelated()) {
					HotelGiftProductRelation gp = new HotelGiftProductRelation();

					gp.setRatePlanId(0);
					gp.setRoomTypeIds("All");

					products.add(gp);
				} else {
					if (item != null
							&& item.getRelationProductList() != null
							&& item.getRelationProductList().getHotelGiftRelationProduct() != null) {
						for (HotelGiftRelationProduct p : item
								.getRelationProductList()
								.getHotelGiftRelationProduct()) {
							if (p.getRoomTypeID() != "none") {
								HotelGiftProductRelation hgp = new HotelGiftProductRelation();
								hgp.setRatePlanId(p.getRatePlanID());
								hgp.setRoomTypeIds(p.getRoomTypeID());
								products.add(hgp);
							}
						}
					}
				}
				if (products.size() == 0) {
					continue;
				}
				int wayOfGiving = item.getWayOfGiving();
				if (wayOfGiving == 3) {
					wayOfGiving = 0;
				} else if (wayOfGiving == 4) {
					wayOfGiving = 1;
				}

				HotelGift hg = new HotelGift();

				hg.setDateType(dateType);
				hg.setEffectiveDates(dates);
				hg.setGiftContent(item.getGiftContentCn());
				hg.setGiftContentEn(item.getGiftContentEn());
				hg.setGiftTypes(BitMaskIntToString(item.getGiftTypes()));
				hg.setHotelCode(shotelId);
				hg.setHotelGiftId(item.getGiftID());
				hg.setHourNumber(hourNumber);
				hg.setHourType(hourType);
				hg.setRelatedProducts(products);
				// 送礼方式 每间房送一回礼品EveryRoom(0)，每间房每个晚上送一回礼品EveryRoomPerDay(1),其它
				// Other(2);
				HotelGiftWayOfGivingEnum givingEnum = HotelGiftWayOfGivingEnum.EveryRoom;
				if (wayOfGiving == 0)
					givingEnum = HotelGiftWayOfGivingEnum.EveryRoom;
				else if (wayOfGiving == 1)
					givingEnum = HotelGiftWayOfGivingEnum.EveryRoomPerDay;
				if (wayOfGiving == 2)
					givingEnum = HotelGiftWayOfGivingEnum.Other;
				hg.setWayOfGiving(givingEnum);

				hg.setWayOfGivingOther(item.getWayOfGivingOtherCn());
				hg.setWayOfGivingOtherEn(item.getWayOfGivingOtherEn());
				hg.setWeekSet(weekSet);
				list.add(hg);
			}
		}
		return list;
	}

	public String BitMaskIntToString(long bitSum) {
		List<Integer> list = new ArrayList<Integer>();
		long loopNum = bitSum;
		for (int i = 1;; i++) {
			if (loopNum == 0)
				break;
			if (loopNum % 2 == 1) {
				list.add(i);
			}
			loopNum /= 2;
		}
		String joinStrs = StringUtils.join(list.toArray(), ",");
		return joinStrs;
	}

}
