package com.elong.nb.bookingdata.thread;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Callable;

import com.elong.nb.agent.ProductForPartnerServiceContract.ResourceInvAndInstantConfirmState;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.model.bookingdata.BookingDataCondition;
import com.elong.nb.model.inventory.bean.Inventory;
import com.elong.nb.repository.InventoryRepository;

public class InventoryThread implements Callable<Object> {

	RestRequest<BookingDataCondition> request;
	InventoryRepository inventoryRepository;
	boolean isInstantConfirmInSearch;
	public InventoryThread(RestRequest<BookingDataCondition> request,InventoryRepository inventoryRepository,boolean isInstantConfirmInSearch)
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

			Calendar cd = Calendar.getInstance();
			cd.setTime(request.getRequest().getDepartureDate());
			cd.add(Calendar.DATE, -1);
			
            //需要及时确认信息，调用后台新接口 ---- 使用搜索里面判断过的
			List<ResourceInvAndInstantConfirmState> invs = null;//inventoryRepository.GetInventoriesBySHotelId(request.getRequest().getHotelCode(), request.getRequest().getRoomTypeId(), 
					//request.getRequest().getArrivalDate(), cd.getTime(), //request.getRequest().getDepartureDate().AddDays(-1), 
					//false); 
			
            List<Inventory> list = new ArrayList<Inventory>();

            //判断立即确认的黑名单 ---- 使用搜索里面判断过的
            //var instantConfirmation = this.InstantConfirmBlackListRepository.IsAlsoInstantConfirmOverBlackListAndRules(request.Request.HotelCode, request.ProxyInfo.OrderFrom);

            /*
            list.AddRange(invs.Select(item => new Inventory
            {
                HotelID = request.Request.HotelId,
                StartDate = item.BeginDate,
                EndDate = item.EndDate,
                StartTime = item.BeginTime,
                EndTime = item.EndTime,
                AvailableAmount = item.AvailableAmount,
                AvailableDate = item.AvailableTime,
                RoomTypeID = item.RoomTypeID,
                Status = item.Status == 0,
                OverBooking = item.IsOverBooking,
                HotelCode = item.HotelID,
                IsInstantConfirm = isInstantConfirmInSearch, //item.IsInstantConfirm ? isInstantConfirmInSearch : false,
                IC_BeginTime = item.IC_BeginTime,
                IC_EndTime = item.IC_EndTime
            }));
            */
            
            for(ResourceInvAndInstantConfirmState item : invs)
            {
            	Inventory inv = new Inventory();
            	inv.setHotelID(request.getRequest().getHotelId());
                        inv.setStartDate(item.getBeginDate().toDate());
                        inv.setEndDate(item.getEndDate().toDate());
                        inv.setStartTime(item.getBeginTime());
                        inv.setEndTime(item.getEndTime());
                        inv.setAvailableAmount(item.getAvailableAmount());
                        inv.setAvailableDate(item.getAvailableTime().toDate());
                        inv.setRoomTypeID(item.getRoomTypeID());
                        inv.setStatus(item.getStatus() == 0);
                        inv.setOverBooking(item.getIsOverBooking());
                        inv.setHotelCode(item.getHotelID());
                        inv.setIsInstantConfirm(isInstantConfirmInSearch); //item.IsInstantConfirm ? isInstantConfirmInSearch : false,
                        inv.setIC_BeginTime(item.getICBeginTime());
                        inv.setIC_EndTime(item.getICEndTime());
                        
               list.add(inv);
            }
            
            if (list.size() > 0) 
            {
                //InvLimitBlackListRepository.ConvertToInventory(list,request.ProxyInfo.OrderFrom);
            }
            
         obj = list;
         
        }
        catch(Exception e)
        {
        	
        }
		
        return obj;

	}
	
	
}
