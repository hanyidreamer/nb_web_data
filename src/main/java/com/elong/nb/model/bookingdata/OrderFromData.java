package com.elong.nb.model.bookingdata;

public class OrderFromData {

	 private String projectName;
     
     /// <summary>
     /// 代理编号
     /// </summary>
     private String proxyId;

     /// <summary>
     /// 会员卡号
     /// </summary>
     private long cardNo;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProxyId() {
		return proxyId;
	}

	public void setProxyId(String proxyId) {
		this.proxyId = proxyId;
	}

	public long getCardNo() {
		return cardNo;
	}

	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}


}
