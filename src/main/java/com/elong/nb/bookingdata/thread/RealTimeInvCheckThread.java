package com.elong.nb.bookingdata.thread;

import java.util.concurrent.Callable;

import com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck.InventoryAndPriceCheckResult;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.dao.adapter.repository.ProductForMisServiceRepository;
import com.elong.nb.model.bookingdata.BookingDataCondition;

public class RealTimeInvCheckThread implements Callable<Object> {

	RestRequest<BookingDataCondition> request;
	ProductForMisServiceRepository productForMisServiceRepository;
	
	public RealTimeInvCheckThread(RestRequest<BookingDataCondition> request,ProductForMisServiceRepository productForMisServiceRepository)
	{
		this.request =request;
		this.productForMisServiceRepository =productForMisServiceRepository;
	}

	@Override
	public Object call() throws Exception {
		
		boolean realtimeInvAvailable =false;
		 try
         {
      	   InventoryAndPriceCheckResult realtimeInvResult = productForMisServiceRepository.CheckHotelRealTimeInventory(request.getRequest().getArrivalDate(), request.getRequest().getDepartureDate(), request.getRequest().getHotelCode(),
                  request.getRequest().getRoomTypeId(), request.getRequest().getRatePlanId(), 1);

             realtimeInvAvailable = (realtimeInvResult != InventoryAndPriceCheckResult.INVENTORY_CLOSE);
         }
         catch (Exception ex)
         {
             return false;
         }
		 
		 Object obj =realtimeInvAvailable;
		 
         return obj;
	}
	
	
}
