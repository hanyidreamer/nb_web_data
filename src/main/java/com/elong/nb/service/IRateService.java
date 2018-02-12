package com.elong.nb.service;

import com.elong.nb.common.model.ProxyAccount;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.model.rate.RateCondition;
import com.elong.nb.model.rate.RateResult;

public interface IRateService {

	RestResponse<RateResult> getRates(RestRequest<RateCondition> request, ProxyAccount proxyAccount) throws Exception;

}
