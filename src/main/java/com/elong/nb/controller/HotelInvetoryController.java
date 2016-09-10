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
import com.elong.nb.model.inventory.InventoryCondition;
import com.elong.nb.model.inventory.InventoryResult;
import com.elong.nb.model.inventory.ValidateInventoryCondition;
import com.elong.nb.model.inventory.ValidateInventoryResult;
import com.elong.nb.model.rate.RateCondition;
import com.elong.nb.service.IBookingDataService;
import com.elong.nb.service.IRackRateService;
import com.elong.nb.service.IRatePlansService;
import com.elong.nb.service.IRateService;
import com.elong.nb.service.IInventoryService;
import com.elong.nb.service.IValidateInventoryService;
import com.google.gson.TypeAdapter;

@Controller
public class HotelInvetoryController {

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

	@RequestMapping(value = "/api/Hotel/GetInventories", method = RequestMethod.POST)
	public ResponseEntity<byte[]> getInventories(HttpServletRequest request)
			throws Exception {
		Map<Class, TypeAdapter> m = new HashMap<Class, TypeAdapter>();
		RestRequest<InventoryCondition> restRequest = GsonUtil.toReq(request,
				InventoryCondition.class, m);
		String rst = validateInventoryRequest(restRequest);
		if (StringUtils.isNotBlank(rst)) {
			RestResponse<InventoryResult> response = new RestResponse<InventoryResult>(
					restRequest.getGuid());
			response.setCode(rst);
			return new ResponseEntity(GsonUtil.toJson(
					response,
					restRequest.getVersion() == null ? 0d : restRequest
							.getVersion()).getBytes(), HttpStatus.OK);
		}
		RestResponse<InventoryResult> response = InventoryService.getInventories(restRequest);
		return new ResponseEntity(GsonUtil.toJson(response,
				restRequest.getVersion()).getBytes(), HttpStatus.OK);

	}

	@RequestMapping(value = "/api/Hotel/ValidateInventory", method = RequestMethod.POST)
	public ResponseEntity<byte[]> validateInventory(HttpServletRequest request)
			throws Exception {
		Map<Class, TypeAdapter> m = new HashMap<Class, TypeAdapter>();
		RestRequest<ValidateInventoryCondition> restRequest = GsonUtil.toReq(
				request, ValidateInventoryCondition.class, m);
		String rst = validateValidateInventoryRequest(restRequest);// validateInventoryRequest(restRequest);
		if (StringUtils.isNotBlank(rst)) {
			RestResponse<InventoryResult> response = new RestResponse<InventoryResult>(
					restRequest.getGuid());
			response.setCode(rst);
			return new ResponseEntity(GsonUtil.toJson(
					response,
					restRequest.getVersion() == null ? 0d : restRequest
							.getVersion()).getBytes(), HttpStatus.OK);
		}
		RestResponse<ValidateInventoryResult> response = this.ValidateInventoryService
				.getValidateInventories(restRequest);
		return new ResponseEntity(GsonUtil.toJson(response,
				restRequest.getVersion()).getBytes(), HttpStatus.OK);

	}
	/**
	 * 校验库存入参合法性
	 * @param restRequest
	 * @return
	 */
	private String validateInventoryRequest(RestRequest<InventoryCondition> restRequest) {
		StringBuffer sb = new StringBuffer(ValidateUtil.validateRestRequest(restRequest));
		if (restRequest.getRequest().getStartDate() == null) {
			sb.append(ErrorCode.Common_StartDateRequired);
			return sb.toString();
		}
		if (restRequest.getRequest().getEndDate() == null) {
			sb.append(ErrorCode.Common_EndDateRequired);
			return sb.toString();
		}
		if (restRequest.getRequest().getStartDate().getTime()>restRequest.getRequest().getEndDate().getTime()) {
			sb.append(ErrorCode.Common_StartDateLessThanEndDate);
			return sb.toString();
		}
		if (StringUtils.isBlank(restRequest.getRequest().getHotelCodes())&& StringUtils.isBlank(restRequest.getRequest().getHotelIds())) {
			sb.append(ErrorCode.Common_NumberIdsFormatErrorAndLessThanTen);
			return sb.toString();
		}
		return sb.toString();
	}
	/**
	 * 校验库存验证入参合法性
	 * @param restRequest
	 * @return
	 */
	private String validateValidateInventoryRequest(RestRequest<ValidateInventoryCondition> restRequest) {
		StringBuffer sb = new StringBuffer(ValidateUtil.validateRestRequest(restRequest));
		if (StringUtils.isBlank(restRequest.getRequest().getHotelId())) {
			sb.append(ErrorCode.Common_HotelIdRequired);
			return sb.toString();
		}
		if (StringUtils.isBlank(restRequest.getRequest().getHotelCode())) {
			sb.append(ErrorCode.Common_HotelCodeRequired);
			return sb.toString();
		}
		if (StringUtils.isBlank(restRequest.getRequest().getRoomTypeId())) {
			sb.append(ErrorCode.Common_RoomTypeIdRequired);
			return sb.toString();
		}
		if (restRequest.getRequest().getArrivalDate() == null) {
			sb.append(ErrorCode.Common_ArrivalDateRequired);
			return sb.toString();
		}
		if (restRequest.getRequest().getDepartureDate() == null) {
			sb.append(ErrorCode.Common_DepartureDateRequired);
			return sb.toString();
		}
		if (restRequest.getRequest().getArrivalDate().getTime()>restRequest.getRequest().getDepartureDate().getTime()) {
			sb.append(ErrorCode.Common_StartDateLessThanEndDate);
			return sb.toString();
		}
		return sb.toString();
	}
}
