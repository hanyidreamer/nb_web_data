package com.elong.nb.model.rateplan.fornb;

public class SearchHotelRatePlanListReq {
	private String shotelId;
	private int paymentType;
	private String GuestType = "1";
	private String PriceModel = "1";
	private String PriceType = "1";
    private String ProductType = "1";
	public String getShotelId() {
		return shotelId;
	}
	public void setShotelId(String shotelId) {
		this.shotelId = shotelId;
	}
	public int getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}
	public String getGuestType() {
		return GuestType;
	}
	public void setGuestType(String guestType) {
		GuestType = guestType;
	}
	public String getPriceModel() {
		return PriceModel;
	}
	public void setPriceModel(String priceModel) {
		PriceModel = priceModel;
	}
	public String getPriceType() {
		return PriceType;
	}
	public void setPriceType(String priceType) {
		PriceType = priceType;
	}
	public String getProductType() {
		return ProductType;
	}
	public void setProductType(String productType) {
		ProductType = productType;
	}
}
