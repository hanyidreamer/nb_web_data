package com.elong.nb.model.bean.enums;

/// <summary>
/// 酒店礼品的日期类型
/// </summary>
public   enum HotelGiftDateTypeEnum
{ 
   /// <summary>
   /// 入住日
   /// </summary>
    CheckinDate(0), 
   /// <summary>
   /// 预订日
   /// </summary>
    BookingDate(1);

   /// <summary>
   /// 在店日期
   /// </summary>
   //StayDate = 2,
    
    		private int intValue;
	private static java.util.HashMap<Integer, HotelGiftDateTypeEnum> mappings;
	private synchronized static java.util.HashMap<Integer, HotelGiftDateTypeEnum> getMappings()
	{
		if (mappings == null)
		{
			mappings = new java.util.HashMap<Integer, HotelGiftDateTypeEnum>();
		}
		return mappings;
	}

	private HotelGiftDateTypeEnum(int value)
	{
		intValue = value;
		HotelGiftDateTypeEnum.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static HotelGiftDateTypeEnum forValue(int value)
	{
		return getMappings().get(value);
	}
	
}
