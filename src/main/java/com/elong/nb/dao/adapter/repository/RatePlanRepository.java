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
	private String getServerUrl(String query){
		  String url = CommonsUtil.CONFIG_PROVIDAR.getProperty("rp.url");
	        if (StringUtils.isBlank(url)){
	        		throw new RuntimeException("Inner Error:RP URL为空，请检查配置");
	        }
	        return url + query;
	}
	public SearchHotelRatePlanListResp getRatePlan(SearchHotelRatePlanListReq req){
		String requestUrl = getServerUrl("/rest/com/elong/hotel/product/entity/req/forpartner/nbapi/SearchHotelRatePlanListReq");
		//SearchHotelRatePlanListReq realRequest=new SearchHotelRatePlanListReq();
		RequestBase<SearchHotelRatePlanListReq> request=new RequestBase<SearchHotelRatePlanListReq>();
		request.setRealRequest(req);
		request.setLogId(UUID.randomUUID().toString());
		String json=JSON.toJSONString(request);
		String result = HttpUtil.httpPost(requestUrl, "requestJson="+json);
		System.out.println(result);
		ResponseBase<SearchHotelRatePlanListResp> response = JSON.parseObject(result, new TypeReference<ResponseBase<SearchHotelRatePlanListResp>>(){});
		if(response!=null&&response.getRealResponse()!=null){
			return response.getRealResponse();
		}else{
			throw new RuntimeException("Inner Exception: "+response.getExceptionMsg());
		}
	}
}
