/**   
 * @(#)RoomRelation.java	2016年8月9日	下午3:34:58	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.model;

import com.google.gson.annotations.SerializedName;

/**
 * 房型mapping－对外模型
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2016年8月9日 下午3:34:58   user     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		user 
 * @version		1.0  
 * @since		JDK1.7
 */
public class RoomRelationApi {

	@SerializedName(value = "RoomId", alternate = "roomId")
	private String elongBaseRoomId;

	@SerializedName(value = "RoomName", alternate = "roomName")
	private String elongBaseRoomName;

	@SerializedName(value = "OtaRoomId", alternate = "otaRoomId")
	private String otaBaseRoomId;

	/**   
	 * 得到elongBaseRoomId的值   
	 *   
	 * @return elongBaseRoomId的值
	 */
	public String getElongBaseRoomId() {
		return elongBaseRoomId;
	}

	/**
	 * 设置elongBaseRoomId的值
	 *   
	 * @param elongBaseRoomId 被设置的值
	 */
	public void setElongBaseRoomId(String elongBaseRoomId) {
		this.elongBaseRoomId = elongBaseRoomId;
	}

	/**   
	 * 得到elongBaseRoomName的值   
	 *   
	 * @return elongBaseRoomName的值
	 */
	public String getElongBaseRoomName() {
		return elongBaseRoomName;
	}

	/**
	 * 设置elongBaseRoomName的值
	 *   
	 * @param elongBaseRoomName 被设置的值
	 */
	public void setElongBaseRoomName(String elongBaseRoomName) {
		this.elongBaseRoomName = elongBaseRoomName;
	}

	/**   
	 * 得到otaBaseRoomId的值   
	 *   
	 * @return otaBaseRoomId的值
	 */
	public String getOtaBaseRoomId() {
		return otaBaseRoomId;
	}

	/**
	 * 设置otaBaseRoomId的值
	 *   
	 * @param otaBaseRoomId 被设置的值
	 */
	public void setOtaBaseRoomId(String otaBaseRoomId) {
		this.otaBaseRoomId = otaBaseRoomId;
	}

}
