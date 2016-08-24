package com.elong.nb.model.rateplan;

import java.util.List;

import com.google.gson.annotations.Since;

public class HotelRatePlan {
	
	@Since(1.09)
	private String HotelID;

    private List<SupplierRatePlan> Suppliers ;

    private List<RatePlan> RatePlans ;

    @Since(1.11)
    private List<HotelGift> Gifts ;

	public String getHotelID() {
		return HotelID;
	}

	public void setHotelID(String hotelID) {
		HotelID = hotelID;
	}

	public List<SupplierRatePlan> getSuppliers() {
		return Suppliers;
	}

	public void setSuppliers(List<SupplierRatePlan> suppliers) {
		Suppliers = suppliers;
	}

	public List<RatePlan> getRatePlans() {
		return RatePlans;
	}

	public void setRatePlans(List<RatePlan> ratePlans) {
		RatePlans = ratePlans;
	}

	public List<HotelGift> getGifts() {
		return Gifts;
	}

	public void setGifts(List<HotelGift> gifts) {
		Gifts = gifts;
	}

    
    //[OnSerializing]
    //private void OnSerializingMethod(StreamingContext context)
    //{

     //   if (com.elong.api.core.wcf.ApiContext.Current.Version < 1.09)
     //   {
     //       this.HotelID = null;
     //   }
     //   if (com.elong.api.core.wcf.ApiContext.Current.Version < 1.11)
     //   {
      //      this.Gifts = null;
      //  }
   // }
}
