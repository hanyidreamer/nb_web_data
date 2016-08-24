package com.elong.nb.model.rateplan;

import java.util.Date;

import com.elong.nb.model.bean.enums.EnumDateType;
import com.elong.nb.model.bean.enums.EnumPrepayChangeRule;
import com.elong.nb.model.bean.enums.EnumPrepayCutPayment;

public class BasePrepayRule extends BaseRule {

	/// <summary>
    /// 日期类型
    /// </summary>

    private EnumDateType DateType;

    /// <summary>
    /// 开始日期
    /// </summary>
    
    private Date StartDate;

    /// <summary>
    /// 结束日期
    /// </summary>
    
    private Date EndDate;

    /// <summary>
    /// 周有效设置
    /// </summary>
    
    private String WeekSet;

    /// <summary>
    /// 变更规则
    /// </summary>

    private EnumPrepayChangeRule ChangeRule;

    /// <summary>
    /// 时间点后扣款类型
    /// </summary>

    private EnumPrepayCutPayment CashScaleFirstAfter;

    /// <summary>
    /// 时间点前扣款类型
    /// </summary>

    private EnumPrepayCutPayment CashScaleFirstBefore;

    /// <summary>
    /// 具体取消时间日期部分
    /// </summary>
    
    private Date DateNum;

    /// <summary>
    /// 具体取消时间小时部分
    /// </summary>
    
    private String Time;

    /// <summary>
    /// 在变更时间点后是否扣
    /// </summary>
    
    private int DeductFeesAfter;

    /// <summary>
    /// 在变更时间点前是否扣费
    /// </summary>
    
    private int DeductFeesBefore;

    /// <summary>
    /// 时间点后扣费的金额或比例
    /// </summary>
    
    private double DeductNumAfter;

    /// <summary>
    /// 时间点前扣费的金额或比例
    /// </summary>
    
    private double DeductNumBefore;

    /// <summary>
    /// 第一阶段提前几小时
    /// </summary>
    
    private int Hour;

    /// <summary>
    /// 第二阶段提前几小时
    /// </summary>
    
    private int Hour2;

	public EnumDateType getDateType() {
		return DateType;
	}

	public void setDateType(EnumDateType dateType) {
		DateType = dateType;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

	public String getWeekSet() {
		return WeekSet;
	}

	public void setWeekSet(String weekSet) {
		WeekSet = weekSet;
	}

	public EnumPrepayChangeRule getChangeRule() {
		return ChangeRule;
	}

	public void setChangeRule(EnumPrepayChangeRule changeRule) {
		ChangeRule = changeRule;
	}

	public EnumPrepayCutPayment getCashScaleFirstAfter() {
		return CashScaleFirstAfter;
	}

	public void setCashScaleFirstAfter(EnumPrepayCutPayment cashScaleFirstAfter) {
		CashScaleFirstAfter = cashScaleFirstAfter;
	}

	public EnumPrepayCutPayment getCashScaleFirstBefore() {
		return CashScaleFirstBefore;
	}

	public void setCashScaleFirstBefore(EnumPrepayCutPayment cashScaleFirstBefore) {
		CashScaleFirstBefore = cashScaleFirstBefore;
	}

	public Date getDateNum() {
		return DateNum;
	}

	public void setDateNum(Date dateNum) {
		DateNum = dateNum;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

	public int getDeductFeesAfter() {
		return DeductFeesAfter;
	}

	public void setDeductFeesAfter(int deductFeesAfter) {
		DeductFeesAfter = deductFeesAfter;
	}

	public int getDeductFeesBefore() {
		return DeductFeesBefore;
	}

	public void setDeductFeesBefore(int deductFeesBefore) {
		DeductFeesBefore = deductFeesBefore;
	}

	public double getDeductNumAfter() {
		return DeductNumAfter;
	}

	public void setDeductNumAfter(double deductNumAfter) {
		DeductNumAfter = deductNumAfter;
	}

	public double getDeductNumBefore() {
		return DeductNumBefore;
	}

	public void setDeductNumBefore(double deductNumBefore) {
		DeductNumBefore = deductNumBefore;
	}

	public int getHour() {
		return Hour;
	}

	public void setHour(int hour) {
		Hour = hour;
	}

	public int getHour2() {
		return Hour2;
	}

	public void setHour2(int hour2) {
		Hour2 = hour2;
	}      


}
