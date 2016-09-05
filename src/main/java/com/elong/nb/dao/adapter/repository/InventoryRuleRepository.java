package com.elong.nb.dao.adapter.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.elong.nb.common.model.ProxyAccount;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.model.InventoryBlackListRuleRealRequest;
import com.elong.nb.model.InventoryBlackListRuleRealResponse;
import com.elong.nb.model.InventoryRuleSoaRequst;
import com.elong.nb.model.InventoryRuleSoaResponse;
import com.elong.nb.model.RuleInventory;
import com.elong.nb.model.bean.Inventory;
import com.elong.nb.util.HttpUtil;
import com.google.gson.Gson;

@Repository
public class InventoryRuleRepository {
	public void convertInventoryWithRule(List<RuleInventory> ruleInventorys, int orderFrom,boolean isNeedInstantConfirm) throws Exception{
		InventoryRuleSoaRequst request=new InventoryRuleSoaRequst();
		InventoryBlackListRuleRealRequest realRequest=new InventoryBlackListRuleRealRequest();
		realRequest.setInventorys(ruleInventorys);
		realRequest.setNeedInstantConfirm(isNeedInstantConfirm);
		realRequest.setNightlyRate(false);
		realRequest.setOrderFrom(orderFrom);
		request.setFrom("NB_Data");
		request.setRealRequest(realRequest);
		Gson gson=new Gson();
		String content=gson.toJson(request);
		String url="http://localhost:8080/nb_web_rule/api/Hotel/GetChangedInventory";
		String str=HttpUtil.httpPost(url, content);
		InventoryRuleSoaResponse response=gson.fromJson(str, InventoryRuleSoaResponse.class);
		if(response.getResponseCode()=="0"){
			response.getRealResponse().getInventorys();
		}else{
			throw new Exception("Inner Exception" + response.getExceptionMsg());
		}
		//inventorys=response.getInventorys();
	}
}
