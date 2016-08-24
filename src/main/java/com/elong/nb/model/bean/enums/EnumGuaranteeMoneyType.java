package com.elong.nb.model.bean.enums;

public enum EnumGuaranteeMoneyType {

	 /// <summary>
    /// 首晚房费担保
    /// </summary>
    FirstNightCost(1),

    /// <summary>
    /// 全额房费担保
    /// </summary>
    FullNightCost(2);
    
    private int intValue;
	private static java.util.HashMap<Integer, EnumGuaranteeMoneyType> mappings;
	private synchronized static java.util.HashMap<Integer, EnumGuaranteeMoneyType> getMappings()
	{
		if (mappings == null)
		{
			mappings = new java.util.HashMap<Integer, EnumGuaranteeMoneyType>();
		}
		return mappings;
	}

	private EnumGuaranteeMoneyType(int value)
	{
		intValue = value;
		EnumGuaranteeMoneyType.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static EnumGuaranteeMoneyType forValue(int value)
	{
		return getMappings().get(value);
	}

}
