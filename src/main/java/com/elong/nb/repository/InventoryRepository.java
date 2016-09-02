/**   
 * @(#)InventoryRepository.java	2016年5月31日	下午1:45:59	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import com.elong.nb.common.ComparableUtil;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.util.CommonsUtil;
import com.elong.nb.model.inventory.InventoryCondition;
import com.elong.nb.model.inventory.bean.Inventory;

/**
 * (类型功能说明描述)
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2016年5月31日 下午1:45:59   Administrator     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		Administrator  
 * @version		1.0  
 * @since		JDK1.7
 */

@Repository
public class InventoryRepository {
	private static final long orderFrom5665=Long.parseLong(CommonsUtil.CONFIG_PROVIDAR.getProperty("OrderFrom5665"));
	private static final String supplier23284=CommonsUtil.CONFIG_PROVIDAR.getProperty("Supplier23284");
	
	public List<Inventory> getInventories(RestRequest<InventoryCondition>restRequest){
		List<Inventory>result=new ArrayList<Inventory>();
		//供应商过滤，准备指定供应商下的hotelCodes
		List<String> shotelIdsUnderSupplier=null;
		if(restRequest.getProxyInfo().getOrderFrom()==orderFrom5665&&StringUtils.isBlank(restRequest.getProxyInfo().getSupplier())){
			restRequest.getProxyInfo().setSupplier(supplier23284);
		}
		if(StringUtils.isNotBlank(restRequest.getProxyInfo().getSupplier())){
			 shotelIdsUnderSupplier=M_SRelationRepository.getSupplierHotels(restRequest.getProxyInfo().getSupplier().trim().split(","));
			
		}
		
		//仅提供昨天和最近90天的房态数据
		int days=restRequest.getProxyInfo().getMaxDays()<=90?restRequest.getProxyInfo().getMaxDays():90;
		if(restRequest.getRequest().getStartDate().before(getDate(-1))){
			restRequest.getRequest().setStartDate(getDate(-1));
		}
		if(restRequest.getRequest().getEndDate().after(getDate(days))){
			restRequest.getRequest().setEndDate(getDate(days));
		}
		class TempSMHotelId{
			private String SHotelId;
			private String MHotelId;
			public String getSHotelId() {
				return SHotelId;
			}
			public void setSHotelId(String sHotelId) {
				SHotelId = sHotelId;
			}
			public String getMHotelId() {
				return MHotelId;
			}
			public void setMHotelId(String mHotelId) {
				MHotelId = mHotelId;
			}
		}
		List<TempSMHotelId>hotelIdPairs=new ArrayList<TempSMHotelId>();
		if(StringUtils.isNotBlank(restRequest.getRequest().getHotelCodes())){
			String hotelCodeStr=restRequest.getRequest().getHotelCodes();
			List<String> hotelCodes=Arrays.asList(hotelCodeStr.split(","));
			if(shotelIdsUnderSupplier!=null){
				hotelCodes=ComparableUtil.intersect(hotelCodes, shotelIdsUnderSupplier);
			}
			for (String hotelCode : hotelCodes) {
				TempSMHotelId tempSMHotelId=new TempSMHotelId();
				tempSMHotelId.setSHotelId(hotelCode);
				tempSMHotelId.setMHotelId(restRequest.getRequest().getHotelIds());
				hotelIdPairs.add(tempSMHotelId);
			}
		}else {
			//有问题
			String[] mHotelIds=restRequest.getRequest().getHotelIds().split(",");
			List<String> sHotelIds=(List<String>) M_SRelationRepository.getSHotelIds(mHotelIds);
			for (int s = 0; s < mHotelIds.length; s++) {
				String mHotelId=mHotelIds[s];
				String sHotelId=sHotelIds.get(s);
				if(shotelIdsUnderSupplier!=null){
					//sHotelId=ComparableUtil.intersect(Arrays.asList(sHotelId), shotelIdsUnderSupplier);
				}
			}
		}
		
		return result;
	}
	
	public Date getDate(int days){
		Date now=new Date();
		Calendar calendar=new GregorianCalendar();
		calendar.setTime(now);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		calendar.add(calendar.DATE, days);
		return calendar.getTime();
	}
}
