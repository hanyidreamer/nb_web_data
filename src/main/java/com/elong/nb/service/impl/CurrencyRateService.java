/**   
 * @(#)CurrencyRateService.java	2016年10月14日	下午5:21:13	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.elong.nb.common.model.ErrorCode;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.dao.adapter.cache.CurrencyRateCache;
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
 * 2016年10月14日 下午5:21:13 user 1.0 初始化创建<br>
 * </p>
 *
 * @author zhangyang.zhu
 * @version 1.0
 * @since JDK1.7
 */
@Service
public class CurrencyRateService implements ICurrencyRateService {
	@Resource
	private CurrencyRateCache currencyRateCache;

	/**
	 * (方法说明描述)
	 *
	 * @param enumCurrencyCode
	 * @return
	 * @throws Exception
	 *
	 * @see com.elong.nb.service.ICurrencyRateService#getCurrencyRate(com.elong.nb.model.bean.enums.EnumCurrencyCode)
	 */
	@Override
	public RestResponse<ExchangeRateResult> getCurrencyRate(RestRequest<ExchangeRateCondition> restRequest) throws Exception {
		RestResponse<ExchangeRateResult> restResponse = new RestResponse<ExchangeRateResult>(restRequest.getGuid());
		ExchangeRateResult result = new ExchangeRateResult();
		if (restRequest.getRequest().getCurrencyId() == null) {
			restResponse.setCode(ErrorCode.Data_CurrencyCodeRequired);
			return restResponse;
		}
		double rate = currencyRateCache.getCurrencyRate(restRequest.getRequest().getCurrencyId());
		if (rate != 0) {
			result.setExchangeRate(rate);
			restResponse.setResult(result);
		} else {
			restResponse.setCode(ErrorCode.Data_NoCurrencyRate);
		}

		return restResponse;
	}

}
