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

import com.elong.nb.UserServiceAgent;
import com.elong.nb.common.gson.GsonUtil;
import com.elong.nb.common.model.ErrorCode;
import com.elong.nb.common.model.ProxyAccount;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.common.util.ValidateUtil;
import com.elong.nb.model.rateplan.RatePlanCondition;
import com.elong.nb.model.rateplan.RatePlanResult;
import com.elong.nb.service.IRatePlansService;
import com.google.gson.TypeAdapter;

@Controller
public class HotelDataController {
	@Resource
	private IRatePlansService ratePlansService;

	// 获取产品
	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/api/Hotel/GetRatePlans", method = RequestMethod.POST)
	public ResponseEntity<byte[]> getRatePlans(HttpServletRequest request) throws IOException {
		String userName = request.getHeader("userName");
		ProxyAccount proxyAccount = UserServiceAgent.findProxyByUsername(userName);
		// 基本校验
		Map<Class, TypeAdapter> m = new HashMap<Class, TypeAdapter>();
		RestRequest<RatePlanCondition> restRequest = null;
		try {
			restRequest = GsonUtil.toReq(request, RatePlanCondition.class, m);
		} catch (Exception e) {
			RestResponse<RatePlanResult> response = new RestResponse<RatePlanResult>(request.getHeader("guid"));
			response.setCode(ErrorCode.Common_ParamInvalid);
			return new ResponseEntity<byte[]>(GsonUtil.toJson(response, 0d).getBytes(), HttpStatus.OK);
		}
		String rst = validateRatePlanRequest(restRequest, proxyAccount);
		if (StringUtils.isNotBlank(rst)) {
			RestResponse<RatePlanResult> response = new RestResponse<RatePlanResult>(restRequest.getGuid());
			response.setCode(rst);
			return new ResponseEntity<byte[]>(GsonUtil.toJson(response, restRequest.getVersion() == null ? 0d : restRequest.getVersion())
					.getBytes(), HttpStatus.OK);
		}

		// 调用Service
		RestResponse<RatePlanResult> response = ratePlansService.GetRatePlans(restRequest, proxyAccount);
		// 反回JSON
		return new ResponseEntity<byte[]>(GsonUtil.toJson(response, restRequest.getVersion()).getBytes(), HttpStatus.OK);

	}

	private String validateRatePlanRequest(RestRequest<RatePlanCondition> restRequest, ProxyAccount proxyAccount) {
		StringBuffer sb = new StringBuffer(ValidateUtil.validateRestRequest(restRequest, proxyAccount));
		RatePlanCondition req = restRequest.getRequest();
		if (StringUtils.isBlank(req.getHotelIds())) {
			sb.append(ErrorCode.Common_HotelIdRequired);
			return sb.toString();
		}
		if (req.getHotelIds().split(",").length > 10) {
			sb.append(ErrorCode.Common_NumberIdsFormatErrorAndLessThanTen);
			return sb.toString();
		}
		return sb.toString();
	}

}
