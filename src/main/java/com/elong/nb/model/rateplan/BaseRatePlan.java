package com.elong.nb.model.rateplan;

import com.elong.nb.model.bean.enums.EnumPaymentType;
import com.google.gson.annotations.Since;

public class BaseRatePlan {
	 /// <summary>
    /// 产品编号
    /// </summary>
    private int RatePlanId ;

    /// <summary>
    /// 产品编码
    /// </summary>
    //public string RatePlanCode { get; set; }

    /// <summary>
    /// 产品名称
    /// </summary>
    private String RatePlanName ;

    /// <summary>
    /// 预定最少数量(默认值：1)
    /// </summary>
    private int MinAmount ;

    /// <summary>
    /// 最少入住天数(默认值：1)
    /// </summary>
    private int MinDays ;

    /// <summary>
    /// 最多入住天数
    /// </summary>
    private int MaxDays;

    /// <summary>
    /// 付款类型
    /// </summary>
    private EnumPaymentType PaymentType;


    @Since(1.21)
    private HourlyRoomInfo HourlyRoomInfo;


	public int getRatePlanId() {
		return RatePlanId;
	}


	public void setRatePlanId(int ratePlanId) {
		RatePlanId = ratePlanId;
	}


	public String getRatePlanName() {
		return RatePlanName;
	}


	public void setRatePlanName(String ratePlanName) {
		RatePlanName = ratePlanName;
	}


	public int getMinAmount() {
		return MinAmount;
	}


	public void setMinAmount(int minAmount) {
		MinAmount = minAmount;
	}


	public int getMinDays() {
		return MinDays;
	}


	public void setMinDays(int minDays) {
		MinDays = minDays;
	}


	public int getMaxDays() {
		return MaxDays;
	}


	public void setMaxDays(int maxDays) {
		MaxDays = maxDays;
	}


	public EnumPaymentType getPaymentType() {
		return PaymentType;
	}


	public void setPaymentType(EnumPaymentType paymentType) {
		PaymentType = paymentType;
	}


	public HourlyRoomInfo getHourlyRoomInfo() {
		return HourlyRoomInfo;
	}


	public void setHourlyRoomInfo(HourlyRoomInfo hourlyRoomInfo) {
		HourlyRoomInfo = hourlyRoomInfo;
	}



    //[OnSerializing]
    //private void OnSerializingMethod(StreamingContext context)
    //{

     //   if (ApiContext.Current.Version < 1.21)
     //   {
      //      this.HourlyRoomInfo = null;
      //  }

    //}
}
