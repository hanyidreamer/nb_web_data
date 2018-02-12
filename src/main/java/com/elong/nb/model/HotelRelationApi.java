/**   
 * @(#)HotelRelation.java	2016年8月9日	下午3:32:23	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * 酒店mapping－对外模型
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2016年8月9日 下午3:32:23   user     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		user 
 * @version		1.0  
 * @since		JDK1.7
 */
public class HotelRelationApi {

	@SerializedName(value = "HotelName", alternate = "hotelName")
	private String elongHotelName;

	@SerializedName(value = "HotelId", alternate = "hotelId")
	private String hotelId;

	@SerializedName(value = "OtaHotelId", alternate = "otaHotelId")
	private String otaHotelId;

	@SerializedName(value = "OperateTime", alternate = "operateTime")
	private String operateTime;

	@SerializedName(value = "RoomRelationList", alternate = "roomRelationList")
	private List<RoomRelationApi> roomRelationList;

	/**   
	 * 得到elongHotelName的值   
	 *   
	 * @return elongHotelName的值
	 */
	public String getElongHotelName() {
		return elongHotelName;
	}

	/**
	 * 设置elongHotelName的值
	 *   
	 * @param elongHotelName 被设置的值
	 */
	public void setElongHotelName(String elongHotelName) {
		this.elongHotelName = elongHotelName;
	}

	/**   
	 * 得到hotelId的值   
	 *   
	 * @return hotelId的值
	 */
	public String getHotelId() {
		return hotelId;
	}

	/**
	 * 设置hotelId的值
	 *   
	 * @param hotelId 被设置的值
	 */
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	/**   
	 * 得到otaHotelId的值   
	 *   
	 * @return otaHotelId的值
	 */
	public String getOtaHotelId() {
		return otaHotelId;
	}

	/**
	 * 设置otaHotelId的值
	 *   
	 * @param otaHotelId 被设置的值
	 */
	public void setOtaHotelId(String otaHotelId) {
		this.otaHotelId = otaHotelId;
	}

	/**   
	 * 得到operateTime的值   
	 *   
	 * @return operateTime的值
	 */
	public String getOperateTime() {
		return operateTime;
	}

	/**
	 * 设置operateTime的值
	 *   
	 * @param operateTime 被设置的值
	 */
	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}

	/**   
	 * 得到roomRelationList的值   
	 *   
	 * @return roomRelationList的值
	 */
	public List<RoomRelationApi> getRoomRelationList() {
		return roomRelationList;
	}

	/**
	 * 设置roomRelationList的值
	 *   
	 * @param roomRelationList 被设置的值
	 */
	public void setRoomRelationList(List<RoomRelationApi> roomRelationList) {
		this.roomRelationList = roomRelationList;
	}

}
