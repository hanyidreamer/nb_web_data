package com.elong.nb.model;

import java.util.List;

public class HotelIdAttr {
	private String hotelId;
	private List<String> hotelCodes;
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	/**
	 * @return the hotelCodes
	 */
	public List<String> getHotelCodes() {
		return hotelCodes;
	}
	/**
	 * @param hotelCodes the hotelCodes to set
	 */
	public void setHotelCodes(List<String> hotelCodes) {
		this.hotelCodes = hotelCodes;
	}
}
