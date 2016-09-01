package com.elong.nb.model.rateplan;

import java.util.Date;

import com.elong.nb.common.util.DateUtils;
import com.elong.nb.model.bean.enums.EnumDateType;
import com.elong.nb.model.bean.enums.EnumGuaranteeChangeRule;
import com.elong.nb.model.bean.enums.EnumGuaranteeMoneyType;


public class BaseGuaranteeRule extends BaseRule {

	/// <summary>
    /// 日期类型
    /// </summary>

    private EnumDateType DateType ;

    /// <summary>
    /// 开始日期
    /// </summary>

    private Date StartDate ;

    /// <summary>
    /// 结束日期
    /// </summary>

    private Date EndDate ;

    /// <summary>
    /// 周有效天数， 一般为周一到周日都有效， 判断日期符合日期段同时也要满足周设置的有效 
    /// 周一对应为1，周二对应为2， 依次类推;逗号分隔
    /// </summary>

    private String WeekSet ;

    /// <summary>
    /// 是否到店时间担保
    /// </summary>

    private boolean IsTimeGuarantee ;

    /// <summary>
    /// 到店担保开始时间
    /// </summary>

    private String StartTime ;

    /// <summary>
    /// 到店担保结束时间
    /// </summary>

    private String EndTime ;

    /// <summary>
    /// 到店担保的结束时间是否为第二天 ; 0为当天，1
    /// </summary>

    private boolean IsTomorrow ;

    /// <summary>
    /// 是否房量担保
    /// </summary>

    private boolean IsAmountGuarantee ;

    /// <summary>
    /// 担保的房间数,预定几间房以上要担保
    /// </summary>

    private int Amount ;

    /// <summary>
    /// 担保类型
    /// </summary>

    private EnumGuaranteeMoneyType GuaranteeType ;

    /// <summary>
    /// 变更规则
    /// </summary>

    private EnumGuaranteeChangeRule ChangeRule ;

    /// <summary>
    /// 日期参数
    /// </summary>

    private Date Day ;

    /// <summary>
    /// 时间参数
    /// </summary>

    private String Time ;

    /// <summary>
    /// 小时参数
    /// </summary>

    private int Hour ;




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




	public boolean isIsTimeGuarantee() {
		return IsTimeGuarantee;
	}




	public void setIsTimeGuarantee(boolean isTimeGuarantee) {
		IsTimeGuarantee = isTimeGuarantee;
	}




	public String getStartTime() {
		return StartTime;
	}




	public void setStartTime(String startTime) {
		StartTime = startTime;
	}




	public String getEndTime() {
		return EndTime;
	}




	public void setEndTime(String endTime) {
		EndTime = endTime;
	}




	public boolean isIsTomorrow() {
		return IsTomorrow;
	}




	public void setIsTomorrow(boolean isTomorrow) {
		IsTomorrow = isTomorrow;
	}




	public boolean isIsAmountGuarantee() {
		return IsAmountGuarantee;
	}




	public void setIsAmountGuarantee(boolean isAmountGuarantee) {
		IsAmountGuarantee = isAmountGuarantee;
	}




	public int getAmount() {
		return Amount;
	}




	public void setAmount(int amount) {
		Amount = amount;
	}




	public EnumGuaranteeMoneyType getGuaranteeType() {
		return GuaranteeType;
	}




	public void setGuaranteeType(EnumGuaranteeMoneyType guaranteeType) {
		GuaranteeType = guaranteeType;
	}




	public EnumGuaranteeChangeRule getChangeRule() {
		return ChangeRule;
	}




	public void setChangeRule(EnumGuaranteeChangeRule changeRule) {
		ChangeRule = changeRule;
	}




	public Date getDay() {
		return Day;
	}




	public void setDay(Date day) {
		Day = day;
	}




	public String getTime() {
		return Time;
	}




	public void setTime(String time) {
		Time = time;
	}




	public int getHour() {
		return Hour;
	}




	public void setHour(int hour) {
		Hour = hour;
	}




	/// <summary>
    /// 获取担保描述
    /// </summary>
    /// <param name="rule_type"></param>
    /// <param name="languageIsCN"></param>
    /// <returns></returns>
    public String BuildDescription(boolean languageIsCN)
    {
    	BaseGuaranteeRule rule = this;
        StringBuilder sb = new StringBuilder();
        //#region 拼装描述
        if (languageIsCN)
        {

            //#region 中文
            //sb.append("担保条件：在" + rule.StartDate.toString("yy.MM.dd") + "至" + rule.EndDate.toString("yy.MM.dd"));
            sb.append("担保条件：在" + DateUtils.convertDate(rule.StartDate,"yy.MM.dd") + "至" +DateUtils.convertDate(rule.EndDate,"yy.MM.dd"));

            if (rule.DateType == EnumDateType.CheckInDay)
            {
                sb.append("入住");
            }
            else if (rule.DateType == EnumDateType.StayDay)
            {
                sb.append("在店");
            }

            if (rule.IsTimeGuarantee && rule.IsAmountGuarantee)
            {
                sb.append("如果在" + rule.StartTime + "至" + (rule.IsTomorrow ? "次日" : "") + rule.EndTime + "到店，或预订房量超过" + rule.Amount + "间");
            }
            else if (rule.IsTimeGuarantee && !rule.IsAmountGuarantee)
            {
                sb.append("如果在" + rule.StartTime + "至" + (rule.IsTomorrow ? "次日" : "") + rule.EndTime + "到店，");
            }
            else if (!rule.IsTimeGuarantee && rule.IsAmountGuarantee)
            {
                sb.append("如果预订房量超过" + rule.Amount + "间，");
            }
            sb.append("需要您提供信用卡担保。");

            //#region 是否可取消
            if (rule.ChangeRule == EnumGuaranteeChangeRule.NoChange)
            {
                sb.append("预订后无法变更取消，");
            }
            else if (rule.ChangeRule == EnumGuaranteeChangeRule.NeedSomeDay)
            {
                sb.append("在" + DateUtils.convertDate(rule.Day,"yy.MM.dd") + "日" + rule.Time + ":00点前可以变更取消，之后无法变更取消，");

            }
            else if (rule.ChangeRule == EnumGuaranteeChangeRule.NeedCheckinTime)
            {
                sb.append("客人最早到店" + rule.Hour + "小时前可以变更取消，之后无法变更取消，");
            }
            else if (rule.ChangeRule == EnumGuaranteeChangeRule.NeedCheckin24hour)
            {
                //sb.Append("客人入住日" + rule.Hour + "小时前可以变更取消，之后无法变更取消，");
                int day = rule.Hour / 24;
                if (day > 0)
                {
                    int time = 24 - (rule.Hour - day * 24);
                    sb.append("客人入住日前" + day + "天" + time + ":00点前可以变更取消，之后无法变更取消，");
                }
                else
                {
                    int time = 24 - rule.Hour;
                    sb.append("客人入住日" + time + ":00点前可以变更取消，之后无法变更取消，");
                }

            }
            
            if (rule.GuaranteeType == EnumGuaranteeMoneyType.FirstNightCost)
            {
                sb.append("如未入住，将扣除第一晚房费");
            }
            else
            {
                sb.append("如未入住，将扣除全额房费");
            }
            sb.append("作为违约金。");
           
        }
        else
        {
            //#region 英文
            if (rule.DateType == EnumDateType.CheckInDay)
            {
                sb.append("For Bookings with  check-in date between " + DateUtils.convertDate(rule.StartDate,"yy.MM.dd") + " and " + DateUtils.convertDate(rule.EndDate,"yy.MM.dd") + ",");
            }
            else if (rule.DateType == EnumDateType.StayDay)
            {
                //sb.append("For Bookings with  check-in date between " + rule.StartDate.ToString("yy.MM.dd") + " and " + rule.EndDate.ToString("yy.MM.dd") + ",");
                sb.append("For Bookings with  check-in date between " + DateUtils.convertDate(rule.StartDate,"yy.MM.dd") + " and " + DateUtils.convertDate(rule.EndDate,"yy.MM.dd") + ",");

            }

            if (rule.IsTimeGuarantee && rule.IsAmountGuarantee)
            {
                sb.append("For bookings with " + rule.Amount + " rooms or above booked, or check-in time between " + rule.StartTime + " and " + (rule.IsTomorrow ? "(next day)" : "") + rule.EndTime + ", ");
            }
            else if (rule.IsTimeGuarantee && !rule.IsAmountGuarantee)
            {
                sb.append("For Bookings with check-in time between " + rule.StartTime + " and " + (rule.IsTomorrow ? "(next day)" : "") + rule.EndTime + ", ");
            }
            else if (!rule.IsTimeGuarantee && rule.IsAmountGuarantee)
            {
                sb.append("For bookings with " + rule.Amount + "  rooms or above booked,");
            }
            sb.append("credit card information is required for guarantee. Once the booking is confirmed,");

            //#region 是否可取消
            if (rule.ChangeRule == EnumGuaranteeChangeRule.NoChange)
            {
                sb.append("it allows no cancellation or change.");
            }
            else if (rule.ChangeRule == EnumGuaranteeChangeRule.NeedSomeDay)
            {
                //sb.append("free cancellation or change is allowed before " + rule.Time + ", " + rule.Day.ToString("yy.MM.dd") + ".");
                sb.append("free cancellation or change is allowed before " + rule.Time + ", " + DateUtils.convertDate(rule.Day,"yy.MM.dd") + ".");

            }
            else if (rule.ChangeRule == EnumGuaranteeChangeRule.NeedCheckinTime)
            {
                sb.append("free cancellation or change is allowed until " + rule.Hour + " hours before your earliest arrival time.");

            }
            else if (rule.ChangeRule == EnumGuaranteeChangeRule.NeedCheckin24hour)
            {
                sb.append("free cancellation or change is allowed until " + rule.Hour + " hours before your check-in date.");

            }
           
            sb.append("If you fail to check in, eLong is authorized to charge ");
            if (rule.GuaranteeType == EnumGuaranteeMoneyType.FirstNightCost)
            {

                sb.append(" the first night room rate ");
            }
            else
            {
                sb.append(" the full room rate ");
            }
            sb.append("to your credit card.");
            
        }
        


        return sb.toString();
    }


}
