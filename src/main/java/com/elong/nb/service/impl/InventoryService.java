/**   
 * @(#)InventoryService.java	2016年5月30日	下午6:48:19	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.elong.nb.common.ComparableUtil;
import com.elong.nb.common.model.ProxyAccount;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.common.util.CommonsUtil;
import com.elong.nb.common.util.HowSwitchUtil;
import com.elong.nb.dao.adapter.cache.M_SRelationCache;
import com.elong.nb.dao.adapter.repository.InventoryRepository;
import com.elong.nb.model.bean.Inventory;
import com.elong.nb.model.inventory.InventoryCondition;
import com.elong.nb.model.inventory.InventoryResult;
import com.elong.nb.model.ms.MSHotelIdRelation;
import com.elong.nb.service.IInventoryService;
import com.elong.nb.service.task.InventoryTask;
import com.elong.nb.util.DateUtil;

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
public class InventoryService implements IInventoryService {

	@Resource
	private M_SRelationCache m_SRelationCache;
	@Resource
	private InventoryRepository inventoryRepository;

	private static final int invThreadSize = Integer.valueOf(CommonsUtil.CONFIG_PROVIDAR.getProperty("inv.thread.size"));

	/** 
	 * 获得库存接口 
	 *
	 * @param request
	 * @return 
	 * @throws Exception 
	 * @see com.elong.nb.service.IInventoryService#getInventories(com.elong.nb.common.model.RestRequest)    
	 */
	@Override
	public RestResponse<InventoryResult> getInventories(RestRequest<InventoryCondition> restRequest, ProxyAccount proxyAccount)
			throws Exception {
		RestResponse<InventoryResult> response = new RestResponse<InventoryResult>(restRequest.getGuid());
		InventoryResult result = new InventoryResult();
		List<Inventory> list = null;

		int invFrom = HowSwitchUtil.getValue("inv.from", Integer.class, 1);
		if (invFrom == 1) {
			list = getInentory(proxyAccount, restRequest.getRequest().getHotelIds(), restRequest.getRequest().getHotelCodes(), restRequest
					.getRequest().getRoomTypeId(), restRequest.getRequest().getStartDate(), restRequest.getRequest().getEndDate(),
					restRequest.getRequest().isIsNeedInstantConfirm(), restRequest.getGuid());
		} else {
			list = getInentory(proxyAccount, restRequest.getRequest().getHotelIds(), restRequest.getRequest().getHotelCodes(), restRequest
					.getRequest().getRoomTypeId(), restRequest.getRequest().getStartDate(), restRequest.getRequest().getEndDate(),
					restRequest.getRequest().isIsNeedInstantConfirm(), proxyAccount.getOrderFrom(), false, restRequest.getGuid());
		}
		result.setInventories(list);
		response.setResult(result);
		return response;
	}

	/**
	 * 获取产品组库存
	 * @param proxyInfo
	 * @param hotelId
	 * @param hotelCodeString
	 * @param roomTypeId
	 * @param startDate
	 * @param endDate
	 * @param isNeedInstantConfirm
	 * @param orderFrom
	 * @param isForBooking
	 * @param guid
	 * @return
	 * @throws Exception
	 */
	private List<Inventory> getInentory(ProxyAccount proxyInfo, String hotelId, String hotelCodeString, String roomTypeId, Date startDate,
			Date endDate, boolean isNeedInstantConfirm, int orderFrom, boolean isForBooking, String guid) throws Exception {
		List<Inventory> result = new ArrayList<Inventory>();
		// 仅提供昨天和近90天的房态数据
		int days = proxyInfo.getMaxDays() != null ? proxyInfo.getMaxDays() : 90;
		Date date = DateUtil.getDate(DateUtil.addDays(new Date(), -1));
		if (startDate.getTime() < date.getTime()) {
			startDate = DateUtil.getDate(DateUtil.addDays(new Date(), -1));
		}
		if (endDate.getTime() > DateUtil.getDate(DateUtil.addDays(new Date(), days)).getTime()) {
			endDate = DateUtil.getDate(DateUtil.addDays(new Date(), days));
		}
		String[] mHotelIdArray = null;
		List<String[]> sHotelIdArrays = null;
		if (StringUtils.isNotBlank(hotelCodeString)) {
			mHotelIdArray = new String[] { hotelId };
			sHotelIdArrays = new ArrayList<String[]>();
			String[] hotelCodes = hotelCodeString.trim().split(",");
			sHotelIdArrays.add(hotelCodes);
		} else {
			List<String> hotelIdList = ComparableUtil.convertDistinctList(Arrays.asList(hotelId.split(",")));
			String tmp = StringUtils.join(hotelIdList, ',');
			mHotelIdArray = tmp.split(",");
			sHotelIdArrays = m_SRelationCache.getSHotelIds(mHotelIdArray);
		}

		List<MSHotelIdRelation> relationList = new LinkedList<MSHotelIdRelation>();
		for (int i = 0; i < mHotelIdArray.length; i++) {
			if (sHotelIdArrays.get(i) != null) {
				String[] hotelCodes = sHotelIdArrays.get(i);
				for (String hotelCode : hotelCodes) {
					MSHotelIdRelation relation = new MSHotelIdRelation();
					relation.setHotelId(mHotelIdArray[i]);
					relation.setHotelCode(hotelCode);
					relationList.add(relation);
				}
			}
		}
		if (relationList.size() <= invThreadSize) {
			for (MSHotelIdRelation relation : relationList) {
				try {
					List<Inventory> list = this.inventoryRepository.getInventorys(relation.getHotelId(), relation.getHotelCode(),
							roomTypeId, startDate, endDate, isNeedInstantConfirm, isForBooking, guid);
					if (list != null && list.size() > 0) {
						result.addAll(list);
					}
				} catch (Exception ex) {
					throw new RuntimeException("Inner Exception: InventoryTaskException:", ex);
				}
			}
		} else {
			InventoryTask inventoryTask = new InventoryTask(relationList, roomTypeId, startDate, endDate, isNeedInstantConfirm,
					inventoryRepository, guid, isForBooking);
			ForkJoinPool forkJoinPool = new ForkJoinPool();
			forkJoinPool.execute(inventoryTask);
			do {

			} while (!inventoryTask.isDone());

			forkJoinPool.shutdown();
			try {
				result = inventoryTask.get();
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 获取库存 商品库
	 * @param proxyInfo
	 * @param hotelId
	 * @param hotelCodeString
	 * @param roomTypeId
	 * @param startDate
	 * @param endDate
	 * @param isNeedInstantConfirm
	 * @param guid
	 * @return
	 * @throws Exception
	 */
	private List<Inventory> getInentory(ProxyAccount proxyInfo, String hotelId, String hotelCodeString, String roomTypeId, Date startDate,
			Date endDate, boolean isNeedInstantConfirm, String guid) throws Exception {
		// 仅提供昨天和近90天的房态数据
		int days = proxyInfo.getMaxDays() != null ? proxyInfo.getMaxDays() : 90;
		Date date = DateUtil.getDate(DateUtil.addDays(new Date(), -1));
		if (startDate.getTime() < date.getTime()) {
			startDate = DateUtil.getDate(DateUtil.addDays(new Date(), -1));
		}
		if (endDate.getTime() > DateUtil.getDate(DateUtil.addDays(new Date(), days)).getTime()) {
			endDate = DateUtil.getDate(DateUtil.addDays(new Date(), days));
		}
		if (StringUtils.isNotEmpty(hotelId)) {
			hotelId = hotelId.replaceAll(" ", "");
		}
		String[] mHotelIdArray = null;
		List<String[]> sHotelIdArrays = new ArrayList<String[]>();
		if (StringUtils.isNotBlank(hotelCodeString)) {
			hotelCodeString = hotelCodeString.replaceAll(" ", "");
			mHotelIdArray = new String[] { hotelId };
			String[] hotelCodes = hotelCodeString.split(",");
			sHotelIdArrays.add(hotelCodes);
		} else {
			List<String> hotelIdList = ComparableUtil.convertDistinctList(Arrays.asList(hotelId.split(",")));
			String tmp = StringUtils.join(hotelIdList, ',');
			mHotelIdArray = tmp.split(",");
			for (int i = 0; i < mHotelIdArray.length; i++) {
				sHotelIdArrays.add(new String[] {});
			}
		}
		Map<String, List<String>> hotelMap = new HashMap<String, List<String>>();
		for (int index = 0; index < mHotelIdArray.length; index++) {
			hotelMap.put(mHotelIdArray[index], Arrays.asList(sHotelIdArrays.get(index)));
		}
		List<String> roomTypeIds = null;
		if (!StringUtils.isBlank(roomTypeId)) {
			roomTypeIds = Arrays.asList(roomTypeId.split(","));
		}
		return inventoryRepository.getInventorys(hotelMap, roomTypeIds, startDate, endDate, isNeedInstantConfirm, proxyInfo.getOrderFrom(),
				guid);
	}
}
