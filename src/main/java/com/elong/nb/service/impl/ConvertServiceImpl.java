/**   
 * @(#)ConvertServiceImpl.java	2016年8月9日	下午1:56:29	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.service.impl;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.utils.DateUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.elong.nb.common.model.ErrorCode;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.model.HotelMappingRequest;
import com.elong.nb.model.HotelMappingResponse;
import com.elong.nb.model.HotelRelation;
import com.elong.nb.model.HotelRelationApi;
import com.elong.nb.model.RoomRelation;
import com.elong.nb.model.RoomRelationApi;
import com.elong.nb.service.IConvertService;

/**
 * 数据格式转换接口实现
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2016年8月9日 下午1:56:29   user     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		user 
 * @version		1.0  
 * @since		JDK1.7
 */
@Service
public class ConvertServiceImpl implements IConvertService {

	private static final Logger logger = Logger.getLogger("hotelMappingLogger");

	/** 
	 * 对外请求数据转换为内部接口参数格式
	 *
	 * @param restRequest
	 * @return 
	 *
	 * @see com.elong.nb.hotelmapping.service.IConvertService#convertRequest(com.elong.nb.common.model.RestRequest)    
	 */
	@Override
	public String convertRequest(RestRequest<HotelMappingRequest> restRequest) {
		HotelMappingRequest hotelMappingRequest = restRequest.getRequest();

		Map<String, Object> realRequestMap = new HashMap<String, Object>();
		realRequestMap.put("elongHotelIds", hotelMappingRequest.getHotelIds());
		realRequestMap.put("otaTypes", new String[] { hotelMappingRequest.getOtaType() });

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("from", "NBAPI");
		map.put("logId", restRequest.getGuid());

		map.put("realRequest", realRequestMap);

		String result = JSON.toJSONString(map);
		logger.debug("convertRequest successfully,result = " + result);
		return result;
	}

	/** 
	 * 内部接口返回结果转换为对外结果格式
	 *
	 * @param restRequest
	 * @param result
	 * @return 
	 *
	 * @see com.elong.nb.hotelmapping.service.IConvertService#convertReponse(com.elong.nb.common.model.RestRequest, java.lang.String)    
	 */
	@Override
	public RestResponse<HotelMappingResponse> convertReponse(RestRequest<HotelMappingRequest> restRequest, String result) {
		RestResponse<HotelMappingResponse> restResponse = new RestResponse<HotelMappingResponse>(restRequest.getGuid());
		if (StringUtils.isEmpty(result)) {
			restResponse.setCode(ErrorCode.Other_MappingDataRequired);
			return restResponse;
		}
		JSONObject jsonObject = null;
		try {
			jsonObject = JSON.parseObject(result);
		} catch (JSONException e) {
			restResponse.setCode(ErrorCode.Other_MappingDataParseError);
			return restResponse;
		}
		String responseCode = jsonObject.getString("responseCode");
		if (!StringUtils.equals(responseCode, "0")) {
			restResponse.setCode(MessageFormat.format(ErrorCode.Other_MappingDataException, jsonObject.getString("exceptionMsg")));
			return restResponse;
		}
		JSONObject realResponse = jsonObject.getJSONObject("realResponse");
		JSONObject otaRelationInfoMap = realResponse.getJSONObject("otaRelationInfoMap");
		if (otaRelationInfoMap.isEmpty()) {
			restResponse.setCode(ErrorCode.Other_MappingDataRequired);
			return restResponse;
		}

		List<HotelRelationApi> hotelRelationList = new ArrayList<HotelRelationApi>();
		String operateTime = DateUtils.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss");
		for (Map.Entry<String, Object> entry : otaRelationInfoMap.entrySet()) {
			String elongHotelId = entry.getKey();
			JSONObject otaData = (JSONObject) entry.getValue();
			JSONObject ctrip = otaData.getJSONObject(restRequest.getRequest().getOtaType());
			if (ctrip == null) {
				logger.debug("convertReponse,elongHotelId = " + elongHotelId + ",not exists.");
				continue;
			}
			try {
				HotelRelation hotelRelation = ctrip.getObject("hotelRelation", HotelRelation.class);
				HotelRelationApi hotelRelationApi = new HotelRelationApi();
				BeanUtils.copyProperties(hotelRelation, hotelRelationApi);
				hotelRelationApi.setOperateTime(operateTime);

				JSONArray roomRelationArray = ctrip.getJSONArray("roomRelationList");
				List<RoomRelationApi> roomRelationApiList = new ArrayList<RoomRelationApi>();
				if (roomRelationArray != null && roomRelationArray.size() > 0) {
					for (int idx = 0; idx < roomRelationArray.size(); idx++) {
						RoomRelation roomRelation = roomRelationArray.getObject(idx, RoomRelation.class);
						RoomRelationApi roomRelationApi = new RoomRelationApi();
						BeanUtils.copyProperties(roomRelation, roomRelationApi);
						roomRelationApiList.add(roomRelationApi);
					}
				}
				hotelRelationApi.setRoomRelationList(roomRelationApiList);
				hotelRelationList.add(hotelRelationApi);
				logger.debug("convertReponse,elongHotelId = " + elongHotelId + ",successfully.");
			} catch (Exception e) {
				logger.error("convertReponse,elongHotelId = " + elongHotelId + ",error = " + e.getMessage(), e);
			}
		}

		restResponse.setCode("0");
		HotelMappingResponse hotelMappingResponse = new HotelMappingResponse();
		hotelMappingResponse.setHotelRelationList(hotelRelationList);
		restResponse.setResult(hotelMappingResponse);
		logger.debug("convertReponse successfully,result = " + JSON.toJSONString(restResponse));
		return restResponse;
	}

}
