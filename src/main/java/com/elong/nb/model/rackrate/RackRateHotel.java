package com.elong.nb.model.rackrate;

import java.util.List;

public class RackRateHotel {

	 private String HotelCode;

     private List<RackRateRoomType> RoomTypes;

	public String getHotelCode() {
		return HotelCode;
	}

	public void setHotelCode(String hotelCode) {
		HotelCode = hotelCode;
	}

	public List<RackRateRoomType> getRoomTypes() {
		return RoomTypes;
	}

	public void setRoomTypes(List<RackRateRoomType> roomTypes) {
		RoomTypes = roomTypes;
	}
     
     
     
}
