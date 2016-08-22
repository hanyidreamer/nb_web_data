package com.elong.nb.model.bean.enums;

/** 
 付款类型
 
*/
public enum EnumPaymentType
{
	/** 
	 全部，仅用于检索
	 
	*/
	All(0),

	/** 
	 前台自付
	 
	*/
	SelfPay(1),
	/** 
	 预付
	 
	*/
	Prepay(2);

	private int intValue;
	private static java.util.HashMap<Integer, EnumPaymentType> mappings;
	private synchronized static java.util.HashMap<Integer, EnumPaymentType> getMappings()
	{
		if (mappings == null)
		{
			mappings = new java.util.HashMap<Integer, EnumPaymentType>();
		}
		return mappings;
	}

	private EnumPaymentType(int value)
	{
		intValue = value;
		EnumPaymentType.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static EnumPaymentType forValue(int value)
	{
		return getMappings().get(value);
	}
}