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
import com.elong.nb.model.common.DataRestResponseCommon;
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
	private final static String RPURL=getServerUrl("/rest/com/elong/hotel/product/entity/req/forpartner/nbapi/SearchHotelRatePlanListReq");
	private static String getServerUrl(String query){
		    String serverURL=CommonsUtil.CONFIG_PROVIDAR.getProperty("rp.url");
	        if (StringUtils.isBlank(serverURL)){
	        		throw new RuntimeException("Inner Error:RP URL为空，请联系管理员检查配置");
	        }
	        return serverURL + query;
	}
	public SearchHotelRatePlanListResp getRatePlan(SearchHotelRatePlanListReq req,String guid){
		RequestBase<SearchHotelRatePlanListReq> request=new RequestBase<SearchHotelRatePlanListReq>();
		request.setRealRequest(req);
		request.setLogId(UUID.randomUUID().toString());
		String json=JSON.toJSONString(request);
		DataRestResponseCommon<SearchHotelRatePlanListResp> response = HttpUtil.getDataRestResponse(RPURL, "requestJson="+json,"application/x-www-form-urlencoded",new DataRestResponseCommon<SearchHotelRatePlanListResp>(),new TypeReference<DataRestResponseCommon<SearchHotelRatePlanListResp>>(){});
		return response.getRealResponse();
	}
}
