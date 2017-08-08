package com.elong.nb.model.rateplan.fornb;

import java.util.List;

import com.elong.nb.model.common.ResponseBase;

public class SearchHotelRatePlanListResp extends ResponseBase {

	private List<HotelDetail> result;

	public List<HotelDetail> getResult() {
		return result;
	}

	public void setResult(List<HotelDetail> result) {
		this.result = result;
	}
}
