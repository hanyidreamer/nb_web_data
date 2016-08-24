package com.elong.nb.model.bean.enums;

/// <summary>
/// 促销规则代码
/// </summary>
public enum EnumDrrRuleCode {
	
	        None(0),

	        /// <summary>
	        /// 提前X天预订，每间晚优惠：金额M或比例N%
	        /// </summary>
	        DRRBookAhead(1),

	        /// <summary>
	        /// 连住X晚起，每间晚优惠：金额M或比例N%
	        /// </summary>
	        DRRStayPerRoomPerNight(2),

	        /// <summary>
	        /// 连住X晚起，最后Y晚优惠：金额M或比例N%
	        /// </summary>
	        DRRStayLastNight(3),

	        /// <summary>
	        /// 连住X晚起，第Y晚及以后优惠：金额M或比例N%
	        /// </summary>
	        DRRStayTheNightAndAfter(4),

	        /// <summary>
	        /// 每连住X晚起，最后Y晚优惠：金额M或比例N%
	        /// </summary>
	        DRRStayPerLastNight(5),

	        /// <summary>
	        /// 在店日期包含周X1……X7，订单按周末价或平日价结算
	        /// </summary>
	        DRRStayWeekDay(6),

	        /// <summary>
	        /// 在周X1至X7入住，订单按周末价或平日价结算
	        /// </summary>
	        DRRCheckInWeekDay(7);
	
	        private int intValue;
	       	private static java.util.HashMap<Integer, EnumDrrRuleCode> mappings;
	       	private synchronized static java.util.HashMap<Integer, EnumDrrRuleCode> getMappings()
	       	{
	       		if (mappings == null)
	       		{
	       			mappings = new java.util.HashMap<Integer, EnumDrrRuleCode>();
	       		}
	       		return mappings;
	       	}

	       	private EnumDrrRuleCode(int value)
	       	{
	       		intValue = value;
	       		EnumDrrRuleCode.getMappings().put(value, this);
	       	}

	       	public int getValue()
	       	{
	       		return intValue;
	       	}

	       	public static EnumDrrRuleCode forValue(int value)
	       	{
	       		return getMappings().get(value);
	       	}

}
