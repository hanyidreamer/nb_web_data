package com.elong.nb.dao.adapter.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.lang3.ClassUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.alibaba.fastjson.JSON;
import com.elong.common.util.StringUtils;
import com.elong.nb.agent.ProductForPartnerServiceContract.GetInvChangeAndInstantConfirmRequest;
import com.elong.nb.agent.ProductForPartnerServiceContract.GetInvChangeAndInstantConfirmResponse;
import com.elong.nb.agent.ProductForPartnerServiceContract.GetInventoryChangeDetailRequest;
import com.elong.nb.agent.ProductForPartnerServiceContract.GetInventoryChangeDetailResponse;
import com.elong.nb.agent.ProductForPartnerServiceContract.IProductForPartnerServiceContract;
import com.elong.nb.agent.ProductForPartnerServiceContract.ResourceInvAndInstantConfirmState;
import com.elong.nb.agent.ProductForPartnerServiceContract.ResourceInventoryState;
import com.elong.nb.common.biglog.BigLog;
import com.elong.nb.common.biglog.Constants;
import com.elong.nb.model.bean.Inventory;
import com.elong.nb.util.DateUtil;

@Repository
public class InventoryRepository {

	private static Logger logger = LogManager.getLogger("biglog");
	@Resource
	private IProductForPartnerServiceContract productForPartnerServiceContract;
	/**
	 * 获取库存
	 * @param mHotelId
	 * @param sHotelId
	 * @param roomTypeId
	 * @param startDate
	 * @param endDate
	 * @param isNeedInstantConfirm
	 * @return
	 */
	public List<Inventory> getInventorys(String mHotelId,String sHotelId,String roomTypeId,Date startDate,Date endDate,boolean isNeedInstantConfirm){
		List<Inventory> inventorys=new LinkedList<Inventory>();
		RequestAttributes httpRequest = RequestContextHolder.getRequestAttributes();
		Object guid = httpRequest.getAttribute(Constants.ELONG_REQUEST_REQUESTGUID, ServletRequestAttributes.SCOPE_REQUEST);
		BigLog log = new BigLog();
		if(guid!=null)
			log.setUserLogType(guid.toString());
		log.setAppName("wcf");
		log.setTraceId(UUID.randomUUID().toString());
		log.setSpan("1.1");
		//需要即时确认的库存
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
			log.setServiceName("IProductForPartnerServiceContract.getInventoryChangeDetailAndInstantConfirm");
			log.setRequestBody(JSON.toJSONString(request));
			long start = System.currentTimeMillis();
			GetInvChangeAndInstantConfirmResponse response=this.productForPartnerServiceContract.getInventoryChangeDetailAndInstantConfirm(request);
			log.setElapsedTime(String.valueOf(System.currentTimeMillis()-start));
			if(response!=null&&response.getResourceInvAndInstantConfirmStateList()!=null&&response.getResourceInvAndInstantConfirmStateList().getResourceInvAndInstantConfirmState().size()>0){
				log.setBusinessErrorCode("0");
				log.setResponseBody(String.valueOf(response.getResourceInvAndInstantConfirmStateList().getResourceInvAndInstantConfirmState().size()));
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
			log.setServiceName("IProductForPartnerServiceContract.getInventoryChangeDetailAndInstantConfirm");
			log.setRequestBody(JSON.toJSONString(request));
			long start = System.currentTimeMillis();
			GetInventoryChangeDetailResponse response=this.productForPartnerServiceContract.getInventoryChangeDetail(request);
			log.setElapsedTime(String.valueOf(System.currentTimeMillis()-start));
			if(response!=null&&response.getResourceInventoryStateList().getResourceInventoryState().size()>0){
				log.setBusinessErrorCode("0");
				log.setResponseBody(String.valueOf(response.getResourceInventoryStateList().getResourceInventoryState().size()));
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
		logger.info(log.toString());
		return inventorys;
	}
	//超售状态转换
	private void convertInventory(Inventory inv){
		if(inv.getAvailableAmount()>3){
			inv.setAvailableAmount(3);
			inv.setOverBooking(0);
		}
		if(inv.getEndDate().getTime()<new Date(1970,1,1).getTime()){
			inv.setEndDate(new Date(1970,1,1));
		}
		if(inv.getStartDate().getTime()<new Date(1970,1,1).getTime()){
			inv.setStartDate(new Date(1970,1,1));
		}
	}
}
