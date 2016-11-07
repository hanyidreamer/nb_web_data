package com.elong.nb.bookingdata.thread;

import java.util.List;
import java.util.concurrent.Callable;

import com.elong.nb.common.model.RestRequest;
import com.elong.nb.dao.adapter.repository.RatePlanRepository;
import com.elong.nb.model.bookingdata.BookingDataCondition;
import com.elong.nb.model.rateplan.HotelRatePlan;

public class RatePlanThread implements Callable<Object>{

	RatePlanRepository ratePlanRepository;
	RestRequest<BookingDataCondition> request;
	
	public RatePlanThread(RestRequest<BookingDataCondition> request,RatePlanRepository ratePlanRepository)
	{
		this.request = request;
		this.ratePlanRepository = ratePlanRepository;
	}
	
	@Override
	public Object call() throws Exception {
		
		HotelRatePlan item = null;
        List<HotelRatePlan> list = null;
//        		ratePlanRepository.GetRatePlans(
//            request.getLocal(), request.getRequest().getHotelId(), request.getRequest().getHotelCode(),
//            request.getRequest().getPaymentType(), request.getProxyInfo(), request.getVersion(), null);
        if ( list != null && list.size() > 0 )
        {
            item = list.get(0);
        }
        Object obj = item;
        return obj;
	}

	
}
