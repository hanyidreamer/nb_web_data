package com.elong.nb.model.rate;

import java.util.Date;

import com.elong.nb.model.bean.enums.EnumPaymentType;
import com.google.gson.annotations.SerializedName;

public class RateCondition {
	@SerializedName(value="HotelIds", alternate="hotelIds")
	private String HotelIds;
	@SerializedName(value="HotelCodes", alternate="hotelCodes")
	private String HotelCodes;
	@SerializedName(value="StartDate", alternate="startDate")
	private Date StartDate;
	@SerializedName(value="EndDate", alternate="endDate")
	private Date EndDate;
	@SerializedName(value="PaymentType", alternate="paymentType")
	private EnumPaymentType PaymentType;

    public String getHotelIds() {
		return HotelIds;
	}

	public void setHotelIds(String hotelIds) {
		HotelIds = hotelIds;
	}

	public String getHotelCodes() {
		return HotelCodes;
	}

	public void setHotelCodes(String hotelCodes) {
		HotelCodes = hotelCodes;
	}

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

	public EnumPaymentType getPaymentType() {
		return PaymentType;
	}

	public void setPaymentType(EnumPaymentType paymentType) {
		PaymentType = paymentType;
	}
}
