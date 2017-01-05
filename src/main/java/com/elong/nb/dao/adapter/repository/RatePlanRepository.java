/**
 * 
 */
package com.elong.nb.dao.adapter.repository;

import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.elong.nb.common.util.CommonsUtil;
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
//	private static Logger logger = LogManager.getLogger("biglog");
//	private static Logger errorLogger = LogManager.getLogger(RatePlanRepository.class);
	private final static String RPURL=getServerUrl("/rest/com/elong/hotel/product/entity/req/forpartner/nbapi/SearchHotelRatePlanListReq");
	private static String getServerUrl(String query){
		    String serverURL=CommonsUtil.CONFIG_PROVIDAR.getProperty("rp.url");
	        if (StringUtils.isBlank(serverURL)){
	        		throw new RuntimeException("Inner Error:RP URL为空，请联系管理员检查配置");
	        }
	        return serverURL + query;
	}
	public SearchHotelRatePlanListResp getRatePlan(SearchHotelRatePlanListReq req,String guid){
		String requestUrl =RPURL;
		RequestBase<SearchHotelRatePlanListReq> request=new RequestBase<SearchHotelRatePlanListReq>();
		request.setRealRequest(req);
		request.setLogId(UUID.randomUUID().toString());
		String json=JSON.toJSONString(request);
		try{
			String result = HttpUtil.httpPost(requestUrl, "requestJson="+json,"application/x-www-form-urlencoded");
			ResponseBase<SearchHotelRatePlanListResp> response = JSON.parseObject(result, new TypeReference<ResponseBase<SearchHotelRatePlanListResp>>(){});
//<<<<<<< HEAD
//			if(response!=null&&response.getRealResponse()!=null&&response.getResponseCode()==0){
//=======
			if(response!=null&&response.getRealResponse()!=null){
				if(response.getResponseCode()!=0){
//					errorLogger.info("requestJson="+json+" res"+result);
				}
//				log.setResponseCode(""+response.getResponseCode());
//				logger.info(log.toString());
				return response.getRealResponse();
			}else{
				throw new RuntimeException("Inner Exception: "+result);
			}
		}catch(Exception ex){
			throw new RuntimeException("SearchHotelRatePlanListReq",ex);
		}
	}
}
