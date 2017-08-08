package com.elong.nb.model.rateplan.fornb;

public enum EnumPrepayRule {
	/**
	 * 不允许变更取消
	 */
	PrepayNoChange(1),
	/**
	 * 允许变更/取消,在到店日24点之前N个小时
	 */
	PrepayNeedSomeDay(2),
	/**
	 * 允许变更/取消,在约定日期
	 */
	PrepayNeedOneTime(3);

	private int value = 1;

	/**
	 * 构造
	 * @param value value
	 */
	private EnumPrepayRule(int value) {
		this.value = value;
	}

	/**
	 * 值
	 * @return value
	 */
	public int value() {
		return this.value;
	}

	/**
	 * 构造器
	 * @param value 值
	 * @return 枚举
	 */
	public static EnumPrepayRule valueOf(int value) {
		switch (value) {
		case 1:
			return PrepayNoChange;
		case 2:
			return PrepayNeedSomeDay;
		case 3:
			return PrepayNeedOneTime;
		default:
			return null;
		}
	}
}
