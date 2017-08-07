/**   
 * @(#)HotelCurrencyRateController.java	2016年10月14日	下午4:56:12	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.elong.nb.common.gson.GsonUtil;
import com.elong.nb.common.model.ErrorCode;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.model.bean.ExchangeRateCondition;
import com.elong.nb.model.bean.ExchangeRateResult;
import com.elong.nb.service.ICurrencyRateService;

/**
 * (类型功能说明描述)
 *
 * <p>
 * 修改历史: <br>
 * 修改日期 修改人员 版本 修改内容<br>
 * -------------------------------------------------<br>
 * 2016年10月14日 下午4:56:12 user 1.0 初始化创建<br>
 * </p>
 *
 * @author zhangyang.zhu
 * @version 1.0
 * @since JDK1.7
 */
@Controller
public class HotelCurrencyRateController {

	@Resource
	private ICurrencyRateService currencyRateService;

	@RequestMapping(value = "/api/Hotel/GetExchangeRate", method = RequestMethod.POST)
	public ResponseEntity<byte[]> getExchangeRate(HttpServletRequest request) throws Exception {
		RestRequest<ExchangeRateCondition> restRequest = null;
		RestResponse<ExchangeRateResult> restResponse = null;
		try {
			restRequest = GsonUtil.toReq(request, ExchangeRateCondition.class, null);
		} catch (Exception e) {
			RestResponse<ExchangeRateResult> response = new RestResponse<ExchangeRateResult>(request.getHeader("guid"));
			response.setCode(ErrorCode.Common_ParamInvalid);
			return new ResponseEntity<byte[]>(GsonUtil.toJson(response, 0d).getBytes(), HttpStatus.OK);
		}
		restResponse = new RestResponse<ExchangeRateResult>(restRequest.getGuid());
		if (restRequest != null) {
			restResponse = currencyRateService.getCurrencyRate(restRequest);
		}
		return new ResponseEntity<byte[]>(GsonUtil.toJson(restResponse, restRequest.getVersion() == null ? 0d : restRequest.getVersion())
				.getBytes(), HttpStatus.OK);
	}
}
