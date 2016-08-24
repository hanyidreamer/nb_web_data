package com.elong.nb.model.rateplan;

import java.util.Date;

public class HotelGiftDate {

	 /// <summary>
    /// 礼品生效开始日期
    /// </summary>
    private Date StartDate;

    /// <summary>
    /// 礼品生效结束日期
    /// </summary>
    private Date EndDate;

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
    
    
}
