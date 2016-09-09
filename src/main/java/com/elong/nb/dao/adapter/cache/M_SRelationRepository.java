/**   
 * @(#)M_SRelationRepository.java	2016年5月31日	下午2:54:16	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.dao.adapter.cache;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.elong.nb.agent.SupplierService.GetSupplierInfoBySupplierIDRequest;
import com.elong.nb.agent.SupplierService.GetSupplierInfoBySupplierIDResponse;
import com.elong.nb.agent.SupplierService.ISupplierServiceContract;
import com.elong.nb.cache.ICacheKey;
import com.elong.nb.cache.RedisManager;
import com.elong.nb.model.rateplan.MSHotelRelation;
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
	private static final String KEY_SUPPLIER_MAP="data.hotel.supplier";
	private static final String KEY_ID_M_S="data.ms.mid_sid";
	private static String KEY_ID_S_M = "data.ms.sid_mid";
	private static String KEY_Hotel_S_M = "data.hotel.sid_mid";
	private static final RedisManager redis=RedisManager.getInstance("redis_data", "redis_data");
	private static  Gson gson=new Gson();
	
	@Resource(name="supplierService")
    private ISupplierServiceContract supplierServiceContract;
	
	
	public static List<String> getSupplierHotels(String[] supplier){
		List<String> supplierHotels=new ArrayList<String>();
		
		if(supplier!=null&&supplier.length>0)
		{
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
		List<String> sHotelIds=new ArrayList<String>();
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
	
    
	public static List<String[]> GetSHotelIds(String... mHotelIds) {

		List<String[]> result = new ArrayList<String[]>();
		for(String str : mHotelIds)
		{
			CacheKEY_ID_M_S msKey = new CacheKEY_ID_M_S();
			msKey.setSuffixKey(str);
			
		   List<String> idList = new ArrayList<String>();
		   if(redis.getObj(msKey) !=null)
		   idList =(List<String>)(redis.getObj(msKey));
		   if(idList !=null && idList.size()>0)
		   {
			   String[] param = new String[idList.size()];
			   String[] idArray =(String[])(idList.toArray(param));
			   result.add(idArray);
		   }
		}
          return result;
	}
	
     
	public static MSHotelRelation GetHotelRelation(String sHotelId) {
		CacheKEY_Hotel_S_M mskey = new CacheKEY_Hotel_S_M();
		mskey.setSuffixKey(sHotelId);
		 if (!redis.exists(mskey))
         {
			 MSHotelRelation ms =new MSHotelRelation();
			 ms.setMHotelId(sHotelId);
			 ms.setSHotelId(sHotelId);
             return ms;
         }
		 
		 //取出来是序列化的JSon
		 String obj = redis.get(mskey);
		 if(obj==null || obj.isEmpty())
		 {
			 MSHotelRelation ms =new MSHotelRelation();
			 ms.setMHotelId(sHotelId);
			 ms.setSHotelId(sHotelId);
             return ms; 
		 }
		 
		 MSHotelRelation temp = gson.fromJson(obj, 
			     new TypeToken<MSHotelRelation>(){}.getType());
				  
         return temp;
	}
	
	public int GetCooperationTypeBySupplierID(int supplierID) {
		
		final String hotelKey="SupplierCooType_"+supplierID;
		ICacheKey cacheKey=new ICacheKey() {
			
			@Override
			public String getKey() {
				return hotelKey;
			}
			
			@Override
			public int getExpirationTime() {
				//24小时=86400秒
				return 86400;
			}
		};
		
		 //1为直签，2为非直签，0为未知
        int type = 1;

        try
        {
            String cooType = redis.get(cacheKey);
            if (cooType==null || cooType.isEmpty())
            {
            	GetSupplierInfoBySupplierIDRequest req = new GetSupplierInfoBySupplierIDRequest();
            	req.setSupplierID(supplierID);
                
                GetSupplierInfoBySupplierIDResponse response = supplierServiceContract.getSupplierInfoBySupplierID(req);
                
                if (response != null && response.getResult() != null && response.getResult().getResponseCode() == 0 && response.getSupplierBaseInfo()!=null)
                {
                    type = response.getSupplierBaseInfo().getCooperationType();
                }

                redis.put(cacheKey, type+"");
            }
            else
            {
                type = Integer.parseInt(cooType);
            }

        }
        catch(Exception e)
        {
        }

        return type;
	}
	
	private static final ICacheKey CacheKEY_ID_S_M=new ICacheKey() {
		
		@Override
		public String getKey() {
			return KEY_ID_S_M;
		}
		
		@Override
		public int getExpirationTime() {
			return -1;
		}
	};
	
	public String GetMHotelId(String sHotelID) {
		//KEY_ID_S_M
		String res = redis.hashGet(CacheKEY_ID_S_M, sHotelID);
	
	    if (res==null || res.isEmpty())
	    {
	        if (!redis.exists(CacheKEY_ID_S_M))
	        {
	            return sHotelID;
	        }
	        
	        res = sHotelID;
	    }
	
	    return res;	
	}

	public List<com.elong.nb.model.rateplan.MSRoomRelation> GetMSRoomRelation(String sHotelId) {
		
		//return redis.HGet<List<MSRoomRelation>>(KEY_RoomType_H_MS, sHotelId);
		
		CacheKEY_RoomType_H_MS cacheKey =new CacheKEY_RoomType_H_MS();
		  cacheKey.setSuffixKey(sHotelId);
		    
		  String res =  redis.get(cacheKey);
		  if(res !=null && !res.isEmpty())
		  {
			  try
			  {
				  List<com.elong.nb.model.rateplan.MSRoomRelation> temp = gson.fromJson(res, 
			     new TypeToken<List<com.elong.nb.model.rateplan.MSRoomRelation>>(){}.getType());
				  
			    return temp;
			
			  }catch(Exception ex){
				  
			  }
		  }
		  
		  return null;
	}

	
}

	class CacheKEY_Hotel_S_M implements ICacheKey{
		private static String KEY_Hotel_S_M = "data.hotel.sid_mid";
	
		private String suffixKey ;
		
		public String getSuffixKey() {
			return suffixKey;
		}
	
		public void setSuffixKey(String suffixKey) {
			this.suffixKey = suffixKey;
		}
	
		@Override
		public String getKey() {
			return KEY_Hotel_S_M + suffixKey;
		}
		
		@Override
		public int getExpirationTime() {
			return -1;
		}
	}

	class CacheKEY_RoomType_H_MS implements ICacheKey{
		
		private static String KEY_RoomType_H_MS = "data.room.shid_msid";
		
	    private String suffixKey ;
		
		public String getSuffixKey() {
			return suffixKey;
		}
	
		public void setSuffixKey(String suffixKey) {
			this.suffixKey = suffixKey;
		}
		
		@Override
		public String getKey() {
			return KEY_RoomType_H_MS + suffixKey;
		}
		
		@Override
		public int getExpirationTime() {
			return -1;
		}
	}
	
    class  CacheKEY_ID_M_S implements ICacheKey{
		
    	private static String KEY_ID_M_S = "data.ms.mid_sid";
    	
		private String suffixKey ;
		
		public String getSuffixKey() {
			return suffixKey;
		}
	
		public void setSuffixKey(String suffixKey) {
			this.suffixKey = suffixKey;
		}
		
		@Override
		public String getKey() {
			return KEY_ID_M_S+suffixKey;
		}
		
		@Override
		public int getExpirationTime() {
			return -1;
		}
	};
	
