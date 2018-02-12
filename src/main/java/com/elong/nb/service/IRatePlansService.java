package com.elong.nb.service;

import com.elong.nb.common.model.ProxyAccount;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.model.rateplan.RatePlanCondition;
import com.elong.nb.model.rateplan.RatePlanResult;

public interface IRatePlansService {

	RestResponse<RatePlanResult> GetRatePlans(RestRequest<RatePlanCondition> request, ProxyAccount proxyAccount);

}
