package com.elong.nb.model.bean.enums;

public enum EnumInvoiceMode {
	       NoSense(0),
	        /// <summary>
	        /// 艺龙开发票
	        /// </summary>
	        Elong(1),

	        /// <summary>
	        /// 酒店开发票
	        /// </summary>
	        Hotel(2);
	        
	        private int intValue;
	   	private static java.util.HashMap<Integer, EnumInvoiceMode> mappings;
	   	private synchronized static java.util.HashMap<Integer, EnumInvoiceMode> getMappings()
	   	{
	   		if (mappings == null)
	   		{
	   			mappings = new java.util.HashMap<Integer, EnumInvoiceMode>();
	   		}
	   		return mappings;
	   	}

	   	private EnumInvoiceMode(int value)
	   	{
	   		intValue = value;
	   		EnumInvoiceMode.getMappings().put(value, this);
	   	}

	   	public int getValue()
	   	{
	   		return intValue;
	   	}

	   	public static EnumInvoiceMode forValue(int value)
	   	{
	   		return getMappings().get(value);
	   	}

}
