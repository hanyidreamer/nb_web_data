/**   
 * @(#)IHotelMappingService.java	2016年8月9日	上午11:34:08	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.service;

import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.model.HotelMappingRequest;
import com.elong.nb.model.HotelMappingResponse;

/**
 * 同步数据接口
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2016年8月9日 上午11:34:08   user     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		user 
 * @version		1.0  
 * @since		JDK1.7
 */
public interface IHotelMappingService {

	/** 
	 * 检查请求参数
	 *
	 * @param restRequest
	 * @return
	 */
	public RestResponse<HotelMappingResponse> checkMessage(RestRequest<HotelMappingRequest> restRequest);

	/** 
	 * 获取返回数据
	 *
	 * @param otaType
	 * @param message
	 * @return
	 */
	public RestResponse<HotelMappingResponse> getMappingData(RestRequest<HotelMappingRequest> restRequest);

}
