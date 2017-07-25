package com.elong.nb.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.elong.nb.UserServiceAgent;
import com.elong.nb.common.gson.GsonUtil;
import com.elong.nb.common.model.ErrorCode;
import com.elong.nb.common.model.ProxyAccount;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.common.util.ValidateUtil;
import com.elong.nb.model.bean.enums.EnumPaymentType;
import com.elong.nb.model.rate.RateCondition;
import com.elong.nb.model.rate.RateResult;
import com.elong.nb.service.IRateService;

@Controller
public class HotelRateController {
	@Resource
	private IRateService rateService;

	@RequestMapping(value = "/api/Hotel/GetRates", method = RequestMethod.POST)
	public ResponseEntity<byte[]> getRates(HttpServletRequest request) throws Exception {
		String userName = request.getHeader("userName");
		ProxyAccount proxyAccount = UserServiceAgent.findProxyByUsername(userName);
		RestRequest<RateCondition> restRequest = null;
		try {
			restRequest = GsonUtil.toReq(request, RateCondition.class, null);
		} catch (Exception e) {
			RestResponse<RateResult> response = new RestResponse<RateResult>(request.getHeader("guid"));
			response.setCode(ErrorCode.Common_ParamInvalid);
			return new ResponseEntity<byte[]>(GsonUtil.toJson(response, 0d).getBytes(), HttpStatus.OK);
		}
		String rst = validateRateRequest(restRequest, proxyAccount);
		if (StringUtils.isNotBlank(rst)) {
			RestResponse<RateResult> response = new RestResponse<RateResult>(restRequest.getGuid());
			response.setCode(rst);
			response.setResult(null);
			return new ResponseEntity<byte[]>(GsonUtil.toJson(response, restRequest.getVersion() == null ? 0d : restRequest.getVersion())
					.getBytes(), HttpStatus.OK);
		}
		RestResponse<RateResult> response = null;
		response = rateService.getRates(restRequest, proxyAccount);
		return new ResponseEntity<byte[]>(GsonUtil.toJson(response, restRequest.getVersion()).getBytes(), HttpStatus.OK);

	}

	private String validateRateRequest(RestRequest<RateCondition> restRequest, ProxyAccount proxyAccount) {
		;
		StringBuffer sb = new StringBuffer(ValidateUtil.validateRestRequest(restRequest, proxyAccount));
		RateCondition req = restRequest.getRequest();
		if (StringUtils.isBlank(restRequest.getRequest().getHotelIds()) || restRequest.getRequest().getHotelIds().split(",").length > 10) {
			sb.append(ErrorCode.Common_NumberIdsFormatErrorAndLessThanTen);
			return sb.toString();
		}
		if (!StringUtils.isBlank(restRequest.getRequest().getHotelCodes())) {
			if (restRequest.getRequest().getHotelIds().contains(",")) {
				sb.append(ErrorCode.Common_HotelIdRequiredOnlyOne);
				return sb.toString();
			} else if (restRequest.getRequest().getHotelCodes().split(",").length > 10) {
				sb.append(ErrorCode.Common_NumberCodesFormatErrorAndLessThanTen);
				return sb.toString();
			}
		}
		if (restRequest.getRequest().getPaymentType() == null) {
			sb.append(ErrorCode.Common_PaymentTypeRequired);
			return sb.toString();
		}
		if (restRequest.getRequest().getStartDate() == null) {
			sb.append(ErrorCode.Common_StartDateRequired);
			return sb.toString();
		}
		if (restRequest.getRequest().getEndDate() == null) {
			sb.append(ErrorCode.Common_EndDateRequired);
			return sb.toString();
		}
		if (restRequest.getRequest().getStartDate().getTime() > restRequest.getRequest().getEndDate().getTime()) {
			sb.append(ErrorCode.Common_StartDateLessThanEndDate);
			return sb.toString();
		}
		// if(restRequest.getRequest().getPaymentType()==null){
		// sb.append(ErrorCode.Common_PaymentTypeRequired);
		// return sb.toString();
		// }
		/**
		 * 如果没有预付权限还查询，则返回错误信息
		 */
		if (req.getPaymentType() == EnumPaymentType.Prepay && (!proxyAccount.getEnabledPrepayProducts())) {
			if (req.getPaymentType() == EnumPaymentType.Prepay) {
				sb.append(ErrorCode.Data_NoPrepayProducts);
				return sb.toString();
			}
		}
		return sb.toString();
	}
}