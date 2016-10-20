package com.elong.nb.dao.adapter.cache;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSON;
import com.elong.nb.cache.RedisManager;
import com.elong.nb.common.model.RedisKeyConst;
import com.mysql.jdbc.StringUtils;

@Repository
public class M_SRelationCache {

	private RedisManager redis = RedisManager.getInstance("redis_msrelation", "redis_msrelation");

	public List<String> getSupplierHotels(String[] supplier) {
		List<String> supplierHotels = new ArrayList<String>();
		if (supplier != null && supplier.length > 0) {
			for (int i = 0; i < supplier.length; i++) {
				supplier[i] = "\"" + supplier[i] + "\"";
			}
		}
		supplierHotels = redis.hMGet(String.class, RedisKeyConst.CacheKey_KEY_SupplierMap, supplier);
		return supplierHotels;
	}

	/**
	 * 获取hotelCode
	 * 
	 * @param mHotelIds
	 * @return
	 * @throws Exception 
	 */
	public List<String[]> getSHotelIds(String[] mHotelIds) throws Exception {
		String[] mHotelIdStrs = new String[mHotelIds.length];
		for (int i = 0; i < mHotelIds.length; i++) {
			mHotelIdStrs[i] = "\"" + mHotelIds[i] + "\"";
		}
		List<String[]> result = new ArrayList<String[]>();
		List<String> rst = new ArrayList<String>();
		rst = redis.hashMGet(RedisKeyConst.CacheKey_KEY_ID_M_S, mHotelIdStrs);
		for (int i = 0; i < mHotelIds.length; i++) {
			if (!StringUtils.isNullOrEmpty(rst.get(i))) {
				result.add(JSON.parseObject(rst.get(i), String[].class));
			} else {
				result.add(new String[] {});
			}
		}
		return result;
	}
}
