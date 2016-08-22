/**   
 * @(#)M_SRelationRepository.java	2016年5月31日	下午2:54:16	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.validator.Var;

import com.elong.nb.cache.ICacheKey;
import com.elong.nb.cache.RedisManager;
import com.elong.nb.common.util.CommonsUtil;

/**
 * (类型功能说明描述)
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2016年5月31日 下午2:54:16   Administrator     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		Administrator  
 * @version		1.0  
 * @since		JDK1.7
 */
public class M_SRelationRepository {
	private static final String KEY_SUPPLIER_MAP="data.hotel.supplier";
	private static final String KEY_ID_M_S="data.ms.mid_sid";
	private static final RedisManager redis=RedisManager.getInstance(null, null);
	
	
	public static List<String> getSupplierHotels(String[] supplier){
		List<String> supplierHotels=new ArrayList<String>();
		
		if(supplier!=null&&supplier.length>0){
			List<String>supplierList=Arrays.asList(supplier);
			for (String s : supplierList) {
				String sHotel = redis.hashGet(new ICacheKey() {

					@Override
					public String getKey() {
						return KEY_SUPPLIER_MAP;
					}

					@Override
					public int getExpirationTime() {
						return -1;
					}
				}, s);
				supplierHotels.add(sHotel);
			}
		}
		return supplierHotels;
	}
	
	/*
	 * 该方法有问题
	 * */
	public static List<String> getSHotelIds(String... mHotelIds){
		List<String> sHotelIds=new ArrayList();
		ICacheKey cacheKey=new ICacheKey() {
			
			@Override
			public String getKey() {
				return KEY_ID_M_S;
			}
			
			@Override
			public int getExpirationTime() {
				return -1;
			}
		};
		boolean keyExist=redis.exists(cacheKey);
		if(!keyExist){
			for (String mHotelId : mHotelIds) {
				sHotelIds.add(mHotelId);
			}
			return sHotelIds;
		}
		
		sHotelIds=redis.hashMGet(cacheKey, mHotelIds);
		
		return sHotelIds;
	}
}
