package com.elong.nb.model.bean.enums;

public enum EnumBookingRule {
	
	           NoneRule(0),

		        /// <summary>
		        /// 务必提供客人国籍
		        /// </summary>
		        NeedNationality(1),

		        /// <summary>
		        /// 您预订了N间房，请您提供不少于N的入住客人姓名 
		        /// </summary>
		        PerRoomPerName(2),

		        /// <summary>
		        /// 此酒店要求外宾务必留英文拼写
		        /// </summary>
		        ForeignerNeedEnName(3),

		        /// <summary>
		        /// 几点到几点酒店不接受预订 , 此处校验的是下单时的预订时间
		        /// </summary>
		        RejectCheckinTime(4),

		        /// <summary>
		        /// 务必提供客人手机号(请加在联系人结点Contact上)
		        /// </summary>
		        NeedPhoneNo(5);
		        
		        private int intValue;
		private static java.util.HashMap<Integer, EnumBookingRule> mappings;
		private synchronized static java.util.HashMap<Integer, EnumBookingRule> getMappings()
		{
			if (mappings == null)
			{
				mappings = new java.util.HashMap<Integer, EnumBookingRule>();
			}
			return mappings;
		}

		private EnumBookingRule(int value)
		{
			intValue = value;
			EnumBookingRule.getMappings().put(value, this);
		}

		public int getValue()
		{
			return intValue;
		}

		public static EnumBookingRule forValue(int value)
		{
			return getMappings().get(value);
		}

}
