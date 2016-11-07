package com.elong.nb.model.rateplan.fornb;

import java.util.List;

public class RoomTypeInfo {
	private String RoomTypeId; //可以是多个用，分隔ID的字符串如“123，345”
    private List<HotelBookingRule> RoomBookingRuleList;
    private List<RatePlanBaseInfo> RatePlans;
	public String getRoomTypeId() {
		return RoomTypeId;
	}
	public void setRoomTypeId(String roomTypeId) {
		RoomTypeId = roomTypeId;
	}
	public List<HotelBookingRule> getRoomBookingRuleList() {
		return RoomBookingRuleList;
	}
	public void setRoomBookingRuleList(List<HotelBookingRule> roomBookingRuleList) {
		RoomBookingRuleList = roomBookingRuleList;
	}
	public List<RatePlanBaseInfo> getRatePlans() {
		return RatePlans;
	}
	public void setRatePlans(List<RatePlanBaseInfo> ratePlans) {
		RatePlans = ratePlans;
	}
}
