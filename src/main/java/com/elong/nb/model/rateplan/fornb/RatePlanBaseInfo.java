package com.elong.nb.model.rateplan.fornb;

import java.util.Date;
import java.util.List;

public class RatePlanBaseInfo {
    private List<AddValuePolicyInfo> AddValuePolicyList;//差异化早餐 富杰
    private List<DRRInfo> RatePlanDRRList;//促销规则 刘康
    private List<PrePayInfo> RatePlanPrePayRuleList;//预付规则
    private List<VouchInfo> RatePlanVouchRuleList;//担保规则 浩瀚
    private List<AddValueInfoSimple> RateplanRelationAddValue;//增值服务 包含普通早餐
    
    private String SettlementType;
    private int RatePlanID;
    private String CNRatePlanName;
    private String ENRatePlanName;
    private String RatePlanRoomTypeId;
    private String PriceType;
    private int IsLimitTimeSale;
    private String ProductType;
    private int BookingChannel;
    private Date StartTime;
    private Date EndTime;
    private int MinAdvanceBookingDays;
    private int MaxAdvanceBookingDays;
    private int MinStayDays;
    private int MaxStayDays;
    private int MinCheckinRooms;
    private int CustomerLevel;
	public List<AddValuePolicyInfo> getAddValuePolicyList() {
		return AddValuePolicyList;
	}
	public void setAddValuePolicyList(List<AddValuePolicyInfo> addValuePolicyList) {
		AddValuePolicyList = addValuePolicyList;
	}
	public List<DRRInfo> getRatePlanDRRList() {
		return RatePlanDRRList;
	}
	public void setRatePlanDRRList(List<DRRInfo> ratePlanDRRList) {
		RatePlanDRRList = ratePlanDRRList;
	}
	public List<PrePayInfo> getRatePlanPrePayRuleList() {
		return RatePlanPrePayRuleList;
	}
	public void setRatePlanPrePayRuleList(List<PrePayInfo> ratePlanPrePayRuleList) {
		RatePlanPrePayRuleList = ratePlanPrePayRuleList;
	}
	public List<VouchInfo> getRatePlanVouchRuleList() {
		return RatePlanVouchRuleList;
	}
	public void setRatePlanVouchRuleList(List<VouchInfo> ratePlanVouchRuleList) {
		RatePlanVouchRuleList = ratePlanVouchRuleList;
	}
	public List<AddValueInfoSimple> getRateplanRelationAddValue() {
		return RateplanRelationAddValue;
	}
	public void setRateplanRelationAddValue(List<AddValueInfoSimple> rateplanRelationAddValue) {
		RateplanRelationAddValue = rateplanRelationAddValue;
	}
	public String getSettlementType() {
		return SettlementType;
	}
	public void setSettlementType(String settlementType) {
		SettlementType = settlementType;
	}
	public int getRatePlanID() {
		return RatePlanID;
	}
	public void setRatePlanID(int ratePlanID) {
		RatePlanID = ratePlanID;
	}
	public String getCNRatePlanName() {
		return CNRatePlanName;
	}
	public void setCNRatePlanName(String cNRatePlanName) {
		CNRatePlanName = cNRatePlanName;
	}
	public String getENRatePlanName() {
		return ENRatePlanName;
	}
	public void setENRatePlanName(String eNRatePlanName) {
		ENRatePlanName = eNRatePlanName;
	}
	public String getRatePlanRoomTypeId() {
		return RatePlanRoomTypeId;
	}
	public void setRatePlanRoomTypeId(String ratePlanRoomTypeId) {
		RatePlanRoomTypeId = ratePlanRoomTypeId;
	}
	public String getPriceType() {
		return PriceType;
	}
	public void setPriceType(String priceType) {
		PriceType = priceType;
	}
	public int getIsLimitTimeSale() {
		return IsLimitTimeSale;
	}
	public void setIsLimitTimeSale(int isLimitTimeSale) {
		IsLimitTimeSale = isLimitTimeSale;
	}
	public String getProductType() {
		return ProductType;
	}
	public void setProductType(String productType) {
		ProductType = productType;
	}
	public int getBookingChannel() {
		return BookingChannel;
	}
	public void setBookingChannel(int bookingChannel) {
		BookingChannel = bookingChannel;
	}
	public Date getStartTime() {
		return StartTime;
	}
	public void setStartTime(Date startTime) {
		StartTime = startTime;
	}
	public Date getEndTime() {
		return EndTime;
	}
	public void setEndTime(Date endTime) {
		EndTime = endTime;
	}
	public int getMinAdvanceBookingDays() {
		return MinAdvanceBookingDays;
	}
	public void setMinAdvanceBookingDays(int minAdvanceBookingDays) {
		MinAdvanceBookingDays = minAdvanceBookingDays;
	}
	public int getMaxAdvanceBookingDays() {
		return MaxAdvanceBookingDays;
	}
	public void setMaxAdvanceBookingDays(int maxAdvanceBookingDays) {
		MaxAdvanceBookingDays = maxAdvanceBookingDays;
	}
	public int getMinStayDays() {
		return MinStayDays;
	}
	public void setMinStayDays(int minStayDays) {
		MinStayDays = minStayDays;
	}
	public int getMaxStayDays() {
		return MaxStayDays;
	}
	public void setMaxStayDays(int maxStayDays) {
		MaxStayDays = maxStayDays;
	}
	public int getMinCheckinRooms() {
		return MinCheckinRooms;
	}
	public void setMinCheckinRooms(int minCheckinRooms) {
		MinCheckinRooms = minCheckinRooms;
	}
	public int getCustomerLevel() {
		return CustomerLevel;
	}
	public void setCustomerLevel(int customerLevel) {
		CustomerLevel = customerLevel;
	}
}
