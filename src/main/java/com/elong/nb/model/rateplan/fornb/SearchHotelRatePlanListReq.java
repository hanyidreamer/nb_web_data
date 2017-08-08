package com.elong.nb.model.rateplan.fornb;

public class SearchHotelRatePlanListReq {

	private String shotelId;
	private Integer paymentType;
	private String guestType = "1";
	/**
	 * 定价模式
	 * 1=每晚计价
	 */
	private String priceModel = "1";
	/**
	 * 阶梯免房	PT - 4096
	 *赔款免房	PT - 8192
	 *海陆空促销	PT - 16384
	 *白日房	PT - 32768
	 *景酒打包	PT - 131072	
	 *国际酒店产品	PT - 128	
	 *限时抢	PT - 16	
	 *30天起租	PT - 8
	 *7天起租	PT - 4
	 *打包销售	PT - 2
	 *单独销售	PT - 1(NBAPI只需要1)
	 *团购产品	PT - 64
	 *钟点房	PT - 32
	 *周边价产品	PT - 256	
	 *9元/半价抢	PT - 512
	 *微信专享	PT - 1024
	 *房型升级产品	PT - 2048
	 */
	private String productType = "1";

	public String getShotelId() {
		return shotelId;
	}

	public void setShotelId(String shotelId) {
		this.shotelId = shotelId;
	}

	public Integer getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(Integer paymentType) {
		this.paymentType = paymentType;
	}

	public String getGuestType() {
		return guestType;
	}

	public void setGuestType(String guestType) {
		this.guestType = guestType;
	}

	public String getPriceModel() {
		return priceModel;
	}

	public void setPriceModel(String priceModel) {
		this.priceModel = priceModel;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}
}
