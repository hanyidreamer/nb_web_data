package com.elong.nb.model.rateplan;

import java.util.Date;

import com.elong.nb.model.bean.enums.HotelGiftDateTypeEnum;
import com.elong.nb.model.bean.enums.HotelGiftHourTypeEnum;
import com.elong.nb.model.bean.enums.HotelGiftWayOfGivingEnum;

/// <summary>
/// 礼品规则
/// v1.11开始不用于hotel.data.rp, 仅用于搜索
/// </summary>
public class BaseGiftRule extends BaseRule{

    /// <summary>
    /// 礼品生效开始日期
    /// </summary>
    private Date StartDate;

    /// <summary>
    /// 礼品生效结束日期
    /// </summary>
    private Date EndDate;

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
    /// 礼品类型  (1,2,3...)
    /// (送餐相关、 延迟退房、 送礼品。。。)
   /// </summary>
    private String GiftTypes ;

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

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
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
    
    
}
