/**   
 * @(#)Inventory.java	2016年5月30日	下午6:51:51	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.model;

import java.util.Date;

/**
 * (类型功能说明描述)
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2016年5月30日 下午6:51:51   Administrator     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		Administrator  
 * @version		1.0  
 * @since		JDK1.7
 */
public class Inventory {
	private String HotelID;
	private String RoomTypeID;
	private String HotelCode;
	private Date AvailableDate;
	private boolean Status;
	private int AvailableAmount;
	private int OverBooking;
	private Date StartDate;
	private Date EndDate;
	private String StartTime;
	private String EndTime;
	private boolean IsInstantConfirm;
	private String IC_BeginTime;
	private String IC_EndTime;
	
	public String getHotelID() {
		return HotelID;
	}
	public void setHotelID(String hotelID) {
		HotelID = hotelID;
	}
	public String getRoomTypeID() {
		return RoomTypeID;
	}
	public void setRoomTypeID(String roomTypeID) {
		RoomTypeID = roomTypeID;
	}
	public String getHotelCode() {
		return HotelCode;
	}
	public void setHotelCode(String hotelCode) {
		HotelCode = hotelCode;
	}
	public Date getAvailableDate() {
		return AvailableDate;
	}
	public void setAvailableDate(Date availableDate) {
		AvailableDate = availableDate;
	}
	public boolean isStatus() {
		return Status;
	}
	public void setStatus(boolean status) {
		Status = status;
	}
	public int getAvailableAmount() {
		return AvailableAmount;
	}
	public void setAvailableAmount(int availableAmount) {
		AvailableAmount = availableAmount;
	}
	public int getOverBooking() {
		return OverBooking;
	}
	public void setOverBooking(int overBooking) {
		OverBooking = overBooking;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	public String getStartTime() {
		return StartTime;
	}
	public void setStartTime(String startTime) {
		StartTime = startTime;
	}
	public String getEndTime() {
		return EndTime;
	}
	public void setEndTime(String endTime) {
		EndTime = endTime;
	}
	public boolean isIsInstantConfirm() {
		return IsInstantConfirm;
	}
	public void setIsInstantConfirm(boolean isInstantConfirm) {
		IsInstantConfirm = isInstantConfirm;
	}
	public String getIC_BeginTime() {
		return IC_BeginTime;
	}
	public void setIC_BeginTime(String iC_BeginTime) {
		IC_BeginTime = iC_BeginTime;
	}
	public String getIC_EndTime() {
		return IC_EndTime;
	}
	public void setIC_EndTime(String iC_EndTime) {
		IC_EndTime = iC_EndTime;
	}
	
	
}
