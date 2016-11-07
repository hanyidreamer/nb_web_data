package com.elong.nb.model.rateplan.fornb;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class VouchInfo {
	private Date StartDate;
	private Date EndDate;
	private String ArriveStartTime;
	private String ArriveEndTime;
	private int RoomCount;
	private int VouchChangeRule;
	private int DateType;
	private String CNDescription;
	private String ENDescription;
	private boolean IsRoomCountVouch;
	private boolean IsArriveTimeVouch;
	private int VouchMoneyType;
	private List<Integer> IsWeekEffective;
	private Map<String, String> RuleValues;//担保规则扩展
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
	public String getArriveStartTime() {
		return ArriveStartTime;
	}
	public void setArriveStartTime(String arriveStartTime) {
		ArriveStartTime = arriveStartTime;
	}
	public String getArriveEndTime() {
		return ArriveEndTime;
	}
	public void setArriveEndTime(String arriveEndTime) {
		ArriveEndTime = arriveEndTime;
	}
	public int getRoomCount() {
		return RoomCount;
	}
	public void setRoomCount(int roomCount) {
		RoomCount = roomCount;
	}
	public int getVouchChangeRule() {
		return VouchChangeRule;
	}
	public void setVouchChangeRule(int vouchChangeRule) {
		VouchChangeRule = vouchChangeRule;
	}
	public int getDateType() {
		return DateType;
	}
	public void setDateType(int dateType) {
		DateType = dateType;
	}
	public String getCNDescription() {
		return CNDescription;
	}
	public void setCNDescription(String cNDescription) {
		CNDescription = cNDescription;
	}
	public String getENDescription() {
		return ENDescription;
	}
	public void setENDescription(String eNDescription) {
		ENDescription = eNDescription;
	}
	public boolean isIsRoomCountVouch() {
		return IsRoomCountVouch;
	}
	public void setIsRoomCountVouch(boolean isRoomCountVouch) {
		IsRoomCountVouch = isRoomCountVouch;
	}
	public boolean isIsArriveTimeVouch() {
		return IsArriveTimeVouch;
	}
	public void setIsArriveTimeVouch(boolean isArriveTimeVouch) {
		IsArriveTimeVouch = isArriveTimeVouch;
	}
	public int getVouchMoneyType() {
		return VouchMoneyType;
	}
	public void setVouchMoneyType(int vouchMoneyType) {
		VouchMoneyType = vouchMoneyType;
	}
	public List<Integer> getIsWeekEffective() {
		return IsWeekEffective;
	}
	public void setIsWeekEffective(List<Integer> isWeekEffective) {
		IsWeekEffective = isWeekEffective;
	}
	public Map<String, String> getRuleValues() {
		return RuleValues;
	}
	public void setRuleValues(Map<String, String> ruleValues) {
		RuleValues = ruleValues;
	}
}
