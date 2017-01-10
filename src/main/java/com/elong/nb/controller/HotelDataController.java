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
import com.elong.nb.common.util.ValidateUtil;
import com.elong.nb.model.bookingdata.BookingDataCondition;
import com.elong.nb.model.bookingdata.BookingDataResult;
import com.elong.nb.model.rateplan.RatePlanCondition;
import com.elong.nb.model.rateplan.RatePlanResult;
import com.elong.nb.service.IBookingDataService;
import com.elong.nb.service.IRatePlansService;
import com.google.gson.TypeAdapter;

@Controller
public class HotelDataController {
	@Resource
	private IRatePlansService ratePlansService;
	@Resource
	private IBookingDataService bookingDataService;
	//获取产品
	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/api/Hotel/GetRatePlans", method = RequestMethod.POST)
	public ResponseEntity<byte[]> getRatePlans(HttpServletRequest request) throws IOException
	{
		//基本校验
		Map<Class, TypeAdapter> m = new HashMap<Class, TypeAdapter>();
		RestRequest<RatePlanCondition> restRequest = GsonUtil.toReq(request,
				RatePlanCondition.class, m);
		String rst = validateRatePlanRequest(restRequest);
		if (StringUtils.isNotBlank(rst)) {
			RestResponse<RatePlanCondition> response = new RestResponse<RatePlanCondition>(
					restRequest.getGuid());
			response.setCode(rst);
			return new ResponseEntity<byte[]>(GsonUtil.toJson(response,
					restRequest.getVersion() == null ? 0d : restRequest.getVersion()).getBytes(), HttpStatus.OK);
		}
		
		//调用Service
		RestResponse<RatePlanResult> response=null;
//		try {
			response = ratePlansService.GetRatePlans(restRequest);
//		} catch (Exception e) {
//			response=new RestResponse<RatePlanResult>(restRequest.getGuid());
//			response.setCode(ErrorCode.Unknown+e.getMessage());
//		}
		
		//反回JSON
		return new ResponseEntity<byte[]>(GsonUtil.toJson(
				response,
				restRequest.getVersion()).getBytes(), HttpStatus.OK);
		
	}
	
	private String validateRatePlanRequest(RestRequest<RatePlanCondition> restRequest){
		;
		StringBuffer sb = new StringBuffer(
				ValidateUtil.validateRestRequest(restRequest));
		RatePlanCondition req = restRequest.getRequest();
		/**
		 * 付款类型不能为空
		 */
		if (req.getPaymentType() ==null || req.getPaymentType().getValue()<0)
		{
			sb.append(ErrorCode.Common_PaymentTypeRequired)	;
		}
		if(StringUtils.isEmpty(req.getHotelIds())&&StringUtils.isEmpty(sb.toString())){
			sb.append(ErrorCode.Common_HotelIdRequired);
		}
		return sb.toString();
	}
	
	
	    //获取GetBookingData
		@SuppressWarnings("rawtypes")
		@RequestMapping(value = "/api/Hotel/GetBookingData", method = RequestMethod.POST)
		public ResponseEntity<byte[]> getBookingData(HttpServletRequest request) throws IOException
		{
			//基本校验
			Map<Class, TypeAdapter> m = new HashMap<Class, TypeAdapter>();
			RestRequest<BookingDataCondition> restRequest = GsonUtil.toReq(request,
					BookingDataCondition.class, m);
			String rst = validateBookingDataRequest(restRequest);
			if (StringUtils.isNotBlank(rst)) {
				RestResponse<BookingDataResult> response = new RestResponse<BookingDataResult>(
						restRequest.getGuid());
				response.setCode(rst);
				return new ResponseEntity<byte[]>(GsonUtil.toJson(response,
						restRequest.getVersion() == null ? 0d : restRequest.getVersion()).getBytes(), HttpStatus.OK);
			}
			
			//调用Service
			RestResponse<BookingDataResult> response=null;
//			try {
				
				response = bookingDataService.getBookingData(restRequest);
				
//			} catch (Exception e) {
//				response=new RestResponse<BookingDataResult>(restRequest.getGuid());
//				response.setCode(ErrorCode.Unknown+e.getMessage());
//			}
			
			//反回JSON
			return new ResponseEntity<byte[]>(GsonUtil.toJson(
					response,
					restRequest.getVersion()).getBytes(), HttpStatus.OK);
			
		}
		
		private String validateBookingDataRequest(RestRequest<BookingDataCondition> restRequest){
			StringBuffer sb = new StringBuffer(
					ValidateUtil.validateRestRequest(restRequest));
			restRequest.getRequest();
			
			//这里加入相关校验
			
			return sb.toString();
		}
}
