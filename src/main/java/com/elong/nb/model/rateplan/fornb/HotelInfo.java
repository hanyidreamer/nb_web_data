package com.elong.nb.model.rateplan.fornb;

import java.util.List;

public class HotelInfo {
	private String shotelId;//改了
    private List<HotelBookingRule> HotelBookingRuleList;
    private int WeekEndStart;
    private int WeekEndEnd;
	public String getShotelId() {
		return shotelId;
	}
	public void setShotelId(String shotelId) {
		this.shotelId = shotelId;
	}
	public int getWeekEndStart() {
		return WeekEndStart;
	}
	public void setWeekEndStart(int weekEndStart) {
		WeekEndStart = weekEndStart;
	}
	public int getWeekEndEnd() {
		return WeekEndEnd;
	}
	public void setWeekEndEnd(int weekEndEnd) {
		WeekEndEnd = weekEndEnd;
	}
	public List<HotelBookingRule> getHotelBookingRuleList() {
		return HotelBookingRuleList;
	}
	public void setHotelBookingRuleList(List<HotelBookingRule> hotelBookingRuleList) {
		HotelBookingRuleList = hotelBookingRuleList;
	}
}
