package com.elong.nb.service.task;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RecursiveTask;

import com.elong.nb.dao.adapter.repository.InventoryRepository;
import com.elong.nb.model.bean.Inventory;

import edu.emory.mathcs.backport.java.util.Arrays;

public class InventoryHotelIdTask  extends RecursiveTask<List<Inventory>> {

	private String[] mHotelIdArray;
	private List<String[]> sHotelIdArrays;
	private Date startDate;
	private Date endDate;
	private boolean isNeedInstantConfirm;
	private String roomTypeId;
	private String guid;
	private InventoryRepository inventoryDao;
	public InventoryHotelIdTask(String[] mHotelIdArray,
			List<String[]> sHotelIdArrays, String roomTypeId, Date startDate, Date endDate,
			boolean isNeedInstantConfirm,InventoryRepository inventoryDao,String guid) {
		super();
		this.mHotelIdArray = mHotelIdArray;
		this.sHotelIdArrays = sHotelIdArrays;
		this.startDate = startDate;
		this.endDate = endDate;
		this.isNeedInstantConfirm = isNeedInstantConfirm;
		this.roomTypeId = roomTypeId;
		this.inventoryDao=inventoryDao;
		this.guid=guid;
	}
	@Override
	protected List<Inventory> compute() {
		// TODO Auto-generated method stub
		List<InventoryHotelCodeTask> tasks=new ArrayList<InventoryHotelCodeTask>();
		for(int i=0;i<mHotelIdArray.length;i++){
			if(sHotelIdArrays.get(i)!=null){
				List<String> hotelCodes= Arrays.asList(sHotelIdArrays.get(i));
				InventoryHotelCodeTask task=new InventoryHotelCodeTask(mHotelIdArray[i],hotelCodes,roomTypeId,startDate,endDate,isNeedInstantConfirm,inventoryDao,guid);
				tasks.add(task);
			}
		}
		invokeAll(tasks);
		List<Inventory> lists=new ArrayList<Inventory>();
		for(int i=0;i<tasks.size();i++){
			InventoryHotelCodeTask task=tasks.get(i);
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
		return lists;
	}

}
