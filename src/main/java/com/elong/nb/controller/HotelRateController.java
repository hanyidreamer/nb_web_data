package com.elong.nb.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.elong.nb.common.gson.GsonUtil;
import com.elong.nb.common.model.ErrorCode;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.common.util.CommonsUtil;
import com.elong.nb.common.util.ValidateUtil;
import com.elong.nb.model.bean.enums.EnumPaymentType;
import com.elong.nb.model.rate.RateCondition;
import com.elong.nb.model.rate.RateResult;
import com.elong.nb.service.IBookingDataService;
import com.elong.nb.service.IRackRateService;
import com.elong.nb.service.IRatePlansService;
import com.elong.nb.service.IRateService;
import com.elong.nb.service.IInventoryService;
import com.elong.nb.service.IValidateInventoryService;
import com.google.gson.TypeAdapter;

@Controller
public class HotelRateController {
	@Resource
	private IRateService rateService;
	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/api/Hotel/GetRates", method = RequestMethod.POST)
	public ResponseEntity<byte[]> getRates(HttpServletRequest request)
			throws IOException {
		Map<Class, TypeAdapter> m = new HashMap<Class, TypeAdapter>();
		RestRequest<RateCondition> restRequest = GsonUtil.toReq(request,
				RateCondition.class, m);
		String rst = validateRateRequest(restRequest);
		if (StringUtils.isNotBlank(rst)) {
			RestResponse<RateResult> response = new RestResponse<RateResult>(
					restRequest.getGuid());
			response.setCode(rst);
			response.setResult(null);
			return new ResponseEntity(GsonUtil.toJson(
					response,
					restRequest.getVersion() == null ? 0d : restRequest
							.getVersion()).getBytes(), HttpStatus.OK);
		}
		RestResponse<RateResult> response = null;
		try {
			response = rateService.getRates(restRequest);
		} catch (Exception e) {
			response = new RestResponse<RateResult>(restRequest.getGuid());
			response.setCode(ErrorCode.Common_UnkownException + e.getMessage());
		}
		return new ResponseEntity(GsonUtil.toJson(response,
				restRequest.getVersion()).getBytes(), HttpStatus.OK);

	}

	private String validateRateRequest(RestRequest<RateCondition> restRequest) {
		;
		StringBuffer sb = new StringBuffer(
				ValidateUtil.validateRestRequest(restRequest));
		RateCondition req = restRequest.getRequest();
		if(StringUtils.isNoneBlank(restRequest.getRequest().getHotelIds())&&restRequest.getRequest().getHotelIds().split(",").length>10){
			sb.append(ErrorCode.Common_NumberIdsFormatErrorAndLessThanTen);
			return sb.toString();
		}
		if(restRequest.getRequest().getStartDate()==null){
			sb.append(ErrorCode.Common_StartDateRequired);
			return sb.toString();
		}
		if(restRequest.getRequest().getEndDate()==null){
			sb.append( ErrorCode.Common_EndDateRequired);
			return sb.toString();
		}
		if(restRequest.getRequest().getStartDate().getTime()>restRequest.getRequest().getEndDate().getTime()){
			sb.append(ErrorCode.Common_StartDateLessThanEndDate);
			return sb.toString();
		}
		if(restRequest.getRequest().getPaymentType()==null){
			sb.append(ErrorCode.Common_PaymentTypeRequired);
			return sb.toString();
		}
		/**
		 * 如果没有预付权限还查询，则返回错误信息
		 */
		if (req.getPaymentType() == EnumPaymentType.Prepay
				&& (!restRequest.getProxyInfo().getEnabledPrepayProducts())) {
			if (req.getPaymentType() == EnumPaymentType.Prepay) {
				sb.append(ErrorCode.Data_NoPrepayProducts);
				return sb.toString();
			}
		}
		return sb.toString();
	}
}