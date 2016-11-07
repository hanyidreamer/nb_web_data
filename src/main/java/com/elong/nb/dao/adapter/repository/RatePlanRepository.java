/**
 * 
 */
package com.elong.nb.dao.adapter.repository;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSON;
import com.elong.nb.common.util.CommonsUtil;
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
		String requestUrl = getServerUrl("/rest/com/elong/hotel/product/entity/req/autofreesale/hotelorder/GetInvLimitBlackList4NBReq");
		//SearchHotelRatePlanListReq realRequest=new SearchHotelRatePlanListReq();
		
		String json=JSON.toJSONString(req);
		String result = HttpUtil.httpPost(requestUrl, "requestJson="+json);
		SearchHotelRatePlanListResp response = JSON.parseObject(result, SearchHotelRatePlanListResp.class);
//		if(response!=null&&response.getRealResponse()!=null){
//			return response.getRealResponse().getInventoryLimitBlackList();
//		}else{
//			throw new RuntimeException("Inner Exception: "+response.getExceptionMsg());
//		}
		return response;
	}
}
