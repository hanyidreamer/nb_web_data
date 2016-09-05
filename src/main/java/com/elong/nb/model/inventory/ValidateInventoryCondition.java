package com.elong.nb.model.inventory;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class ValidateInventoryCondition {
	@SerializedName(value = "HotelId", alternate = "hotelId")
	private String HotelId;
	@SerializedName(value = "HotelCode", alternate = "hotelCode")
	private String HotelCode;
	@SerializedName(value = "RoomTypeId", alternate = "roomTypeId")
	private String RoomTypeId;
	@SerializedName(value = "Amount", alternate = "amount")
	private int Amount;
	@SerializedName(value = "ArrivalDate", alternate = "arrivalDate")
	private Date ArrivalDate;
	@SerializedName(value = "DepartureDate", alternate = "departureDate")
	private Date DepartureDate;
	
	public String getHotelId() {
		return HotelId;
	}
	public void setHotelId(String hotelId) {
		HotelId = hotelId;
	}
	public String getHotelCode() {
		return HotelCode;
	}
	public void setHotelCode(String hotelCode) {
		HotelCode = hotelCode;
	}
	public String getRoomTypeId() {
		return RoomTypeId;
	}
	public void setRoomTypeId(String roomTypeId) {
		RoomTypeId = roomTypeId;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public Date getArrivalDate() {
		return ArrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		ArrivalDate = arrivalDate;
	}
	public Date getDepartureDate() {
		return DepartureDate;
	}
	public void setDepartureDate(Date departureDate) {
		DepartureDate = departureDate;
	}
}
