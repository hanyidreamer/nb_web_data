package com.elong.nb.service.impl;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.elong.nb.common.model.ErrorCode;
import com.elong.nb.common.model.NbapiHttpRequest;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.common.util.HttpClientUtil;
import com.elong.nb.common.util.ValidateUtil;
import com.elong.nb.model.HotelMappingRequest;
import com.elong.nb.model.HotelMappingResponse;
import com.elong.nb.service.IConvertService;
import com.elong.nb.service.IHotelMappingService;
import com.elong.springmvc_enhance.utilities.PropertiesHelper;

/**   
 * @(#)HotelMappingServiceImpl.java	2016年8月9日	下午1:21:22	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */

/**
 * 同步数据接口实现
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2016年8月9日 下午1:21:22   user     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		user 
 * @version		1.0  
 * @since		JDK1.7
 */
@Service
public class HotelMappingServiceImpl implements IHotelMappingService {

	private static final Logger logger = Logger.getLogger("hotelMappingLogger");

	@Resource(type = IConvertService.class)
	private IConvertService convertService;

	/** 
	 * 检查请求参数
	 *
	 * @param restRequest
	 * @return 
	 *
	 * @see com.elong.nb.hotelmapping.service.IHotelMappingService#checkMessage(com.elong.nb.common.model.RestRequest)    
	 */
	@Override
	public RestResponse<HotelMappingResponse> checkMessage(RestRequest<HotelMappingRequest> restRequest) {
		RestResponse<HotelMappingResponse> restResponse = new RestResponse<HotelMappingResponse>(restRequest.getGuid());
		String rst = ValidateUtil.validateRestRequest(restRequest);
		if (StringUtils.isNotEmpty(rst)) {
			restResponse.setCode(rst);
			return restResponse;
		}
		HotelMappingRequest hotelMappingRequest = restRequest.getRequest();
		if (hotelMappingRequest == null) {
			restResponse.setCode(ErrorCode.Common_DataRequired);
			return restResponse;
		}
		if (hotelMappingRequest.getHotelIds() == null || hotelMappingRequest.getHotelIds().size() == 0) {
			restResponse.setCode(ErrorCode.Other_HotelIdRequired);
			return restResponse;
		}
		if (CollectionUtils.size(hotelMappingRequest.getHotelIds()) > 50) {
			restResponse.setCode(ErrorCode.Other_HotelIdTooMany);
			return restResponse;
		}
		restResponse.setCode("0");
		return restResponse;
	}

	/** 
	 * 获取返回数据
	 *
	 * @param otaType
	 * @param message
	 * @return 
	 *
	 * @see com.elong.nb.hotelmapping.service.IHotelMappingService#getMappingData(java.lang.String, java.lang.String)    
	 */
	@Override
	public RestResponse<HotelMappingResponse> getMappingData(RestRequest<HotelMappingRequest> restRequest) {
		String requestData = convertService.convertRequest(restRequest);
		String requestUrl = PropertiesHelper.getEnvProperties("hotelmapping.mapping.url", "config").toString();
		logger.debug("httpPost,requestUrl = " + requestUrl);
		logger.debug("httpPost,requestData = " + requestData);
		Map<String, Object> paramsMap = new HashMap<String, Object>();
		paramsMap.put("requestJson", requestData);
		NbapiHttpRequest nbapiHttpRequest = new NbapiHttpRequest();
		nbapiHttpRequest.setUrl(requestUrl);
		nbapiHttpRequest.setParamsMap(paramsMap);
		String result = null;
		try {
			result = HttpClientUtil.httpFormPost(nbapiHttpRequest);
		} catch (Exception e) {
			logger.error("httpPost,error = " + e.getMessage(), e);
			RestResponse<HotelMappingResponse> syncResponse = new RestResponse<HotelMappingResponse>(restRequest.getGuid());
			syncResponse.setCode(MessageFormat.format(ErrorCode.Other_MappingDataException, e.getMessage()));
			return syncResponse;
		}
		logger.debug("httpPost,result = " + result);
		return convertService.convertReponse(restRequest, result);
	}
}
