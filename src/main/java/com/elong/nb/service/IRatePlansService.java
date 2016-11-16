package com.elong.nb.service;

import java.util.List;

import com.elong.nb.common.model.EnumLocal;
import com.elong.nb.common.model.ProxyAccount;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.model.bean.enums.EnumPaymentType;
import com.elong.nb.model.rateplan.HotelRatePlan;
import com.elong.nb.model.rateplan.RatePlanCondition;
import com.elong.nb.model.rateplan.RatePlanResult;

public interface IRatePlansService {

	RestResponse<RatePlanResult> GetRatePlans(RestRequest<RatePlanCondition> request);
	List<HotelRatePlan> getRatePlans(EnumLocal language,String mHotelId, String shotelId, EnumPaymentType paymentType,
			ProxyAccount proxyInfo, double requestVersion, String options,String guid);
}
