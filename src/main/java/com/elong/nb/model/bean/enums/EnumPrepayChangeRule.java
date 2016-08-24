package com.elong.nb.model.bean.enums;

public enum EnumPrepayChangeRule {
	/// <summary>
    /// 不允许变更取消
    /// </summary>
    PrepayNoChange(1),
    /// <summary>
    /// 允许变更/取消,在到店日24点之前N个小时
    /// </summary>
    PrepayNeedSomeDay(2),

    /// <summary>
    /// 允许变更/取消,在约定日期
    /// </summary>
    PrepayNeedOneTime(3);
    
    		private int intValue;
	private static java.util.HashMap<Integer, EnumPrepayChangeRule> mappings;
	private synchronized static java.util.HashMap<Integer, EnumPrepayChangeRule> getMappings()
	{
		if (mappings == null)
		{
			mappings = new java.util.HashMap<Integer, EnumPrepayChangeRule>();
		}
		return mappings;
	}

	private EnumPrepayChangeRule(int value)
	{
		intValue = value;
		EnumPrepayChangeRule.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static EnumPrepayChangeRule forValue(int value)
	{
		return getMappings().get(value);
	}
}
