/**   
 * @(#)IConvertService.java	2016年8月9日	下午1:43:18	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.service;

import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.model.HotelMappingRequest;
import com.elong.nb.model.HotelMappingResponse;

/**
 * 数据格式转换接口
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2016年8月9日 下午1:43:18   user     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		user 
 * @version		1.0  
 * @since		JDK1.7
 */
public interface IConvertService {

	/** 
	 * 对外请求数据转换为内部接口参数格式
	 *
	 * @param restRequest
	 * @return
	 */
	public String convertRequest(RestRequest<HotelMappingRequest> restRequest);

	/** 
	 * 内部接口返回结果转换为对外结果格式
	 *
	 * @param restRequest
	 * @param result
	 * @return
	 */
	public RestResponse<HotelMappingResponse> convertReponse(RestRequest<HotelMappingRequest> restRequest, String result);

}
