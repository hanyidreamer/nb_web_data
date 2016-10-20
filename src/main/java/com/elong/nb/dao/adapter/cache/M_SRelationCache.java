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
		return redis.hashMGet(RedisKeyConst.CacheKey_KEY_SupplierMap, supplier);
	}

	/**
	 * 获取hotelCode
	 * 
	 * @param mHotelIds
	 * @return
	 * @throws Exception 
	 */
	public List<String[]> getSHotelIds(String[] mHotelIds) throws Exception {
		List<String[]> result = new ArrayList<String[]>();
		List<String> rst = redis.hashMGet(RedisKeyConst.CacheKey_KEY_ID_M_S, mHotelIds);
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
