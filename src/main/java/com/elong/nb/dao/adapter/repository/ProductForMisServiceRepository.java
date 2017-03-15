package com.elong.nb.dao.adapter.repository;

import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck.ArrayOfPriceDaySimple;
import com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck.CheckInventoryAndPriceRequest;
import com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck.CheckInventoryAndPriceResponse;
import com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck.IProductForSearchServiceContract;
import com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck.InventoryAndPriceCheckResult;
import com.elong.nb.checklist.CheckListUtil;
import com.elong.nb.data.biglog.BigLog;
import com.elong.nb.util.DateUtil;

@Repository
public class ProductForMisServiceRepository {
	//private static CheckListUtil logger = LogManager.getLogger("biglog");
	@Resource(name = "productForSearchService")
	private IProductForSearchServiceContract ProductForSearchServiceForRealTimeCheck;

	/**
	 * 检查酒店的实时库存，直连酒店会发起直连查询命令
	 * @param arrivalDate
	 * @param departureDate
	 * @param hotelCode
	 * @param roomTypeId
	 * @param ratePlanId
	 * @param numberOfRooms
	 * @param guid
	 * @return
	 */
	public InventoryAndPriceCheckResult CheckHotelRealTimeInventory(
			Date arrivalDate, Date departureDate, String hotelCode,
			String roomTypeId, int ratePlanId, int numberOfRooms, String guid) {

		CheckInventoryAndPriceRequest req = new CheckInventoryAndPriceRequest();
		BigLog log = new BigLog();
		log.setUserLogType(guid);
		log.setAppName("IProductForSearchServiceContract ");
		log.setTraceId(UUID.randomUUID().toString());
		log.setSpan("1.1");
		req.setArriveDate(DateUtil.toDateTime(arrivalDate));
		req.setBookingTime(DateUtil.toDateTime(new Date()));
		req.setCurrencyCode("RMB");
		req.setLeaveDate(DateUtil.toDateTime(departureDate));
		req.setOperatorIp("127.0.0.1");
		req.setOperatorName("NBAPI");
		req.setOperatorTime(DateUtil.toDateTime(new Date()));
		// ProductCheckType.CheckInventory;
		// req.setProductCheckType(ProductCheckType.CheckInventory);
		// 2:检查库存，4检查价格
		req.setProductType(2);
		req.setRatePlanID(ratePlanId);
		req.setRequestFrom(3);
		req.setRoomCount(numberOfRooms);
		req.setRoomTypeID(roomTypeId);
		req.setSHotelID(hotelCode);
		// req.setPriceList( new PriceDaySimple[0]);
		ArrayOfPriceDaySimple arrayPrice = new ArrayOfPriceDaySimple();
		req.setPriceList(arrayPrice);
		req.setDynamicId("");
		log.setServiceName("checkInventoryAndPriceForNB");
		long start = System.currentTimeMillis();
		try {
			CheckInventoryAndPriceResponse res = ProductForSearchServiceForRealTimeCheck
					.checkInventoryAndPriceForNB(req);
			log.setElapsedTime(String.valueOf(System.currentTimeMillis()
					- start));
			if (res != null && res.getResult() != null) {
				log.setBusinessErrorCode(String.valueOf(res.getResult().getResponseCode()));
				log.setExceptionMsg(res.getResult().getErrorMessage());
			} else {
				log.setBusinessErrorCode("1");
			}
			CheckListUtil.info(log);
			if (res != null
					&& res.getResult() != null
					&& res.getResult().getResponseCode() == 0
					&& res.getCheckResult() != InventoryAndPriceCheckResult.INVENTORY_CLOSE) {
				return InventoryAndPriceCheckResult.AVAILABLE;

			}

		} catch (Exception ex) {
			log.setElapsedTime(String.valueOf(System.currentTimeMillis()
					- start));
			log.setException(ex);
			log.setExceptionMsg(ex.getMessage());
			log.setResponseCode("1");
			CheckListUtil.error(log);
			throw new RuntimeException("checkInventoryAndPriceForNB",ex);
		}
		return InventoryAndPriceCheckResult.INVENTORY_CLOSE;
	}
}
