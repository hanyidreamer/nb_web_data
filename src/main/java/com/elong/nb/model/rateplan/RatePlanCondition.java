package com.elong.nb.model.rateplan;



import com.elong.nb.model.bean.enums.EnumPaymentType;

public class RatePlanCondition {

	 //[NumberIds(ErrorMessage = ErrorCode.Common_NumberIdsFormatErrorAndLessThanTen)]
		        private String HotelIds;

		        //[Required(ErrorMessage = ErrorCode.Common_PaymentTypeRequired)]
		        private EnumPaymentType PaymentType;

		        /// <summary>
		        /// 1---return bookingChannel
		        /// </summary>
		        private String Options;

				public String getHotelIds() {
					return HotelIds;
				}

				public void setHotelIds(String hotelIds) {
					HotelIds = hotelIds;
				}

				public EnumPaymentType getPaymentType() {
					return PaymentType;
				}

				public void setPaymentType(EnumPaymentType paymentType) {
					PaymentType = paymentType;
				}

				public String getOptions() {
					return Options;
				}

				public void setOptions(String options) {
					Options = options;
				}

		        
		        
}
