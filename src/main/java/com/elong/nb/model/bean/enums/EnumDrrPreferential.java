package com.elong.nb.model.bean.enums;

/// <summary>
///优惠类型
/// </summary>
public enum EnumDrrPreferential
{
    /// <summary>
    /// 金额
    /// </summary>
    Cash(1),

    /// <summary>
    /// 比例
    /// </summary>
    Scale(2);
    
    private int intValue;
   	private static java.util.HashMap<Integer, EnumDrrPreferential> mappings;
   	private synchronized static java.util.HashMap<Integer, EnumDrrPreferential> getMappings()
   	{
   		if (mappings == null)
   		{
   			mappings = new java.util.HashMap<Integer, EnumDrrPreferential>();
   		}
   		return mappings;
   	}

   	private EnumDrrPreferential(int value)
   	{
   		intValue = value;
   		EnumDrrPreferential.getMappings().put(value, this);
   	}

   	public int getValue()
   	{
   		return intValue;
   	}

   	public static EnumDrrPreferential forValue(int value)
   	{
   		return getMappings().get(value);
   	}
}
