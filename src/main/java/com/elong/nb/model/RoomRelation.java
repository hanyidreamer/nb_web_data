/**   
 * @(#)RoomRelation.java	2016年8月9日	下午3:34:58	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.model;

/**
 * 房型mapping－内部模型
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
public class RoomRelation {

	private Long createdAt;
	private String creator;
	private String creatorIp;
	private String elongBaseRoomId;
	private String elongBaseRoomName;
	private String elongHotelName;
	private String hotelId;
	private Integer operateType;
	private String operator;
	private String operatorIp;
	private String otaBaseRoomId;
	private String otaBaseRoomName;
	private String otaHotelId;
	private String otaHotelName;
	private String otaType;
	private Integer status;
	private Integer trustedLevel;
	private Long updatedAt;

	/**   
	 * 得到createdAt的值   
	 *   
	 * @return createdAt的值
	 */
	public Long getCreatedAt() {
		return createdAt;
	}

	/**
	 * 设置createdAt的值
	 *   
	 * @param createdAt 被设置的值
	 */
	public void setCreatedAt(Long createdAt) {
		this.createdAt = createdAt;
	}

	/**   
	 * 得到creator的值   
	 *   
	 * @return creator的值
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * 设置creator的值
	 *   
	 * @param creator 被设置的值
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}

	/**   
	 * 得到creatorIp的值   
	 *   
	 * @return creatorIp的值
	 */
	public String getCreatorIp() {
		return creatorIp;
	}

	/**
	 * 设置creatorIp的值
	 *   
	 * @param creatorIp 被设置的值
	 */
	public void setCreatorIp(String creatorIp) {
		this.creatorIp = creatorIp;
	}

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
	 * 得到operateType的值   
	 *   
	 * @return operateType的值
	 */
	public Integer getOperateType() {
		return operateType;
	}

	/**
	 * 设置operateType的值
	 *   
	 * @param operateType 被设置的值
	 */
	public void setOperateType(Integer operateType) {
		this.operateType = operateType;
	}

	/**   
	 * 得到operator的值   
	 *   
	 * @return operator的值
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * 设置operator的值
	 *   
	 * @param operator 被设置的值
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}

	/**   
	 * 得到operatorIp的值   
	 *   
	 * @return operatorIp的值
	 */
	public String getOperatorIp() {
		return operatorIp;
	}

	/**
	 * 设置operatorIp的值
	 *   
	 * @param operatorIp 被设置的值
	 */
	public void setOperatorIp(String operatorIp) {
		this.operatorIp = operatorIp;
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

	/**   
	 * 得到otaBaseRoomName的值   
	 *   
	 * @return otaBaseRoomName的值
	 */
	public String getOtaBaseRoomName() {
		return otaBaseRoomName;
	}

	/**
	 * 设置otaBaseRoomName的值
	 *   
	 * @param otaBaseRoomName 被设置的值
	 */
	public void setOtaBaseRoomName(String otaBaseRoomName) {
		this.otaBaseRoomName = otaBaseRoomName;
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
	 * 得到otaHotelName的值   
	 *   
	 * @return otaHotelName的值
	 */
	public String getOtaHotelName() {
		return otaHotelName;
	}

	/**
	 * 设置otaHotelName的值
	 *   
	 * @param otaHotelName 被设置的值
	 */
	public void setOtaHotelName(String otaHotelName) {
		this.otaHotelName = otaHotelName;
	}

	/**   
	 * 得到otaType的值   
	 *   
	 * @return otaType的值
	 */
	public String getOtaType() {
		return otaType;
	}

	/**
	 * 设置otaType的值
	 *   
	 * @param otaType 被设置的值
	 */
	public void setOtaType(String otaType) {
		this.otaType = otaType;
	}

	/**   
	 * 得到status的值   
	 *   
	 * @return status的值
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * 设置status的值
	 *   
	 * @param status 被设置的值
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**   
	 * 得到trustedLevel的值   
	 *   
	 * @return trustedLevel的值
	 */
	public Integer getTrustedLevel() {
		return trustedLevel;
	}

	/**
	 * 设置trustedLevel的值
	 *   
	 * @param trustedLevel 被设置的值
	 */
	public void setTrustedLevel(Integer trustedLevel) {
		this.trustedLevel = trustedLevel;
	}

	/**   
	 * 得到updatedAt的值   
	 *   
	 * @return updatedAt的值
	 */
	public Long getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * 设置updatedAt的值
	 *   
	 * @param updatedAt 被设置的值
	 */
	public void setUpdatedAt(Long updatedAt) {
		this.updatedAt = updatedAt;
	}

}
