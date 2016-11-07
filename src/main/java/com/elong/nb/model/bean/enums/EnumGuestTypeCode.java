package com.elong.nb.model.bean.enums;
/**
 * 客人国籍类别：1-统一价；2-内宾；3-外宾；4-港澳台；5-日本
 * 
 *(下单接口为：0-统一价；1-内宾；2-外宾；3-港澳台；4-日本)
 */
public enum EnumGuestTypeCode {

	All(1),
	Chinese(2),
	OtherForeign(3),
	HongKong(4),
	Japanese(5);
	private int intValue;
	private static java.util.HashMap<Integer, EnumGuestTypeCode> mappings;

	private synchronized static java.util.HashMap<Integer, EnumGuestTypeCode> getMappings() {
		if (mappings == null) {
			mappings = new java.util.HashMap<Integer, EnumGuestTypeCode>();
		}
		return mappings;
	}

	private EnumGuestTypeCode(int value) {
		intValue = value;
		EnumGuestTypeCode.getMappings().put(value, this);
	}

	public int getValue() {
		return intValue;
	}

	public static EnumGuestTypeCode forValue(int value) {
		return getMappings().get(value);
	}

}
