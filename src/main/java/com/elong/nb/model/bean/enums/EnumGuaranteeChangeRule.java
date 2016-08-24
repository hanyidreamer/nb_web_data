package com.elong.nb.model.bean.enums;

public enum EnumGuaranteeChangeRule {

	 /// <summary>
    /// 不允许变更取消
    /// </summary>
    NoChange(1),
    /// <summary>
    /// 允许变更/取消,需在XX日YY时之前通知
    /// </summary>
    NeedSomeDay(2),
    /// <summary>
    /// 允许变更/取消,需在最早到店时间之前几小时通知
    /// </summary>
    NeedCheckinTime(3),
    /// <summary>
    /// 允许变更/取消,需在到店日期的24点之前
    /// </summary>
    NeedCheckin24hour(4);

    private int intValue;
	private static java.util.HashMap<Integer, EnumGuaranteeChangeRule> mappings;
	private synchronized static java.util.HashMap<Integer, EnumGuaranteeChangeRule> getMappings()
	{
		if (mappings == null)
		{
			mappings = new java.util.HashMap<Integer, EnumGuaranteeChangeRule>();
		}
		return mappings;
	}

	private EnumGuaranteeChangeRule(int value)
	{
		intValue = value;
		EnumGuaranteeChangeRule.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static EnumGuaranteeChangeRule forValue(int value)
	{
		return getMappings().get(value);
	}

}
