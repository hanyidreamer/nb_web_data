package com.elong.nb.bookingdata.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import com.elong.nb.common.model.RestRequest;
import com.elong.nb.model.bookingdata.BookingDataCondition;
import com.elong.nb.model.rate.bean.Rate;
import com.elong.nb.service.impl.RateService;
import com.elong.nb.util.DateUtil;

public class RateThread implements Callable<List<Rate>> {

	RestRequest<BookingDataCondition> request;
	RateService rateService;

	public RateThread(RestRequest<BookingDataCondition> request,
			RateService rateService) {
		this.request = request;
		this.rateService = rateService;
	}

	@Override
	public List<Rate> call() throws Exception {
		List<Rate> obj = null;
		try {
			List<Rate> list = rateService.getRate(request.getProxyInfo(),
					request.getRequest().getHotelId(), request.getRequest().getHotelCode(), 
					request.getRequest().getArrivalDate(), DateUtil.addDays(request.getRequest().getDepartureDate(), -1),
					request.getRequest().getPaymentType(), 
					request.getProxyInfo().getLowestProfitPercent(), request.getGuid());
			List<Rate> rates = new ArrayList<Rate>();
			if (list != null) {
				for (Rate x : list) {
					if (request.getRequest().getRoomTypeId().equals(x.getRoomTypeId())
							&& request.getRequest().getRatePlanId() == x.getRateplanId())
						rates.add(x);
				}
			}
			obj = rates;
		} catch (Exception e) {
			return null;
		}
		return obj;
	}
}
