package com.elong.nb.service;

import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.model.rackrate.RackRateRequest;
import com.elong.nb.model.rackrate.RackRateResponse;

public interface IRackRateService {

	public RestResponse<RackRateResponse> GetRackRates(RestRequest<RackRateRequest> request);
}
