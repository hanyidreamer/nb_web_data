package com.elong.nb.model.rateplan.fornb;

import java.util.List;

public class HotelInfo {

	private String shotelId;// 改了
	private List<HotelBookingRule> hotelBookingRuleList;
	private int weekEndStart;
	private int weekEndEnd;

	public String getShotelId() {
		return shotelId;
	}

	public void setShotelId(String shotelId) {
		this.shotelId = shotelId;
	}

	public List<HotelBookingRule> getHotelBookingRuleList() {
		return hotelBookingRuleList;
	}

	public void setHotelBookingRuleList(List<HotelBookingRule> hotelBookingRuleList) {
		this.hotelBookingRuleList = hotelBookingRuleList;
	}

	public int getWeekEndStart() {
		return weekEndStart;
	}

	public void setWeekEndStart(int weekEndStart) {
		this.weekEndStart = weekEndStart;
	}

	public int getWeekEndEnd() {
		return weekEndEnd;
	}

	public void setWeekEndEnd(int weekEndEnd) {
		this.weekEndEnd = weekEndEnd;
	}
}
