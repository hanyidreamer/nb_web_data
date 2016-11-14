package com.elong.nb.bookingdata.thread;

import java.util.Calendar;
import java.util.concurrent.Callable;

import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.model.bookingdata.BookingDataCondition;
import com.elong.nb.model.inventory.InventoryCondition;
import com.elong.nb.model.inventory.InventoryResult;
import com.elong.nb.service.IInventoryService;

public class InventoryThread implements Callable<Object> {

	RestRequest<BookingDataCondition> request;
	IInventoryService inventoryRepository;
	boolean isInstantConfirmInSearch;
	public InventoryThread(RestRequest<BookingDataCondition> request,IInventoryService inventoryRepository,boolean isInstantConfirmInSearch)
	{
		this.request =request;
		this.inventoryRepository =inventoryRepository;
		this.isInstantConfirmInSearch = isInstantConfirmInSearch;
	}

	@Override
	public Object call() throws Exception {
		
		Object obj = null;
		
		try
        {

			Calendar DepartureDate = Calendar.getInstance();
			DepartureDate.setTime(request.getRequest().getDepartureDate());
			DepartureDate.add(Calendar.DATE, -1);
			
			RestRequest<InventoryCondition> restRequest = new RestRequest<InventoryCondition>();
			restRequest.setGuid(request.getGuid());
			restRequest.setLocal(request.getLocal());
			restRequest.setProxyInfo(request.getProxyInfo());
			restRequest.setVersion(request.getVersion());
			
			InventoryCondition con = new InventoryCondition();
			con.setStartDate(request.getRequest().getArrivalDate());
			con.setEndDate(DepartureDate.getTime());
			con.setHotelIds(request.getRequest().getHotelId());
			con.setHotelCodes(request.getRequest().getHotelCode());
			con.setIsNeedInstantConfirm(true);
			con.setRoomTypeId(request.getRequest().getRoomTypeId());
			restRequest.setRequest(con);
			
			RestResponse<InventoryResult> res = inventoryRepository.getInventories(restRequest);
           
			if(res !=null && res.getResult()!=null && res.getResult().getInventories()!=null)
			{
               obj = res.getResult().getInventories();
			}
         
        }
        catch(Exception e)
        {
        	
        }
		
        return obj;

	}
	
	
}
