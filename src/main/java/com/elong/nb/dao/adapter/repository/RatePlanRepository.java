/**
 * 
 */
package com.elong.nb.dao.adapter.repository;

import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.elong.nb.common.biglog.BigLog;
import com.elong.nb.common.util.CommonsUtil;
import com.elong.nb.model.rateplan.fornb.HotelBookingRule;
import com.elong.nb.model.rateplan.fornb.RequestBase;
import com.elong.nb.model.rateplan.fornb.ResponseBase;
import com.elong.nb.model.rateplan.fornb.SearchHotelRatePlanListReq;
import com.elong.nb.model.rateplan.fornb.SearchHotelRatePlanListResp;
import com.elong.nb.util.HttpUtil;

/**
 * @author user
 *
 */
@Repository
public class RatePlanRepository {
	private static Logger logger = LogManager.getLogger("biglog");
	private static String url=CommonsUtil.CONFIG_PROVIDAR.getProperty("rp.url");
	private String getServerUrl(String query){
	        if (StringUtils.isBlank(url)){
	        		throw new RuntimeException("Inner Error:RP URL为空，请联系管理员检查配置");
	        }
	        return url + query;
	}
	public SearchHotelRatePlanListResp getRatePlan(SearchHotelRatePlanListReq req,String guid){
		String requestUrl = getServerUrl("/rest/com/elong/hotel/product/entity/req/forpartner/nbapi/SearchHotelRatePlanListReq");
		//SearchHotelRatePlanListReq realRequest=new SearchHotelRatePlanListReq();
		RequestBase<SearchHotelRatePlanListReq> request=new RequestBase<SearchHotelRatePlanListReq>();
		request.setRealRequest(req);
		request.setLogId(UUID.randomUUID().toString());
		String json=JSON.toJSONString(request);
		BigLog log = new BigLog();
		log.setUserLogType(guid);
		log.setAppName("data_http");
		log.setTraceId(UUID.randomUUID().toString());
		log.setSpan("1.1");
		log.setServiceName("SearchHotelRatePlanList");
		log.setRequestBody(json);
		long start = System.currentTimeMillis();
		String result = HttpUtil.httpPost(requestUrl, "requestJson="+json);
		log.setElapsedTime(String.valueOf(System.currentTimeMillis()-start));
		ResponseBase<SearchHotelRatePlanListResp> response = JSON.parseObject(result, new TypeReference<ResponseBase<SearchHotelRatePlanListResp>>(){});
		if(response!=null&&response.getRealResponse()!=null){
			log.setResponseCode("0");
			logger.info(log.toString());
			return response.getRealResponse();
		}else{
			log.setResponseCode("1");
			logger.info(log.toString());
			throw new RuntimeException("Inner Exception: "+response!=null?response.getExceptionMsg():"");
		}
	}
}
