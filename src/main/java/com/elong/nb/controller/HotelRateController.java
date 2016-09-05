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

	private String hasNoPrepayAuth = CommonsUtil.CONFIG_PROVIDAR
			.getProperty("HasNoPrepayAuth.restRequest.Request");
	private String unKownException = CommonsUtil.CONFIG_PROVIDAR
			.getProperty("UnKownException.restRequest.Request");
	private String idsLessTen = CommonsUtil.CONFIG_PROVIDAR
			.getProperty("NumberIdsFormatErrorAndLessThanTen.restRequest.Request");

	@Resource
	private IRateService RateService;
	@Resource
	private IRatePlansService ratePlansService;
	@Resource
	private IBookingDataService bookingDataService;
	@Resource
	private IRackRateService rackRateService;
	@Resource
	private IInventoryService InventoryService;
	@Resource
	private IValidateInventoryService ValidateInventoryService;

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
			return new ResponseEntity(GsonUtil.toJson(
					response,
					restRequest.getVersion() == null ? 0d : restRequest
							.getVersion()).getBytes(), HttpStatus.OK);
		}
		RestResponse<RateResult> response = null;
		try {
			response = RateService.getRates(restRequest);
		} catch (Exception e) {
			response = new RestResponse<RateResult>(restRequest.getGuid());
			response.setCode(unKownException + e.getMessage());
		}
		return new ResponseEntity(GsonUtil.toJson(response,
				restRequest.getVersion()).getBytes(), HttpStatus.OK);

	}

	private String validateRateRequest(RestRequest<RateCondition> restRequest) {
		;
		StringBuffer sb = new StringBuffer(
				ValidateUtil.validateRestRequest(restRequest));
		RateCondition req = restRequest.getRequest();
		if(restRequest.getRequest().getHotelIds()!="10"){
			sb.append(ErrorCode.Common_IdsMustLestThanTen);
			return sb.toString();
			 //String pattern = String.format("^(\d+,){0,%s}\d+,?$",);
	           // return Regex.IsMatch(input, pattern) ? ValidationResult.Success : new ValidationResult(ErrorMessage ?? "字符串格式错误且个数不能大于" + Number);
		}
		if(restRequest.getRequest().getStartDate()==null){
			sb.append(ErrorCode.Common_StartDateRequired);
			return sb.toString();
		}
		if(restRequest.getRequest().getEndDate()==null){
			sb.append( ErrorCode.Common_EndDateRequired);
			return sb.toString();
		}
		if(restRequest.getRequest().getStartDate().after(restRequest.getRequest().getEndDate())){
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
				sb.append(hasNoPrepayAuth);
				return sb.toString();
			}
		}
		return sb.toString();
	}
}