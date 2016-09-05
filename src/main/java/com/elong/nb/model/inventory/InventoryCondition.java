/**   
 * @(#)InventoryCondition.java	2016年5月30日	下午7:11:57	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.model.inventory;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

/**
 * (类型功能说明描述)
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2016年5月30日 下午7:11:57   Administrator     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		Administrator  
 * @version		1.0  
 * @since		JDK1.7
 */
public class InventoryCondition {
@SerializedName(value = "HotelIds", alternate = "hotelIds")	
private String HotelIds;
@SerializedName(value = "HotelCodes", alternate = "hotelCodes")
private String HotelCodes;
@SerializedName(value = "RoomTypeId", alternate = "roomTypeId")
private String RoomTypeId;
@SerializedName(value = "StartDate", alternate = "startDate")
private Date StartDate;
@SerializedName(value = "EndDate", alternate = "endDate")
private Date EndDate;
@SerializedName(value = "IsNeedInstantConfirm", alternate = "isNeedInstantConfirm")
private boolean IsNeedInstantConfirm;
public String getHotelIds() {
	return HotelIds;
}
public void setHotelIds(String hotelIds) {
	HotelIds = hotelIds;
}
public String getHotelCodes() {
	return HotelCodes;
}
public void setHotelCodes(String hotelCodes) {
	HotelCodes = hotelCodes;
}
public String getRoomTypeId() {
	return RoomTypeId;
}
public void setRoomTypeId(String roomTypeId) {
	RoomTypeId = roomTypeId;
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
public boolean isIsNeedInstantConfirm() {
	return IsNeedInstantConfirm;
}
public void setIsNeedInstantConfirm(boolean isNeedInstantConfirm) {
	IsNeedInstantConfirm = isNeedInstantConfirm;
}

}
