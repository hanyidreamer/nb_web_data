package com.elong.nb.service.task;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RecursiveTask;

import com.elong.nb.common.util.CommonsUtil;
import com.elong.nb.dao.adapter.repository.InventoryRepository;
import com.elong.nb.model.bean.Inventory;
import com.elong.nb.model.ms.MSHotelIdRelation;

public class InventoryTask extends RecursiveTask<List<Inventory>> {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2354977134625909973L;
	private static final int invThreadSize=Integer.valueOf(CommonsUtil.CONFIG_PROVIDAR.getProperty("inv.thread.size"));
	private List<MSHotelIdRelation> relationList;
	private Date startDate;
	private Date endDate;
	private boolean isNeedInstantConfirm;
	private String roomTypeId;
	private String guid;
	private InventoryRepository inventoryRepository;
	private boolean isForBooking;

	public InventoryTask(List<MSHotelIdRelation> relationList,
			String roomTypeId, Date startDate, Date endDate,
			boolean isNeedInstantConfirm, InventoryRepository inventoryRepository,String guid,boolean isForBooking) {
		this.relationList=relationList;
		this.startDate = startDate;
		this.endDate = endDate;
		this.isNeedInstantConfirm = isNeedInstantConfirm;
		this.guid=guid;
		this.roomTypeId=roomTypeId;
		this.inventoryRepository = inventoryRepository;
		this.isForBooking=isForBooking;
	}

	@Override
	protected List<Inventory> compute() {
		List<Inventory> lists = new ArrayList<Inventory>();
		if (relationList.size() <= invThreadSize) {
			for (MSHotelIdRelation relation : relationList) {
				try {
					List<Inventory> list = this.inventoryRepository.getInventorys(
							relation.getHotelId(), relation.getHotelCode(), roomTypeId, startDate, endDate,
							isNeedInstantConfirm,isForBooking,guid);
					if (list != null && list.size() > 0) {
						lists.addAll(list);
					}
				} catch (Exception ex) {
					throw new RuntimeException("Inner Exception: InventoryTaskException:"+ex.getMessage(),ex);
				}
			}
		} else {
			int threadCount=relationList.size()/invThreadSize;
			if(relationList.size()%invThreadSize==0){
				threadCount--;
			}
			List<InventoryTask> tasks=new ArrayList<InventoryTask>();
			for(int i=0;i<=threadCount;i++){
				int size=(i+1)*invThreadSize<relationList.size()?(i+1)*invThreadSize:relationList.size();
				List<MSHotelIdRelation> rList=relationList.subList(i*invThreadSize, size);
				InventoryTask task = new InventoryTask(rList
						, roomTypeId, startDate,
						endDate, isNeedInstantConfirm, inventoryRepository,guid,isForBooking);
				tasks.add(task);
			}
			
			invokeAll(tasks);
			for(int i=0;i<tasks.size();i++){
				InventoryTask task=tasks.get(i);
				try {
					List<Inventory> list=task.get();
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
