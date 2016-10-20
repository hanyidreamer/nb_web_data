/**   
 * @(#)M_SRelationRepository.java	2016年5月31日	下午2:54:16	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.dao.adapter.cache;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
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
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

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

@Repository
public class M_SRelationRepository {

	private static final RedisManager redis = RedisManager.getInstance("redis_data", "redis_data");

	private static Gson gson = new Gson();

	private static Logger LocalMsg = LogManager.getLogger(M_SRelationRepository.class);

	@Resource(name = "supplierService")
	private ISupplierServiceContract supplierServiceContract;

	public static List<String> getSupplierHotels(String[] supplier) {
		List<String> supplierHotels = new LinkedList<String>();
		if (supplier != null && supplier.length > 0) {
			List<String> supplierList = Arrays.asList(supplier);
			for (String s : supplierList) {
				String sHotel = redis.hashGet(RedisKeyConst.CacheKey_KEY_SupplierMap, s);
				supplierHotels.add(sHotel);
			}
		}
		return supplierHotels;
	}

	@SuppressWarnings("serial")
	public static List<String[]> GetSHotelIds(String... mHotelIds) {
		List<String[]> result = new LinkedList<String[]>();
		List<String> valueList = redis.hashMGet(RedisKeyConst.CacheKey_KEY_ID_M_S, mHotelIds);
		for (String str : valueList) {
			if (str != null && !str.isEmpty()) {
				String[] t = gson.fromJson(str, new TypeToken<String[]>() {
				}.getType());
				result.add(t);
			}
		}
		return result;
	}

	public static MSHotelRelation GetHotelRelation(String sHotelId) {
		ICacheKey cacheKey = RedisKeyConst.CacheKey_KEY_Hotel_S_M;
		if (!redis.exists(cacheKey)) {
			MSHotelRelation ms = new MSHotelRelation();
			ms.setMHotelId(sHotelId);
			ms.setSHotelId(sHotelId);
			return ms;
		}

		// 取出来是序列化的JSon
		String str = redis.hashGet(cacheKey, sHotelId);
		if (StringUtils.isEmpty(str)) {
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

	public int GetCooperationTypeBySupplierID(int supplierID) {
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

	public List<MSRoomRelation> GetMSRoomRelation(String sHotelId) {
		String res = redis.hashGet(RedisKeyConst.CacheKey_KEY_RoomType_H_MS, sHotelId);
		if (StringUtils.isNotEmpty(res)) {
			try {
				return JSON.parseArray(res, MSRoomRelation.class);
			} catch (Exception ex) {
				LocalMsg.error(ex.getMessage());
			}
		}
		return null;
	}

}