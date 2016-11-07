package com.elong.nb.model.rateplan.fornb;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class PrePayInfo {
	private int Target;
    private int PrepayChangeRule;
    private int DateType;
    private Date StartDate;
    private Date EndDate;
    private int CutTypeAfter;
    private int CutTypeBefor;
    private boolean CutAfterChangeTime;
    private boolean CutBeforChangeTime;
    private double CutNumAfter;
    private double CutNumBefor;
    private String CNDescription;
    private String ENDescription;
    private List<Integer> IsWeekEffective;
    Map<String, String> RuleValues;
	public int getTarget() {
		return Target;
	}
	public void setTarget(int target) {
		Target = target;
	}
	public int getPrepayChangeRule() {
		return PrepayChangeRule;
	}
	public void setPrepayChangeRule(int prepayChangeRule) {
		PrepayChangeRule = prepayChangeRule;
	}
	public int getDateType() {
		return DateType;
	}
	public void setDateType(int dateType) {
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
	public int getCutTypeAfter() {
		return CutTypeAfter;
	}
	public void setCutTypeAfter(int cutTypeAfter) {
		CutTypeAfter = cutTypeAfter;
	}
	public int getCutTypeBefor() {
		return CutTypeBefor;
	}
	public void setCutTypeBefor(int cutTypeBefor) {
		CutTypeBefor = cutTypeBefor;
	}
	public boolean isCutAfterChangeTime() {
		return CutAfterChangeTime;
	}
	public void setCutAfterChangeTime(boolean cutAfterChangeTime) {
		CutAfterChangeTime = cutAfterChangeTime;
	}
	public boolean isCutBeforChangeTime() {
		return CutBeforChangeTime;
	}
	public void setCutBeforChangeTime(boolean cutBeforChangeTime) {
		CutBeforChangeTime = cutBeforChangeTime;
	}
	public double getCutNumAfter() {
		return CutNumAfter;
	}
	public void setCutNumAfter(double cutNumAfter) {
		CutNumAfter = cutNumAfter;
	}
	public double getCutNumBefor() {
		return CutNumBefor;
	}
	public void setCutNumBefor(double cutNumBefor) {
		CutNumBefor = cutNumBefor;
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
