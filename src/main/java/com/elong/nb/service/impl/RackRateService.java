package com.elong.nb.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.httpclient.util.DateUtil;
import org.springframework.stereotype.Service;

import com.elong.nb.cache.ICacheKey;
import com.elong.nb.cache.RedisManager;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.model.rackrate.RackRateHotel;
import com.elong.nb.model.rackrate.RackRateRequest;
import com.elong.nb.model.rackrate.RackRateResponse;
import com.elong.nb.model.rackrate.RackRateRoomType;
import com.elong.nb.repository.RackRatesRepository;
import com.elong.nb.service.IRackRateService;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

@Service
public class RackRateService implements IRackRateService {

	private static final RedisManager redis=RedisManager.getInstance("redis_data", "redis_data");
	private static  Gson gson=new Gson();
	
	@Resource 
	RackRatesRepository rackRatesRepository;
	
	private static String KEY_RackRateRecordsSet = "Data.RackRate.Record";
	
	class KEY_RackRate_RecordsSet implements ICacheKey{
		
		private String suffixKey ;
		
		public String getSuffixKey() {
			return suffixKey;
		}

		public void setSuffixKey(String suffixKey) {
			this.suffixKey = suffixKey;
		}
		
		@Override
		public String getKey() {
			return KEY_RackRateRecordsSet+suffixKey;
		}
		
		//7天=604800秒
		@Override
		public int getExpirationTime() {
			return 604800;
		}
	};
	
	
	
	
	@Override
	public RestResponse<RackRateResponse> GetRackRates(RestRequest<RackRateRequest> request) 
	{
		
        //if (!redis.exists(KEY_RackRate_RecordsSet))
        {
        	//redis.hashPut(KEY_RackRate_RecordsSet, "-1", "-1");
        	//有效期7天
        	//redis.Expire(KEY_RackRate_RecordsSet, DateTime.Now.AddDays(7));
        }

        String[] hotelCodes = request.getRequest().getHotelCodes().split(",");
        //List<RackRateHotel> rackHotels = redis.HMGet<string, List<RackRateRoomType>>(KEY_RackRate_RecordsSet, hotelCodes).Where(rooms => rooms != null).Select(rooms => new RackRateHotel { HotelCode = rooms.First().HotelCode, RoomTypes = rooms }).ToList(); ;
        List<RackRateHotel> rackHotels = new ArrayList<RackRateHotel>();
		for(String hcode : hotelCodes)
		{
			KEY_RackRate_RecordsSet key = new KEY_RackRate_RecordsSet();
	    	   key.setSuffixKey(hcode);
	    	   
	    	   //gson.fromJson(redis.get(HOTEL_HOTELIMAGES), new TypeToken<List<HotelImg>>() {}.getType())
	    	   
	    	   List<RackRateRoomType> roomTypeList = gson.fromJson(redis.get(key), new TypeToken<List<RackRateRoomType>>() {
			}.getType());
	    	   
	    	   RackRateHotel hotel = new RackRateHotel();
	    	   hotel.setHotelCode(hcode);
	    	   hotel.setRoomTypes(roomTypeList);
	    	   rackHotels.add(hotel); 
		}
		
        if (rackHotels.size() != hotelCodes.length)
        {
            rackHotels =rackRatesRepository.GetRackRates(request.getRequest().getHotelCodes());
            //redis.HMSet(KEY_RackRate_RecordsSet, rackHotels.Select(item => item.HotelCode).ToArray(), rackHotels.Select(item => item.RoomTypes).ToArray());
	       for (RackRateHotel hotel : rackHotels)
	       {
	    	   KEY_RackRate_RecordsSet key = new KEY_RackRate_RecordsSet();
	    	   key.setSuffixKey(hotel.getHotelCode());
	            redis.put(key, hotel.getRoomTypes());
	       }
        }

        /*
        rackHotels.ForEach(hotel =>
        {
            hotel.RoomTypes.ForEach(room =>
            {
                if (room.EndDate > DateTime.Now.Date.AddYears(1))
                {
                    room.EndDate = DateTime.Now.Date.AddYears(1);
                }
            });
        } */
        for( RackRateHotel hotel :rackHotels)
        {
        	for(RackRateRoomType room : hotel.getRoomTypes())
        	{
        		Calendar cal = Calendar.getInstance();
        		cal.add(Calendar.DATE, 1);
        		
        		if(DateUtil.formatDate(room.getEndDate(), "yyyy-MM-dd").
        				compareTo(DateUtil.formatDate(cal.getTime(), "yyyy-MM-dd"))>0)
        		{
        			room.setEndDate(cal.getTime());
        		}
        	}
        }

        RestResponse<RackRateResponse> response = new RestResponse<RackRateResponse>(request.getGuid());
        RackRateResponse  rackResponse = new RackRateResponse();
        rackResponse.setRackRates(rackHotels);   
        response.setResult(rackResponse); 
        
        return response;
    }

	
	
	
	
	
}
