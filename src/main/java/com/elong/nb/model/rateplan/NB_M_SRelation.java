package com.elong.nb.model.rateplan;

import java.util.Date;

public class NB_M_SRelation {

	private String SHotelID;
	private String SStatus ;
	private String SSupplierTypeID;
	private String MHotelID;
	private String MStatus;
	private int SSupplierID;

	private Date UpdatedAt;

	public String getSHotelID() {
		return SHotelID;
	}

	public void setSHotelID(String sHotelID) {
		SHotelID = sHotelID;
	}

	public String getSStatus() {
		return SStatus;
	}

	public void setSStatus(String sStatus) {
		SStatus = sStatus;
	}

	public String getSSupplierTypeID() {
		return SSupplierTypeID;
	}

	public void setSSupplierTypeID(String sSupplierTypeID) {
		SSupplierTypeID = sSupplierTypeID;
	}

	public String getMHotelID() {
		return MHotelID;
	}

	public void setMHotelID(String mHotelID) {
		MHotelID = mHotelID;
	}

	public String getMStatus() {
		return MStatus;
	}

	public void setMStatus(String mStatus) {
		MStatus = mStatus;
	}

	public int getSSupplierID() {
		return SSupplierID;
	}

	public void setSSupplierID(int sSupplierID) {
		SSupplierID = sSupplierID;
	}

	public Date getUpdatedAt() {
		return UpdatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		UpdatedAt = updatedAt;
	}

	
	

}
