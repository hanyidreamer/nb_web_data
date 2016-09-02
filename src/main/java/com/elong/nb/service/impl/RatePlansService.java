package com.elong.nb.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.elong.nb.common.model.ErrorCode;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.model.bean.enums.EnumPaymentType;
import com.elong.nb.model.rateplan.RatePlanCondition;
import com.elong.nb.model.rateplan.RatePlanResult;
import com.elong.nb.repository.RatePlanRepository;
import com.elong.nb.service.IRatePlansService;

@Service
public class RatePlansService implements IRatePlansService {

	@Resource
	private RatePlanRepository ratePlanRepository;
	
	@Override
	public RestResponse<RatePlanResult> GetRatePlans(
			RestRequest<RatePlanCondition> request) {
		
		RestResponse<RatePlanResult> response = new RestResponse<RatePlanResult>(request.getGuid());
        if (request.getRequest().getPaymentType() == EnumPaymentType.Prepay && !request.getProxyInfo().getEnabledPrepayProducts())
        {
        	response.setCode(ErrorCode.Data_NoPrepayProducts);
        }
        else 
        	{
        	  RatePlanResult res = new RatePlanResult();
        	  response.setResult(res);
        	  response.getResult().setHotels(ratePlanRepository.GetRatePlans(request));
        	}
        
        return response;
	}

}
