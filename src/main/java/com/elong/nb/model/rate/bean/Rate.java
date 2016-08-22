package com.elong.nb.model.rate.bean;

import java.util.Date;

import com.google.gson.annotations.Since;

public class Rate {

	private String HotelID;

    /// <summary>
    /// s酒店ID
    /// </summary>
	@Since(1.13)
	private String HotelCode;

    /// <summary>
    /// 房型ID
    /// </summary>
	private String RoomTypeId;

    /// <summary>
    /// RatePlan
    /// </summary>
	private int RateplanId;

    /// <summary>
    /// 开始时间
    /// </summary>
	private Date StartDate;

    /// <summary>
    /// 结束时间
    /// </summary>
	private Date EndDate;

    /// <summary>
    /// 状态
    /// </summary>
	private Boolean Status;

    /// <summary>
    /// 平日卖价
    /// </summary>
	private Double Member;

    /// <summary>
    /// 周末卖价
    /// </summary>
    public Double Weekend;

    /// <summary>
    ///  平日底价
    /// </summary>
    private Double MemberCost;

    /// <summary>
    /// 周末底价
    /// </summary>
    public Double WeekendCost;


    /// <summary>
    /// v1.01新增
    /// 加床价
    /// </summary>
    @Since(1.01)
    private Double AddBed;

    /// <summary>
    /// 房价ID(v1.08新增)
    /// </summary>
    @Since(1.08)
    private Long PriceID;

    /// <summary>
    /// 货币代码(v1.08新增)
    /// </summary>
    @Since(1.08)
    private String CurrencyCode;

	public String getHotelID() {
		return HotelID;
	}

	public void setHotelID(String hotelID) {
		HotelID = hotelID;
	}

	public String getHotelCode() {
		return HotelCode;
	}

	public void setHotelCode(String hotelCode) {
		HotelCode = hotelCode;
	}

	public String getRoomTypeId() {
		return RoomTypeId;
	}

	public void setRoomTypeId(String roomTypeId) {
		RoomTypeId = roomTypeId;
	}

	public int getRateplanId() {
		return RateplanId;
	}

	public void setRateplanId(int rateplanId) {
		RateplanId = rateplanId;
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

	public Boolean getStatus() {
		return Status;
	}

	public void setStatus(Boolean status) {
		Status = status;
	}

	public Double getMember() {
		return Member;
	}

	public void setMember(Double member) {
		Member = member;
	}

	public Double getWeekend() {
		return Weekend;
	}

	public void setWeekend(Double weekend) {
		Weekend = weekend;
	}

	public Double getMemberCost() {
		return MemberCost;
	}

	public void setMemberCost(Double memberCost) {
		MemberCost = memberCost;
	}

	public Double getWeekendCost() {
		return WeekendCost;
	}

	public void setWeekendCost(Double weekendCost) {
		WeekendCost = weekendCost;
	}

	public Double getAddBed() {
		return AddBed;
	}

	public void setAddBed(Double addBed) {
		AddBed = addBed;
	}

	public Long getPriceID() {
		return PriceID;
	}

	public void setPriceID(Long priceID) {
		PriceID = priceID;
	}

	public String getCurrencyCode() {
		return CurrencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		CurrencyCode = currencyCode;
	}
    
}
