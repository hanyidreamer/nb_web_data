package com.elong.nb.service.task;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RecursiveTask;

import com.elong.nb.dao.adapter.repository.RatePlanRepository;
import com.elong.nb.model.rateplan.fornb.HotelDetail;
import com.elong.nb.model.rateplan.fornb.SearchHotelRatePlanListReq;
import com.elong.nb.model.rateplan.fornb.SearchHotelRatePlanListResp;

public class RatePlanHotelCodeTask extends RecursiveTask<List<HotelDetail>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> hotelCodes;
	private String guid;
	private RatePlanRepository ratePlanRepository;

	public RatePlanHotelCodeTask(List<String> hotelCodes,RatePlanRepository ratePlanRepository,String guid) {
		this.hotelCodes = hotelCodes;
		this.guid=guid;
		this.ratePlanRepository = ratePlanRepository;
	}

	@Override
	protected List<HotelDetail> compute() {
		List<HotelDetail> lists = new ArrayList<HotelDetail>();
		if (hotelCodes.size() < 2) {
			for (String hotelCode : hotelCodes) {
				try {
					SearchHotelRatePlanListReq req=new SearchHotelRatePlanListReq();
					req.setShotelId(hotelCode);
					SearchHotelRatePlanListResp res = this.ratePlanRepository.getRatePlan(req, guid);
					if (res != null&&res.getResult()!=null&&res.getResult().size() > 0) {
						lists.addAll(res.getResult());
					}
				} catch (Exception ex) {
					throw new RuntimeException("Inner Exception: InventoryTaskException:"+ex.getMessage());
				}
			}
		} else {
			int size = hotelCodes.size() / 2;
			RatePlanHotelCodeTask task1 = new RatePlanHotelCodeTask(hotelCodes.subList(0, size),ratePlanRepository,guid);
			RatePlanHotelCodeTask task2 = new RatePlanHotelCodeTask(hotelCodes.subList(size, hotelCodes.size()),
					ratePlanRepository,guid);
			invokeAll(task1, task2);
			try {
				List<HotelDetail> list1;
				list1 = task1.get();
				List<HotelDetail> list2 = task2.get();
				if (list1 != null) {
					lists.addAll(list1);
				}
				if (list2 != null) {
					lists.addAll(list2);
				}
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return lists;
	}

}
