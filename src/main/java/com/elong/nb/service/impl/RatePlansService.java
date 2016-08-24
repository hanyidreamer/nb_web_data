package com.elong.nb.service.impl;

import org.springframework.stereotype.Service;

import com.elong.nb.common.model.ErrorCode;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.model.bean.enums.EnumPaymentType;
import com.elong.nb.model.rateplan.RatePlanCondition;
import com.elong.nb.model.rateplan.RatePlanResult;
import com.elong.nb.service.IRatePlansService;

@Service
public class RatePlansService implements IRatePlansService {

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
        	//response.getResult().setHotels("this.HotelDataRepository.GetRatePlans(request)");
        	}
        
        return response;
	}

}
