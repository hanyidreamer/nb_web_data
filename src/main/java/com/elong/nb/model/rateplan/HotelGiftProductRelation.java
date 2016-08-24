package com.elong.nb.model.rateplan;

public class HotelGiftProductRelation {
    /// <summary>
    /// 销售房型编号， all表示所有房型
    /// </summary>
    private String RoomTypeIds;

    private int RatePlanId;

	public String getRoomTypeIds() {
		return RoomTypeIds;
	}

	public void setRoomTypeIds(String roomTypeIds) {
		RoomTypeIds = roomTypeIds;
	}

	public int getRatePlanId() {
		return RatePlanId;
	}

	public void setRatePlanId(int ratePlanId) {
		RatePlanId = ratePlanId;
	}
    
}
