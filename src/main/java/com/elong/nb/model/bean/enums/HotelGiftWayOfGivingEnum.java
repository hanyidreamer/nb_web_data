package com.elong.nb.model.bean.enums;

/// <summary>
/// 送礼品方式
/// </summary>
public enum HotelGiftWayOfGivingEnum
{
/// <summary>
/// 每间房送一回礼品
/// </summary>
    EveryRoom(0),

/// <summary>
    /// 每间房每个晚上送一回礼品
/// </summary>
    EveryRoomPerDay(1),
/// <summary>
/// 其它
/// </summary>

    Other(2);
    
    		private int intValue;
	private static java.util.HashMap<Integer, HotelGiftWayOfGivingEnum> mappings;
	private synchronized static java.util.HashMap<Integer, HotelGiftWayOfGivingEnum> getMappings()
	{
		if (mappings == null)
		{
			mappings = new java.util.HashMap<Integer, HotelGiftWayOfGivingEnum>();
		}
		return mappings;
	}

	private HotelGiftWayOfGivingEnum(int value)
	{
		intValue = value;
		HotelGiftWayOfGivingEnum.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static HotelGiftWayOfGivingEnum forValue(int value)
	{
		return getMappings().get(value);
	}
}
