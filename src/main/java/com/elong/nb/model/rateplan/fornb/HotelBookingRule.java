package com.elong.nb.model.rateplan.fornb;

import java.util.Date;

public class HotelBookingRule {

	private long iD;
	private int dateType = 3;// 预定时间
	private String cNDescription;
	private String eNDescription;
	private Date startDate;
	private Date endDate;
	private String startHour;
	private String endHour;
	private String roomTypeID;
	private int hotelBooKingRule;

	public long getID() {
		return iD;
	}

	public void setID(long iD) {
		this.iD = iD;
	}

	public int getDateType() {
		return dateType;
	}

	public void setDateType(int dateType) {
		this.dateType = dateType;
	}

	public String getCNDescription() {
		return cNDescription;
	}

	public void setCNDescription(String cNDescription) {
		this.cNDescription = cNDescription;
	}

	public String getENDescription() {
		return eNDescription;
	}

	public void setENDescription(String eNDescription) {
		this.eNDescription = eNDescription;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getStartHour() {
		return startHour;
	}

	public void setStartHour(String startHour) {
		this.startHour = startHour;
	}

	public String getEndHour() {
		return endHour;
	}

	public void setEndHour(String endHour) {
		this.endHour = endHour;
	}

	public String getRoomTypeID() {
		return roomTypeID;
	}

	public void setRoomTypeID(String roomTypeID) {
		this.roomTypeID = roomTypeID;
	}

	public int getHotelBooKingRule() {
		return hotelBooKingRule;
	}

	public void setHotelBooKingRule(int hotelBooKingRule) {
		this.hotelBooKingRule = hotelBooKingRule;
	}
}
