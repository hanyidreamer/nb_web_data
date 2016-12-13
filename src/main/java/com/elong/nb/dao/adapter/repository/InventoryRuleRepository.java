package com.elong.nb.dao.adapter.repository;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSON;
import com.elong.nb.common.util.CommonsUtil;
import com.elong.nb.model.InventoryBlackListRuleRealRequest;
import com.elong.nb.model.InventoryRuleHitCheckRealRequest;
import com.elong.nb.model.InventoryRuleHitCheckRealResponse;
import com.elong.nb.model.InventoryRuleHitCheckSoaRequest;
import com.elong.nb.model.InventoryRuleHitCheckSoaResponse;
import com.elong.nb.model.InventoryRuleSoaRequst;
import com.elong.nb.model.InventoryRuleSoaResponse;
import com.elong.nb.model.RuleInventoryRequest;
import com.elong.nb.model.RuleInventoryResponse;
import com.elong.nb.util.HttpUtil;
import com.google.gson.Gson;

@Repository
public class InventoryRuleRepository {
	private String getServerUrl(String query){
		  String url = CommonsUtil.CONFIG_PROVIDAR.getProperty("rule.url");
	        if (StringUtils.isBlank(url)){
	        		throw new RuntimeException("Inner Error:分销规则URL为空，请检查配置");
	        }
	        return url + query;
	}
	public List<RuleInventoryResponse> convertInventoryWithRule(List<RuleInventoryRequest> ruleInventorys, int orderFrom,boolean isNeedInstantConfirm) throws Exception{
		InventoryRuleSoaRequst request=new InventoryRuleSoaRequst();
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
		String str=HttpUtil.httpPost(url, content,"application/x-www-form-urlencoded");
		InventoryRuleSoaResponse response=JSON.parseObject(str, InventoryRuleSoaResponse.class);
		if("0".equals(response.getResponseCode())){
			return response.getRealResponse().getInventorys();
		}else{
			throw new RuntimeException("Inner Exception" + response.getExceptionMsg());
		}
	}
	public InventoryRuleHitCheckRealResponse getCheckInfo(Map<String,List<String>> hotelMap, int orderFrom,boolean isNeedInstantConfirm) throws Exception{
		InventoryRuleHitCheckSoaRequest request=new InventoryRuleHitCheckSoaRequest();
		InventoryRuleHitCheckRealRequest realRequest=new InventoryRuleHitCheckRealRequest();
		realRequest.setHotelMap(hotelMap);
		realRequest.setNeedInstantConfirm(isNeedInstantConfirm);
		realRequest.setOrderFrom(orderFrom);
		request.setFrom("NB_Data");
		request.setRealRequest(realRequest);
		request.setLogId(UUID.randomUUID().toString());
		Gson gson=new Gson();
		String content=JSON.toJSONString(request);
		String url=getServerUrl("/api/Hotel/CheckInvRuleHit");
		try{
			String str=HttpUtil.httpPost(url, content,"application/x-www-form-urlencoded");
			InventoryRuleHitCheckSoaResponse response=gson.fromJson(str, InventoryRuleHitCheckSoaResponse.class);
			if("0".equals(response.getResponseCode())){
				return response.getRealResponse();
			}
		}catch(Exception ex){
		}
		return new InventoryRuleHitCheckRealResponse();
	}
}
