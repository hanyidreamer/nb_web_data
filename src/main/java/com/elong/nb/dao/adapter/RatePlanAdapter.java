package com.elong.nb.dao.adapter;

import java.util.ArrayList;
import java.util.Collections;
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
import com.elong.hotel.goods.ds.thrift.MetaHoursRoomMsg;
import com.elong.hotel.goods.ds.thrift.MetaMHotelBaseRpDrrGift;
import com.elong.hotel.goods.ds.thrift.MetaPrePayInfo;
import com.elong.hotel.goods.ds.thrift.MetaProductInfo;
import com.elong.hotel.goods.ds.thrift.MetaRatePlanBaseInfo;
import com.elong.hotel.goods.ds.thrift.MetaRoomTypeInfo;
import com.elong.hotel.goods.ds.thrift.MetaSHotelBaseRpDrrGift;
import com.elong.hotel.goods.ds.thrift.MetaVouchInfo;
import com.elong.hotel.goods.ds.thrift.TimeRushPolicy;
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
import com.elong.nb.model.bean.enums.EnumInvoiceMode;
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
import com.elong.nb.model.rateplan.MSRoomRelation;
import com.elong.nb.model.rateplan.RatePlan;
import com.elong.nb.model.rateplan.SupplierRatePlan;
import com.elong.nb.model.rateplan.TimeRushRule;
import com.elong.nb.model.rateplan.fornb.EnumPrepayRule;
import com.elong.nb.model.rateplan.fornb.GiftRelation;
import com.elong.nb.util.DateUtil;

public class RatePlanAdapter extends AbstractGoodsAdapter<HotelRatePlan, GetBaseRatePlanDRRGiftResponse> {

	private Map<String, EnumPaymentType> hotelCodeFilterType;

	private boolean isCn;

	@Override
	public List<HotelRatePlan> toNBObject(GetBaseRatePlanDRRGiftResponse goodsObject) {
		if (goodsObject.getReturn_code() == 0) {
			List<HotelRatePlan> HotelRatePlans = new LinkedList<HotelRatePlan>();
			if (goodsObject.getMhotel_detail() != null) {
				for (MetaMHotelBaseRpDrrGift metaMhotel : goodsObject.getMhotel_detail()) {
					HotelRatePlan hotelRatePlan = new HotelRatePlan();
					hotelRatePlan.setSuppliers(new LinkedList<SupplierRatePlan>());
					hotelRatePlan.setRatePlans(new LinkedList<RatePlan>());
					hotelRatePlan.setHotelID(SafeConvertUtils.ToHotelId(metaMhotel.getMhotel_id()));
					hotelRatePlan.setGifts(new LinkedList<HotelGift>());
					if (metaMhotel.getShotel_detail() != null) {
						for (MetaSHotelBaseRpDrrGift metaSHotelBaseRpDrrGift : metaMhotel.getShotel_detail()) {
							hotelRatePlan.getSuppliers().add(
									toSupplier(metaSHotelBaseRpDrrGift.getHotel_base_info(), metaSHotelBaseRpDrrGift.getRoom_base_infos()));
							String hotelCode = SafeConvertUtils.ToHotelId(metaSHotelBaseRpDrrGift.getHotel_base_info().getShotel_id());
							Map<Integer, BaseDrrRule> drrMap = toDrrRule(metaSHotelBaseRpDrrGift.getDrrs());
							Map<Integer, List<Integer>> drrIdsMap = new HashMap<Integer, List<Integer>>();
							Map<Integer, List<String>> drrIdroomTypeIdMap = new HashMap<Integer, List<String>>();
							Map<Integer, List<GiftRelation>> giftRelationMap = new HashMap<Integer, List<GiftRelation>>();
							Map<Integer, List<String>> roomTypesrpRelation = new HashMap<Integer, List<String>>();
							Map<Integer, Integer> invoiceModeMap = new HashMap<Integer, Integer>();
							Map<Integer, Integer> cooperationTypeMap = new HashMap<Integer, Integer>();
							if (metaSHotelBaseRpDrrGift.getRoom_base_infos() != null) {
								for (MetaRoomTypeInfo metaRoomTypeInfo : metaSHotelBaseRpDrrGift.getRoom_base_infos()) {
									String roomTypeId = SafeConvertUtils.ToRoomId(metaRoomTypeInfo.getRoom_type_id());
									for (MetaProductInfo metaProductInfo : metaRoomTypeInfo.getProducts()) {
										// 商品库返回的直签类型
										cooperationTypeMap.put(metaProductInfo.getRate_plan_id(),
												(int) metaProductInfo.getCooperation_type_convert());
										invoiceModeMap.put(metaProductInfo.getRate_plan_id(), metaProductInfo.getInvoice_mode());
										if (roomTypesrpRelation.containsKey(metaProductInfo.getRate_plan_id())) {
											roomTypesrpRelation.get(metaProductInfo.getRate_plan_id()).add(roomTypeId);
										} else {
											List<String> roomTypeIds = new LinkedList<String>();
											roomTypeIds.add(roomTypeId);
											roomTypesrpRelation.put(metaProductInfo.getRate_plan_id(), roomTypeIds);
										}
										if (metaProductInfo.getDrr_ids() != null) {
											// drrrule 重复bug修改
											List<Integer> drrIds = drrIdsMap.get(metaProductInfo.getRate_plan_id());
											if (drrIds == null) {
												drrIds = new ArrayList<Integer>();
											}
											for (Integer metaDrrId : metaProductInfo.getDrr_ids()) {
												// drrrule 和 roomtypeid 对应关系
												List<String> roomTypeIds = drrIdroomTypeIdMap.get(metaDrrId);
												if (roomTypeIds == null) {
													roomTypeIds = new ArrayList<String>();
												}
												roomTypeIds.add(StringUtils.trim(roomTypeId));
												drrIdroomTypeIdMap.put(metaDrrId, roomTypeIds);

												if (drrIds.contains(metaDrrId))
													continue;
												drrIds.add(metaDrrId);
											}
											drrIdsMap.put(metaProductInfo.getRate_plan_id(), drrIds);
										}
										if (metaProductInfo.getGift_ids() != null) {
											for (int giftId : metaProductInfo.getGift_ids()) {
												GiftRelation giftRelation = new GiftRelation();
												giftRelation.setRatePlanId(metaProductInfo.getRate_plan_id());
												giftRelation.setRoomTypeId(roomTypeId);
												if (giftRelationMap.containsKey(giftId)) {
													giftRelationMap.get(giftId).add(giftRelation);
												} else {
													List<GiftRelation> giftList = new LinkedList<GiftRelation>();
													giftList.add(giftRelation);
													giftRelationMap.put(giftId, giftList);
												}
											}
										}
									}
								}
							}
							List<HotelGift> hotelGifts = toGift(metaSHotelBaseRpDrrGift.getGifts(), hotelCode, giftRelationMap);
							if (hotelGifts != null) {
								hotelRatePlan.getGifts().addAll(hotelGifts);
							}
							if (metaSHotelBaseRpDrrGift.getRatePlans() != null) {
								for (MetaRatePlanBaseInfo metaRatePlanBaseInfo : metaSHotelBaseRpDrrGift.getRatePlans()) {
									List<BaseDrrRule> drrRuleList = new LinkedList<BaseDrrRule>();
									if (drrIdsMap.containsKey(metaRatePlanBaseInfo.getRate_plan_id())) {
										if (drrIdsMap.get(metaRatePlanBaseInfo.getRate_plan_id()) != null) {
											for (int drrId : drrIdsMap.get(metaRatePlanBaseInfo.getRate_plan_id())) {
												if (drrMap.containsKey(drrId)) {
													// 补充drrrule里的roomtypeid
													BaseDrrRule baseDrrRule = drrMap.get(drrId);
													List<String> roomTypeIds = drrIdroomTypeIdMap.get(drrId);
													@SuppressWarnings("unchecked")
													String roomTypeIdStr = StringUtils.join(roomTypeIds);
													if (StringUtils.isNotEmpty(roomTypeIdStr)) {
														roomTypeIdStr = StringUtils.remove(roomTypeIdStr, "[");
														roomTypeIdStr = StringUtils.remove(roomTypeIdStr, "]");
														baseDrrRule.setRoomTypeIds(roomTypeIdStr);
													}
													drrRuleList.add(baseDrrRule);
												}
											}
										}
									}
									if (hotelCodeFilterType.containsKey(hotelCode)) {
										EnumPaymentType paymentType = EnumPaymentType.forValue(Integer.valueOf(metaRatePlanBaseInfo
												.getSettlement_type()));
										if (paymentType == hotelCodeFilterType.get(hotelCode)) {
											continue;
										}
									}
									String roomTypeIds = "";
									if (roomTypesrpRelation.containsKey(metaRatePlanBaseInfo.getRate_plan_id())) {
										roomTypeIds = StringUtils
												.join(roomTypesrpRelation.get(metaRatePlanBaseInfo.getRate_plan_id()), ",");
									}

									RatePlan ratePlan = toRatePlan(metaRatePlanBaseInfo, hotelCode, drrRuleList, roomTypeIds);
									Integer productInvoiceMode = invoiceModeMap.get(metaRatePlanBaseInfo.getRate_plan_id());
									ratePlan.setInvoiceMode(getInvoiceMode(productInvoiceMode));
									Integer cooperationType = cooperationTypeMap.get(metaRatePlanBaseInfo.getRate_plan_id());
									ratePlan.setCooperationType(cooperationType);
									hotelRatePlan.getRatePlans().add(ratePlan);
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

	private EnumInvoiceMode getInvoiceMode(int productInvoiceMode) {
		if (productInvoiceMode == 1 || productInvoiceMode == 3)
			return EnumInvoiceMode.Elong;
		if (productInvoiceMode == 2)
			return EnumInvoiceMode.Hotel;
		return EnumInvoiceMode.NoSense;
	}

	/**
	 * 转换供应商节点
	 * 
	 * @param hotelInfo
	 * @param roomBaseInfo
	 * @return
	 */
	private SupplierRatePlan toSupplier(MetaHotelInfo hotelInfo, List<MetaRoomTypeInfo> roomBaseInfo) {
		SupplierRatePlan supplier = new SupplierRatePlan();
		supplier.setHotelCode(SafeConvertUtils.ToHotelId(hotelInfo.getShotel_id()));
		supplier.setRooms(toMSRoomRelations(roomBaseInfo));
		supplier.setWeekendEnd(hotelInfo.getWeek_end_end());
		supplier.setWeekendStart(hotelInfo.getWeek_end_start());
		supplier.setBookingRules(toBaseBookingRule(hotelInfo.getHotel_booking_rule_list(), roomBaseInfo));
		return supplier;

	}

	/** 
	 * 转换ms房型关系 
	 *
	 * @param roomBaseInfo
	 * @return
	 */
	private List<MSRoomRelation> toMSRoomRelations(List<MetaRoomTypeInfo> roomBaseInfo) {
		if (roomBaseInfo == null || roomBaseInfo.size() == 0)
			return Collections.emptyList();
		List<MSRoomRelation> roomRelations = new ArrayList<MSRoomRelation>();
		for (MetaRoomTypeInfo metaRoomTypeInfo : roomBaseInfo) {
			MSRoomRelation roomRelation = new MSRoomRelation();
			roomRelation.setRoomId(SafeConvertUtils.ToRoomId(metaRoomTypeInfo.getMroom_type_id()));
			roomRelation.setRoomTypeId(SafeConvertUtils.ToRoomId(metaRoomTypeInfo.getRoom_type_id()));
			roomRelation.setStatus(metaRoomTypeInfo.getStatus() == 1);
			roomRelations.add(roomRelation);
		}
		return roomRelations;
	}

	/**
	 * 转换预订规则
	 * 
	 * @param hotelBookingRules
	 * @param roomBaseInfos
	 * @return
	 */
	private List<BaseBookingRule> toBaseBookingRule(List<MetaHotelBookingRule> hotelBookingRules, List<MetaRoomTypeInfo> roomBaseInfos) {
		Map<Long, BaseBookingRule> hotelBookingRuleMap = new HashMap<Long, BaseBookingRule>();
		List<BaseBookingRule> bookingRules = new LinkedList<BaseBookingRule>();
		if (hotelBookingRules != null) {
			for (MetaHotelBookingRule hotelBookingRule : hotelBookingRules) {
				if (!hotelBookingRuleMap.containsKey(hotelBookingRule.getId())) {
					hotelBookingRuleMap.put(hotelBookingRule.getId(), toBaseBookingRule(hotelBookingRule));
				}
			}
		}
		Map<Long, MetaHotelBookingRule> roomBookingRuleMap = new HashMap<Long, MetaHotelBookingRule>();
		Map<Long, List<String>> bookingRuleRoomTypeRelation = new HashMap<Long, List<String>>();
		if (roomBaseInfos != null) {
			for (MetaRoomTypeInfo roomBaseInfo : roomBaseInfos) {
				String roomTypeId = SafeConvertUtils.ToRoomId(roomBaseInfo.getRoom_type_id());
				if (roomBaseInfo.getHotel_booking_rule_list() != null) {
					for (MetaHotelBookingRule hotelBookingRule : roomBaseInfo.getHotel_booking_rule_list()) {
						if (!hotelBookingRuleMap.containsKey(hotelBookingRule.getId())
								&& !hotelBookingRuleMap.containsKey(hotelBookingRule.getId())) {
							roomBookingRuleMap.put(hotelBookingRule.getId(), hotelBookingRule);
						}
						if (bookingRuleRoomTypeRelation.containsKey(hotelBookingRule.getId())) {
							bookingRuleRoomTypeRelation.get(hotelBookingRule.getId()).add(roomTypeId);
						} else {
							List<String> roomTypes = new LinkedList<String>();
							roomTypes.add(roomTypeId);
							bookingRuleRoomTypeRelation.put(hotelBookingRule.getId(), roomTypes);
						}
					}
				}
			}
		}
		if (hotelBookingRuleMap.size() > 0) {
			for (BaseBookingRule baseBookingRule : hotelBookingRuleMap.values()) {
				baseBookingRule.setRoomTypeIds("all");
				bookingRules.add(baseBookingRule);
			}
		}
		if (roomBookingRuleMap.size() > 0) {
			for (MetaHotelBookingRule metaBookingRule : roomBookingRuleMap.values()) {
				List<String> roomTypes = bookingRuleRoomTypeRelation.get(metaBookingRule.getId());
				Collections.sort(roomTypes);
				BaseBookingRule baseBookingRule = toBaseBookingRule(metaBookingRule);
				baseBookingRule.setRoomTypeIds(StringUtils.join(roomTypes, ","));
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
	private BaseBookingRule toBaseBookingRule(MetaHotelBookingRule hotelBookingRule) {
		BaseBookingRule bookingRule = new BaseBookingRule();
		bookingRule.setDateType(EnumDateType.forValue(hotelBookingRule.date_type));
		bookingRule.setDescription(isCn ? hotelBookingRule.getCn_description() : hotelBookingRule.getEn_description());
		bookingRule.setEndDate(new Date(hotelBookingRule.getEnd_date()));
		bookingRule.setEndHour(hotelBookingRule.getEnd_hour());
		bookingRule.setRoomTypeIds(hotelBookingRule.getRoom_type_id());
		bookingRule.setStartDate(new Date(hotelBookingRule.getStart_date()));
		bookingRule.setStartHour(hotelBookingRule.getStart_hour());
		bookingRule.setTypeCode(EnumBookingRule.forValue(hotelBookingRule.getHotelBookingRule()));
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
	private RatePlan toRatePlan(MetaRatePlanBaseInfo metaRatePlanBaseInfo, String hotelCode, List<BaseDrrRule> drrRuleList,
			String roomTypeIds) {
		RatePlan ratePlan = new RatePlan();
		ratePlan.setIsLimitTimeSale(metaRatePlanBaseInfo.getIs_limit_time_sale() == 1);
		ratePlan.setMaxAdvHours(metaRatePlanBaseInfo.getMax_advance_booking_days());
		ratePlan.setMaxDays(metaRatePlanBaseInfo.getMax_stay_days());
		ratePlan.setMinAdvHours(metaRatePlanBaseInfo.getMin_advance_booking_days());
		ratePlan.setMinAmount(metaRatePlanBaseInfo.getMin_checkin_rooms());
		ratePlan.setMinDays(metaRatePlanBaseInfo.getMin_stay_days());
		ratePlan.setPaymentType(EnumPaymentType.forValue(Integer.valueOf(metaRatePlanBaseInfo.getSettlement_type())));
		if (ratePlan.getPaymentType() == EnumPaymentType.Prepay) {
			ratePlan.setPrepayRules(toPrepayRule(metaRatePlanBaseInfo.getRate_plan_pre_pay_rule_list()));
		} else {
			ratePlan.setGuaranteeRules(toGuaranteeRule(metaRatePlanBaseInfo.getRate_plan_vouch_rule_list()));
		}
		boolean isHourPayRoom = ProductTypeUtils.isHourPayRoom(metaRatePlanBaseInfo.getCn_rate_plan_name());
		ratePlan.setProductTypes(parseProductType(metaRatePlanBaseInfo.getProduct_type(), metaRatePlanBaseInfo.getBooking_channel(),
				isHourPayRoom));
		ratePlan.setRatePlanId(metaRatePlanBaseInfo.getRate_plan_id());
		ratePlan.setRatePlanName(isCn ? metaRatePlanBaseInfo.getCn_rate_plan_name() : metaRatePlanBaseInfo.getEn_rate_plan_name());
		String rpSubTitle = metaRatePlanBaseInfo.getRp_sub_title();
		ratePlan.setRatePlanName(ratePlan.getRatePlanName() + (StringUtils.isNotEmpty(rpSubTitle) ? rpSubTitle : ""));// 副标题合并到RP名称上
		ratePlan.setRoomTypeIds(roomTypeIds);
		ratePlan.setStartTime(DateUtil.getTimeString(new Date(metaRatePlanBaseInfo.getStart_time() - 28800000)));
		ratePlan.setValueAdds(toValueAdd(metaRatePlanBaseInfo.getAdd_value_policy_list(),
				metaRatePlanBaseInfo.getRateplan_relation_add_value()));

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
		// 客人国籍类别：1-统一价；2-内宾；3-外宾；4-港澳台；5-日本；6-中宾
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
		else if (metaRatePlanBaseInfo.getPrice_type().equals("6"))
			gtype = EnumGuestTypeCode.ChinaGuest;
		ratePlan.setCustomerType(gtype);
		ratePlan.setDrrRules(drrRuleList);
		ratePlan.setEndTime(DateUtil.getTimeString(new Date(metaRatePlanBaseInfo.getEnd_time() - 28800000)));
		// 在这个节点不需要提供
		// ratePlan.setGifts(metaRatePlanBaseInfo.);
		//
		ratePlan.setHotelCode(hotelCode);

		List<MetaHoursRoomMsg> hours_room_msg_list = metaRatePlanBaseInfo.getHours_room_msg_list();
		if (hours_room_msg_list != null && hours_room_msg_list.size() > 0) {
			MetaHoursRoomMsg metaHoursRoomMsg = hours_room_msg_list.get(0);
			if (metaHoursRoomMsg != null) {
				String latestArrivalTime = metaHoursRoomMsg.getLatestArrivalTime();
				String stayTime = metaHoursRoomMsg.getStayTime();
				ratePlan.setEarliestToliveTime(metaHoursRoomMsg.getEarliestArrivalTime());
				try {
					ratePlan.setLatestToliveTime(DateUtil.getTimeString(latestArrivalTime, stayTime));
				} catch (Exception e) {
					e.printStackTrace();
				}
				ratePlan.setStayTime(metaHoursRoomMsg.getStayTime());
			}
		}
		// 限时抢规则、适用人群
		ratePlan.setTimeRushRuleList(toTimeRushRules(metaRatePlanBaseInfo.getTime_rush_policy_list()));
		ratePlan.setGuestType(toGuestType(metaRatePlanBaseInfo.getGuest_type()));
		ratePlan.setGuestTypeExtendCh(metaRatePlanBaseInfo.getGuest_type_extend_ch() == null ? "" : metaRatePlanBaseInfo
				.getGuest_type_extend_ch());
		// x项目属性设置, 004001:入住人数, 050001:入住性别, 013001:床型, 011000:楼层, 012001:朝向, 014001:自定义
		Map<String, String> xProperties = metaRatePlanBaseInfo.getX_properties();
		if (xProperties != null && xProperties.size() > 0) {
			ratePlan.setxStayPeopleNum(xProperties.get("004001") == null ? "" : xProperties.get("004001"));
			ratePlan.setxStaySex(xProperties.get("050001") == null ? "" : xProperties.get("050001"));
			ratePlan.setxBedType(xProperties.get("013001") == null ? "" : xProperties.get("013001"));
			ratePlan.setxFloor(xProperties.get("011000") == null ? "" : xProperties.get("011000"));
			ratePlan.setxOrientation(xProperties.get("012001") == null ? "" : xProperties.get("012001"));
			ratePlan.setxUserDefined(xProperties.get("014001") == null ? "" : xProperties.get("014001"));
		}
		return ratePlan;
	}

	/** 
	 * 商品库适用人群 转换为 分销适用人群
	 * 
	 * @param goodsGuestType 适用人群,二进制位表示:
	 * 	0:不限,1:持中国身份证的居民,2:持回乡证的港澳人士,3:持台胞证的台湾人士,4:持中国护照的侨胞,
	 * 	5:持大陆工作证/居留许可的外籍人士,6:持非中国护照的外籍人士,7:其他
	 * @return
	 */
	private String toGuestType(int goodsGuestType) {
		List<String> guestTypes = new ArrayList<String>();
		if (isGuestType(goodsGuestType, 0)) {
			guestTypes.add("0");
		}
		if (isGuestType(goodsGuestType, 1)) {
			guestTypes.add("1");
		}
		if (isGuestType(goodsGuestType, 2)) {
			guestTypes.add("2");
		}
		if (isGuestType(goodsGuestType, 3)) {
			guestTypes.add("3");
		}
		if (isGuestType(goodsGuestType, 4)) {
			guestTypes.add("4");
		}
		if (isGuestType(goodsGuestType, 5)) {
			guestTypes.add("5");
		}
		if (isGuestType(goodsGuestType, 6)) {
			guestTypes.add("6");
		}
		if (isGuestType(goodsGuestType, 7)) {
			guestTypes.add("7");
		}
		return StringUtils.join(guestTypes, ",");
	}

	/** 
	 * 商品库适用人群 转换判断
	 *
	 * @param goodsGuestType
	 * @param position 所在二进制位数
	 * @return
	 */
	private boolean isGuestType(int goodsGuestType, int position) {
		int decimalVal = (int) Math.pow(2, position);
		return (goodsGuestType & decimalVal) == decimalVal;
	}

	/** 
	 * 商品库限时抢规则 转换为 分销限时抢规则
	 *
	 * @param goodsTimeRushPolicyList
	 * @return
	 */
	private List<TimeRushRule> toTimeRushRules(List<TimeRushPolicy> goodsTimeRushPolicyList) {
		if (goodsTimeRushPolicyList == null || goodsTimeRushPolicyList.size() == 0)
			return Collections.emptyList();
		List<TimeRushRule> timeRushRuleList = new ArrayList<TimeRushRule>();
		for (TimeRushPolicy goodsTimeRushPolicy : goodsTimeRushPolicyList) {
			TimeRushRule timeRushRule = new TimeRushRule();
			timeRushRule.setBookingStartTime(new Date(1000 * goodsTimeRushPolicy.getBooking_start_time()));
			timeRushRule.setBookingEndTime(new Date(1000 * goodsTimeRushPolicy.getBooking_end_time()));
			timeRushRule.setStartDate(new Date(1000 * goodsTimeRushPolicy.getStart_date()));
			timeRushRule.setEndDate(new Date(1000 * goodsTimeRushPolicy.getEnd_state()));
			timeRushRule.setStartTime(new Date(1000 * goodsTimeRushPolicy.getStart_time()));
			timeRushRule.setEndTime(new Date(1000 * goodsTimeRushPolicy.getEnd_time()));
			timeRushRuleList.add(timeRushRule);
		}
		return timeRushRuleList;
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
	private List<HotelGift> toGift(List<MetaHotelGiftModel> gift, String hotelCode, Map<Integer, List<GiftRelation>> giftRelationMap) {
		if (gift != null) {
			List<HotelGift> hotelGifts = new LinkedList<HotelGift>();
			for (MetaHotelGiftModel item : gift) {
				if (item.getStatus() == 0) {
					continue;
				}
				// 礼包信息屏蔽
				String giftContentCn = item.getGift_content_cn();
				if (StringUtils.isNotEmpty(giftContentCn)) {
					giftContentCn = DescriptionHelper.giftContentFilter(giftContentCn);
					if (giftContentCn == null)
						continue;
					item.setGift_content_cn(giftContentCn);
				}
				HotelGiftDateTypeEnum dateType = HotelGiftDateTypeEnum.CheckinDate;
				String weekSet = "";
				HotelGiftHourTypeEnum hourType = HotelGiftHourTypeEnum.Hours24;
				int hourNumber = -1;
				List<HotelGiftDate> dates = new ArrayList<HotelGiftDate>();
				if (item.getRelation_date_list() != null) {
					for (MetaHotelGiftRelationDate date : item.getRelation_date_list()) {
						if (date.getBegin_date() <= System.currentTimeMillis() && date.getEnd_date() >= System.currentTimeMillis()) {
							HotelGiftDateTypeEnum giftDateType = HotelGiftDateTypeEnum.CheckinDate;
							if (date.getDate_type() == 0) {
								giftDateType = HotelGiftDateTypeEnum.CheckinDate;
							} else {
								giftDateType = HotelGiftDateTypeEnum.BookingDate;
							}
							dateType = giftDateType;
							weekSet = bitMaskIntToString(date.getBit_sum4_week());
							HotelGiftHourTypeEnum giftHourType = HotelGiftHourTypeEnum.Hours24;
							if (date.getHour_type() == 2)
								giftHourType = HotelGiftHourTypeEnum.XHourAfter;
							else if (date.getHour_type() == 1)
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
					if (giftRelationMap != null && giftRelationMap.containsKey(item.gift_id)) {
						if (giftRelationMap.get(item.gift_id) != null) {
							Map<Integer, List<String>> rpRoomTypeMap = new HashMap<Integer, List<String>>();
							for (GiftRelation giftRelation : giftRelationMap.get(item.gift_id)) {
								if (rpRoomTypeMap.containsKey(giftRelation.getRatePlanId())) {
									rpRoomTypeMap.get(giftRelation.getRatePlanId()).add(giftRelation.getRoomTypeId());
								} else {
									List<String> roomTypeIds = new LinkedList<String>();
									roomTypeIds.add(giftRelation.getRoomTypeId());
									rpRoomTypeMap.put(giftRelation.getRatePlanId(), roomTypeIds);
								}
							}
							for (Integer rpId : rpRoomTypeMap.keySet()) {
								HotelGiftProductRelation hgp = new HotelGiftProductRelation();
								hgp.setRatePlanId(rpId);
								hgp.setRoomTypeIds(StringUtils.join(rpRoomTypeMap.get(rpId), ","));
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
				if (metaDRRInfo.getDrr_rule() == EnumDrrRuleCode.DRRBookAhead.getValue())
					drrRuleEnum = EnumDrrRuleCode.DRRBookAhead;
				else if (metaDRRInfo.getDrr_rule() == EnumDrrRuleCode.DRRCheckInWeekDay.getValue())
					drrRuleEnum = EnumDrrRuleCode.DRRCheckInWeekDay;
				else if (metaDRRInfo.getDrr_rule() == EnumDrrRuleCode.DRRStayLastNight.getValue())
					drrRuleEnum = EnumDrrRuleCode.DRRStayLastNight;
				else if (metaDRRInfo.getDrr_rule() == EnumDrrRuleCode.DRRStayPerLastNight.getValue())
					drrRuleEnum = EnumDrrRuleCode.DRRStayPerLastNight;
				else if (metaDRRInfo.getDrr_rule() == EnumDrrRuleCode.DRRStayPerRoomPerNight.getValue())
					drrRuleEnum = EnumDrrRuleCode.DRRStayPerRoomPerNight;
				else if (metaDRRInfo.getDrr_rule() == EnumDrrRuleCode.DRRStayTheNightAndAfter.getValue())
					drrRuleEnum = EnumDrrRuleCode.DRRStayTheNightAndAfter;
				else if (metaDRRInfo.getDrr_rule() == EnumDrrRuleCode.DRRStayWeekDay.getValue())
					drrRuleEnum = EnumDrrRuleCode.DRRStayWeekDay;
				else if (metaDRRInfo.getDrr_rule() == EnumDrrRuleCode.None.getValue())
					drrRuleEnum = EnumDrrRuleCode.None;
				drrRule.setTypeCode(drrRuleEnum);

				EnumDrrPreferential drrPre = EnumDrrPreferential.Scale;
				if (metaDRRInfo.getMoney_or_percent() == EnumDrrPreferential.Cash.getValue())
					drrPre = EnumDrrPreferential.Cash;
				else if (metaDRRInfo.getMoney_or_percent() == EnumDrrPreferential.Scale.getValue())
					drrPre = EnumDrrPreferential.Scale;
				drrRule.setCashScale(drrPre);
				drrRule.setDeductNum(metaDRRInfo.getMoney_or_percent_value());

				EnumDateType dateType = EnumDateType.CheckInDay;
				if (metaDRRInfo.getDate_type() == EnumDateType.BookDay.getValue())
					dateType = EnumDateType.BookDay;
				else if (metaDRRInfo.getDate_type() == EnumDateType.CheckInDay.getValue())
					dateType = EnumDateType.CheckInDay;
				else if (metaDRRInfo.getDate_type() == EnumDateType.StayDay.getValue())
					dateType = EnumDateType.StayDay;
				drrRule.setDateType(dateType);

				drrRule.setDescription(DescriptionHelper.drrDescription(metaDRRInfo, isCn));
				drrRule.setStartDate(new Date(metaDRRInfo.getStart_date()));
				drrRule.setEndDate(new Date(metaDRRInfo.getEnd_date()));

				EnumDrrFeeType drrFee = EnumDrrFeeType.WeekendFee;
				if (metaDRRInfo.getFee_type() == EnumDrrFeeType.WeekdayFee.getValue())
					drrFee = EnumDrrFeeType.WeekdayFee;
				else if (metaDRRInfo.getFee_type() == EnumDrrFeeType.WeekendFee.getValue())
					drrFee = EnumDrrFeeType.WeekendFee;
				drrRule.setFeeType(drrFee);
				drrRule.setWeekSet(getWeekSet(metaDRRInfo.getIs_week_effective()));
				if (metaDRRInfo.getRuleValues() != null) {
					if (metaDRRInfo.getRuleValues().containsKey("CheckInNum")
							&& StringUtils.isNotEmpty(metaDRRInfo.getRuleValues().get("CheckInNum"))) {
						drrRule.setCheckInNum(Integer.valueOf(metaDRRInfo.getRuleValues().get("CheckInNum")));
					}
					if (metaDRRInfo.getRuleValues().containsKey("DayNum")
							&& StringUtils.isNotEmpty(metaDRRInfo.getRuleValues().get("DayNum"))) {
						drrRule.setDayNum(Integer.valueOf(metaDRRInfo.getRuleValues().get("DayNum")));
					}
					if (metaDRRInfo.getRuleValues().containsKey("LastDayNum")
							&& StringUtils.isNotEmpty(metaDRRInfo.getRuleValues().get("LastDayNum"))) {
						drrRule.setLastDayNum(Integer.valueOf(metaDRRInfo.getRuleValues().get("LastDayNum")));
					}
					if (metaDRRInfo.getRuleValues().containsKey("EveryCheckInNum")
							&& StringUtils.isNotEmpty(metaDRRInfo.getRuleValues().get("EveryCheckInNum"))) {
						drrRule.setEveryCheckInNum(Integer.valueOf(metaDRRInfo.getRuleValues().get("EveryCheckInNum")));
					}
					if (metaDRRInfo.getRuleValues().containsKey("WhichDayNum")
							&& StringUtils.isNotEmpty(metaDRRInfo.getRuleValues().get("WhichDayNum"))) {
						drrRule.setWhichDayNum(Integer.valueOf(metaDRRInfo.getRuleValues().get("WhichDayNum")));
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
	private List<BaseGuaranteeRule> toGuaranteeRule(List<MetaVouchInfo> metaVouchInfos) {
		if (metaVouchInfos != null) {
			List<BaseGuaranteeRule> guaranteeRules = new LinkedList<BaseGuaranteeRule>();
			for (MetaVouchInfo metaVouchInfo : metaVouchInfos) {
				BaseGuaranteeRule guaranteeRule = new BaseGuaranteeRule();
				guaranteeRule.setStartDate(new Date(metaVouchInfo.getStart_date()));
				guaranteeRule.setEndDate(new Date(metaVouchInfo.getEndDate()));
				guaranteeRule.setStartTime(metaVouchInfo.getArrive_start_time() != null ? metaVouchInfo.getArrive_start_time() : "");
				guaranteeRule.setEndTime(metaVouchInfo.getArrive_end_time() != null ? metaVouchInfo.getArrive_end_time() : "");
				guaranteeRule.setAmount(metaVouchInfo.getRoom_count());

				EnumGuaranteeChangeRule gcrule = EnumGuaranteeChangeRule.NoChange;
				if (metaVouchInfo.getVouch_change_rule() == EnumGuaranteeChangeRule.NeedCheckin24hour.getValue())
					gcrule = EnumGuaranteeChangeRule.NeedCheckin24hour;
				else if (metaVouchInfo.getVouch_change_rule() == EnumGuaranteeChangeRule.NeedCheckinTime.getValue())
					gcrule = EnumGuaranteeChangeRule.NeedCheckinTime;
				else if (metaVouchInfo.getVouch_change_rule() == EnumGuaranteeChangeRule.NeedSomeDay.getValue())
					gcrule = EnumGuaranteeChangeRule.NeedSomeDay;
				guaranteeRule.setChangeRule(gcrule);

				EnumDateType dateType = EnumDateType.CheckInDay;
				if (metaVouchInfo.getDate_type() == EnumDateType.BookDay.getValue())
					dateType = EnumDateType.BookDay;
				else if (metaVouchInfo.getDate_type() == EnumDateType.CheckInDay.getValue())
					dateType = EnumDateType.CheckInDay;
				else if (metaVouchInfo.getDate_type() == EnumDateType.StayDay.getValue())
					dateType = EnumDateType.StayDay;
				guaranteeRule.setDateType(dateType);

				guaranteeRule.setDescription(DescriptionHelper.vouchInfoDescription(metaVouchInfo, isCn));
				guaranteeRule.setIsAmountGuarantee(metaVouchInfo.isIs_room_count_vouch());
				guaranteeRule.setIsTimeGuarantee(metaVouchInfo.isIs_arrive_time_vouch());

				EnumGuaranteeMoneyType moneyType = EnumGuaranteeMoneyType.FullNightCost;
				if (metaVouchInfo.getVouch_money_type() == EnumGuaranteeMoneyType.FirstNightCost.getValue())
					moneyType = EnumGuaranteeMoneyType.FirstNightCost;
				guaranteeRule.setGuaranteeType(moneyType);
				guaranteeRule.setWeekSet(getWeekSet(metaVouchInfo.getIs_week_effective()));
				if (metaVouchInfo.getRule_values() != null) {
					if (metaVouchInfo.getRule_values().containsKey("DayNum")
							&& StringUtils.isNotEmpty(metaVouchInfo.getRule_values().get("DayNum"))) {
						guaranteeRule.setDay(DateUtil.toDate(metaVouchInfo.getRule_values().get("DayNum")));
					}
					if (metaVouchInfo.getRule_values().containsKey("HourNum")
							&& StringUtils.isNotEmpty(metaVouchInfo.getRule_values().get("HourNum"))) {
						guaranteeRule.setHour(Integer.valueOf(metaVouchInfo.getRule_values().get("HourNum")));
					}
					if (metaVouchInfo.getRule_values().containsKey("TimeNum")
							&& StringUtils.isNotEmpty(metaVouchInfo.getRule_values().get("TimeNum"))) {
						guaranteeRule.setTime(metaVouchInfo.getRule_values().get("TimeNum"));
					}
					if (metaVouchInfo.getRule_values().containsKey("IsTomorrow")
							&& StringUtils.isNotEmpty(metaVouchInfo.getRule_values().get("IsTomorrow"))) {
						guaranteeRule.setIsTomorrow("1".equals(metaVouchInfo.getRule_values().get("IsTomorrow")));
					}
				}

				// 如果是无条件担保，需要将取消条款中的 最早到店时间前N小时修改成
				// 到店日24点前N+10小时---这样就是将最早到店时间默认为14点
				if (!guaranteeRule.getIsAmountGuarantee() && !guaranteeRule.getIsTimeGuarantee()
						&& guaranteeRule.getChangeRule() == EnumGuaranteeChangeRule.NeedCheckinTime) {
					guaranteeRule.setChangeRule(EnumGuaranteeChangeRule.NeedCheckin24hour);
					guaranteeRule.setHour(guaranteeRule.getHour() + 10);
					guaranteeRule.setDescription(guaranteeRule.BuildDescription(isCn));
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
	private List<BasePrepayRule> toPrepayRule(List<MetaPrePayInfo> metaPrePayInfos) {
		List<BasePrepayRule> basePrepayRules = new LinkedList<BasePrepayRule>();
		if (metaPrePayInfos != null && metaPrePayInfos.size() > 0) {
			for (MetaPrePayInfo metaPrePayInfo : metaPrePayInfos) {
				if (metaPrePayInfo.getTarget() == 1) {
					continue;
				}
				BasePrepayRule basePrepay = new BasePrepayRule();
				EnumPrepayChangeRule prepayrule = EnumPrepayChangeRule.PrepayNoChange;
				if (metaPrePayInfo.getPrepay_change_rule() == EnumPrepayRule.PrepayNeedOneTime.value())
					prepayrule = EnumPrepayChangeRule.PrepayNeedOneTime;
				else if (metaPrePayInfo.getPrepay_change_rule() == EnumPrepayRule.PrepayNeedSomeDay.value())
					prepayrule = EnumPrepayChangeRule.PrepayNeedSomeDay;
				basePrepay.setChangeRule(prepayrule);

				EnumDateType dateType = EnumDateType.CheckInDay;
				if (metaPrePayInfo.getDate_type() != 0) {
					dateType = EnumDateType.forValue(metaPrePayInfo.getDate_type());
				}
				basePrepay.setDateType(dateType);
				basePrepay.setStartDate(new Date(metaPrePayInfo.getStart_date()));
				basePrepay.setEndDate(new Date(metaPrePayInfo.getEnd_date()));
				EnumPrepayCutPayment after = EnumPrepayCutPayment.FristNight;
				if (metaPrePayInfo.getCut_type_after() > 0) {
					after = EnumPrepayCutPayment.forValue(metaPrePayInfo.getCut_type_after());
				}
				basePrepay.setCashScaleFirstAfter(after);
				EnumPrepayCutPayment before = EnumPrepayCutPayment.FristNight;
				if (metaPrePayInfo.getCut_type_befor() > 0) {
					before = EnumPrepayCutPayment.forValue(metaPrePayInfo.getCut_type_befor());
				}
				basePrepay.setCashScaleFirstBefore(before);

				basePrepay.setDeductFeesAfter(metaPrePayInfo.isCut_after_change_time() ? 1 : 0);
				basePrepay.setDeductFeesBefore(metaPrePayInfo.isCut_befor_change_time() ? 1 : 0);

				basePrepay.setDeductNumAfter(metaPrePayInfo.getCut_num_after());
				basePrepay.setDeductNumBefore(metaPrePayInfo.getCut_num_befor());
				basePrepay.setDescription(DescriptionHelper.prepayDescription(metaPrePayInfo, isCn));
				basePrepay.setWeekSet(getWeekSet(metaPrePayInfo.getIs_week_effective()));
				if (metaPrePayInfo.getRule_values() != null) {
					if (metaPrePayInfo.getRule_values().containsKey("HourNum")
							&& StringUtils.isNotEmpty(metaPrePayInfo.getRule_values().get("HourNum"))) {
						basePrepay.setHour(Integer.valueOf(metaPrePayInfo.getRule_values().get("HourNum")));
					}
					if (metaPrePayInfo.getRule_values().containsKey("HourNum2")
							&& StringUtils.isNotEmpty(metaPrePayInfo.getRule_values().get("HourNum2"))) {
						basePrepay.setHour2(Integer.valueOf(metaPrePayInfo.getRule_values().get("HourNum2")));
					}
					if (metaPrePayInfo.getRule_values().containsKey("TimeNum")) {
						basePrepay.setTime(metaPrePayInfo.getRule_values().get("TimeNum"));
					}
					if (metaPrePayInfo.getRule_values().containsKey("DateNum")) {
						if (StringUtils.isNotEmpty(metaPrePayInfo.getRule_values().get("DateNum"))) {
							basePrepay.setDateNum(DateUtil.toDate(metaPrePayInfo.getRule_values().get("DateNum")));
						} else {
							basePrepay.setDateNum(DateUtil.getMinValue());
						}
					}
				}
				basePrepayRules.add(basePrepay);
			}
		}
		if (basePrepayRules.size() == 0) {
			BasePrepayRule base = new BasePrepayRule();

			base.setChangeRule(EnumPrepayChangeRule.PrepayNoChange);
			base.setDateType(EnumDateType.CheckInDay);

			Date today = DateUtil.getDate(new Date());
			base.setStartDate(DateUtil.addDays(today, -1));
			base.setEndDate(DateUtil.addYears(today, 1));
			base.setCashScaleFirstAfter(EnumPrepayCutPayment.Percent);
			base.setCashScaleFirstBefore(EnumPrepayCutPayment.Percent);
			base.setDeductFeesAfter(100);
			base.setDeductFeesBefore(100);
			base.setWeekSet("1,2,3,4,5,6,7");
			base.setDescription(isCn ? "一经预订成功不可变更/取消。"
					: "Once the order has been submitted successfully,  it won't be possible to change or cancel it.");
			base.setDeductNumAfter(100);
			base.setDeductNumBefore(100);
			base.setDateNum(DateUtil.addDays(today, -1));
			base.setHour(0);
			base.setHour2(0);
			base.setTime("18:00:00");
			basePrepayRules.add(base);
		}
		return basePrepayRules;

	}

	private List<BaseValueAddRule> toValueAdd(List<MetaAddValuePolicyInfo> policyInfo, List<MetaAddValueInfoSimple> relationAdd) {
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
				cnDescription = DateUtil.getDateString(new Date(rule.getStart_date())) + " - "
						+ DateUtil.getDateString(new Date(rule.getEnd_date()))
						+ ((rule.getIs_include() == 0) ? " 不含早餐" : " 包含 " + rule.getShare() + " 份早餐");
				enDescription = DateUtil.getDateString(new Date(rule.getStart_date())) + " - "
						+ DateUtil.getDateString(new Date(rule.getEnd_date()))
						+ ((rule.getIs_include() == 0) ? " no breakfast" : " includes " + rule.getShare() + " breakfast");
			}

			BaseValueAddRule base = new BaseValueAddRule();

			base.setDescription(isCn ? cnDescription : enDescription);
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
						sb1.append(addValue.getShare() + "份" + addValue.getAdd_value_cn_name() + ",");
					} else {
						sb1.append(" " + addValue.getShare() + " " + addValue.getAdd_value_en_name() + ",");
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
						sb2.append(addValue.getSingle_price() + "%" + " of the first night room rate. ,");
					}
				}
			}
		}

		if (isCn) {
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

		if (isCn) {
			return sb3.toString().equals("") ? "" : "附加服务：" + sb3.toString();
		}
		return sb3.toString().equals("") ? "" : "Other service：" + sb3.toString();
	}

	private String getWeekSet(long timeSet) {
		List<Integer> set = new LinkedList<Integer>();
		for (int i = 1; i <= 6; i++) {
			if ((timeSet & (long) Math.pow(2, i)) == Math.pow(2, i)) {
				set.add(i);
			}
		}
		if ((timeSet & (long) Math.pow(2, 0)) == Math.pow(2, 0)) {
			set.add(7);
		}
		return StringUtils.join(set, ",");
	}

	/**
	 * 3---限时抢购
	 * 4--钟点房
	 * @param strProductType 16---限时抢购,32--钟点房
	 * @param bookingchanel
	 * @param isHourPayRoom
	 * @return
	 */
	public String parseProductType(String strProductType, int bookingchanel, boolean isHourPayRoom) {
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
		// 床位房 productType值是2的26次方
		if ((pt & 67108864) == 67108864) {
			productTypeList.add("25");
		}
		if (productTypeList.size() > 0) {
			productTypes = StringUtils.join(productTypeList, ",");
		} else {
			productTypes = null;
		}
		return productTypes;
	}

	@Override
	public void setFilter(Map<String, EnumPaymentType> hotelCodeFilterType, boolean isCn) {
		this.hotelCodeFilterType = hotelCodeFilterType;
		this.isCn = isCn;
	}

}
