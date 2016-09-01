package com.elong.nb.service;

import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.model.bookingdata.BookingDataCondition;
import com.elong.nb.model.bookingdata.BookingDataResult;

public interface IBookingDataService {
	
	RestResponse<BookingDataResult> GetBookingData(RestRequest<BookingDataCondition> request);
}
