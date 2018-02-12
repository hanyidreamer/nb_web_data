/**   
 * @(#)HotelMappingController.java	2016年8月9日	上午11:21:32	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.controller;

import java.io.IOException;
import java.text.MessageFormat;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.elong.nb.UserServiceAgent;
import com.elong.nb.common.gson.GsonUtil;
import com.elong.nb.common.model.ErrorCode;
import com.elong.nb.common.model.ProxyAccount;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.model.HotelMappingRequest;
import com.elong.nb.model.HotelMappingResponse;
import com.elong.nb.service.IHotelMappingService;

/**
 * 同步数据Controller
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2016年8月9日 上午11:21:32   user     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		user 
 * @version		1.0  
 * @since		JDK1.7
 */
@Controller
public class HotelMappingController {

	private static final Logger logger = Logger.getLogger("hotelMappingLogger");

	@Resource(type = IHotelMappingService.class)
	private IHotelMappingService syncService;

	/** 
	 * 获取酒店mapping数据
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/api/Hotel/HotelMapping", method = RequestMethod.POST)
	public ResponseEntity<byte[]> hotelMapping(HttpServletRequest request) throws IOException {
		RestRequest<HotelMappingRequest> restRequest = GsonUtil.toReq(request, HotelMappingRequest.class, null);
		Double version = restRequest.getVersion() == null ? 0d : restRequest.getVersion();

		String userName = request.getHeader("userName");
		ProxyAccount proxyAccount = UserServiceAgent.findProxyByUsername(userName);
		try {
			// 检查参数
			RestResponse<HotelMappingResponse> restResponse = syncService.checkMessage(restRequest, proxyAccount);
			logger.debug("hotelMapping,checkMessage,restResponse = " + JSON.toJSONString(restResponse));
			if (!StringUtils.equals(restResponse.getCode(), "0")) {
				return new ResponseEntity<byte[]>(GsonUtil.toJson(restResponse, version).getBytes(), HttpStatus.OK);
			}
			// 获取数据
			restResponse = syncService.getMappingData(restRequest);
			logger.debug("hotelMapping,responseResult = " + JSON.toJSONString(restResponse));
			// 返回结果
			return new ResponseEntity<byte[]>(GsonUtil.toJson(restResponse, version).getBytes(), HttpStatus.OK);

		} catch (Exception e) {
			// 异常返回
			logger.error("hotelMapping,error = " + e.getMessage(), e);
			RestResponse<HotelMappingResponse> restResponse = new RestResponse<HotelMappingResponse>(restRequest.getGuid());
			restResponse.setCode(MessageFormat.format(ErrorCode.Other_MappingDataException, e.getMessage()));
			return new ResponseEntity<byte[]>(GsonUtil.toJson(restResponse, version).getBytes(), HttpStatus.OK);
		}
	}

}
