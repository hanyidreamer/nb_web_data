package com.elong.nb.model.rateplan.fornb;

import java.util.Date;
import java.util.List;

public class AddValuePolicyInfo {
	private Date startDate;
	private Date endDate;
	private int isInclude;
	private int share;
	private int priceDefaultOption;
	private int singlePriceDefaultOption;
	private double price;
	private double singlePrice;
	private int isAdd;
	private String currencyCode;
	private List<Integer> isWeekEffective;
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
	public int getPriceDefaultOption() {
		return priceDefaultOption;
	}
	public void setPriceDefaultOption(int priceDefaultOption) {
		this.priceDefaultOption = priceDefaultOption;
	}
	public int getSinglePriceDefaultOption() {
		return singlePriceDefaultOption;
	}
	public void setSinglePriceDefaultOption(int singlePriceDefaultOption) {
		this.singlePriceDefaultOption = singlePriceDefaultOption;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getSinglePrice() {
		return singlePrice;
	}
	public void setSinglePrice(double singlePrice) {
		this.singlePrice = singlePrice;
	}
	public int getIsAdd() {
		return isAdd;
	}
	public void setIsAdd(int isAdd) {
		this.isAdd = isAdd;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public List<Integer> getIsWeekEffective() {
		return isWeekEffective;
	}
	public void setIsWeekEffective(List<Integer> isWeekEffective) {
		this.isWeekEffective = isWeekEffective;
	}
}
