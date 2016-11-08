package com.elong.nb.model.rateplan.fornb;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class PrePayInfo {
	private int target;
    private int prepayChangeRule;
    private int dateType;
    private Date startDate;
    private Date endDate;
    private int cutTypeAfter;
    private int cutTypeBefor;
    private boolean cutAfterChangeTime;
    private boolean cutBeforChangeTime;
    private double cutNumAfter;
    private double cutNumBefor;
    private String cNDescription;
    private String eNDescription;
    private List<Integer> isWeekEffective;
    Map<String, String> ruleValues;
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public int getPrepayChangeRule() {
		return prepayChangeRule;
	}
	public void setPrepayChangeRule(int prepayChangeRule) {
		this.prepayChangeRule = prepayChangeRule;
	}
	public int getDateType() {
		return dateType;
	}
	public void setDateType(int dateType) {
		this.dateType = dateType;
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
	public int getCutTypeAfter() {
		return cutTypeAfter;
	}
	public void setCutTypeAfter(int cutTypeAfter) {
		this.cutTypeAfter = cutTypeAfter;
	}
	public int getCutTypeBefor() {
		return cutTypeBefor;
	}
	public void setCutTypeBefor(int cutTypeBefor) {
		this.cutTypeBefor = cutTypeBefor;
	}
	public boolean isCutAfterChangeTime() {
		return cutAfterChangeTime;
	}
	public void setCutAfterChangeTime(boolean cutAfterChangeTime) {
		this.cutAfterChangeTime = cutAfterChangeTime;
	}
	public boolean isCutBeforChangeTime() {
		return cutBeforChangeTime;
	}
	public void setCutBeforChangeTime(boolean cutBeforChangeTime) {
		this.cutBeforChangeTime = cutBeforChangeTime;
	}
	public double getCutNumAfter() {
		return cutNumAfter;
	}
	public void setCutNumAfter(double cutNumAfter) {
		this.cutNumAfter = cutNumAfter;
	}
	public double getCutNumBefor() {
		return cutNumBefor;
	}
	public void setCutNumBefor(double cutNumBefor) {
		this.cutNumBefor = cutNumBefor;
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
