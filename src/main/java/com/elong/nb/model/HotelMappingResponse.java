/**   
 * @(#)HotelMappingResponse.java	2016年8月9日	下午3:32:23	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * hotel-mapping返回
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
public class HotelMappingResponse {

	@SerializedName(value = "HotelRelationList", alternate = "hotelRelationList")
	private List<HotelRelationApi> hotelRelationList;

	/**   
	 * 得到hotelRelationList的值   
	 *   
	 * @return hotelRelationList的值
	 */
	public List<HotelRelationApi> getHotelRelationList() {
		return hotelRelationList;
	}

	/**
	 * 设置hotelRelationList的值
	 *   
	 * @param hotelRelationList 被设置的值
	 */
	public void setHotelRelationList(List<HotelRelationApi> hotelRelationList) {
		this.hotelRelationList = hotelRelationList;
	}

}
