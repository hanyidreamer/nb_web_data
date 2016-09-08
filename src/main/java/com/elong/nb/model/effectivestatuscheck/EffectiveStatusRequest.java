package com.elong.nb.model.effectivestatuscheck;

import java.util.Date;

public class EffectiveStatusRequest {

	private String mhotelId;
    private String roomTypeId;
    private int ratePlanId;
    private String checkinDate;
    private String checkoutDate;
	public String getMhotelId() {
		return mhotelId;
	}
	public void setMhotelId(String mhotelId) {
		this.mhotelId = mhotelId;
	}
	public String getRoomTypeId() {
		return roomTypeId;
	}
	public void setRoomTypeId(String roomTypeId) {
		this.roomTypeId = roomTypeId;
	}
	public int getRatePlanId() {
		return ratePlanId;
	}
	public void setRatePlanId(int ratePlanId) {
		this.ratePlanId = ratePlanId;
	}
	public String getCheckinDate() {
		return checkinDate;
	}
	public void setCheckinDate(String checkinDate) {
		this.checkinDate = checkinDate;
	}
	public String getCheckoutDate() {
		return checkoutDate;
	}
	public void setCheckoutDate(String checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
    
    
    
}
