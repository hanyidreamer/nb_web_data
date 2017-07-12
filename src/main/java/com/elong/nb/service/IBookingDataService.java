package com.elong.nb.service;

import com.elong.nb.common.model.ProxyAccount;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.model.bookingdata.BookingDataCondition;
import com.elong.nb.model.bookingdata.BookingDataResult;

public interface IBookingDataService {

	RestResponse<BookingDataResult> getBookingData(RestRequest<BookingDataCondition> request, ProxyAccount proxyAccount);

}
