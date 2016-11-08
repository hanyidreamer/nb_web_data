package com.elong.nb.model.rateplan.fornb;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class VouchInfo {
	private Date startDate;
	private Date endDate;
	private String arriveStartTime;
	private String arriveEndTime;
	private int roomCount;
	private int vouchChangeRule;
	private int dateType;
	private String cNDescription;
	private String eNDescription;
	private boolean isRoomCountVouch;
	private boolean isArriveTimeVouch;
	private int vouchMoneyType;
	private List<Integer> isWeekEffective;
	private Map<String, String> ruleValues;//担保规则扩展
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getArriveStartTime() {
		return arriveStartTime;
	}
	public void setArriveStartTime(String arriveStartTime) {
		this.arriveStartTime = arriveStartTime;
	}
	public String getArriveEndTime() {
		return arriveEndTime;
	}
	public void setArriveEndTime(String arriveEndTime) {
		this.arriveEndTime = arriveEndTime;
	}
	public int getRoomCount() {
		return roomCount;
	}
	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}
	public int getVouchChangeRule() {
		return vouchChangeRule;
	}
	public void setVouchChangeRule(int vouchChangeRule) {
		this.vouchChangeRule = vouchChangeRule;
	}
	public int getDateType() {
		return dateType;
	}
	public void setDateType(int dateType) {
		this.dateType = dateType;
	}
	public String getCNDescription() {
		return cNDescription;
	}
	public void setCNDescription(String cNDescription) {
		this.cNDescription = cNDescription;
	}
	public String getENDescription() {
		return eNDescription;
	}
	public void setENDescription(String eNDescription) {
		this.eNDescription = eNDescription;
	}
	public boolean isRoomCountVouch() {
		return isRoomCountVouch;
	}
	public void setRoomCountVouch(boolean isRoomCountVouch) {
		this.isRoomCountVouch = isRoomCountVouch;
	}
	public boolean isArriveTimeVouch() {
		return isArriveTimeVouch;
	}
	public void setArriveTimeVouch(boolean isArriveTimeVouch) {
		this.isArriveTimeVouch = isArriveTimeVouch;
	}
	public int getVouchMoneyType() {
		return vouchMoneyType;
	}
	public void setVouchMoneyType(int vouchMoneyType) {
		this.vouchMoneyType = vouchMoneyType;
	}
	public List<Integer> getIsWeekEffective() {
		return isWeekEffective;
	}
	public void setIsWeekEffective(List<Integer> isWeekEffective) {
		this.isWeekEffective = isWeekEffective;
	}
	public Map<String, String> getRuleValues() {
		return ruleValues;
	}
	public void setRuleValues(Map<String, String> ruleValues) {
		this.ruleValues = ruleValues;
	}
}
