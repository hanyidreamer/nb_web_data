package com.elong.nb.model.bean.enums;

/// <summary>
/// 价格类型
/// </summary>
public enum EnumDrrFeeType
{
    /// <summary>
    /// 周末价格
    /// </summary>
    WeekendFee(1),

    /// <summary>
    /// 平日价格
    /// </summary>
    WeekdayFee(2);
    
    private int intValue;
	private static java.util.HashMap<Integer, EnumDrrFeeType> mappings;
	private synchronized static java.util.HashMap<Integer, EnumDrrFeeType> getMappings()
	{
		if (mappings == null)
		{
			mappings = new java.util.HashMap<Integer, EnumDrrFeeType>();
		}
		return mappings;
	}

	private EnumDrrFeeType(int value)
	{
		intValue = value;
		EnumDrrFeeType.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static EnumDrrFeeType forValue(int value)
	{
		return getMappings().get(value);
	}

}
