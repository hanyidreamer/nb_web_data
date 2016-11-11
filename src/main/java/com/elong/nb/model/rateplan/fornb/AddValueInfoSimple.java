package com.elong.nb.model.rateplan.fornb;

public class AddValueInfoSimple {
	private int ratePlanId;
	private int isInclude;
	private int share;
	private String addValueCNName;
	private String addValueENName;
	private boolean isAdd;
	private double singlePrice;
	private String businessCode;
	private int priceDefaultOption;
	private double price;
	private int singlePriceDefaultOption;
	public int getRatePlanId() {
		return ratePlanId;
	}
	public void setRatePlanId(int ratePlanId) {
		this.ratePlanId = ratePlanId;
	}
	public int getIsInclude() {
		return isInclude;
	}
	public void setIsInclude(int isInclude) {
		this.isInclude = isInclude;
	}
	public int getShare() {
		return share;
	}
	public void setShare(int share) {
		this.share = share;
	}
	public String getAddValueCNName() {
		return addValueCNName;
	}
	public void setAddValueCNName(String addValueCNName) {
		this.addValueCNName = addValueCNName;
	}
	public String getAddValueENName() {
		return addValueENName;
	}
	public void setAddValueENName(String addValueENName) {
		this.addValueENName = addValueENName;
	}
	public boolean isAdd() {
		return isAdd;
	}
	public void setIsAdd(boolean isAdd) {
		this.isAdd = isAdd;
	}
	public double getSinglePrice() {
		return singlePrice;
	}
	public void setSinglePrice(double singlePrice) {
		this.singlePrice = singlePrice;
	}
	public String getBusinessCode() {
		return businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}
	public int getPriceDefaultOption() {
		return priceDefaultOption;
	}
	public void setPriceDefaultOption(int priceDefaultOption) {
		this.priceDefaultOption = priceDefaultOption;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSinglePriceDefaultOption() {
		return singlePriceDefaultOption;
	}
	public void setSinglePriceDefaultOption(int singlePriceDefaultOption) {
		this.singlePriceDefaultOption = singlePriceDefaultOption;
	}
}
