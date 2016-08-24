package com.elong.nb.model.bean.enums;

public enum EnumDateType {

	/// <summary>
    /// 入住日期
    /// </summary>
    CheckInDay(1),

    /// <summary>
    /// 在店日期
    /// </summary>
    StayDay(2),

    /// <summary>
    /// 预订日期
    /// </summary>
    BookDay(3);

    private int intValue;
	private static java.util.HashMap<Integer, EnumDateType> mappings;
	private synchronized static java.util.HashMap<Integer, EnumDateType> getMappings()
	{
		if (mappings == null)
		{
			mappings = new java.util.HashMap<Integer, EnumDateType>();
		}
		return mappings;
	}

	private EnumDateType(int value)
	{
		intValue = value;
		EnumDateType.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static EnumDateType forValue(int value)
	{
		return getMappings().get(value);
	}

	
}
