package com.elong.nb.service.task;

import java.util.ArrayList;
import java.util.Currency;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RecursiveTask;

import javax.annotation.Resource;

import com.elong.nb.dao.adapter.repository.InventoryRepository;
import com.elong.nb.model.bean.Inventory;

public class InventoryHotelCodeTask extends RecursiveTask<List<Inventory>> {

	private String hotelId;
	private List<String> hotelCodes;
	private Date startDate;
	private Date endDate;
	private boolean isNeedInstantConfirm;
	private String roomTypeId;
	private InventoryRepository inventoryDao;

	public InventoryHotelCodeTask(String hotelId, List<String> hotelCodes,
			String roomTypeId, Date startDate, Date endDate,
			boolean isNeedInstantConfirm, InventoryRepository inventoryDao) {
		this.hotelId = hotelId;
		this.hotelCodes = hotelCodes;
		this.startDate = startDate;
		this.endDate = endDate;
		this.isNeedInstantConfirm = isNeedInstantConfirm;
		this.inventoryDao = inventoryDao;
	}

	@Override
	protected List<Inventory> compute() {
		List<Inventory> lists = new ArrayList<Inventory>();
		if (hotelCodes.size() < 5) {
			for (String hotelCode : hotelCodes) {
				try {
					System.out.println("<------------"+hotelCode);
					// List<Inventory> list=new ArrayList<Inventory>();
					long start=System.currentTimeMillis();
					List<Inventory> list = this.inventoryDao.getInventorys(
							hotelId, hotelCode, roomTypeId, startDate, endDate,
							isNeedInstantConfirm);
					long end =System.currentTimeMillis();
					System.out.println("task network:"+(end-start));
					if (list != null && list.size() > 0) {
						lists.addAll(list);
					}
				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
			}
		} else {
			int size = hotelCodes.size() / 2;
			InventoryHotelCodeTask task1 = new InventoryHotelCodeTask(hotelId,
					hotelCodes.subList(0, size), roomTypeId, startDate,
					endDate, isNeedInstantConfirm, inventoryDao);
			InventoryHotelCodeTask task2 = new InventoryHotelCodeTask(hotelId,
					hotelCodes.subList(size + 1, hotelCodes.size() - 1),
					roomTypeId, startDate, endDate, isNeedInstantConfirm,
					inventoryDao);
			invokeAll(task1, task2);
			try {
				List<Inventory> list1;
				list1 = task1.get();
				List<Inventory> list2 = task2.get();
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
