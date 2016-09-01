package com.elong.nb.repository;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.http.client.utils.DateUtils;

import com.elong.nb.model.rackrate.RackRateHotel;
import com.elong.nb.model.rackrate.RackRateRoomType;
import com.elong.nb.sql.SqlHelper;

public class RackRatesRepository {

	private static SqlHelper SqlHelper = new SqlHelper("conf/custom/env/jobjdbc.properties");
	
	public List<RackRateHotel> GetRackRates(String hotelIds)
    {
        hotelIds = "''" + hotelIds.replace(",", "'',''") + "''";
        String sql = String.format("usp_execute_sql_prod 'select HotelID HotelCode,RoomTypeID,BeginDate,EndDate,RackRate,CurrencyCode from RackRateInfo(NOLOCK) where HotelId in({1}) AND EndDate>=''{0}'''",DateUtils.formatDate(new Date(), "yyyy-MM-dd"), hotelIds);

        //var rackRooms = SqlHelper.ExecuteDataTable<RackRateRoomType>(sql);
        //List<RackRateHotel> rackHotels = rackRooms.GroupBy(room => room.HotelCode).Select(kv => new RackRateHotel { HotelCode = kv.Key, RoomTypes = kv.Select(hotel => hotel).ToList() }).ToList();
        
        HashMap<String,List<RackRateRoomType>> map = new HashMap<String,List<RackRateRoomType>>();
        List<RackRateHotel> rackHotels = new ArrayList<RackRateHotel>();
        List<RackRateRoomType> roomTypeList = new ArrayList<RackRateRoomType>();
        
        try
        {
	        Object[] params=null;
	        ResultSet rackRooms = SqlHelper.getResultSet(sql,params);
	        
	        while (rackRooms.next()) {
	        	
	           String HotelCode  = rackRooms.getString("HotelCode");
	           String RoomTypeID  = rackRooms.getString("RoomTypeID");
	           String BeginDate  = rackRooms.getString("BeginDate");
	           String EndDate  = rackRooms.getString("EndDate");
	           String RackRate  = rackRooms.getString("RackRate");
	           String CurrencyCode  = rackRooms.getString("CurrencyCode");
	           
	           RackRateRoomType roomType = new RackRateRoomType();
	    	   roomType.setHotelCode(HotelCode);
	    	   roomType.setRoomTypeID(RoomTypeID);
	    	   roomType.setBeginDate(DateUtils.parseDate(BeginDate,new String[]{"yyyy-MM-dd"}) );
	    	   roomType.setEndDate(DateUtils.parseDate(EndDate,new String[]{"yyyy-MM-dd"}) );
	    	   roomType.setRackRate(Double.parseDouble(RackRate));
	    	   roomType.setCurrencyCode(CurrencyCode);
	    	   
	           if(!map.containsKey(HotelCode))
	           {
	        	   roomTypeList = new ArrayList<RackRateRoomType>();
	        	   roomTypeList.add(roomType);
	        	   
	        	   map.put(HotelCode, roomTypeList);
	        	   
	        	   RackRateHotel hotel = new RackRateHotel();
	        	   hotel.setRoomTypes(roomTypeList);
	        	   rackHotels.add(hotel);
	           }
	           else
	           {
	        	   roomTypeList =  map.get(HotelCode);
	        	   roomTypeList.add(roomType);
	           }
	        }
        }
        catch(Exception e) {
        	
        }
        
        return rackHotels;
    }
	
}
