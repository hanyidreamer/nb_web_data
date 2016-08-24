package com.elong.nb.model.bean.enums;

/// <summary>
/// 单价选项
/// </summary>

public enum EnumValueAddPriceOption {
	 /// <summary>
    /// 无
    /// </summary>
    None(0),
    /// <summary>
    /// 金额
    /// </summary>
    Money(1),

    /// <summary>
    /// 比例
    /// </summary>
    Percent(2);
    
    		private int intValue;
	private static java.util.HashMap<Integer, EnumValueAddPriceOption> mappings;
	private synchronized static java.util.HashMap<Integer, EnumValueAddPriceOption> getMappings()
	{
		if (mappings == null)
		{
			mappings = new java.util.HashMap<Integer, EnumValueAddPriceOption>();
		}
		return mappings;
	}

	private EnumValueAddPriceOption(int value)
	{
		intValue = value;
		EnumValueAddPriceOption.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static EnumValueAddPriceOption forValue(int value)
	{
		return getMappings().get(value);
	}
}
