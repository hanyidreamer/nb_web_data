package com.elong.nb.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.elong.nb.common.gson.GsonUtil;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.common.util.CommonsUtil;
import com.elong.nb.common.util.ValidateUtil;
import com.elong.nb.model.bean.enums.EnumPaymentType;
import com.elong.nb.model.rate.RateCondition;
import com.elong.nb.model.rate.RateResult;
import com.elong.nb.service.IRateService;
import com.google.gson.TypeAdapter;

@Controller
public class HotelDataController {
	
	private String hasNoPrepayAuth = CommonsUtil.CONFIG_PROVIDAR
			.getProperty("HasNoPrepayAuth.restRequest.Request");

	@Resource
	private IRateService RateService;
	@RequestMapping(value = "/api/Hotel/GetInventories", method = RequestMethod.POST)
	public ResponseEntity<byte[]> getInventories(HttpServletRequest request)
	{
		//RestResponse<InventoryResult> response = new RestResponse<InventoryResult>(
		//		"");
//		Object restRequest;
//		GetInventoryChangeDetailRequest obj=new GetInventoryChangeDetailRequest();
//		obj.setHotelID("50101624");
//		obj.setBeginTime(new DateTime(2016,8,18,0,0));
//		obj.setEndTime(new DateTime(2016,8,20,0,0));
//		GetInventoryChangeDetailResponse oi=ProductForPartnerServiceContract.getInventoryChangeDetail(obj);
		return new ResponseEntity(GsonUtil.toJson(null,
				0).getBytes(), HttpStatus.OK);
		
	}
	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/api/Hotel/GetRates", method = RequestMethod.POST)
	public ResponseEntity<byte[]> getRates(HttpServletRequest request) throws IOException
	{
		Map<Class, TypeAdapter> m = new HashMap<Class, TypeAdapter>();
		RestRequest<RateCondition> restRequest = GsonUtil.toReq(request,
				RateCondition.class, m);
		String rst = validateRateRequest(restRequest);
		if (StringUtils.isNotBlank(rst)) {
			RestResponse<RateResult> response = new RestResponse<RateResult>(
					restRequest.getGuid());
			response.setCode(rst);
			return new ResponseEntity(GsonUtil.toJson(response,
					restRequest.getVersion() == null ? 0d : restRequest.getVersion()).getBytes(), HttpStatus.OK);
		}
		RestResponse<RateResult> response=null;
		try {
			response = RateService.getRates(restRequest);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity(GsonUtil.toJson(
				response,
				restRequest.getVersion()).getBytes(), HttpStatus.OK);
		
		
	}
	
	private String validateRateRequest(RestRequest<RateCondition> restRequest){
		;
		StringBuffer sb = new StringBuffer(
				ValidateUtil.validateRestRequest(restRequest));
		RateCondition req = restRequest.getRequest();
		/**
		 * 如果没有预付权限还查询，则返回错误信息
		 */
		if (req.getPaymentType() == EnumPaymentType.Prepay
				&& (!restRequest.getProxyInfo().getEnabledPrepayProducts())) {
			if (req.getPaymentType() == EnumPaymentType.Prepay) {
				sb.append(hasNoPrepayAuth);
				return sb.toString();
			} 
		}
		return sb.toString();
	}
}
