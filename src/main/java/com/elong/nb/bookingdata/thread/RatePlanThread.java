package com.elong.nb.bookingdata.thread;

import java.util.List;
import java.util.concurrent.Callable;

import com.elong.nb.common.model.RestRequest;
import com.elong.nb.model.bookingdata.BookingDataCondition;
import com.elong.nb.model.rateplan.HotelRatePlan;
import com.elong.nb.service.IRatePlansService;

public class RatePlanThread implements Callable<Object>{

	IRatePlansService ratePlanService;
	RestRequest<BookingDataCondition> request;
	
	public RatePlanThread(RestRequest<BookingDataCondition> request,IRatePlansService ratePlanService)
	{
		this.request = request;
		this.ratePlanService = ratePlanService;
	}
	
	@Override
	public Object call() throws Exception {
		
		HotelRatePlan item = null;
        List<HotelRatePlan> list = ratePlanService.getRatePlans(
            request.getLocal(), request.getRequest().getHotelId(), request.getRequest().getHotelCode(),
            request.getRequest().getPaymentType(), request.getProxyInfo(), request.getVersion(), null,request.getGuid());
        if ( list != null && list.size() > 0 )
        {
            item = list.get(0);
        }
        Object obj = item;
        return obj;
	}

	
}
