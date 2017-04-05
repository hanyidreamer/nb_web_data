package com.elong.nb.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.elong.nb.util.MathUtil;

@Service
public class ValidateInventoryService implements IValidateInventoryService {
	@Resource
	private IInventoryService inventoryService;

	/**
	 * 验证库存
	 */
	public RestResponse<ValidateInventoryResult> getValidateInventories(
			RestRequest<ValidateInventoryCondition> restRequest)
			throws Exception {
		RestResponse<ValidateInventoryResult> result = new RestResponse<ValidateInventoryResult>(
				restRequest.getGuid());
		result.setCode("0");
		ValidateInventoryResult validateInventoryResult = new ValidateInventoryResult();
		validateInventoryResult.setIsOK(true);
		result.setResult(validateInventoryResult);
		Date start = restRequest.getRequest().getArrivalDate();
		Date end = null;
		//如果离店日期大于到店日期 库存校验结束日期为离店日期的前一天的库存
		if(start.getTime()==restRequest.getRequest().getDepartureDate().getTime()){
			end=restRequest.getRequest().getDepartureDate();
		}else{
			end=DateUtil.addDays(restRequest.getRequest().getDepartureDate(), -1);
		}
		// Date now = new Date();
		Calendar now = Calendar.getInstance();
		now.setTime(new Date());
		int time = now.get(Calendar.HOUR_OF_DAY) * 10000
				+ now.get(Calendar.MINUTE) * 100 + now.get(Calendar.SECOND);

		RestRequest<InventoryCondition> req = new RestRequest<InventoryCondition>();
		req.setGuid(restRequest.getGuid());
		req.setLocal(restRequest.getLocal());
		req.setProxyInfo(restRequest.getProxyInfo());
		req.setVersion(restRequest.getVersion());
		InventoryCondition request = new InventoryCondition();
		request.setHotelIds(restRequest.getRequest().getHotelId());
		request.setHotelCodes(restRequest.getRequest().getHotelCode());
		request.setStartDate(start);
		request.setEndDate(end);
		request.setRoomTypeId(restRequest.getRequest().getRoomTypeId());
		req.setRequest(request);
		List<Inventory> inventories = this.inventoryService.getInventories(req)
				.getResult().getInventories();
		Map<Date,List<Inventory>> inventoryMap=new HashMap<Date,List<Inventory>>();
		if(inventories!=null){
			for(Inventory inv:inventories){
				if(inv.getHotelCode().equals(restRequest.getRequest().getHotelCode())){
					if(inventoryMap.containsKey(inv.getAvailableDate())){
						inventoryMap.get(inv.getAvailableDate()).add(inv);
					}else{
						List<Inventory> invs=new ArrayList<Inventory>();
						invs.add(inv);
						inventoryMap.put(inv.getAvailableDate(), invs);
					}
				}
			}
		}
		for(Date key:inventoryMap.keySet()){
			List<Inventory> q = inventoryMap.get(key);
			if (q != null && q.size() > 0) {
				for (Inventory inv : q) {
					if (!inv.isStatus() // 库存状态
							|| inv.getStartDate().getTime() > now.getTimeInMillis()
							|| inv.getEndDate().getTime() < now.getTimeInMillis() // 库存可使用的日期
							|| (restRequest.getRequest().getAmount() > 0
									&& inv.getOverBooking() == 1 && inv
									.getAvailableAmount() < restRequest
									.getRequest().getAmount()) // 库存数量
					) {
						result.getResult().setIsOK(false);
						return result;
					}
					// 库存可使用的日期(只验证当日(当凌晨后预订也验证前一天)的预订时间)
					if (inv.getAvailableDate().getTime()==DateUtil.getDate(new Date()).getTime()||inv.getAvailableDate().getTime()==DateUtil.getDate(DateUtil.addDays(new Date(), -1)).getTime()) {
						if(inv.getStartTime().length() == 8||inv.getEndTime().length() == 8){
							String startTimeStr = inv.getStartTime().replace(":", "");
							if (MathUtil.isNumeric(startTimeStr)) {
								int t = Integer.parseInt(startTimeStr);
								if (t > time) {
									result.getResult().setIsOK(false);
									return result;
								}
								String endTimeStr = inv.getEndTime().replace(":", "");
								if (MathUtil.isNumeric(endTimeStr)) {
									t = Integer.parseInt(endTimeStr);
									if (t < time) {
										result.getResult().setIsOK(false);
										return result;
									}
								}
							}
						}
					}
				}
			}
		}
		return result;
	}

}
