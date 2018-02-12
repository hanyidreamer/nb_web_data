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
import com.elong.nb.model.inventory.InventoryCondition;
import com.elong.nb.model.inventory.InventoryResult;
import com.elong.nb.service.IInventoryService;
import com.elong.nb.service.LogCollectService;

@Controller
public class HotelInvetoryController {

	@Resource
	private IInventoryService inventoryService;

	@Resource
	private LogCollectService logCollectService;

	@RequestMapping(value = "/api/Hotel/GetInventories", method = RequestMethod.POST)
	public ResponseEntity<byte[]> getInventories(HttpServletRequest request) throws Exception {
		String userName = request.getHeader("userName");
		ProxyAccount proxyAccount = UserServiceAgent.findProxyByUsername(userName);
		RestRequest<InventoryCondition> restRequest = null;
		try {
			restRequest = GsonUtil.toReq(request, InventoryCondition.class, null);
		} catch (Exception e) {
			RestResponse<InventoryResult> response = new RestResponse<InventoryResult>(request.getHeader("guid"));
			response.setCode(ErrorCode.Common_ParamInvalid);
			return new ResponseEntity<byte[]>(GsonUtil.toJson(response, 0d).getBytes(), HttpStatus.OK);
		}
		String rst = validateInventoryRequest(restRequest, proxyAccount);
		if (StringUtils.isNotBlank(rst)) {
			RestResponse<InventoryResult> response = new RestResponse<InventoryResult>(restRequest.getGuid());
			response.setCode(rst);
			response.setResult(null);
			return new ResponseEntity<byte[]>(GsonUtil.toJson(response, restRequest.getVersion() == null ? 0d : restRequest.getVersion())
					.getBytes(), HttpStatus.OK);
		}
		RestResponse<InventoryResult> response = this.inventoryService.getInventories(restRequest, proxyAccount);
		// 记业务监控日志
		logCollectService.writeInventoryLog(proxyAccount, response);
		return new ResponseEntity<byte[]>(GsonUtil.toJson(response, restRequest.getVersion()).getBytes(), HttpStatus.OK);

	}

	/**
	 * 校验库存入参合法性
	 * @param restRequest
	 * @return
	 */
	private String validateInventoryRequest(RestRequest<InventoryCondition> restRequest, ProxyAccount proxyAccount) {
		StringBuffer sb = new StringBuffer(ValidateUtil.validateRestRequest(restRequest, proxyAccount));
		if (StringUtils.isBlank(restRequest.getRequest().getHotelIds()) || restRequest.getRequest().getHotelIds().split(",").length > 10) {
			sb.append(ErrorCode.Common_NumberIdsFormatErrorAndLessThanTen);
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
		if (!StringUtils.isBlank(restRequest.getRequest().getHotelCodes())) {
			if (restRequest.getRequest().getHotelIds().contains(",")) {
				sb.append(ErrorCode.Common_HotelIdRequiredOnlyOne);
				return sb.toString();
			} else if (restRequest.getRequest().getHotelCodes().split(",").length > 10) {
				sb.append(ErrorCode.Common_NumberCodesFormatErrorAndLessThanTen);
				return sb.toString();
			}
		}
		return sb.toString();
	}

}
