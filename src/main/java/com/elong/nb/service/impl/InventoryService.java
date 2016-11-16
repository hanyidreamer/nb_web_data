/**   
 * @(#)InventoryService.java	2016年5月30日	下午6:48:19	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.elong.nb.common.ComparableUtil;
import com.elong.nb.common.biglog.Constants;
import com.elong.nb.common.model.ProxyAccount;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.dao.adapter.cache.M_SRelationCache;
import com.elong.nb.dao.adapter.repository.InventoryRepository;
import com.elong.nb.dao.adapter.repository.InventoryRuleRepository;
import com.elong.nb.model.InventoryRuleHitCheckRealResponse;
import com.elong.nb.model.RuleInventoryRequest;
import com.elong.nb.model.RuleInventoryResponse;
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
				restRequest.getRequest().isIsNeedInstantConfirm(),restRequest.getProxyInfo().getOrderFrom(),false,restRequest.getGuid());
		result.setInventories(list);
		response.setResult(result);
		return response;
	}
	@Override
	public RestResponse<InventoryResult> getInventoriesForBooking(RestRequest<InventoryCondition> restRequest) throws Exception {
		RestResponse<InventoryResult> response = new RestResponse<InventoryResult>(
				restRequest.getGuid());
		InventoryResult result = new InventoryResult();
		List<Inventory> list= getInentory(restRequest.getProxyInfo(),restRequest.getRequest().getHotelIds(),restRequest.getRequest().getHotelCodes(),restRequest.getRequest().getRoomTypeId(),restRequest.getRequest().getStartDate(),restRequest.getRequest().getEndDate(),
				restRequest.getRequest().isIsNeedInstantConfirm(),restRequest.getProxyInfo().getOrderFrom(),true,restRequest.getGuid());
		result.setInventories(list);
		response.setResult(result);
		return response;
	}
	/**
	 * 需要规则验证的库存数据转换
	 * @param list
	 * @param needBlackListRuleCodes 
	 * @return
	 */
	private List<RuleInventoryRequest> toRuleInventory(List<Inventory> list, List<String> needBlackListRuleCodes){
		List<RuleInventoryRequest> result=new ArrayList<RuleInventoryRequest>();
		for(int index=0;index<list.size();index++){
			Inventory inventory=list.get(index);
			//过滤不在黑名单列表里的库存
			if(needBlackListRuleCodes.contains(inventory.getHotelCode())&&inventory.isStatus()){
				RuleInventoryRequest ruleInventory=new RuleInventoryRequest();
				ruleInventory.setHotelCode(inventory.getHotelCode());
				ruleInventory.setHotelID(inventory.getHotelID());
				ruleInventory.setRoomTypeID(inventory.getRoomTypeID());
				ruleInventory.setAvailableDate(inventory.getAvailableDate());
				ruleInventory.setRuleKey(String.valueOf(index));
				ruleInventory.setStartDate(inventory.getStartDate());
				ruleInventory.setEndDate(inventory.getEndDate());
				ruleInventory.setOverBooking(inventory.getOverBooking());
				result.add(ruleInventory);
			}
		}
		return result;
	}
	//合并黑名单数据
	private void convertToInventory(List<RuleInventoryResponse> ruleList,List<Inventory> list){
		if(ruleList!=null){
			for(RuleInventoryResponse ruleInventory:ruleList){
				list.get(Integer.parseInt(ruleInventory.getRuleKey())).setEndDate(ruleInventory.getEndDate());
				list.get(Integer.parseInt(ruleInventory.getRuleKey())).setOverBooking(ruleInventory.getOverBooking());
				list.get(Integer.parseInt(ruleInventory.getRuleKey())).setStartDate(ruleInventory.getStartDate());
				list.get(Integer.parseInt(ruleInventory.getRuleKey())).setStatus(ruleInventory.isStatus());
				if(!ruleInventory.isStatus()){
					list.get(Integer.parseInt(ruleInventory.getRuleKey())).setAvailableAmount(0);
				}
			}
		}
		
	}
	//获取库存
	private List<Inventory> getInentory(ProxyAccount proxyInfo,String hotelId,String hotelCodeString,String roomTypeId,Date startDate,Date endDate,boolean isNeedInstantConfirm,int orderFrom,boolean isForBooking,String guid) throws Exception{
		List<Inventory> result=new ArrayList<Inventory>();
		// 仅提供昨天和近90天的房态数据
		int days = proxyInfo.getMaxDays() != null ? proxyInfo.getMaxDays() : 90;
		Date date= DateUtil.addDays(new Date(), -1);
		if (startDate.getTime()<date.getTime()) {
			startDate = DateUtil.addDays(new Date(), -1);
		}
		if (endDate.getTime()>DateUtil.addDays(new Date(), days).getTime()) {
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
		} else{
			List<String> hotelIdList=ComparableUtil.convertDistinctList(Arrays.asList(hotelId.split(",")));
			String tmp=StringUtils.join(hotelIdList, ',');
			mHotelIdArray=tmp.split(",");
			sHotelIdArrays = m_SRelationCache.getSHotelIds(mHotelIdArray);
		}
		//如果代理商有供应商限制，则只取其有权限的供应商下的s酒店
		if(shotelIdsUnderSupplier!=null){
			for(int i=0;i<mHotelIdArray.length;i++){
				String[] intersectHotelCode=ComparableUtil.intersect(sHotelIdArrays.get(i),shotelIdsUnderSupplier);
				sHotelIdArrays.set(i, intersectHotelCode);
			}
		}
//		RequestAttributes httpRequest = RequestContextHolder.getRequestAttributes();
//		Object requestGUID=httpRequest!=null?httpRequest.getAttribute(Constants.ELONG_REQUEST_REQUESTGUID, ServletRequestAttributes.SCOPE_REQUEST):null;
//		String guid = requestGUID!=null?requestGUID.toString():"";
		InventoryHotelIdTask inventoryTask=new InventoryHotelIdTask(mHotelIdArray,sHotelIdArrays,roomTypeId,startDate,endDate,isNeedInstantConfirm,inventoryDao,guid,isForBooking);
		ForkJoinPool forkJoinPool = new ForkJoinPool();
		forkJoinPool.execute(inventoryTask);
		do {

		} while (!inventoryTask.isDone());
		
		forkJoinPool.shutdown();
		try {
			result= inventoryTask.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String,List<String>> hotelMap=new HashMap<String, List<String>>();
		for(int index=0;index<mHotelIdArray.length;index++){
			hotelMap.put(mHotelIdArray[index], Arrays.asList(sHotelIdArrays.get(index)));
		}
		if(result!=null&&result.size()>0){
			InventoryRuleHitCheckRealResponse hitRule=inventoryRuleRepository.getCheckInfo(hotelMap, orderFrom, isNeedInstantConfirm);
			List<String> needBlackListRuleCodes=hitRule.getNeedBlackListRuleCodes();
			List<RuleInventoryResponse> ruleListResult= null;
			if(needBlackListRuleCodes!=null&&needBlackListRuleCodes.size()>0){
				List<RuleInventoryRequest> ruleList=toRuleInventory(result,needBlackListRuleCodes);
				if(ruleList!=null&&ruleList.size()>0){
					ruleListResult= inventoryRuleRepository.convertInventoryWithRule(ruleList,proxyInfo.getOrderFrom(),isNeedInstantConfirm);
					convertToInventory(ruleListResult, result);
				}
			}
			List<String> hitInstantConfirmList=hitRule.getInstantConfirmCodes();
			if(isNeedInstantConfirm&&hitInstantConfirmList!=null&&hitInstantConfirmList.size()>0){
				if(result!=null&&result.size()>0){
					for(Inventory inv:result){
						if(inv.isIsInstantConfirm()){
							if(hitInstantConfirmList.contains(inv.getHotelCode())){
								inv.setIsInstantConfirm(false);
							}
						}
					}
				}
				
			}
		}
		return result;
	}
}
