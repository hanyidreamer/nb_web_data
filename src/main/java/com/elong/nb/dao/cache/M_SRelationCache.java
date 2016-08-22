package com.elong.nb.dao.cache;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSON;
import com.elong.nb.cache.ICacheKey;
import com.elong.nb.cache.RedisManager;
import com.mysql.jdbc.StringUtils;

@Repository
public class M_SRelationCache {
	private static final String KEY_SUPPLIER_MAP = "data.hotel.supplier";
	private static final String KEY_ID_M_S = "data.ms.mid_sid";

	// public List<String> getSupplierHotels(String[] supplier){
	// List<String> supplierHotels=new ArrayList<String>();
	//
	// if(supplier!=null&&supplier.length>0){
	// List<String>supplierList=Arrays.asList(supplier);
	// for (String s : supplierList) {
	// String sHotel = redis.hashGet(new ICacheKey() {
	//
	// @Override
	// public String getKey() {
	// return KEY_SUPPLIER_MAP;
	// }
	//
	// @Override
	// public int getExpirationTime() {
	// return -1;
	// }
	// }, s);
	// supplierHotels.add(sHotel);
	// }
	// }
	// return supplierHotels;
	// }

	/**
	 * 获取hotelCode
	 * 
	 * @param mHotelIds
	 * @return
	 */
	public List<String[]> getSHotelIds(String[] mHotelIds) {

		try {
			RedisManager redis = RedisManager.getInstance("redis_inventory",
					"redis_inventory");
			String[] mHotelIdStrs = new String[mHotelIds.length];
			for (int i = 0; i < mHotelIds.length; i++) {
				mHotelIdStrs[i] = "\"" + mHotelIds[i] + "\"";
			}
			List<String[]> result=new ArrayList<String[]>();
			List<String> rst = new ArrayList<String>();
			rst = redis.hashMGet(new ICacheKey() {
				@Override
				public String getKey() {
					return KEY_ID_M_S;
				}

				@Override
				public int getExpirationTime() {
					return 0;
				}
			}, mHotelIdStrs);
			for (int i = 0; i < mHotelIds.length; i++) {
				if (!StringUtils.isNullOrEmpty(rst.get(i))) {
					result.add(JSON.parseObject(rst.get(i), String[].class));
				}else{
					result.add(null);
				}
			}
			return result;
		} catch (Exception ex) {
			System.out.println(ex);
			return null;
		}
	}
}
