/**   
 * @(#)InventoryService.java	2016年5月30日	下午6:48:19	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.elong.nb.common.ComparableUtil;
import com.elong.nb.common.model.ProxyAccount;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.dao.adapter.cache.M_SRelationCache;
import com.elong.nb.dao.adapter.repository.InventoryRepository;
import com.elong.nb.dao.adapter.repository.InventoryRuleRepository;
import com.elong.nb.model.RuleInventory;
import com.elong.nb.model.bean.Inventory;
import com.elong.nb.model.inventory.InventoryCondition;
import com.elong.nb.model.inventory.InventoryResult;
import com.elong.nb.service.IInventoryService;
import com.elong.nb.service.task.InventoryHotelIdTask;
import com.elong.nb.util.DateUtil;

import edu.emory.mathcs.backport.java.util.Arrays;

/**
 * (类型功能说明描述)
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2016年5月30日 下午6:48:19   Administrator     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		Administrator  
 * @version		1.0  
 * @since		JDK1.7
 */
@Service
public class InventoryService implements IInventoryService{

	@Resource
	private M_SRelationCache m_SRelationCache;
	@Resource
	private InventoryRepository inventoryDao;
	@Resource
	private InventoryRuleRepository inventoryRuleRepository;
	/** 
	 * (方法说明描述)获得库存接口 
	 *
	 * @param request
	 * @return 
	 * @throws Exception 
	 * @see com.elong.nb.service.IInventoryService#getInventories(com.elong.nb.common.model.RestRequest)    
	 */
	@Override
	public RestResponse<InventoryResult> getInventories(RestRequest<InventoryCondition> restRequest) throws Exception {

		RestResponse<InventoryResult> response = new RestResponse<InventoryResult>(
				restRequest.getGuid());
		InventoryResult result = new InventoryResult();
		List<Inventory> list= getInentory(restRequest.getProxyInfo(),restRequest.getRequest().getHotelIds(),restRequest.getRequest().getHotelCodes(),restRequest.getRequest().getRoomTypeId(),restRequest.getRequest().getStartDate(),restRequest.getRequest().getEndDate(),
				false,restRequest.getProxyInfo().getOrderFrom());
		List<RuleInventory> ruleList=toRuleInventory(list);
		inventoryRuleRepository.convertInventoryWithRule(ruleList,restRequest.getProxyInfo().getOrderFrom(), restRequest.getRequest().isIsNeedInstantConfirm());
		convertToInventory(ruleList, list);
		result.setInventories(list);
		response.setResult(result);
		return response;
	}
	private List<RuleInventory> toRuleInventory(List<Inventory> list){
		List<RuleInventory> result=new ArrayList<RuleInventory>();
		for(int index=0;index<list.size();index++){
			RuleInventory ruleInventory=new RuleInventory();
			Inventory inventory=list.get(index);
			ruleInventory.setAvailableAmount(inventory.getAvailableAmount());
			ruleInventory.setAvailableDate(inventory.getAvailableDate());
			ruleInventory.setEndDate(inventory.getEndDate());
			ruleInventory.setEndTime(inventory.getEndTime());
			ruleInventory.setHotelCode(inventory.getHotelCode());
			ruleInventory.setHotelID(inventory.getHotelID());
			ruleInventory.setIsInstantConfirm(inventory.isIsInstantConfirm());
			ruleInventory.setOverBooking(inventory.getOverBooking());
			ruleInventory.setRoomTypeID(inventory.getRoomTypeID());
			ruleInventory.setRuleKey(""+index);
			ruleInventory.setStartDate(inventory.getStartDate());
			ruleInventory.setStartTime(inventory.getStartTime());
			ruleInventory.setStatus(inventory.isStatus());
			result.add(ruleInventory);
		}
		return result;
	}
	private void convertToInventory(List<RuleInventory> ruleList,List<Inventory> list){
		if(ruleList!=null){
			for(RuleInventory ruleInventory:ruleList){
				list.get(Integer.parseInt(ruleInventory.getRuleKey())).setAvailableAmount(ruleInventory.getAvailableAmount());
				list.get(Integer.parseInt(ruleInventory.getRuleKey())).setAvailableDate(ruleInventory.getAvailableDate());
				list.get(Integer.parseInt(ruleInventory.getRuleKey())).setEndDate(ruleInventory.getEndDate());
				list.get(Integer.parseInt(ruleInventory.getRuleKey())).setEndTime(ruleInventory.getEndTime());
				list.get(Integer.parseInt(ruleInventory.getRuleKey())).setIsInstantConfirm(ruleInventory.isIsInstantConfirm());
				list.get(Integer.parseInt(ruleInventory.getRuleKey())).setOverBooking(ruleInventory.getOverBooking());
				list.get(Integer.parseInt(ruleInventory.getRuleKey())).setStartDate(ruleInventory.getStartDate());
				list.get(Integer.parseInt(ruleInventory.getRuleKey())).setStartTime(ruleInventory.getStartTime());
				list.get(Integer.parseInt(ruleInventory.getRuleKey())).setStatus(ruleInventory.isStatus());
			}
		}
		
	}
	private List<Inventory> getInentory(ProxyAccount proxyInfo,String hotelId,String hotelCodeString,String roomTypeId,Date startDate,Date endDate,boolean isNeedInstantConfirm,int orderFrom){
		
		// 仅提供昨天和近90天的房态数据
		int days = proxyInfo.getMaxDays() != null ? proxyInfo.getMaxDays() : 90;
		Date date= DateUtil.addDays(new Date(), -1);
		if (startDate.before(date)) {
			startDate = DateUtil.addDays(new Date(), -1);
		}
		if (endDate.after(DateUtil.addDays(new Date(), days))) {
			endDate = DateUtil.addDays(new Date(), days);
		}
		String[] shotelIdsUnderSupplier=null;
		if(StringUtils.isNotBlank(proxyInfo.getSupplier())){
			List<String> list=this.m_SRelationCache.getSupplierHotels(proxyInfo.getSupplier().trim().split(","));//获取供应商下的hotelcode
			if(list!=null){
				String tmp=StringUtils.join(list, ',');
				shotelIdsUnderSupplier=tmp.split(",");
			}
		}
		String[] mHotelIdArray = null;
		List<String[]> sHotelIdArrays = null;
		if (StringUtils.isNotBlank(hotelCodeString)) {
			mHotelIdArray = new String[] { hotelId };
			sHotelIdArrays = new ArrayList<String[]>();
			String[] hotelCodes=hotelCodeString.split(",");
			sHotelIdArrays.add(hotelCodes);
		} else {
			mHotelIdArray = hotelId.split(",");
			sHotelIdArrays = m_SRelationCache.getSHotelIds(mHotelIdArray);
		}
		//如果代理商有供应商限制，则只取其有权限的供应商下的s酒店
		if(shotelIdsUnderSupplier!=null){
			for(int i=0;i<mHotelIdArray.length;i++){
				String[] intersectHotelCode=ComparableUtil.intersect(sHotelIdArrays.get(i),shotelIdsUnderSupplier);
				sHotelIdArrays.set(i, intersectHotelCode);
			}
		}
		InventoryHotelIdTask inventoryTask=new InventoryHotelIdTask(mHotelIdArray,sHotelIdArrays,roomTypeId,startDate,endDate,isNeedInstantConfirm,inventoryDao);
		ForkJoinPool forkJoinPool = new ForkJoinPool();
		forkJoinPool.execute(inventoryTask);
		do {

		} while (!inventoryTask.isDone());
		
		forkJoinPool.shutdown();
		try {
			return inventoryTask.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
