/**   
 * @(#)HotelCurrencyRateController.java	2016年10月14日	下午4:56:12	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.elong.nb.common.gson.GsonUtil;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.model.bean.ExchangeRateCondition;
import com.elong.nb.model.bean.ExchangeRateResult;
import com.elong.nb.model.bean.enums.EnumCurrencyCode;
import com.elong.nb.model.common.ResponseResult;
import com.elong.nb.service.ICurrencyRateService;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

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
	public ResponseEntity<byte[]> getExchangeRate(HttpServletRequest request)
			throws Exception {
		RestRequest<ExchangeRateCondition> restRequest = null;
		RestResponse<ExchangeRateResult> restResponse = null;
		// try {
		restRequest = GsonUtil.toReq(request, ExchangeRateCondition.class, null);
		restResponse = new RestResponse<ExchangeRateResult>(restRequest.getGuid());
		if (restRequest != null) {
			restResponse = currencyRateService.getCurrencyRate(restRequest);
		}

		// } catch (Exception e) {
		// restResponse.setResult(null);
		// restResponse.setCode("获取汇率接口异常"+e);
		// }
		return new ResponseEntity(GsonUtil.toJson(restResponse,restRequest.getVersion() == null ? 0d : restRequest
						.getVersion()).getBytes(), HttpStatus.OK);
	}
}
