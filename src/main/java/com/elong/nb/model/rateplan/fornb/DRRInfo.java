package com.elong.nb.model.rateplan.fornb;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class DRRInfo {
	private int dRRRule;
	private int moneyOrPercent;
	private double moneyOrPercentValue;
	private int dateType;
	private String cNDescription;
	private String eNDescription;
	private Date startDate;
	private Date endDate;
	private int feeType;
	private List<Integer> isWeekEffective;
	private Map<String, String> ruleValues;
	private String roomTypeIds;
	public int getDRRRule() {
		return dRRRule;
	}
	public void setDRRRule(int dRRRule) {
		this.dRRRule = dRRRule;
	}
	public int getMoneyOrPercent() {
		return moneyOrPercent;
	}
	public void setMoneyOrPercent(int moneyOrPercent) {
		this.moneyOrPercent = moneyOrPercent;
	}
	public double getMoneyOrPercentValue() {
		return moneyOrPercentValue;
	}
	public void setMoneyOrPercentValue(double moneyOrPercentValue) {
		this.moneyOrPercentValue = moneyOrPercentValue;
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
	public int getFeeType() {
		return feeType;
	}
	public void setFeeType(int feeType) {
		this.feeType = feeType;
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
	public String getRoomTypeIds() {
		return roomTypeIds;
	}
	public void setRoomTypeIds(String roomTypeIds) {
		this.roomTypeIds = roomTypeIds;
	}
}
