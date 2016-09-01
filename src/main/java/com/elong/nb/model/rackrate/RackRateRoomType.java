package com.elong.nb.model.rackrate;

import java.util.Date;


public class RackRateRoomType {

	            //[JsonIgnore] Gson用transient忽略
		        private transient long PriceId;

		        private String HotelCode;

		        private String RoomTypeID;

		        private Date BeginDate ;

		        private Date EndDate;

		        private double RackRate;

		        private String CurrencyCode;

				public long getPriceId() {
					return PriceId;
				}

				public void setPriceId(long priceId) {
					PriceId = priceId;
				}

				public String getHotelCode() {
					return HotelCode;
				}

				public void setHotelCode(String hotelCode) {
					HotelCode = hotelCode;
				}

				public String getRoomTypeID() {
					return RoomTypeID;
				}

				public void setRoomTypeID(String roomTypeID) {
					RoomTypeID = roomTypeID;
				}

				public Date getBeginDate() {
					return BeginDate;
				}

				public void setBeginDate(Date beginDate) {
					BeginDate = beginDate;
				}

				public Date getEndDate() {
					return EndDate;
				}

				public void setEndDate(Date endDate) {
					EndDate = endDate;
				}

				public double getRackRate() {
					return RackRate;
				}

				public void setRackRate(double rackRate) {
					RackRate = rackRate;
				}

				public String getCurrencyCode() {
					return CurrencyCode;
				}

				public void setCurrencyCode(String currencyCode) {
					CurrencyCode = currencyCode;
				}
		        
		        
}
