/**   
 * @(#)LogCollectServiceImpl.java	2017年10月20日	上午11:19:46	   
 *     
 * Copyrights (C) 2017艺龙旅行网保留所有权利
 */
package com.elong.nb.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.elong.nb.DataInventoryPlanStatistic;
import com.elong.nb.DataRatePlanStatistic;
import com.elong.nb.common.model.ProxyAccount;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.common.util.DateUtils;
import com.elong.nb.model.bean.Inventory;
import com.elong.nb.model.inventory.InventoryResult;
import com.elong.nb.model.rateplan.HotelRatePlan;
import com.elong.nb.model.rateplan.MSRoomRelation;
import com.elong.nb.model.rateplan.RatePlanResult;
import com.elong.nb.model.rateplan.SupplierRatePlan;
import com.elong.nb.service.LogCollectService;

/**
 * 业务监控日志手机service实现
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年10月20日 上午11:19:46   suht     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		suht  
 * @version		1.0  
 * @since		JDK1.7
 */
@Service
public class LogCollectServiceImpl implements LogCollectService {

	private static final Logger minitorLogger = Logger.getLogger("MinitorLogger");

	private static final String BUSINESS_TYPE = "nbdata";

	/** 
	 * rp接口查询业务监控日志收集 
	 *
	 * @param proxyAccount
	 * @param response 
	 *
	 * @see com.elong.nb.service.LogCollectService#writeRateplanLog(com.elong.nb.common.model.ProxyAccount, com.elong.nb.common.model.RestResponse)    
	 */
	@Override
	public void writeRateplanLog(ProxyAccount proxyAccount, RestResponse<RatePlanResult> response) {
		DataRatePlanStatistic statisticModel = new DataRatePlanStatistic();
		statisticModel.setBusiness_type(BUSINESS_TYPE + "_rp");
		statisticModel.setLog_time(DateUtils.convertDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
		statisticModel.setProxyId(proxyAccount.getOrderFrom() + "");
		int rateplanSize = 0, roomTrueSize = 0, roomFalseSize = 0;
		RatePlanResult ratePlanResult = response.getResult();
		if (ratePlanResult == null || ratePlanResult.getHotels() == null) {
			statisticModel.setRatePlanSize(0);
			statisticModel.setRoomTrueSize(0);
			statisticModel.setRoomFalseSize(0);
			minitorLogger.info(JSON.toJSONString(statisticModel));
			return;
		}
		List<HotelRatePlan> hotels = ratePlanResult.getHotels();
		for (HotelRatePlan hotel : hotels) {
			if (hotel.getRatePlans() == null)
				continue;
			rateplanSize += hotel.getRatePlans().size();
		}
		for (HotelRatePlan hotel : hotels) {
			List<SupplierRatePlan> suppliers = hotel.getSuppliers();
			if (suppliers == null || suppliers.size() == 0)
				continue;
			for (SupplierRatePlan supplier : suppliers) {
				List<MSRoomRelation> rooms = supplier.getRooms();
				if (rooms == null || rooms.size() == 0)
					continue;
				for (MSRoomRelation room : rooms) {
					if (room.isStatus()) {
						++roomTrueSize;
					} else {
						++roomFalseSize;
					}
				}
			}
		}
		statisticModel.setRatePlanSize(rateplanSize);
		statisticModel.setRoomTrueSize(roomTrueSize);
		statisticModel.setRoomFalseSize(roomFalseSize);
		minitorLogger.info(JSON.toJSONString(statisticModel));
	}

	/** 
	 * 库存接口查询业务监控日志收集  
	 *
	 * @param proxyAccount
	 * @param response 
	 *
	 * @see com.elong.nb.service.LogCollectService#writeInventoryLog(com.elong.nb.common.model.ProxyAccount, com.elong.nb.common.model.RestResponse)    
	 */
	@Override
	public void writeInventoryLog(ProxyAccount proxyAccount, RestResponse<InventoryResult> response) {
		DataInventoryPlanStatistic statisticModel = new DataInventoryPlanStatistic();
		statisticModel.setBusiness_type(BUSINESS_TYPE + "_inv");
		statisticModel.setLog_time(DateUtils.convertDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
		statisticModel.setInvProxyId(proxyAccount.getOrderFrom() + "");
		int invSize = 0, invTrueSize = 0, invFalseSize = 0;
		InventoryResult inventoryResult = response.getResult();
		if (inventoryResult == null || inventoryResult.getInventories() == null) {
			statisticModel.setInvSize(0);
			statisticModel.setInvTrueSize(0);
			statisticModel.setInvFalseSize(0);
			minitorLogger.info(JSON.toJSONString(statisticModel));
			return;
		}
		List<Inventory> invList = inventoryResult.getInventories();
		invSize = invList.size();
		for (Inventory inventory : invList) {
			if (inventory.isStatus()) {
				++invTrueSize;
			} else {
				++invFalseSize;
			}
		}
		statisticModel.setInvSize(invSize);
		statisticModel.setInvTrueSize(invTrueSize);
		statisticModel.setInvFalseSize(invFalseSize);
		minitorLogger.info(JSON.toJSONString(statisticModel));
	}

}
