package com.elong.nb.model.rateplan.fornb;

import java.util.List;

public class RoomTypeInfo {
	private String roomTypeId; //可以是多个用，分隔ID的字符串如“123，345”
    private List<HotelBookingRule> roomBookingRuleList;
    private List<RatePlanBaseInfo> ratePlans;
	public String getRoomTypeId() {
		return roomTypeId;
	}
	public void setRoomTypeId(String roomTypeId) {
		this.roomTypeId = roomTypeId;
	}
	public List<HotelBookingRule> getRoomBookingRuleList() {
		return roomBookingRuleList;
	}
	public void setRoomBookingRuleList(List<HotelBookingRule> roomBookingRuleList) {
		this.roomBookingRuleList = roomBookingRuleList;
	}
	public List<RatePlanBaseInfo> getRatePlans() {
		return ratePlans;
	}
	public void setRatePlans(List<RatePlanBaseInfo> ratePlans) {
		this.ratePlans = ratePlans;
	}
}
