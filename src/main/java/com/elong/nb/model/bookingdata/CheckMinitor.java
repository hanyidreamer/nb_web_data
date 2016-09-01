package com.elong.nb.model.bookingdata;

public class CheckMinitor {

	 private String agentId;

     private String agentName;
     private String orderCheckTime;
     
   /// <summary>
   ///N:失败 Y：成功
   /// </summary>
     private String orderCheckStatus;

     private String roomNightsCount;
    
     private String orderCheckCode;
    
     private String checkFailureReason;

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getOrderCheckTime() {
		return orderCheckTime;
	}

	public void setOrderCheckTime(String orderCheckTime) {
		this.orderCheckTime = orderCheckTime;
	}

	public String getOrderCheckStatus() {
		return orderCheckStatus;
	}

	public void setOrderCheckStatus(String orderCheckStatus) {
		this.orderCheckStatus = orderCheckStatus;
	}

	public String getRoomNightsCount() {
		return roomNightsCount;
	}

	public void setRoomNightsCount(String roomNightsCount) {
		this.roomNightsCount = roomNightsCount;
	}

	public String getOrderCheckCode() {
		return orderCheckCode;
	}

	public void setOrderCheckCode(String orderCheckCode) {
		this.orderCheckCode = orderCheckCode;
	}

	public String getCheckFailureReason() {
		return checkFailureReason;
	}

	public void setCheckFailureReason(String checkFailureReason) {
		this.checkFailureReason = checkFailureReason;
	}
     
     
    
}
