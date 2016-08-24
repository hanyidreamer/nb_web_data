package com.elong.nb.model.rateplan;

import java.util.List;

import com.elong.nb.model.bean.enums.EnumInvoiceMode;
import com.google.gson.annotations.Since;

public class SupplierRatePlan {
	
	 /// <summary>
    /// 酒店编码(SHotelID)
    /// </summary>
    private String HotelCode ;  

    /// <summary>
    /// 周末开始
    /// </summary>
    private int WeekendStart ;

    /// <summary>
    /// 周末结束
    /// </summary>
    private int WeekendEnd ;

    /// <summary>
    /// 预定规则
    /// </summary>
    private List<BaseBookingRule> BookingRules ;

    /// <summary>
    /// 房型的M-S的关系
    /// </summary>
    @Since(1.10)
    private List<MSRoomRelation> Rooms ;

    /// <summary>
    /// 
    /// </summary>
    @Since(1.11)
    private EnumInvoiceMode InvoiceMode ;

	public String getHotelCode() {
		return HotelCode;
	}

	public void setHotelCode(String hotelCode) {
		HotelCode = hotelCode;
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

	public List<BaseBookingRule> getBookingRules() {
		return BookingRules;
	}

	public void setBookingRules(List<BaseBookingRule> bookingRules) {
		BookingRules = bookingRules;
	}

	public List<MSRoomRelation> getRooms() {
		return Rooms;
	}

	public void setRooms(List<MSRoomRelation> rooms) {
		Rooms = rooms;
	}

	public EnumInvoiceMode getInvoiceMode() {
		return InvoiceMode;
	}

	public void setInvoiceMode(EnumInvoiceMode invoiceMode) {
		InvoiceMode = invoiceMode;
	}


    //[OnSerializing]
    //private void OnSerializingMethod(StreamingContext context)
    //{

    //    if (com.elong.api.core.wcf.ApiContext.Current.Version < 1.10)
     //   {
     //       this.Rooms = null;
     //   }
     //   if (com.elong.api.core.wcf.ApiContext.Current.Version < 1.11)
     //   {
     //       this.InvoiceMode = null;
     //   }
        
    //}

    
    
}
