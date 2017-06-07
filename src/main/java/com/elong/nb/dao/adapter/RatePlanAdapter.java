package com.elong.nb.dao.adapter;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.elong.hotel.goods.ds.thrift.GetBaseRatePlanDRRGiftResponse;
import com.elong.hotel.goods.ds.thrift.MetaAddValueInfoSimple;
import com.elong.hotel.goods.ds.thrift.MetaAddValuePolicyInfo;
import com.elong.hotel.goods.ds.thrift.MetaDRRInfo;
import com.elong.hotel.goods.ds.thrift.MetaHotelBookingRule;
import com.elong.hotel.goods.ds.thrift.MetaHotelGiftModel;
import com.elong.hotel.goods.ds.thrift.MetaHotelGiftRelationDate;
import com.elong.hotel.goods.ds.thrift.MetaHotelInfo;
import com.elong.hotel.goods.ds.thrift.MetaMHotelBaseRpDrrGift;
import com.elong.hotel.goods.ds.thrift.MetaPrePayInfo;
import com.elong.hotel.goods.ds.thrift.MetaProductInfo;
import com.elong.hotel.goods.ds.thrift.MetaRatePlanBaseInfo;
import com.elong.hotel.goods.ds.thrift.MetaRoomTypeInfo;
import com.elong.hotel.goods.ds.thrift.MetaSHotelBaseRpDrrGift;
import com.elong.hotel.goods.ds.thrift.MetaVouchInfo;
import com.elong.nb.common.util.ProductTypeUtils;
import com.elong.nb.common.util.SafeConvertUtils;
import com.elong.nb.model.bean.base.BaseBookingRule;
import com.elong.nb.model.bean.base.BaseDrrRule;
import com.elong.nb.model.bean.base.BaseGuaranteeRule;
import com.elong.nb.model.bean.base.BasePrepayRule;
import com.elong.nb.model.bean.base.BaseValueAddRule;
import com.elong.nb.model.bean.enums.EnumBookingRule;
import com.elong.nb.model.bean.enums.EnumDateType;
import com.elong.nb.model.bean.enums.EnumDrrFeeType;
import com.elong.nb.model.bean.enums.EnumDrrPreferential;
import com.elong.nb.model.bean.enums.EnumDrrRuleCode;
import com.elong.nb.model.bean.enums.EnumGuaranteeChangeRule;
import com.elong.nb.model.bean.enums.EnumGuaranteeMoneyType;
import com.elong.nb.model.bean.enums.EnumGuestTypeCode;
import com.elong.nb.model.bean.enums.EnumPaymentType;
import com.elong.nb.model.bean.enums.EnumPrepayChangeRule;
import com.elong.nb.model.bean.enums.EnumPrepayCutPayment;
import com.elong.nb.model.bean.enums.EnumValueAddPriceOption;
import com.elong.nb.model.bean.enums.HotelGiftDateTypeEnum;
import com.elong.nb.model.bean.enums.HotelGiftHourTypeEnum;
import com.elong.nb.model.bean.enums.HotelGiftWayOfGivingEnum;
import com.elong.nb.model.rateplan.HotelGift;
import com.elong.nb.model.rateplan.HotelGiftDate;
import com.elong.nb.model.rateplan.HotelGiftProductRelation;
import com.elong.nb.model.rateplan.HotelRatePlan;
import com.elong.nb.model.rateplan.RatePlan;
import com.elong.nb.model.rateplan.SupplierRatePlan;
import com.elong.nb.model.rateplan.fornb.EnumPrepayRule;
import com.elong.nb.model.rateplan.fornb.GiftRelation;
import com.elong.nb.util.DateUtil;

public class RatePlanAdapter extends
		AbstractGoodsAdapter<HotelRatePlan, GetBaseRatePlanDRRGiftResponse> {
	private Map<String, EnumPaymentType> hotelCodeFilterType;
	private Map<String, Integer> shotelCooperationTypeMap;
//	private static M_SRelationCache m_SRelationCache=new M_SRelationCache();
	private boolean isCn;

	@Override
	public List<HotelRatePlan> toNBObject(
			GetBaseRatePlanDRRGiftResponse goodsObject) {
		if (goodsObject.getReturn_code() == 0) {
			List<HotelRatePlan> HotelRatePlans=new LinkedList<HotelRatePlan>();
			if (goodsObject.getMhotel_detail() != null) {
				for (MetaMHotelBaseRpDrrGift metaMhotel : goodsObject
						.getMhotel_detail()) {
					HotelRatePlan hotelRatePlan = new HotelRatePlan();
					hotelRatePlan
							.setSuppliers(new LinkedList<SupplierRatePlan>());
					hotelRatePlan.setRatePlans(new LinkedList<RatePlan>());
					hotelRatePlan.setHotelID(SafeConvertUtils
							.ToHotelId(metaMhotel.getMhotel_id()));
					hotelRatePlan.setGifts(new LinkedList<HotelGift>());
					if (metaMhotel.getShotel_detail() != null) {
						for (MetaSHotelBaseRpDrrGift metaSHotelBaseRpDrrGift : metaMhotel
								.getShotel_detail()) {
							hotelRatePlan.getSuppliers().add(
									toSupplier(metaSHotelBaseRpDrrGift
											.getHotel_base_info(),
											metaSHotelBaseRpDrrGift
													.getRoom_base_infos()));
							String hotelCode = SafeConvertUtils
									.ToHotelId(metaSHotelBaseRpDrrGift
											.getHotel_base_info()
											.getShotel_id());
							Map<Integer, BaseDrrRule> drrMap = toDrrRule(metaSHotelBaseRpDrrGift
									.getDrrs());
							Map<Integer, List<Integer>> drrIdsMap = new HashMap<Integer, List<Integer>>();
							Map<Integer, List<GiftRelation>> giftRelationMap = new HashMap<Integer, List<GiftRelation>>();
							Map<Integer, List<String>> roomTypesrpRelation=new HashMap<Integer, List<String>>();
							if (metaSHotelBaseRpDrrGift.getRoom_base_infos() != null) {
								for (MetaRoomTypeInfo metaRoomTypeInfo : metaSHotelBaseRpDrrGift
										.getRoom_base_infos()) {
									String roomTypeId = SafeConvertUtils
											.ToRoomId(metaRoomTypeInfo
													.getRoom_type_id());
									for (MetaProductInfo metaProductInfo : metaRoomTypeInfo
											.getProducts()) {
										if(roomTypesrpRelation.containsKey(metaProductInfo.getRate_plan_id())){
											roomTypesrpRelation.get(metaProductInfo.getRate_plan_id()).add(roomTypeId);
										}else{
											List<String> roomTypeIds=new LinkedList<String>();
											roomTypeIds.add(roomTypeId);
											roomTypesrpRelation.put(metaProductInfo.getRate_plan_id(), roomTypeIds);
										}
										if (metaProductInfo.getDrr_ids() != null) {
											if (drrIdsMap
													.containsKey(metaProductInfo
															.getRate_plan_id())) {
												drrIdsMap
														.get(metaProductInfo
																.getRate_plan_id())
														.addAll(metaProductInfo
																.getDrr_ids());
											} else {
												drrIdsMap.put(metaProductInfo
														.getRate_plan_id(),
														metaProductInfo
																.getDrr_ids());
											}
										}
										if (metaProductInfo.getGift_ids() != null) {
											for (int giftId : metaProductInfo
													.getGift_ids()) {
												GiftRelation giftRelation = new GiftRelation();
												giftRelation
														.setRatePlanId(metaProductInfo
																.getRate_plan_id());
												giftRelation
														.setRoomTypeId(roomTypeId);
												if (giftRelationMap
														.containsKey(giftId)) {
													giftRelationMap.get(giftId)
															.add(giftRelation);
												} else {
													List<GiftRelation> giftList = new LinkedList<GiftRelation>();
													giftList.add(giftRelation);
													giftRelationMap.put(giftId,
															giftList);
												}
											}
										}
									}
								}
							}
							List<HotelGift> hotelGifts=toGift(metaSHotelBaseRpDrrGift.getGifts(), hotelCode, giftRelationMap);
							if(hotelGifts!=null){
								hotelRatePlan.getGifts().addAll(hotelGifts);
							}
							if (metaSHotelBaseRpDrrGift.getRatePlans() != null) {
								for (MetaRatePlanBaseInfo metaRatePlanBaseInfo : metaSHotelBaseRpDrrGift
										.getRatePlans()) {
									List<BaseDrrRule> drrRuleList = new LinkedList<BaseDrrRule>();
									if (drrIdsMap
											.containsKey(metaRatePlanBaseInfo
													.getRate_plan_id())) {
										if (drrIdsMap.get(metaRatePlanBaseInfo
												.getRate_plan_id()) != null) {
											for (int drrId : drrIdsMap
													.get(metaRatePlanBaseInfo
															.getRate_plan_id())) {
												if (drrMap.containsKey(drrId)) {
													drrRuleList.add(drrMap
															.get(drrId));
												}
											}
										}
									}
									if(hotelCodeFilterType.containsKey(hotelCode)){
										EnumPaymentType paymentType=EnumPaymentType.forValue(Integer.valueOf(metaRatePlanBaseInfo
												.getSettlement_type()));
										if(paymentType==hotelCodeFilterType.get(hotelCode)){
											continue;
										}
									}
									String roomTypeIds="";
									if(roomTypesrpRelation.containsKey(metaRatePlanBaseInfo.getRate_plan_id())){
										roomTypeIds=StringUtils.join(roomTypesrpRelation.get(metaRatePlanBaseInfo.getRate_plan_id()),",");
									}
									hotelRatePlan.getRatePlans().add(toRatePlan(metaRatePlanBaseInfo,
													hotelCode, drrRuleList,roomTypeIds));
								}
							}
						}
					}
					HotelRatePlans.add(hotelRatePlan);
				}
				return HotelRatePlans;
			}
		}
		return null;
	}

	/**
	 * 转换供应商节点
	 * 
	 * @param hotelInfo
	 * @param roomBaseInfo
	 * @return
	 */
	private SupplierRatePlan toSupplier(MetaHotelInfo hotelInfo,
			List<MetaRoomTypeInfo> roomBaseInfo) {
		SupplierRatePlan supplier = new SupplierRatePlan();
		supplier.setHotelCode(SafeConvertUtils.ToHotelId(hotelInfo
				.getShotel_id()));
//		List<MSRoomRelation> msList = m_SRelationCache
//				.getMSRoomRelation(supplier.getHotelCode());
//		supplier.setRooms(msList);
		supplier.setWeekendEnd(hotelInfo.getWeek_end_end());
		supplier.setWeekendStart(hotelInfo.getWeek_end_start());
		supplier.setBookingRules(toBaseBookingRule(
				hotelInfo.getHotel_booking_rule_list(), roomBaseInfo));
		return supplier;

	}

	/**
	 * 转换预订规则
	 * 
	 * @param hotelBookingRules
	 * @param roomBaseInfos
	 * @return
	 */
	private List<BaseBookingRule> toBaseBookingRule(
			List<MetaHotelBookingRule> hotelBookingRules,
			List<MetaRoomTypeInfo> roomBaseInfos) {
		Map<Long, BaseBookingRule> bookingRuleMap = new HashMap<Long, BaseBookingRule>();
		List<BaseBookingRule> bookingRules = new LinkedList<BaseBookingRule>();
		if (hotelBookingRules != null) {
			for (MetaHotelBookingRule hotelBookingRule : hotelBookingRules) {
				if (bookingRuleMap.containsKey(hotelBookingRule.getId())) {
					bookingRuleMap.put(hotelBookingRule.getId(),
							toBaseBookingRule(hotelBookingRule));
				}
			}
		}
		if (roomBaseInfos != null) {
			for (MetaRoomTypeInfo roomBaseInfo : roomBaseInfos) {
				if (roomBaseInfo.getHotel_booking_rule_list() != null) {
					for (MetaHotelBookingRule hotelBookingRule : roomBaseInfo
							.getHotel_booking_rule_list()) {
						if (!bookingRuleMap
								.containsKey(hotelBookingRule.getId())) {
							bookingRuleMap.put(hotelBookingRule.getId(),
									toBaseBookingRule(hotelBookingRule));
						}
					}
				}
			}
		}
		if (bookingRuleMap.size() > 0) {
			for (BaseBookingRule baseBookingRule : bookingRuleMap.values()) {
				bookingRules.add(baseBookingRule);
			}
		}
		return bookingRules;

	}

	/**
	 * 转换预订规则对象
	 * 
	 * @param hotelBookingRule
	 * @return
	 */
	private BaseBookingRule toBaseBookingRule(
			MetaHotelBookingRule hotelBookingRule) {
		BaseBookingRule bookingRule = new BaseBookingRule();
		bookingRule.setDateType(EnumDateType
				.forValue(hotelBookingRule.date_type));
		bookingRule.setDescription("");
		bookingRule.setEndDate(new Date(hotelBookingRule.getEnd_date()));
		bookingRule.setEndHour(hotelBookingRule.getEnd_hour());
		bookingRule.setRoomTypeIds(hotelBookingRule.getRoom_type_id());
		bookingRule.setStartDate(new Date(hotelBookingRule.getStart_date()));
		bookingRule.setStartHour(hotelBookingRule.getStart_hour());
		bookingRule.setTypeCode(EnumBookingRule.forValue(hotelBookingRule
				.getHotelBookingRule()));
		return bookingRule;
	}

	/**
	 * 转换rp
	 * @param metaRatePlanBaseInfo 
	 * @param hotelCode
	 * @param drrRuleList
	 * @param roomTypeIds
	 * @return
	 */
	private RatePlan toRatePlan(MetaRatePlanBaseInfo metaRatePlanBaseInfo,
			String hotelCode, List<BaseDrrRule> drrRuleList, String roomTypeIds) {
		RatePlan ratePlan = new RatePlan();
		ratePlan.setIsLimitTimeSale(metaRatePlanBaseInfo
				.getIs_limit_time_sale() == 1);
		ratePlan.setMaxAdvHours(metaRatePlanBaseInfo
				.getMax_advance_booking_days());
		ratePlan.setMaxDays(metaRatePlanBaseInfo.getMax_stay_days());
		ratePlan.setMinAdvHours(metaRatePlanBaseInfo
				.getMin_advance_booking_days());
		ratePlan.setMinAmount(metaRatePlanBaseInfo.getMin_checkin_rooms());
		ratePlan.setMinDays(metaRatePlanBaseInfo.getMin_stay_days());
		ratePlan.setPaymentType(EnumPaymentType.forValue(Integer.valueOf(metaRatePlanBaseInfo
				.getSettlement_type())));
		if (ratePlan.getPaymentType() == EnumPaymentType.Prepay) {
			ratePlan.setPrepayRules(toPrepayRule(metaRatePlanBaseInfo
					.getRate_plan_pre_pay_rule_list()));
		} else {
			ratePlan.setGuaranteeRules(toGuaranteeRule(metaRatePlanBaseInfo
					.getRate_plan_vouch_rule_list()));
		}
		boolean isHourPayRoom=ProductTypeUtils.isHourPayRoom(metaRatePlanBaseInfo.getCn_rate_plan_name());
		ratePlan.setProductTypes(parseProductType(metaRatePlanBaseInfo.getProduct_type(),metaRatePlanBaseInfo.getBooking_channel(),isHourPayRoom));
		ratePlan.setRatePlanId(metaRatePlanBaseInfo.getRate_plan_id());
		ratePlan.setRatePlanName(isCn ? metaRatePlanBaseInfo
				.getCn_rate_plan_name() : metaRatePlanBaseInfo
				.getEn_rate_plan_name());
		ratePlan.setRoomTypeIds(roomTypeIds);
		ratePlan.setStartTime(DateUtil.getTimeString(new Date(
				metaRatePlanBaseInfo.getStart_time())));
		 ratePlan.setValueAdds(toValueAdd(metaRatePlanBaseInfo.getAdd_value_policy_list(), metaRatePlanBaseInfo.getRateplan_relation_add_value()));

		int c = metaRatePlanBaseInfo.getBooking_channel();
		List<Integer> channels = new LinkedList<Integer>();
		if ((c & 2) == 2) {
			channels.add(1);
		}
		if ((c & 4) == 4)
			channels.add(2);
		if ((c & 16) == 16)
			channels.add(3);
		if (channels.size() > 0) {
			ratePlan.setBookingChannels(StringUtils.join(channels, ','));
		}
		// rp 会员等级
		List<Integer> levels = new LinkedList<Integer>();
		if ((metaRatePlanBaseInfo.getCustomer_level() & 1024) == 1024) {
			levels.add(0);
		}
		if ((metaRatePlanBaseInfo.getCustomer_level() & 1) == 1) {
			levels.add(1);
		}
		if ((metaRatePlanBaseInfo.getCustomer_level() & 2) == 2) {
			levels.add(2);
		}
		if ((metaRatePlanBaseInfo.getCustomer_level() & 4) == 4) {
			levels.add(3);
		}
		if ((metaRatePlanBaseInfo.getCustomer_level() & 8) == 8) {
			levels.add(4);
		}
		int[] lev = new int[levels.size()];
		for (int i = 0; i < levels.size(); i++) {
			lev[i] = levels.get(i);
		}
		ratePlan.setCustomerLevel(lev);
		ratePlan.setCooperationType(shotelCooperationTypeMap.get(hotelCode));
		// 客人国籍类别：1-统一价；2-内宾；3-外宾；4-港澳台；5-日本
		EnumGuestTypeCode gtype = EnumGuestTypeCode.Chinese;
		if (metaRatePlanBaseInfo.getPrice_type().equals("1"))
			gtype = EnumGuestTypeCode.All;
		else if (metaRatePlanBaseInfo.getPrice_type().equals("2"))
			gtype = EnumGuestTypeCode.Chinese;
		else if (metaRatePlanBaseInfo.getPrice_type().equals("3"))
			gtype = EnumGuestTypeCode.OtherForeign;
		else if (metaRatePlanBaseInfo.getPrice_type().equals("4"))
			gtype = EnumGuestTypeCode.HongKong;
		else if (metaRatePlanBaseInfo.getPrice_type().equals("5"))
			gtype = EnumGuestTypeCode.Japanese;
		ratePlan.setCustomerType(gtype);
		ratePlan.setDrrRules(drrRuleList);
		ratePlan.setEndTime(DateUtil.getTimeString(new Date(
				metaRatePlanBaseInfo.getEnd_time())));
		// 在这个节点不需要提供
		// ratePlan.setGifts(metaRatePlanBaseInfo.);
		//
		ratePlan.setHotelCode(hotelCode);
		return ratePlan;

	}

	public String bitMaskIntToString(long bitSum) {
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
	/**
	 * 
	 * @param gift
	 */
	private List<HotelGift> toGift(List<MetaHotelGiftModel> gift, String hotelCode,
			Map<Integer, List<GiftRelation>> giftRelationMap) {
		if (gift != null) {
			List<HotelGift> hotelGifts=new LinkedList<HotelGift>();
			for (MetaHotelGiftModel item : gift) {

				if (item.getStatus() == 0) {
					continue;
				}
				HotelGiftDateTypeEnum dateType = HotelGiftDateTypeEnum.CheckinDate;
				String weekSet = "";
				HotelGiftHourTypeEnum hourType = HotelGiftHourTypeEnum.Hours24;
				int hourNumber = -1;
				List<HotelGiftDate> dates = new ArrayList<HotelGiftDate>();
				if (item.getRelation_date_list() != null) {
					for (MetaHotelGiftRelationDate date : item
							.getRelation_date_list()) {
						if (date.getBegin_date() <= System.currentTimeMillis()
								&& date.getEnd_date() >= System
										.currentTimeMillis()) {
							HotelGiftDateTypeEnum giftDateType = HotelGiftDateTypeEnum.CheckinDate;
							if(date.getDate_type()==0){
								giftDateType = HotelGiftDateTypeEnum.CheckinDate;
							}else{
								giftDateType = HotelGiftDateTypeEnum.BookingDate;
							}
							dateType = giftDateType;
							 weekSet =bitMaskIntToString(date.getBit_sum4_week());
							HotelGiftHourTypeEnum giftHourType = HotelGiftHourTypeEnum.Hours24;
							 if (date.getHour_type() ==2)
							 giftHourType = HotelGiftHourTypeEnum.XHourAfter;
							 else if (date.getHour_type() ==1)
							 giftHourType = HotelGiftHourTypeEnum.XHourBefore;
							hourType = giftHourType;
							hourNumber = date.getHour_number();

							HotelGiftDate hg = new HotelGiftDate();
							hg.setEndDate(new Date(date.getEnd_date()));
							hg.setStartDate(new Date(date.getBegin_date()));
							dates.add(hg);
						}
					}
				}
				if (dates.size() == 0) {
					continue;
				}
				List<HotelGiftProductRelation> products = new ArrayList<HotelGiftProductRelation>();
				if (item.isIs_all_product_related()) {
					HotelGiftProductRelation gp = new HotelGiftProductRelation();

					gp.setRatePlanId(0);
					gp.setRoomTypeIds("All");

					products.add(gp);
				} else {
					if (giftRelationMap != null
							&& giftRelationMap.containsKey(item.gift_id)) {
						if (giftRelationMap.get(item.gift_id) != null) {
							Map<Integer,List<String>> rpRoomTypeMap=new HashMap<Integer, List<String>>();
							for(GiftRelation giftRelation:giftRelationMap.get(item.gift_id)){
								if(rpRoomTypeMap.containsKey(giftRelation.getRatePlanId())){
									rpRoomTypeMap.get(giftRelation.getRatePlanId()).add(giftRelation.getRoomTypeId());
								}else{
									List<String> roomTypeIds=new LinkedList<String>();
									roomTypeIds.add(giftRelation.getRoomTypeId());
								}
							}
							for (Integer rpId : rpRoomTypeMap.keySet()) {
									HotelGiftProductRelation hgp = new HotelGiftProductRelation();
									hgp.setRatePlanId(rpId);
									hgp.setRoomTypeIds(StringUtils.join(rpRoomTypeMap.get(rpId),","));
									products.add(hgp);
							}
						}

					}
				}
				if (products.size() == 0) {
					continue;
				}
				int wayOfGiving = item.getWay_of_giving();
				if (wayOfGiving == 3) {
					wayOfGiving = 0;
				} else if (wayOfGiving == 4) {
					wayOfGiving = 1;
				}

				HotelGift hg = new HotelGift();

				hg.setDateType(dateType);
				hg.setEffectiveDates(dates);
				hg.setGiftContent(item.getGift_content_cn());
				hg.setGiftContentEn(item.getGift_content_en());
				hg.setGiftTypes(bitMaskIntToString(item.getGift_types()));
				hg.setHotelCode(hotelCode);
				hg.setHotelGiftId(item.getGift_id());
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

				hg.setWayOfGivingOther(item.getWay_of_giving_other_cn());
				hg.setWayOfGivingOtherEn(item.getWay_of_giving_other_en());
				hg.setWeekSet(weekSet);
				hotelGifts.add(hg);
			}
			return hotelGifts;
		}
		return null;
	}

	private Map<Integer, BaseDrrRule> toDrrRule(List<MetaDRRInfo> drrInfo) {
		Map<Integer, BaseDrrRule> drrRuleMap = new HashMap<Integer, BaseDrrRule>();
		if (drrInfo != null) {
			for (MetaDRRInfo metaDRRInfo : drrInfo) {
				BaseDrrRule drrRule = new BaseDrrRule();
				EnumDrrRuleCode drrRuleEnum = EnumDrrRuleCode.DRRBookAhead;
				if (metaDRRInfo.getDrr_rule() == EnumDrrRuleCode.DRRBookAhead
						.getValue())
					drrRuleEnum = EnumDrrRuleCode.DRRBookAhead;
				else if (metaDRRInfo.getDrr_rule() == EnumDrrRuleCode.DRRCheckInWeekDay
						.getValue())
					drrRuleEnum = EnumDrrRuleCode.DRRCheckInWeekDay;
				else if (metaDRRInfo.getDrr_rule() == EnumDrrRuleCode.DRRStayLastNight
						.getValue())
					drrRuleEnum = EnumDrrRuleCode.DRRStayLastNight;
				else if (metaDRRInfo.getDrr_rule() == EnumDrrRuleCode.DRRStayPerLastNight
						.getValue())
					drrRuleEnum = EnumDrrRuleCode.DRRStayPerLastNight;
				else if (metaDRRInfo.getDrr_rule() == EnumDrrRuleCode.DRRStayPerRoomPerNight
						.getValue())
					drrRuleEnum = EnumDrrRuleCode.DRRStayPerRoomPerNight;
				else if (metaDRRInfo.getDrr_rule() == EnumDrrRuleCode.DRRStayTheNightAndAfter
						.getValue())
					drrRuleEnum = EnumDrrRuleCode.DRRStayTheNightAndAfter;
				else if (metaDRRInfo.getDrr_rule() == EnumDrrRuleCode.DRRStayWeekDay
						.getValue())
					drrRuleEnum = EnumDrrRuleCode.DRRStayWeekDay;
				else if (metaDRRInfo.getDrr_rule() == EnumDrrRuleCode.None
						.getValue())
					drrRuleEnum = EnumDrrRuleCode.None;
				drrRule.setTypeCode(drrRuleEnum);

				EnumDrrPreferential drrPre = EnumDrrPreferential.Scale;
				if (metaDRRInfo.getMoney_or_percent() == EnumDrrPreferential.Cash
						.getValue())
					drrPre = EnumDrrPreferential.Cash;
				else if (metaDRRInfo.getMoney_or_percent() == EnumDrrPreferential.Scale
						.getValue())
					drrPre = EnumDrrPreferential.Scale;
				drrRule.setCashScale(drrPre);
				drrRule.setDeductNum(metaDRRInfo.getMoney_or_percent_value());

				EnumDateType dateType = EnumDateType.CheckInDay;
				if (metaDRRInfo.getDate_type() == EnumDateType.BookDay
						.getValue())
					dateType = EnumDateType.BookDay;
				else if (metaDRRInfo.getDate_type() == EnumDateType.CheckInDay
						.getValue())
					dateType = EnumDateType.CheckInDay;
				else if (metaDRRInfo.getDate_type() == EnumDateType.StayDay
						.getValue())
					dateType = EnumDateType.StayDay;
				drrRule.setDateType(dateType);

				 drrRule.setDescription(DescriptionHelper.drrDescription(metaDRRInfo, isCn));
				drrRule.setStartDate(new Date(metaDRRInfo.getStart_date()));
				drrRule.setEndDate(new Date(metaDRRInfo.getEnd_date()));

				EnumDrrFeeType drrFee = EnumDrrFeeType.WeekendFee;
				if (metaDRRInfo.getFee_type() == EnumDrrFeeType.WeekdayFee
						.getValue())
					drrFee = EnumDrrFeeType.WeekdayFee;
				else if (metaDRRInfo.getFee_type() == EnumDrrFeeType.WeekendFee
						.getValue())
					drrFee = EnumDrrFeeType.WeekendFee;
				drrRule.setFeeType(drrFee);
				 drrRule.setWeekSet(getWeekSet(metaDRRInfo.getIs_week_effective()));
				if (metaDRRInfo.getRuleValues() != null) {
					if (metaDRRInfo.getRuleValues().containsKey("CheckInNum")) {
						drrRule.setCheckInNum(Integer.valueOf(metaDRRInfo
								.getRuleValues().get("CheckInNum")));
					}
					if (metaDRRInfo.getRuleValues().containsKey("DayNum")) {
						drrRule.setDayNum(Integer.valueOf(metaDRRInfo
								.getRuleValues().get("DayNum")));
					}
					if (metaDRRInfo.getRuleValues().containsKey("LastDayNum")) {
						drrRule.setLastDayNum(Integer.valueOf(metaDRRInfo
								.getRuleValues().get("LastDayNum")));
					}
					if (metaDRRInfo.getRuleValues().containsKey(
							"EveryCheckInNum")) {
						drrRule.setEveryCheckInNum(Integer.valueOf(metaDRRInfo
								.getRuleValues().get("EveryCheckInNum")));
					}
					if (metaDRRInfo.getRuleValues().containsKey("WhichDayNum")) {
						drrRule.setWhichDayNum(Integer.valueOf(metaDRRInfo
								.getRuleValues().get("WhichDayNum")));
					}
				}
				drrRule.setRoomTypeIds(metaDRRInfo.getRoom_type_ids());
				drrRuleMap.put(metaDRRInfo.getDrr_policy_id(), drrRule);
			}
		}
		return drrRuleMap;
	}

	/**
	 * 担保规则转换
	 * 
	 * @param metaVouchInfos
	 * @return
	 */
	private List<BaseGuaranteeRule> toGuaranteeRule(
			List<MetaVouchInfo> metaVouchInfos) {
		if (metaVouchInfos != null) {
			List<BaseGuaranteeRule> guaranteeRules = new LinkedList<BaseGuaranteeRule>();
			for (MetaVouchInfo metaVouchInfo : metaVouchInfos) {
				BaseGuaranteeRule guaranteeRule = new BaseGuaranteeRule();
				guaranteeRule.setStartDate(new Date(metaVouchInfo
						.getStart_date()));
				guaranteeRule.setEndDate(new Date(metaVouchInfo.getEndDate()));
				guaranteeRule
						.setStartTime(metaVouchInfo.getArrive_start_time() != null ? metaVouchInfo
								.getArrive_start_time() : "");
				guaranteeRule
						.setEndTime(metaVouchInfo.getArrive_end_time() != null ? metaVouchInfo
								.getArrive_end_time() : "");
				guaranteeRule.setAmount(metaVouchInfo.getRoom_count());

				EnumGuaranteeChangeRule gcrule = EnumGuaranteeChangeRule.NoChange;
				if (metaVouchInfo.getVouch_change_rule() == EnumGuaranteeChangeRule.NeedCheckin24hour
						.getValue())
					gcrule = EnumGuaranteeChangeRule.NeedCheckin24hour;
				else if (metaVouchInfo.getVouch_change_rule() == EnumGuaranteeChangeRule.NeedCheckinTime
						.getValue())
					gcrule = EnumGuaranteeChangeRule.NeedCheckinTime;
				else if (metaVouchInfo.getVouch_change_rule() == EnumGuaranteeChangeRule.NeedSomeDay
						.getValue())
					gcrule = EnumGuaranteeChangeRule.NeedSomeDay;
				guaranteeRule.setChangeRule(gcrule);

				EnumDateType dateType = EnumDateType.CheckInDay;
				if (metaVouchInfo.getDate_type() == EnumDateType.BookDay
						.getValue())
					dateType = EnumDateType.BookDay;
				else if (metaVouchInfo.getDate_type() == EnumDateType.CheckInDay
						.getValue())
					dateType = EnumDateType.CheckInDay;
				else if (metaVouchInfo.getDate_type() == EnumDateType.StayDay
						.getValue())
					dateType = EnumDateType.StayDay;
				guaranteeRule.setDateType(dateType);

				guaranteeRule.setDescription(DescriptionHelper.vouchInfoDescription(metaVouchInfo, isCn));
				guaranteeRule.setIsAmountGuarantee(metaVouchInfo
						.isIs_room_count_vouch());
				guaranteeRule.setIsTimeGuarantee(metaVouchInfo
						.isIs_arrive_time_vouch());

				EnumGuaranteeMoneyType moneyType = EnumGuaranteeMoneyType.FullNightCost;
				if (metaVouchInfo.getVouch_money_type() == EnumGuaranteeMoneyType.FirstNightCost
						.getValue())
					moneyType = EnumGuaranteeMoneyType.FirstNightCost;
				guaranteeRule.setGuaranteeType(moneyType);
				 guaranteeRule.setWeekSet(getWeekSet(metaVouchInfo.getIs_week_effective()));
				if (metaVouchInfo.getRule_values() != null) {
					if (metaVouchInfo.getRule_values().containsKey("DayNum")) {
						guaranteeRule.setDay(DateUtil.toDate(metaVouchInfo
								.getRule_values().get("DayNum")));
					}
					if (metaVouchInfo.getRule_values().containsKey("HourNum")) {
						guaranteeRule.setHour(Integer.valueOf(metaVouchInfo
								.getRule_values().get("HourNum")));
					}
					if (metaVouchInfo.getRule_values().containsKey("TimeNum")) {
						guaranteeRule.setTime(metaVouchInfo.getRule_values()
								.get("TimeNum"));
					}
					if (metaVouchInfo.getRule_values()
							.containsKey("IsTomorrow")) {
						guaranteeRule.setIsTomorrow(metaVouchInfo
								.getRule_values().get("IsTomorrow") == "true");
					}
				}

				// 如果是无条件担保，需要将取消条款中的 最早到店时间前N小时修改成
				// 到店日24点前N+10小时---这样就是将最早到店时间默认为14点
				if (!guaranteeRule.getIsAmountGuarantee()
						&& !guaranteeRule.getIsTimeGuarantee()
						&& guaranteeRule.getChangeRule() == EnumGuaranteeChangeRule.NeedCheckinTime) {
					guaranteeRule
							.setChangeRule(EnumGuaranteeChangeRule.NeedCheckin24hour);
					guaranteeRule.setHour(guaranteeRule.getHour() + 10);
					 guaranteeRule.setDescription(guaranteeRule
					 .BuildDescription(isCn));
				}
				guaranteeRules.add(guaranteeRule);
			}
			return guaranteeRules;
		}
		return null;

	}

	/**
	 * 转预付规则
	 * 
	 * @param metaPrePayInfos
	 * @return
	 */
	private List<BasePrepayRule> toPrepayRule(
			List<MetaPrePayInfo> metaPrePayInfos) {
		if (metaPrePayInfos != null) {
			List<BasePrepayRule> basePrepayRules = new LinkedList<BasePrepayRule>();
			for (MetaPrePayInfo metaPrePayInfo : metaPrePayInfos) {
				if (metaPrePayInfo.getTarget() == 1) {
					continue;
				}
				BasePrepayRule basePrepay = new BasePrepayRule();
				EnumPrepayChangeRule prepayrule = EnumPrepayChangeRule.PrepayNoChange;
				if (metaPrePayInfo.getPrepay_change_rule() == EnumPrepayRule.PrepayNeedOneTime
						.value())
					prepayrule = EnumPrepayChangeRule.PrepayNeedOneTime;
				else if (metaPrePayInfo.getPrepay_change_rule() == EnumPrepayRule.PrepayNeedSomeDay
						.value())
					prepayrule = EnumPrepayChangeRule.PrepayNeedSomeDay;
				basePrepay.setChangeRule(prepayrule);

				EnumDateType dateType = EnumDateType.CheckInDay;
				if (metaPrePayInfo.getDate_type() != 0) {
					dateType = EnumDateType.forValue(metaPrePayInfo
							.getDate_type());
				}
				basePrepay.setDateType(dateType);
				basePrepay
						.setStartDate(new Date(metaPrePayInfo.getStart_date()));
				basePrepay.setEndDate(new Date(metaPrePayInfo.getEnd_date()));
				EnumPrepayCutPayment after = EnumPrepayCutPayment.FristNight;
				if (metaPrePayInfo.getCut_type_after() > 0) {
					after = EnumPrepayCutPayment.forValue(metaPrePayInfo
							.getCut_type_after());
				}
				basePrepay.setCashScaleFirstAfter(after);
				EnumPrepayCutPayment before = EnumPrepayCutPayment.FristNight;
				if (metaPrePayInfo.getCut_type_befor() > 0) {
					before = EnumPrepayCutPayment.forValue(metaPrePayInfo
							.getCut_type_befor());
				}
				basePrepay.setCashScaleFirstBefore(before);

				basePrepay.setDeductFeesAfter(metaPrePayInfo
						.isCut_after_change_time() ? 1 : 0);
				basePrepay.setDeductFeesBefore(metaPrePayInfo
						.isCut_befor_change_time() ? 1 : 0);

				basePrepay.setDeductNumAfter(metaPrePayInfo.getCut_num_after());
				basePrepay
						.setDeductNumBefore(metaPrePayInfo.getCut_num_befor());
				 basePrepay.setDescription(DescriptionHelper.prepayDescription(metaPrePayInfo, isCn));
				 basePrepay.setWeekSet(getWeekSet(metaPrePayInfo.getIs_week_effective()));
				if (metaPrePayInfo.getRule_values() != null) {
					if (metaPrePayInfo.getRule_values().containsKey("HourNum")) {
						basePrepay.setHour(Integer.valueOf(metaPrePayInfo
								.getRule_values().get("HourNum")));
					}
					if (metaPrePayInfo.getRule_values().containsKey("HourNum2")) {
						basePrepay.setHour2(Integer.valueOf(metaPrePayInfo
								.getRule_values().get("HourNum2")));
					}
					if (metaPrePayInfo.getRule_values().containsKey("TimeNum")) {
						basePrepay.setTime(metaPrePayInfo.getRule_values().get(
								"TimeNum"));
					}
					if (metaPrePayInfo.getRule_values().containsKey("DateNum")) {
						if(StringUtils.isNotEmpty(metaPrePayInfo
								.getRule_values().get("DateNum"))){
							basePrepay.setDateNum(DateUtil.toDate(metaPrePayInfo
									.getRule_values().get("DateNum")));
						}else{
							basePrepay.setDateNum(DateUtil.getMinValue());
						}
					}
				}
				basePrepayRules.add(basePrepay);
			}
			return basePrepayRules;
		}
		return null;

	}

	private List<BaseValueAddRule> toValueAdd(
			List<MetaAddValuePolicyInfo> policyInfo,
			List<MetaAddValueInfoSimple> relationAdd) {
		List<BaseValueAddRule> result = new LinkedList<BaseValueAddRule>();

		if (relationAdd == null || policyInfo == null)
			return result;

		for (MetaAddValueInfoSimple rule : relationAdd) {
			BaseValueAddRule baserule = new BaseValueAddRule();

			 baserule.setDescription(getAdditionalServiceRDisciption(rule));
			baserule.setTypeCode(rule.getBusiness_code());
			baserule.setIsInclude(rule.getIs_include() == 1);
			// 无None(0),金额Money(1),比例Percent(2)
			EnumValueAddPriceOption priceOpt = EnumValueAddPriceOption.Percent;
			if (rule.getPrice_default_option() == 0)
				priceOpt = EnumValueAddPriceOption.None;
			else if (rule.getPrice_default_option() == 1)
				priceOpt = EnumValueAddPriceOption.Money;
			baserule.setPriceOption(priceOpt);
			baserule.setPrice(rule.getPrice());
			// 无None(0),金额Money(1),比例Percent(2)
			EnumValueAddPriceOption addPrice = EnumValueAddPriceOption.Percent;
			if (rule.getSingle_price_default_option() == 1)
				addPrice = EnumValueAddPriceOption.Money;
			else if (rule.getSingle_price_default_option() == 0)
				addPrice = EnumValueAddPriceOption.None;
			baserule.setExtOption(addPrice);

			baserule.setExtPrice(rule.getSingle_price());
			baserule.setIsExtAdd(rule.isIs_add());
			baserule.setAmount(rule.getShare());
			result.add(baserule);
		}

		for (MetaAddValuePolicyInfo rule : policyInfo) {
			String cnDescription = "";
			String enDescription = "";
			if (rule.getStart_date() != 0 && rule.getEnd_date() != 0) {
				cnDescription = DateUtil.getDateString(new Date(rule
						.getStart_date()))
						+ " - "
						+ DateUtil.getDateString(new Date(rule.getEnd_date()))
						+ ((rule.getIs_include() == 0) ? " 不含早餐" : " 包含 "
								+ rule.getShare() + " 份早餐");
				enDescription = DateUtil.getDateString(new Date(rule
						.getStart_date()))
						+ " - "
						+ DateUtil.getDateString(new Date(rule.getEnd_date()))
						+ ((rule.getIs_include() == 0) ? " no breakfast"
								: " includes " + rule.getShare() + " breakfast");
			}

			BaseValueAddRule base = new BaseValueAddRule();

			 base.setDescription(isCn ? cnDescription
			 : enDescription);
			base.setTypeCode("99");
			base.setIsInclude(rule.getIs_include() == 1);
			// 无None(0),金额Money(1),比例Percent(2)
			EnumValueAddPriceOption priceOpt = EnumValueAddPriceOption.Percent;
			if (rule.getPrice_default_option() == 0)
				priceOpt = EnumValueAddPriceOption.None;
			else if (rule.getPrice_default_option() == 1)
				priceOpt = EnumValueAddPriceOption.Money;
			base.setPriceOption(priceOpt);
			base.setPrice(rule.getPrice());
			// 无None(0),金额Money(1),比例Percent(2)
			EnumValueAddPriceOption addPrice = EnumValueAddPriceOption.Percent;
			if (rule.getSingle_price_default_option() == 1)
				addPrice = EnumValueAddPriceOption.Money;
			else if (rule.getSingle_price_default_option() == 0)
				addPrice = EnumValueAddPriceOption.None;
			base.setExtOption(addPrice);

			base.setExtPrice(rule.getSingle_price());
			base.setIsExtAdd(rule.getIs_add() == 1);
			base.setAmount(rule.getShare());
			if (rule.getStart_date() != 0)
				base.setStartDate(new Date(rule.getStart_date()));
			if (rule.getEnd_date() != 0)
				base.setEndDate(new Date(rule.getEnd_date()));
			base.setCurrencyCode(rule.getCurrency_code());
			 base.setWeekSet(getWeekSet(rule.getIs_week_effective()));

			result.add(base);
		}
		return result;
	}
	private String getAdditionalServiceRDisciption(MetaAddValueInfoSimple addValue) {
		if (addValue == null)
			return "";

		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = new StringBuilder();

		if (true) {
			if (addValue.getIs_include() == 1) {
				if (addValue.getShare() > 0)
					if (isCn) {
						sb1.append(addValue.getShare() + "份"
								+ addValue.getAdd_value_cn_name() + ",");
					} else {
						sb1.append(" " + addValue.getShare() + " "
								+ addValue.getAdd_value_en_name() + ",");
					}
				else if (isCn) {
					sb1.append(addValue.getAdd_value_cn_name() + ",");
				} else {
					sb1.append(addValue.getAdd_value_en_name() + ",");
				}

			}
			if (addValue.isIs_add()) {
				if (isCn) {
					sb2.append("1份" + addValue.getAdd_value_cn_name());
				} else {
					sb2.append(" 1 " + addValue.getAdd_value_en_name());
				}

				if (addValue.getSingle_price_default_option() == 1) {
					if (isCn) {
						sb2.append(" " + addValue.getSingle_price() + " 元,");
					} else {
						sb2.append(" RMB " + addValue.getSingle_price() + " ,");
					}

				} else {
					if (isCn) {
						sb2.append("首晚房费的" + addValue.getSingle_price() + "%,");
					} else {
						sb2.append(addValue.getSingle_price()+"%"+" of the first night room rate. ,");
					}
				}
			}
		}

		if (isCn) {
			if (sb1.length() != 0) {
				String temp1 = "";
				if (sb1.toString().contains(","))
					temp1 = sb1.toString().substring(0,
							sb1.toString().lastIndexOf(","));
				else
					temp1 = sb1.toString();
				sb3.append("包含" + temp1 + ";");
			}
			if (sb2.length() != 0) {
				// "单加" + sb2.ToString().TrimEnd(',')
				String temp1 = "";
				if (sb2.toString().contains(","))
					temp1 = sb2.toString().substring(0,
							sb2.toString().lastIndexOf(","));
				else
					temp1 = sb2.toString();

				sb3.append("单加" + temp1);
			}
		} else {
			if (sb1.length() != 0) {
				String temp1 = "";
				if (sb1.toString().contains(","))
					temp1 = sb1.toString().substring(0,
							sb1.toString().lastIndexOf(","));
				else
					temp1 = sb1.toString();

				sb3.append(" Including " + temp1 + ";");
			}
			if (sb2.length() != 0) {
				String temp1 = "";
				if (sb2.toString().contains(","))
					temp1 = sb2.toString().substring(0,
							sb2.toString().lastIndexOf(","));
				else
					temp1 = sb2.toString();

				sb3.append(" every additional one costs " + temp1);
			}
		}

		if (isCn) {
			return sb3.toString().equals("") ? "" : "附加服务：" + sb3.toString();
		}
		return sb3.toString().equals("") ? "" : "Other service："
				+ sb3.toString();
	}

	private String getWeekSet(long timeSet){
		List<Integer> set=new LinkedList<Integer>();
		for(int i=1;i<=7;i++){
			if((timeSet&(long)Math.pow(2, i-1))==Math.pow(2, i-1)){
				set.add(i);
			}
		}
		return StringUtils.join(set,",");
	}
	/**
	 * 3---限时抢购
	 * 4--钟点房
	 * @param strProductType 16---限时抢购,32--钟点房
	 * @param bookingchanel
	 * @param isHourPayRoom
	 * @return
	 */
	public String parseProductType(String strProductType, int bookingchanel,
			boolean isHourPayRoom) {
		String productTypes = "";
		List<String> productTypeList=new LinkedList<String>();
		int pt = Integer.parseInt("0" + strProductType);
		if ((pt & 16) == 16)
			productTypeList.add("3");
			//productTypes += "3,";
		if (isHourPayRoom || (pt & 32) == 32)
			productTypeList.add("4");
		if ((bookingchanel & 2) == 0 && (bookingchanel & 16) == 16)
			productTypeList.add("5");
		// 买一送一 productType值是2的14次方
		if ((pt & 16384) == 16384) {
			productTypeList.add("101");
		}
		if (productTypeList.size()>0) {
			productTypes = StringUtils.join(productTypeList, ",");
		} else {
			productTypes=null;
		}
		return productTypes;
	}

	@Override
	public void setFilter(Map<String, EnumPaymentType> hotelCodeFilterType,
			Map<String, Integer> shotelCooperationTypeMap, boolean isCn) {
		this.hotelCodeFilterType=hotelCodeFilterType;
		this.shotelCooperationTypeMap=shotelCooperationTypeMap;
		this.isCn=isCn;
	} 

}
