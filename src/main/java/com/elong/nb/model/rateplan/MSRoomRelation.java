package com.elong.nb.model.rateplan;

import com.google.gson.annotations.Since;

public class MSRoomRelation {

	private String RoomTypeId;
    private String RoomId;
    @Since(1.11)
    private boolean Status;
    
	public String getRoomTypeId() {
		return RoomTypeId;
	}
	public void setRoomTypeId(String roomTypeId) {
		RoomTypeId = roomTypeId;
	}
	public String getRoomId() {
		return RoomId;
	}
	public void setRoomId(String roomId) {
		RoomId = roomId;
	}
	public boolean isStatus() {
		return Status;
	}
	public void setStatus(boolean status) {
		Status = status;
	}


    //[OnSerializing]
    //private void OnSerializingMethod(StreamingContext context)
    //{

     //   if (com.elong.api.core.wcf.ApiContext.Current.Version < 1.11)
     //   {
     //       this.Status = null;
     //   }

    //}
}
