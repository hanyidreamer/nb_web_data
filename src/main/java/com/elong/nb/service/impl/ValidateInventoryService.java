package com.elong.nb.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.model.bean.Inventory;
import com.elong.nb.model.inventory.InventoryCondition;
import com.elong.nb.model.inventory.ValidateInventoryCondition;
import com.elong.nb.model.inventory.ValidateInventoryResult;
import com.elong.nb.service.IInventoryService;
import com.elong.nb.service.IValidateInventoryService;
import com.elong.nb.util.DateUtil;
@Service
public class ValidateInventoryService implements IValidateInventoryService{
	@Resource
	private IInventoryService InventoryService;

	 public RestResponse<ValidateInventoryResult> getValidateInventories(RestRequest<ValidateInventoryCondition> restRequest) throws Exception
     {
         RestResponse<ValidateInventoryResult> result =new RestResponse<ValidateInventoryResult>(restRequest.getGuid());
         result.setCode("0");
         ValidateInventoryResult validateInventoryResult=new ValidateInventoryResult();
         validateInventoryResult.setIsOK(true);
         result.setResult(validateInventoryResult);
         Date start = restRequest.getRequest().getArrivalDate();//Request.ArrivalDate.Date;
         Date end = DateUtil.addDays(restRequest.getRequest().getDepartureDate(),-1);
         Date now = new Date();
         int time = now.getHours() * 10000 + now.getMinutes() * 100 + now.getSeconds();

         RestRequest<InventoryCondition> req = new RestRequest<InventoryCondition>();
         req.setGuid(restRequest.getGuid());
         req.setLocal(restRequest.getLocal());
         req.setProxyInfo(restRequest.getProxyInfo());
         req.setVersion(restRequest.getVersion());
         InventoryCondition request=new InventoryCondition();
         request.setHotelIds(restRequest.getRequest().getHotelId());
         request.setHotelCodes(restRequest.getRequest().getHotelCode());
         request.setStartDate(start);
         request.setEndDate(end);
         request.setRoomTypeId(restRequest.getRequest().getRoomTypeId());
         req.setRequest(request);
        	 List<Inventory> inventories = this.InventoryService.getInventories(req).getResult().getInventories();
         while (start.getTime()<=end.getTime())
         {
        	 	List<Inventory> q = new ArrayList<Inventory>();
        	 	for(Inventory item:inventories){
            	 	if(item.getHotelCode()==restRequest.getRequest().getHotelCode()&&item.getAvailableDate()==start){
            	 		q.add(item);
            	 	}
        	 		
        	 	}
             if (q != null && q.size() > 0)
             {
                 for(Inventory inv:q)
                 {
                     if (!inv.isStatus()  //库存状态
                         || inv.getStartDate().after(now) || inv.getEndDate().before(now)  //库存可使用的日期
                         || (restRequest.getRequest().getAmount() > 0 && inv.getOverBooking() == 1 && inv.getAvailableAmount() < restRequest.getRequest().getAmount())  //库存数量
                         )
                     {
                         result.getResult().setIsOK(false);
                         return result;
                     }
                     //库存可使用的日期
                     try
                     {
                         if (inv.getStartTime().length() == 8 || inv.getEndTime().length() == 8)
                         {
                             int t = Integer.parseInt(inv.getStartTime().replace(":", ""));
                             if (t > time)
                             {
                                 result.getResult().setIsOK(false); 
                                 return result;
                             }
                             t = Integer.parseInt(inv.getEndTime().replace(":", ""));
                             if (t < time)
                             {
                            	 result.getResult().setIsOK(false); 
                                 return result;
                             }
                         }
                     }
                     catch(Exception ex)
                     {
                     }

                 }
             }
             start = DateUtil.addDays(start,1);
         }

         return result;
     }

}
