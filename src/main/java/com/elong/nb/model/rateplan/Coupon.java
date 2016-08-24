package com.elong.nb.model.rateplan;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;

public class Coupon {

	            @XmlElement(name="EffectiveDateFrom")
		        private Date EffectiveDateFrom;
	            @XmlElement(name="EffectiveDateTo")
		        private Date EffectiveDateTo;
	            @XmlElement(name="CouponRedemptionUpperLimit")
		        private double CouponRedemptionUpperLimit;
	            @XmlElement(name="PromotionType")
		        private int PromotionType;
	            @XmlElement(name="RoomTypeID")
		        private String RoomTypeID;
	            @XmlElement(name="RatePlanID")
		        private int RatePlanID;
				public Date getEffectiveDateFrom() {
					return EffectiveDateFrom;
				}
				public void setEffectiveDateFrom(Date effectiveDateFrom) {
					EffectiveDateFrom = effectiveDateFrom;
				}
				public Date getEffectiveDateTo() {
					return EffectiveDateTo;
				}
				public void setEffectiveDateTo(Date effectiveDateTo) {
					EffectiveDateTo = effectiveDateTo;
				}
				public double getCouponRedemptionUpperLimit() {
					return CouponRedemptionUpperLimit;
				}
				public void setCouponRedemptionUpperLimit(double couponRedemptionUpperLimit) {
					CouponRedemptionUpperLimit = couponRedemptionUpperLimit;
				}
				public int getPromotionType() {
					return PromotionType;
				}
				public void setPromotionType(int promotionType) {
					PromotionType = promotionType;
				}
				public String getRoomTypeID() {
					return RoomTypeID;
				}
				public void setRoomTypeID(String roomTypeID) {
					RoomTypeID = roomTypeID;
				}
				public int getRatePlanID() {
					return RatePlanID;
				}
				public void setRatePlanID(int ratePlanID) {
					RatePlanID = ratePlanID;
				}
	            
	            

}
