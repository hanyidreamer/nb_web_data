/**   
 * @(#)HotelMappingRequest.java	2016年8月11日	上午10:36:48	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.model;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.google.gson.annotations.SerializedName;

/**
 * hotel-mapping请求
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2016年8月11日 上午10:36:48   user     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		user 
 * @version		1.0  
 * @since		JDK1.7
 */
public class HotelMappingRequest {

	@SerializedName(value = "HotelIds", alternate = "hotelIds")
	private List<String> hotelIds;

	@SerializedName(value = "OtaType", alternate = "otaType")
	private String otaType;

	/**   
	 * 得到elongHotelIds的值   
	 *   
	 * @return hotelIds的值
	 */
	public List<String> getHotelIds() {
		return hotelIds;
	}

	/**
	 * 设置hotelIds的值
	 *   
	 * @param hotelIds 被设置的值
	 */
	public void setHotelIds(List<String> hotelIds) {
		this.hotelIds = hotelIds;
	}

	/**   
	 * 得到otaType的值   
	 *   
	 * @return otaType的值
	 */
	public String getOtaType() {
		if (StringUtils.isEmpty(otaType)) {
			otaType = "ctrip";
		}
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

}
