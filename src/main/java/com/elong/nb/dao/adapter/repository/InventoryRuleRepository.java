package com.elong.nb.dao.adapter.repository;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.elong.nb.common.util.CommonsUtil;
import com.elong.nb.data.biglog.BigLog;
import com.elong.nb.model.HotelCodeRuleRealRequest;
import com.elong.nb.model.HotelCodeRuleRealResponse;
import com.elong.nb.model.InventoryBlackListRuleRealRequest;
import com.elong.nb.model.InventoryBlackListRuleRealResponse;
import com.elong.nb.model.InventoryRuleHitCheckRealRequest;
import com.elong.nb.model.InventoryRuleHitCheckRealResponse;
import com.elong.nb.model.RequestBase;
import com.elong.nb.model.ResponseBase;
import com.elong.nb.model.RuleInventoryRequest;
import com.elong.nb.model.RuleInventoryResponse;
import com.elong.nb.util.HttpUtil;

@Repository
public class InventoryRuleRepository {
	private static final String RULEURL=CommonsUtil.CONFIG_PROVIDAR.getProperty("rule.url");
	private static Logger logger = LogManager.getLogger("biglog");
	private String getServerUrl(String query){
		  String url = RULEURL;
	        if (StringUtils.isBlank(url)){
	        		throw new RuntimeException("Inner Error:分销规则URL为空，请检查配置");
	        }
	        return url + query;
	}
	public List<RuleInventoryResponse> convertInventoryWithRule(List<RuleInventoryRequest> ruleInventorys, int orderFrom,boolean isNeedInstantConfirm) throws Exception{
		RequestBase<InventoryBlackListRuleRealRequest> request=new RequestBase<InventoryBlackListRuleRealRequest>();
		InventoryBlackListRuleRealRequest realRequest=new InventoryBlackListRuleRealRequest();
		realRequest.setInventorys(ruleInventorys);
		realRequest.setNeedInstantConfirm(isNeedInstantConfirm);
		realRequest.setNightlyRate(false);
		realRequest.setOrderFrom(orderFrom);
		request.setFrom("NB_Data");
		request.setRealRequest(realRequest);
		request.setLogId(UUID.randomUUID().toString());
		String content=JSON.toJSONString(request);
		String url=getServerUrl("/api/Hotel/GetChangedInventory");
		BigLog log = new BigLog();
        log.setAppName("data_http");
        log.setServiceName("api.Hotel.GetChangedInventory");
		log.setTraceId(UUID.randomUUID().toString());
		log.setSpan("1.1");
		long start = System.currentTimeMillis();
		try{
			String str=HttpUtil.httpPost(url, content,"application/x-www-form-urlencoded");
			log.setElapsedTime(String.valueOf(System.currentTimeMillis()-start));
			ResponseBase<InventoryBlackListRuleRealResponse> response=JSON.parseObject(str, new TypeReference<ResponseBase<InventoryBlackListRuleRealResponse>>(){});
			if("0".equals(response.getResponseCode())){
				logger.info(log.toString());
				return response.getRealResponse().getInventorys();
			}
		}catch(Exception e){
			log.setElapsedTime(String.valueOf(System.currentTimeMillis()-start));
			log.setException(e);
			log.setExceptionMsg(e.getMessage());
			log.setResponseCode("1");
			logger.info(log.toString());
		}
		logger.info(log.toString());
		return null;
	}
	public InventoryRuleHitCheckRealResponse getCheckInfo(Map<String,List<String>> hotelMap, int orderFrom,boolean isNeedInstantConfirm) throws Exception{
		RequestBase<InventoryRuleHitCheckRealRequest> request=new RequestBase<InventoryRuleHitCheckRealRequest>();
		InventoryRuleHitCheckRealRequest realRequest=new InventoryRuleHitCheckRealRequest();
		realRequest.setHotelMap(hotelMap);
		realRequest.setNeedInstantConfirm(isNeedInstantConfirm);
		realRequest.setOrderFrom(orderFrom);
		request.setFrom("NB_Data");
		request.setRealRequest(realRequest);
		request.setLogId(UUID.randomUUID().toString());
		String content=JSON.toJSONString(request);
		String url=getServerUrl("/api/Hotel/CheckInvRuleHit");
		BigLog log = new BigLog();
        log.setAppName("data_http");
        log.setServiceName("api.Hotel.CheckInvRuleHit");
		log.setTraceId(UUID.randomUUID().toString());
		log.setSpan("1.1");
		long start = System.currentTimeMillis();
		try{
			String str=HttpUtil.httpPost(url, content,"application/x-www-form-urlencoded");
			log.setElapsedTime(String.valueOf(System.currentTimeMillis()-start));
			ResponseBase<InventoryRuleHitCheckRealResponse> response=JSON.parseObject(str,new TypeReference<ResponseBase<InventoryRuleHitCheckRealResponse>>(){});
			if("0".equals(response.getResponseCode())){
				logger.info(log.toString());
				return response.getRealResponse();
			}
		}catch(Exception e){
			log.setElapsedTime(String.valueOf(System.currentTimeMillis()-start));
			log.setException(e);
			log.setExceptionMsg(e.getMessage());
			log.setResponseCode("1");
			logger.info(log.toString());
		}
		return null;
	}
	public HotelCodeRuleRealResponse getCodeRuleInfo(Map<String, String> hotelCodeRule, int orderFrom, List<String> hotelCodes, int paymentType){
		RequestBase<HotelCodeRuleRealRequest> request=new RequestBase<HotelCodeRuleRealRequest>();
		HotelCodeRuleRealRequest realRequest=new HotelCodeRuleRealRequest();
		realRequest.setHotelCodeRule(hotelCodeRule);
		realRequest.setOrderFrom(orderFrom);
		realRequest.setHotelCodes(hotelCodes);
		realRequest.setPaymentType(paymentType);
		request.setFrom("NB_Data");
		request.setRealRequest(realRequest);
		request.setLogId(UUID.randomUUID().toString());
		String content=JSON.toJSONString(request);
		String url=getServerUrl("/api/Hotel/GetHitHotelCode");
		BigLog log = new BigLog();
        log.setAppName("data_http");
        log.setServiceName("api.Hotel.GetHitHotelCode");
		log.setTraceId(UUID.randomUUID().toString());
		log.setSpan("1.1");
		long start = System.currentTimeMillis();
		try{
			String str=HttpUtil.httpPost(url, content,"application/x-www-form-urlencoded");
			log.setElapsedTime(String.valueOf(System.currentTimeMillis()-start));
			ResponseBase<HotelCodeRuleRealResponse> response=JSON.parseObject(str,new TypeReference<ResponseBase<HotelCodeRuleRealResponse>>(){});
			if("0".equals(response.getResponseCode())){
				logger.info(log.toString());
				return response.getRealResponse();
			}
		}catch(Exception e){
			log.setElapsedTime(String.valueOf(System.currentTimeMillis()-start));
			log.setException(e);
			log.setExceptionMsg(e.getMessage());
			log.setResponseCode("1");
			logger.info(log.toString());
		}
		return null;
	}
}
