package com.elong.nb.model.bean.enums;

/// <summary>
/// 送礼品时间点类型
/// </summary>
public enum HotelGiftHourTypeEnum
{
/// <summary>
/// 全天24小时都可以送礼品
/// </summary>
    Hours24(0),

/// <summary>
/// **点之前送礼品
/// </summary>
    XHourBefore(1),

/// <summary>
    ///  **点之后送礼品
/// </summary>
    XHourAfter(2);
    
    private int intValue;
	private static java.util.HashMap<Integer, HotelGiftHourTypeEnum> mappings;
	private synchronized static java.util.HashMap<Integer, HotelGiftHourTypeEnum> getMappings()
	{
		if (mappings == null)
		{
			mappings = new java.util.HashMap<Integer, HotelGiftHourTypeEnum>();
		}
		return mappings;
	}

	private HotelGiftHourTypeEnum(int value)
	{
		intValue = value;
		HotelGiftHourTypeEnum.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static HotelGiftHourTypeEnum forValue(int value)
	{
		return getMappings().get(value);
	}

}