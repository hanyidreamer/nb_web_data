package com.elong.nb.repository;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck.ArrayOfPriceDaySimple;
import com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck.CheckInventoryAndPriceRequest;
import com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck.CheckInventoryAndPriceResponse;
import com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck.IProductForSearchServiceContract;
import com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck.InventoryAndPriceCheckResult;
import com.elong.nb.util.DateUtil;

@Repository
public class ProductForMisServiceRepository {

	@Resource(name="productForSearchService")
	private IProductForSearchServiceContract ProductForSearchServiceForRealTimeCheck;
	
	/// <summary>
    /// 检查酒店的实时库存，直连酒店会发起直连查询命令
    /// </summary>
    /// <param name="arrivalDate"></param>
    /// <param name="departureDate"></param>
    /// <param name="hotelCode"></param>
    /// <param name="roomTypeId"></param>
    /// <param name="ratePlanId"></param>
    /// <param name="numberOfRooms"></param>
    /// <returns></returns>
    public InventoryAndPriceCheckResult CheckHotelRealTimeInventory(Date arrivalDate, Date departureDate, String hotelCode, String roomTypeId,
        int ratePlanId, int numberOfRooms)
    {

    	CheckInventoryAndPriceRequest req = new CheckInventoryAndPriceRequest();
        
            req.setArriveDate(DateUtil.toDateTime(arrivalDate));
            req.setBookingTime(DateUtil.toDateTime(new Date()));
            		req.setCurrencyCode("RMB");
            		req.setLeaveDate(DateUtil.toDateTime(departureDate));
            		req.setOperatorIp("127.0.0.1");
            		req.setOperatorName("NBAPI");
            		req.setOperatorTime(DateUtil.toDateTime(new Date()));
            		//ProductCheckType.CheckInventory;
            		//req.setProductCheckType(ProductCheckType.CheckInventory);
            		//2:检查库存，4检查价格
            	     req.setProductType(2);
            		req.setRatePlanID(ratePlanId);
            		req.setRequestFrom(3);
            		req.setRoomCount(numberOfRooms);
            		req.setRoomTypeID(roomTypeId);
            		req.setSHotelID(hotelCode);
            		//req.setPriceList( new PriceDaySimple[0]);
            		ArrayOfPriceDaySimple arrayPrice = new ArrayOfPriceDaySimple();
            		req.setPriceList(arrayPrice);
            req.setDynamicId("");
        

            CheckInventoryAndPriceResponse res = ProductForSearchServiceForRealTimeCheck.checkInventoryAndPriceForNB(req);
        if (res != null && res.getResult() != null && res.getResult().getResponseCode() == 0 && res.getCheckResult() != InventoryAndPriceCheckResult.INVENTORY_CLOSE)
        {
            return InventoryAndPriceCheckResult.AVAILABLE;

        }
        return InventoryAndPriceCheckResult.INVENTORY_CLOSE;
    }
}
