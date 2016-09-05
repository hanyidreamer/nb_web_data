package com.elong.nb.dao.adapter.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.joda.time.DateTime;
import org.springframework.stereotype.Repository;

import com.elong.common.util.StringUtils;
import com.elong.nb.agent.ProductForPartnerServiceContract.GetInvChangeAndInstantConfirmRequest;
import com.elong.nb.agent.ProductForPartnerServiceContract.GetInvChangeAndInstantConfirmResponse;
import com.elong.nb.agent.ProductForPartnerServiceContract.GetInventoryChangeDetailRequest;
import com.elong.nb.agent.ProductForPartnerServiceContract.GetInventoryChangeDetailResponse;
import com.elong.nb.agent.ProductForPartnerServiceContract.IProductForPartnerServiceContract;
import com.elong.nb.agent.ProductForPartnerServiceContract.ResourceInvAndInstantConfirmState;
import com.elong.nb.agent.ProductForPartnerServiceContract.ResourceInventoryState;
import com.elong.nb.model.bean.Inventory;
import com.elong.nb.util.DateUtil;

@Repository
public class InventoryRepository {

	@Resource
	private IProductForPartnerServiceContract ProductForPartnerServiceContract;
	public List<Inventory> getInventorys(String mHotelId,String sHotelId,String roomTypeId,Date startDate,Date endDate,boolean isNeedInstantConfirm){
		List<Inventory> inventorys=new ArrayList<Inventory>();
		if(isNeedInstantConfirm){
			GetInvChangeAndInstantConfirmRequest request=new GetInvChangeAndInstantConfirmRequest();
			request.setHotelID(sHotelId);
			request.setBeginTime(DateUtil.toDateTime(startDate));
			request.setEndTime(DateUtil.toDateTime(endDate));
			if(StringUtils.isNotBlank(roomTypeId)){
				request.setRoomTypeIDs(roomTypeId);
			}
			request.setOperatorTime(new DateTime());
			request.setIsNeedInstantConfirm(isNeedInstantConfirm);
			GetInvChangeAndInstantConfirmResponse response=this.ProductForPartnerServiceContract.getInventoryChangeDetailAndInstantConfirm(request);
			if(response!=null&&response.getResourceInvAndInstantConfirmStateList()!=null&&response.getResourceInvAndInstantConfirmStateList().getResourceInvAndInstantConfirmState().size()>0){
				for(ResourceInvAndInstantConfirmState item:response.getResourceInvAndInstantConfirmStateList().getResourceInvAndInstantConfirmState()){
					Inventory inv=new Inventory();
					inv.setHotelID(mHotelId);
					inv.setStartDate(item.getBeginDate().toDate());
					inv.setEndDate(item.getEndDate().toDate());
					inv.setStartTime(item.getBeginTime());
					inv.setEndTime(item.getEndTime());
					inv.setAvailableAmount(item.getAvailableAmount());
					inv.setAvailableDate(item.getAvailableTime().toDate());
					inv.setRoomTypeID(item.getRoomTypeID());
					inv.setStatus(item.getStatus()==0);
					inv.setOverBooking(item.getIsOverBooking());
					inv.setHotelCode(item.getHotelID());
					inv.setIsInstantConfirm(item.isIsInstantConfirm());
					inv.setIC_BeginTime(item.getICBeginTime());
					inv.setIC_EndTime(item.getICEndTime());
					convertInventory(inv);
					inventorys.add(inv);
				}
			}else{
				inventorys=new ArrayList<Inventory>();
			}
			
		}else{
			GetInventoryChangeDetailRequest request=new GetInventoryChangeDetailRequest();
			request.setHotelID(sHotelId);
			request.setBeginTime(DateUtil.toDateTime(startDate));
			request.setEndTime(DateUtil.toDateTime(endDate));
			if(StringUtils.isNotBlank(roomTypeId)){
				request.setRoomTypeIDs(roomTypeId);
			}
			request.setOperatorTime(new DateTime());
			GetInventoryChangeDetailResponse response=this.ProductForPartnerServiceContract.getInventoryChangeDetail(request);
			if(response!=null&&response.getResourceInventoryStateList().getResourceInventoryState().size()>0){
				for(ResourceInventoryState item:response.getResourceInventoryStateList().getResourceInventoryState()){
					Inventory inv=new Inventory();
					inv.setHotelID(mHotelId);
					inv.setStartDate(item.getBeginDate().toDate());
					inv.setEndDate(item.getEndDate().toDate());
					inv.setStartTime(item.getBeginTime());
					inv.setEndTime(item.getEndTime());
					inv.setAvailableDate(item.getAvailableTime().toDate());
					inv.setRoomTypeID(item.getRoomTypeID());
					inv.setStatus(item.getStatus()==0);
					inv.setAvailableAmount(item.getAvailableAmount());
					inv.setOverBooking(item.getIsOverBooking());
					inv.setHotelCode(item.getHotelID());
					convertInventory(inv);
					inventorys.add(inv);
				}
			}else{
				inventorys=new ArrayList<Inventory>();
			}
		}
		return inventorys;
	}
	private void convertInventory(Inventory inv){
		if(inv.getAvailableAmount()>3){
			inv.setAvailableAmount(3);
			inv.setOverBooking(0);
		}
	}
}
