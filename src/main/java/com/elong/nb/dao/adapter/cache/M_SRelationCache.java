package com.elong.nb.dao.adapter.cache;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSON;
import com.elong.nb.agent.SupplierService.GetSupplierInfoBySupplierIDRequest;
import com.elong.nb.agent.SupplierService.GetSupplierInfoBySupplierIDResponse;
import com.elong.nb.agent.SupplierService.ISupplierServiceContract;
import com.elong.nb.cache.ICacheKey;
import com.elong.nb.cache.RedisManager;
import com.elong.nb.common.model.RedisKeyConst;
import com.elong.nb.model.rateplan.MSHotelRelation;
import com.elong.nb.model.rateplan.MSRoomRelation;
import com.elong.nb.model.rateplan.NB_M_SRelation;
import com.mysql.jdbc.StringUtils;

@Repository
public class M_SRelationCache {

	private static final RedisManager redis = RedisManager.getInstance("redis_job", "redis_job");
	private static Logger LocalMsg = LogManager.getLogger(M_SRelationCache.class);
	@Resource(name = "supplierService")
	private ISupplierServiceContract supplierServiceContract;
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
	public List<String[]> getSHotelIds(String[] mHotelIds){
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
	public MSHotelRelation getHotelRelation(String sHotelId) {
		ICacheKey cacheKey = RedisKeyConst.CacheKey_KEY_Hotel_S_M;
		if (!redis.exists(cacheKey)) {
			MSHotelRelation ms = new MSHotelRelation();
			ms.setMHotelId(sHotelId);
			ms.setSHotelId(sHotelId);
			return ms;
		}

		// 取出来是序列化的JSon
		String str = redis.hashGet(cacheKey, sHotelId);
		if (StringUtils.isNullOrEmpty(str)) {
			MSHotelRelation ms = new MSHotelRelation();
			ms.setMHotelId(sHotelId);
			ms.setSHotelId(sHotelId);
			return ms;
		}
		NB_M_SRelation nbMSRelation = JSON.parseObject(str, NB_M_SRelation.class);

		MSHotelRelation temp = new MSHotelRelation();
		temp.setMHotelId(nbMSRelation.getMHotelID());
		temp.setSHotelId(nbMSRelation.getSHotelID());
		temp.setSupplierId(nbMSRelation.getSSupplierID());
		return temp;
	}

	public int getCooperationTypeBySupplierID(int supplierID) {
		String hotelKey = String.format(RedisKeyConst.KEY_SupplierCooType, supplierID);
		ICacheKey cacheKey = RedisManager.getCacheKey(hotelKey, 24 * 3600);// 24小时=86400秒
		// 1为直签，2为非直签，0为未知
		int type = 1;
		try {
			String cooType = redis.get(cacheKey);
			if (cooType == null || cooType.isEmpty()) {
				GetSupplierInfoBySupplierIDRequest req = new GetSupplierInfoBySupplierIDRequest();
				req.setSupplierID(supplierID);
				GetSupplierInfoBySupplierIDResponse response = supplierServiceContract.getSupplierInfoBySupplierID(req);
				if (response != null && response.getResult() != null && response.getResult().getResponseCode() == 0
						&& response.getSupplierBaseInfo() != null) {
					type = response.getSupplierBaseInfo().getCooperationType();
				}
				redis.put(cacheKey, type + "");
			} else {
				type = Integer.parseInt(cooType);
			}
		} catch (Exception e) {
			LocalMsg.error(e.getMessage());
		}
		return type;
	}

	public String GetMHotelId(String sHotelID) {
		String res = redis.hashGet(RedisKeyConst.CacheKey_KEY_ID_S_M, sHotelID);
		if (res == null || res.isEmpty()) {
			if (!redis.exists(RedisKeyConst.CacheKey_KEY_ID_S_M)) {
				return sHotelID;
			}
			res = sHotelID;
		}
		return res;
	}

	public List<MSRoomRelation> getMSRoomRelation(String sHotelId) {
		String res = redis.hashGet(RedisKeyConst.CacheKey_KEY_RoomType_H_MS, sHotelId);
		if (!StringUtils.isNullOrEmpty(res)) {
			try {
				return JSON.parseArray(res, MSRoomRelation.class);
			} catch (Exception ex) {
				LocalMsg.error(ex.getMessage());
			}
		}
		return null;
	}
}
