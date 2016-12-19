package com.elong.nb.service.task;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RecursiveTask;

import org.apache.commons.lang3.StringUtils;

import com.elong.nb.common.util.CommonsUtil;
import com.elong.nb.dao.adapter.repository.RatePlanRepository;
import com.elong.nb.model.bean.enums.EnumPaymentType;
import com.elong.nb.model.rateplan.fornb.HotelDetail;
import com.elong.nb.model.rateplan.fornb.SearchHotelRatePlanListReq;
import com.elong.nb.model.rateplan.fornb.SearchHotelRatePlanListResp;

public class RatePlanTask extends RecursiveTask<List<HotelDetail>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> hotelCodes;
	private String guid;
	private RatePlanRepository ratePlanRepository;
	private EnumPaymentType paymentType;
	private static final int rpThreadSize=Integer.valueOf(CommonsUtil.CONFIG_PROVIDAR.getProperty("inv.thread.size"));
	public RatePlanTask(List<String> hotelCodes,EnumPaymentType paymentType,RatePlanRepository ratePlanRepository,String guid) {
		this.paymentType=paymentType;
		this.hotelCodes = hotelCodes;
		this.guid=guid;
		this.ratePlanRepository = ratePlanRepository;
	}

	@Override
	protected List<HotelDetail> compute() {
		List<HotelDetail> lists = new ArrayList<HotelDetail>();
		if (hotelCodes.size() <= rpThreadSize) {
				try {
					SearchHotelRatePlanListReq req=new SearchHotelRatePlanListReq();
					if (paymentType != EnumPaymentType.All) {
						req.setPaymentType(paymentType.getValue());
					}
					int preCount=10;
					List<String> shotelIdsList=new LinkedList<String>();
					if(hotelCodes.size()>=preCount){
						int count=hotelCodes.size()/preCount;
						if(hotelCodes.size()%preCount==0){
							count--;
						}
						for(int i=0;i<=count;i++){
							int size=(i+1)*10<hotelCodes.size()?(i+1)*preCount:hotelCodes.size();
							shotelIdsList.add(StringUtils.join(hotelCodes.subList(i*preCount, size), ','));
						}
					}
					for(String shotelIds:shotelIdsList){
						req.setShotelId(shotelIds);
						SearchHotelRatePlanListResp res = this.ratePlanRepository.getRatePlan(req, guid);
						if (res != null&&res.getResult()!=null&&res.getResult().size() > 0) {
							lists.addAll(res.getResult());
						}
					}
				} catch (Exception ex) {
					throw new RuntimeException("Inner Exception: RatePlanTaskException:"+ex.getMessage());
				}
		} else {
			int threadCount=hotelCodes.size()/rpThreadSize;
			if(hotelCodes.size()%rpThreadSize==0){
				threadCount--;
			}
			List<RatePlanTask> tasks=new LinkedList<RatePlanTask>();
			for(int i=0;i<=threadCount;i++){
				int size=(i+1)*rpThreadSize<hotelCodes.size()?(i+1)*rpThreadSize:hotelCodes.size();
				RatePlanTask task = new RatePlanTask(hotelCodes.subList(i*rpThreadSize, size),paymentType,ratePlanRepository,guid);
						
				tasks.add(task);
			}
			invokeAll(tasks);
			for(int i=0;i<tasks.size();i++){
			RatePlanTask task=tasks.get(i);
			try {
				List<HotelDetail> list=task.get();
				if(list!=null){
					lists.addAll(list);
				}
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
		return lists;
	}

}
