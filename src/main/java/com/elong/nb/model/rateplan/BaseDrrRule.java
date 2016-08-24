package com.elong.nb.model.rateplan;

import java.util.Date;

import com.elong.nb.model.bean.enums.EnumDateType;
import com.elong.nb.model.bean.enums.EnumDrrFeeType;
import com.elong.nb.model.bean.enums.EnumDrrPreferential;
import com.elong.nb.model.bean.enums.EnumDrrRuleCode;
import com.google.gson.annotations.Since;

//促销规则
public class BaseDrrRule extends BaseRule {

	/// <summary>
    /// 产品促销规则类型代码
    /// </summary>
    private EnumDrrRuleCode TypeCode;

    /// <summary>
    /// 日期类型
    /// </summary>
    private EnumDateType DateType;

    /// <summary>
    /// 促销生效开始日期
    /// </summary>
    private Date StartDate;

    /// <summary>
    /// 促销生效结束日期
    /// </summary>
    private Date EndDate;

    /// <summary>
    /// 提前几天
    /// </summary>
    private int DayNum;

    /// <summary>
    /// 连住几天
    /// </summary>
    private int CheckInNum;

    /// <summary>
    /// 每连住几晚
    /// </summary>
    private int EveryCheckInNum;

    /// <summary>
    /// 最后几天
    /// </summary>
    private int LastDayNum;

    /// <summary>
    /// 第几晚及以后优惠
    /// </summary>
    private int WhichDayNum;

    /// <summary>
    /// 按金额或按比例来优惠
    /// </summary>
    private EnumDrrPreferential CashScale;

    /// <summary>
    /// 按金额或比例优惠的数值
    /// </summary>
    private double DeductNum;

    /// <summary>
    /// 星期有效设置
    /// </summary>
    private String WeekSet;

    /// <summary>
    /// 价格类型
    /// </summary>
    private EnumDrrFeeType FeeType;


    @Since(1.11)
    private String RoomTypeIds;


	public EnumDrrRuleCode getTypeCode() {
		return TypeCode;
	}


	public void setTypeCode(EnumDrrRuleCode typeCode) {
		TypeCode = typeCode;
	}


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


	public int getDayNum() {
		return DayNum;
	}


	public void setDayNum(int dayNum) {
		DayNum = dayNum;
	}


	public int getCheckInNum() {
		return CheckInNum;
	}


	public void setCheckInNum(int checkInNum) {
		CheckInNum = checkInNum;
	}


	public int getEveryCheckInNum() {
		return EveryCheckInNum;
	}


	public void setEveryCheckInNum(int everyCheckInNum) {
		EveryCheckInNum = everyCheckInNum;
	}


	public int getLastDayNum() {
		return LastDayNum;
	}


	public void setLastDayNum(int lastDayNum) {
		LastDayNum = lastDayNum;
	}


	public int getWhichDayNum() {
		return WhichDayNum;
	}


	public void setWhichDayNum(int whichDayNum) {
		WhichDayNum = whichDayNum;
	}


	public EnumDrrPreferential getCashScale() {
		return CashScale;
	}


	public void setCashScale(EnumDrrPreferential cashScale) {
		CashScale = cashScale;
	}


	public double getDeductNum() {
		return DeductNum;
	}


	public void setDeductNum(double deductNum) {
		DeductNum = deductNum;
	}


	public String getWeekSet() {
		return WeekSet;
	}


	public void setWeekSet(String weekSet) {
		WeekSet = weekSet;
	}


	public EnumDrrFeeType getFeeType() {
		return FeeType;
	}


	public void setFeeType(EnumDrrFeeType feeType) {
		FeeType = feeType;
	}


	public String getRoomTypeIds() {
		return RoomTypeIds;
	}


	public void setRoomTypeIds(String roomTypeIds) {
		RoomTypeIds = roomTypeIds;
	}

    
    //[OnSerializing]
    //private void OnSerializingMethod(StreamingContext context)
    //{

     //   if (com.elong.api.core.wcf.ApiContext.Current.Version < 1.11)
     //   {
     //       this.RoomTypeIds = null;
      //  }

    //}
}
