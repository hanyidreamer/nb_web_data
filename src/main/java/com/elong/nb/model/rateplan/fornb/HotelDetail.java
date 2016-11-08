package com.elong.nb.model.rateplan.fornb;

import java.util.List;

public class HotelDetail {
	private HotelInfo hotelBaseInfo;
    private List<RoomTypeInfo> roomBaseInfos;
	public HotelInfo getHotelBaseInfo() {
		return hotelBaseInfo;
	}
	public void setHotelBaseInfo(HotelInfo hotelBaseInfo) {
		this.hotelBaseInfo = hotelBaseInfo;
	}
	public List<RoomTypeInfo> getRoomBaseInfos() {
		return roomBaseInfos;
	}
	public void setRoomBaseInfos(List<RoomTypeInfo> roomBaseInfos) {
		this.roomBaseInfos = roomBaseInfos;
	}
}
