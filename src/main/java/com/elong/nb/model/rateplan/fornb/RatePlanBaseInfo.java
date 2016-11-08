package com.elong.nb.model.rateplan.fornb;

import java.util.Date;
import java.util.List;

public class RatePlanBaseInfo {
    private List<AddValuePolicyInfo> addValuePolicyList;//差异化早餐 富杰
    private List<DRRInfo> ratePlanDRRList;//促销规则 刘康
    private List<PrePayInfo> ratePlanPrePayRuleList;//预付规则
    private List<VouchInfo> ratePlanVouchRuleList;//担保规则 浩瀚
    private List<AddValueInfoSimple> rateplanRelationAddValue;//增值服务 包含普通早餐
    
    private String settlementType;
    private int ratePlanID;
    private String cNRatePlanName;
    private String eNRatePlanName;
    private String ratePlanRoomTypeId;
    private String priceType;
    private int isLimitTimeSale;
    private String productType;
    private int bookingChannel;
    private Date startTime;
    private Date endTime;
    private int minAdvanceBookingDays;
    private int maxAdvanceBookingDays;
    private int minStayDays;
    private int maxStayDays;
    private int minCheckinRooms;
    private int customerLevel;
	public List<AddValuePolicyInfo> getAddValuePolicyList() {
		return addValuePolicyList;
	}
	public void setAddValuePolicyList(List<AddValuePolicyInfo> addValuePolicyList) {
		this.addValuePolicyList = addValuePolicyList;
	}
	public List<DRRInfo> getRatePlanDRRList() {
		return ratePlanDRRList;
	}
	public void setRatePlanDRRList(List<DRRInfo> ratePlanDRRList) {
		this.ratePlanDRRList = ratePlanDRRList;
	}
	public List<PrePayInfo> getRatePlanPrePayRuleList() {
		return ratePlanPrePayRuleList;
	}
	public void setRatePlanPrePayRuleList(List<PrePayInfo> ratePlanPrePayRuleList) {
		this.ratePlanPrePayRuleList = ratePlanPrePayRuleList;
	}
	public List<VouchInfo> getRatePlanVouchRuleList() {
		return ratePlanVouchRuleList;
	}
	public void setRatePlanVouchRuleList(List<VouchInfo> ratePlanVouchRuleList) {
		this.ratePlanVouchRuleList = ratePlanVouchRuleList;
	}
	public List<AddValueInfoSimple> getRateplanRelationAddValue() {
		return rateplanRelationAddValue;
	}
	public void setRateplanRelationAddValue(
			List<AddValueInfoSimple> rateplanRelationAddValue) {
		this.rateplanRelationAddValue = rateplanRelationAddValue;
	}
	public String getSettlementType() {
		return settlementType;
	}
	public void setSettlementType(String settlementType) {
		this.settlementType = settlementType;
	}
	public int getRatePlanID() {
		return ratePlanID;
	}
	public void setRatePlanID(int ratePlanID) {
		this.ratePlanID = ratePlanID;
	}
	public String getCNRatePlanName() {
		return cNRatePlanName;
	}
	public void setCNRatePlanName(String cNRatePlanName) {
		this.cNRatePlanName = cNRatePlanName;
	}
	public String getENRatePlanName() {
		return eNRatePlanName;
	}
	public void setENRatePlanName(String eNRatePlanName) {
		this.eNRatePlanName = eNRatePlanName;
	}
	public String getRatePlanRoomTypeId() {
		return ratePlanRoomTypeId;
	}
	public void setRatePlanRoomTypeId(String ratePlanRoomTypeId) {
		this.ratePlanRoomTypeId = ratePlanRoomTypeId;
	}
	public String getPriceType() {
		return priceType;
	}
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}
	public int getIsLimitTimeSale() {
		return isLimitTimeSale;
	}
	public void setIsLimitTimeSale(int isLimitTimeSale) {
		this.isLimitTimeSale = isLimitTimeSale;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public int getBookingChannel() {
		return bookingChannel;
	}
	public void setBookingChannel(int bookingChannel) {
		this.bookingChannel = bookingChannel;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public int getMinAdvanceBookingDays() {
		return minAdvanceBookingDays;
	}
	public void setMinAdvanceBookingDays(int minAdvanceBookingDays) {
		this.minAdvanceBookingDays = minAdvanceBookingDays;
	}
	public int getMaxAdvanceBookingDays() {
		return maxAdvanceBookingDays;
	}
	public void setMaxAdvanceBookingDays(int maxAdvanceBookingDays) {
		this.maxAdvanceBookingDays = maxAdvanceBookingDays;
	}
	public int getMinStayDays() {
		return minStayDays;
	}
	public void setMinStayDays(int minStayDays) {
		this.minStayDays = minStayDays;
	}
	public int getMaxStayDays() {
		return maxStayDays;
	}
	public void setMaxStayDays(int maxStayDays) {
		this.maxStayDays = maxStayDays;
	}
	public int getMinCheckinRooms() {
		return minCheckinRooms;
	}
	public void setMinCheckinRooms(int minCheckinRooms) {
		this.minCheckinRooms = minCheckinRooms;
	}
	public int getCustomerLevel() {
		return customerLevel;
	}
	public void setCustomerLevel(int customerLevel) {
		this.customerLevel = customerLevel;
	}
}
