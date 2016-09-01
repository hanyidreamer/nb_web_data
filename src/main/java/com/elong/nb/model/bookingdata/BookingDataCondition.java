package com.elong.nb.model.bookingdata;

import java.util.Date;

import com.elong.nb.model.bean.enums.EnumPaymentType;

public class BookingDataCondition {

	        //[Required(ErrorMessage = ErrorCode.Common_HotelIdRequired)]
	        private String HotelId;

	        //[Required(ErrorMessage = ErrorCode.Common_HotelCodeRequired)]
	        private String HotelCode;

	        
	        private String RoomId;

	        //[Required(ErrorMessage = ErrorCode.Common_RoomTypeIdRequired)]
	        private String RoomTypeId;

	        //[Required(ErrorMessage = ErrorCode.Common_RatePlanIdRequired)]
	        private int RatePlanId;

	        //[Required(ErrorMessage = ErrorCode.Common_ArrivalDateRequired)]
	        //[Compare("DepartureDate", core.validation.CompareOperator.LessThanEqual, ErrorMessage = ErrorCode.Search_DepartureDateRangeInvalid)]
	        private Date ArrivalDate;

	        //[Required(ErrorMessage = ErrorCode.Common_DepartureDateRequired)]
	        private Date DepartureDate;


	        private EnumPaymentType PaymentType;
	        
	        /// <summary>
	        /// 是否需要即时确认信息
	        /// </summary>
	        private boolean isNeedInstantConfirm;

	        /// <summary>
	        /// 是否返回drr计算后的价格
	        /// </summary>
	        private boolean IsRatesWithDRR;

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

			public String getRoomId() {
				return RoomId;
			}

			public void setRoomId(String roomId) {
				RoomId = roomId;
			}

			public String getRoomTypeId() {
				return RoomTypeId;
			}

			public void setRoomTypeId(String roomTypeId) {
				RoomTypeId = roomTypeId;
			}

			public int getRatePlanId() {
				return RatePlanId;
			}

			public void setRatePlanId(int ratePlanId) {
				RatePlanId = ratePlanId;
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

			public EnumPaymentType getPaymentType() {
				return PaymentType;
			}

			public void setPaymentType(EnumPaymentType paymentType) {
				PaymentType = paymentType;
			}

			public boolean isNeedInstantConfirm() {
				return isNeedInstantConfirm;
			}

			public void setNeedInstantConfirm(boolean isNeedInstantConfirm) {
				this.isNeedInstantConfirm = isNeedInstantConfirm;
			}

			public boolean isIsRatesWithDRR() {
				return IsRatesWithDRR;
			}

			public void setIsRatesWithDRR(boolean isRatesWithDRR) {
				IsRatesWithDRR = isRatesWithDRR;
			}
	        
	        
}
