package com.elong.nb.model.rateplan.fornb;

import java.util.List;

public class HotelDetail {
	private HotelInfo HotelBaseInfo;
    private List<RoomTypeInfo> RoomBaseInfos;
	public HotelInfo getHotelBaseInfo() {
		return HotelBaseInfo;
	}
	public void setHotelBaseInfo(HotelInfo hotelBaseInfo) {
		HotelBaseInfo = hotelBaseInfo;
	}
	public List<RoomTypeInfo> getRoomBaseInfos() {
		return RoomBaseInfos;
	}
	public void setRoomBaseInfos(List<RoomTypeInfo> roomBaseInfos) {
		RoomBaseInfos = roomBaseInfos;
	}
}
