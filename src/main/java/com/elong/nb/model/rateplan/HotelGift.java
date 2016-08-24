package com.elong.nb.model.rateplan;

import java.util.List;

import com.elong.nb.model.bean.enums.HotelGiftDateTypeEnum;
import com.elong.nb.model.bean.enums.HotelGiftHourTypeEnum;
import com.elong.nb.model.bean.enums.HotelGiftWayOfGivingEnum;

/// <summary>
/// 新版礼品
/// </summary>
public class HotelGift {

	 private int HotelGiftId;

     /// <summary>
     /// 供应商编号
     /// </summary>
     private String HotelCode;

     /// <summary>
     /// 关联的房型和RatePlan
     /// </summary>
     private List<HotelGiftProductRelation> RelatedProducts;

     /// <summary>
     /// 有效日期，可能多个
     /// </summary>
     private List<HotelGiftDate> EffectiveDates;

     /// <summary>
     /// 日期类型
     /// </summary>
     private HotelGiftDateTypeEnum DateType;
     /// <summary>
     /// 星期有效设置
     /// </summary>
     private String WeekSet;
     /// <summary>
     /// 礼品内容
     /// </summary>
     private String GiftContent;

     /// <summary>
     /// 礼品内容
     /// </summary>
     private String GiftContentEn;

     /// <summary>
     /// 礼品类型  (1,2,3...)
     /// (送餐相关、 延迟退房、 送礼品。。。)
     /// </summary>
     private String GiftTypes;

     /// <summary>
     /// 小时数
     /// </summary>
     private int HourNumber;

     /// <summary>
     /// 小时类型 
     /// （几点之前参加 或者几点之后参加 或者 24点都参加
     /// </summary>
     private HotelGiftHourTypeEnum HourType;
     /// <summary>
     /// 送礼方式 
     /// （直送一次 还是 每晚都送 还是 其它）
     /// </summary>
     private HotelGiftWayOfGivingEnum WayOfGiving;

     /// <summary>
     /// 送礼方式是其它的话，
     /// 送礼方式的新名称
     /// </summary>
     private String WayOfGivingOther;
     private String WayOfGivingOtherEn;
	public int getHotelGiftId() {
		return HotelGiftId;
	}
	public void setHotelGiftId(int hotelGiftId) {
		HotelGiftId = hotelGiftId;
	}
	public String getHotelCode() {
		return HotelCode;
	}
	public void setHotelCode(String hotelCode) {
		HotelCode = hotelCode;
	}
	public List<HotelGiftProductRelation> getRelatedProducts() {
		return RelatedProducts;
	}
	public void setRelatedProducts(List<HotelGiftProductRelation> relatedProducts) {
		RelatedProducts = relatedProducts;
	}
	public List<HotelGiftDate> getEffectiveDates() {
		return EffectiveDates;
	}
	public void setEffectiveDates(List<HotelGiftDate> effectiveDates) {
		EffectiveDates = effectiveDates;
	}
	public HotelGiftDateTypeEnum getDateType() {
		return DateType;
	}
	public void setDateType(HotelGiftDateTypeEnum dateType) {
		DateType = dateType;
	}
	public String getWeekSet() {
		return WeekSet;
	}
	public void setWeekSet(String weekSet) {
		WeekSet = weekSet;
	}
	public String getGiftContent() {
		return GiftContent;
	}
	public void setGiftContent(String giftContent) {
		GiftContent = giftContent;
	}
	public String getGiftContentEn() {
		return GiftContentEn;
	}
	public void setGiftContentEn(String giftContentEn) {
		GiftContentEn = giftContentEn;
	}
	public String getGiftTypes() {
		return GiftTypes;
	}
	public void setGiftTypes(String giftTypes) {
		GiftTypes = giftTypes;
	}
	public int getHourNumber() {
		return HourNumber;
	}
	public void setHourNumber(int hourNumber) {
		HourNumber = hourNumber;
	}
	public HotelGiftHourTypeEnum getHourType() {
		return HourType;
	}
	public void setHourType(HotelGiftHourTypeEnum hourType) {
		HourType = hourType;
	}
	public HotelGiftWayOfGivingEnum getWayOfGiving() {
		return WayOfGiving;
	}
	public void setWayOfGiving(HotelGiftWayOfGivingEnum wayOfGiving) {
		WayOfGiving = wayOfGiving;
	}
	public String getWayOfGivingOther() {
		return WayOfGivingOther;
	}
	public void setWayOfGivingOther(String wayOfGivingOther) {
		WayOfGivingOther = wayOfGivingOther;
	}
	public String getWayOfGivingOtherEn() {
		return WayOfGivingOtherEn;
	}
	public void setWayOfGivingOtherEn(String wayOfGivingOtherEn) {
		WayOfGivingOtherEn = wayOfGivingOtherEn;
	}
     
     


}
