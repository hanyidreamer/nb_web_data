package com.elong.nb.model.bookingdata;

import java.util.List;

import com.elong.nb.model.inventory.bean.Inventory;
import com.elong.nb.model.rate.bean.Rate;
import com.elong.nb.model.rateplan.BaseBookingRule;
import com.google.gson.annotations.Since;
import com.elong.nb.model.rateplan.RatePlan;

public class BookingDataResult {
	
	 private RatePlan RatePlan;

     /// <summary>
     /// 周末开始
     /// </summary>
     private int WeekendStart ;

     /// <summary>
     /// 周末结束
     /// </summary>
     private int WeekendEnd;

     /// <summary>
     /// 预定规则
     /// </summary>
     private List<com.elong.nb.model.bean.base.BaseBookingRule> BookingRules;


     private List<com.elong.nb.model.bean.Inventory> Inventories;

     private List<Rate> Rates;

     @Since(1.26)
     private ObjectEffectiveStatus ObjectEffectiveStatus;

	public RatePlan getRatePlan() {
		return RatePlan;
	}

	public void setRatePlan(RatePlan ratePlan) {
		RatePlan = ratePlan;
	}

	public int getWeekendStart() {
		return WeekendStart;
	}

	public void setWeekendStart(int weekendStart) {
		WeekendStart = weekendStart;
	}

	public int getWeekendEnd() {
		return WeekendEnd;
	}

	public void setWeekendEnd(int weekendEnd) {
		WeekendEnd = weekendEnd;
	}

	public List<com.elong.nb.model.bean.base.BaseBookingRule> getBookingRules() {
		return BookingRules;
	}

	public void setBookingRules(List<com.elong.nb.model.bean.base.BaseBookingRule> bookingRules) {
		BookingRules = bookingRules;
	}

	public List<com.elong.nb.model.bean.Inventory> getInventories() {
		return Inventories;
	}

	public void setInventories(List<com.elong.nb.model.bean.Inventory> inventories) {
		Inventories = inventories;
	}

	public List<Rate> getRates() {
		return Rates;
	}

	public void setRates(List<Rate> rates) {
		Rates = rates;
	}

	public ObjectEffectiveStatus getObjectEffectiveStatus() {
		return ObjectEffectiveStatus;
	}

	public void setObjectEffectiveStatus(ObjectEffectiveStatus objectEffectiveStatus) {
		ObjectEffectiveStatus = objectEffectiveStatus;
	}

     
     /*
     //public 
     [OnSerializing]
     private void OnSerializingMethod(StreamingContext context)
     {
         if (ApiContext.Current.Version < 1.26)
         {
             this.ObjectEffectiveStatus = null;
         }
     } */

}
