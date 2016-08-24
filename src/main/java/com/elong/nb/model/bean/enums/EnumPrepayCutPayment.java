package com.elong.nb.model.bean.enums;

public enum EnumPrepayCutPayment {

    /// <summary>
    /// 金额
    /// </summary>
    Money(1),
    /// <summary>
    /// 比例
    /// </summary>
    Percent(2),
    /// <summary>
    /// 首晚
    /// </summary>
    FristNight(3);
    
    		private int intValue;
    	private static java.util.HashMap<Integer, EnumPrepayCutPayment> mappings;
    	private synchronized static java.util.HashMap<Integer, EnumPrepayCutPayment> getMappings()
    	{
    		if (mappings == null)
    		{
    			mappings = new java.util.HashMap<Integer, EnumPrepayCutPayment>();
    		}
    		return mappings;
    	}

    	private EnumPrepayCutPayment(int value)
    	{
    		intValue = value;
    		EnumPrepayCutPayment.getMappings().put(value, this);
    	}

    	public int getValue()
    	{
    		return intValue;
    	}

    	public static EnumPrepayCutPayment forValue(int value)
    	{
    		return getMappings().get(value);
    	}
}
