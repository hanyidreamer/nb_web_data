/**
 * 
 */
package com.elong.nb.dao.adapter.repository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.elong.hotel.goods.ds.thrift.GetBaseRatePlanDRRGiftRequest;
import com.elong.hotel.goods.ds.thrift.GetBaseRatePlanDRRGiftResponse;
import com.elong.hotel.goods.ds.thrift.MetaMhotel;
import com.elong.nb.agent.thrift.utils.ThriftUtils;
import com.elong.nb.checklist.CheckListUtil;
import com.elong.nb.common.model.EnumBookingChannel;
import com.elong.nb.common.model.EnumMemberLevel;
import com.elong.nb.common.model.EnumSellChannel;
import com.elong.nb.common.model.ProxyAccount;
import com.elong.nb.common.util.CommonsUtil;
import com.elong.nb.dao.adapter.AbstractGoodsAdapter;
import com.elong.nb.dao.adapter.RatePlanAdapter;
import com.elong.nb.data.biglog.BigLog;
import com.elong.nb.model.HotelIdAttr;
import com.elong.nb.model.bean.enums.EnumPaymentType;
import com.elong.nb.model.common.DataRestResponseCommon;
import com.elong.nb.model.rateplan.HotelRatePlan;
import com.elong.nb.model.rateplan.fornb.RequestBase;
import com.elong.nb.model.rateplan.fornb.SearchHotelRatePlanListReq;
import com.elong.nb.model.rateplan.fornb.SearchHotelRatePlanListResp;
import com.elong.nb.util.HttpUtil;
import com.google.gson.Gson;

/**
 * @author user
 *
 */
@Repository
public class RatePlanRepository {
	private static final String server_ip=CommonsUtil.CONFIG_PROVIDAR.getProperty("goods.server_ip");
	private static final int server_port=Integer.valueOf(CommonsUtil.CONFIG_PROVIDAR.getProperty("goods.server_port"));
	private static final int server_timeout=Integer.valueOf(CommonsUtil.CONFIG_PROVIDAR.getProperty("goods.server_timeout"));
	private final static String RPURL=getServerUrl("/rest/com/elong/hotel/product/entity/req/forpartner/nbapi/SearchHotelRatePlanListReq");
	private static String getServerUrl(String query){
		    String serverURL=CommonsUtil.CONFIG_PROVIDAR.getProperty("rp.url");
	        if (StringUtils.isBlank(serverURL)){
	        		throw new RuntimeException("Inner Error:RP URL为空，请联系管理员检查配置");
	        }
	        return serverURL + query;
	}
	public SearchHotelRatePlanListResp getRatePlan(SearchHotelRatePlanListReq req,String guid){
		RequestBase<SearchHotelRatePlanListReq> request=new RequestBase<SearchHotelRatePlanListReq>();
		request.setRealRequest(req);
		request.setLogId(UUID.randomUUID().toString());
		String json=JSON.toJSONString(request);
		DataRestResponseCommon<SearchHotelRatePlanListResp> response = HttpUtil.getDataRestResponse(RPURL, "requestJson="+json,"application/x-www-form-urlencoded",new DataRestResponseCommon<SearchHotelRatePlanListResp>(),new TypeReference<DataRestResponseCommon<SearchHotelRatePlanListResp>>(){});
		return response.getRealResponse();
	}
	public List<HotelRatePlan> getRatePlans(ProxyAccount proxyInfo,
			List<HotelIdAttr> hotelIdAttrs,EnumPaymentType paymentType,Map<String, EnumPaymentType> hotelCodeFilterType, Map<String, Integer> shotelCooperationTypeMap, boolean isCn,String guid) {
		List<HotelRatePlan> ratePlans=null;
		BigLog log = new BigLog();
		log.setUserLogType(guid);
		log.setAppName("RatePlanRepository");
		log.setTraceId(guid);
		log.setSpan("1.1");
		log.setServiceName("getRatePlans");
		GetBaseRatePlanDRRGiftRequest request=new GetBaseRatePlanDRRGiftRequest();
		if(proxyInfo.getBookingChannel()!=null){
			request.setBooking_channel(proxyInfo.getBookingChannel().getValue());
		}else{
			request.setBooking_channel(EnumBookingChannel.OnLine.getValue());
		}
		if(proxyInfo.getSellChannel()!=null){
			request.setSell_channel(proxyInfo.getSellChannel().getValue());
		}else{
			request.setSell_channel(EnumSellChannel.A.getValue());
		}
		if(proxyInfo.getMemberLevel()!=null){
			request.setMember_level(proxyInfo.getMemberLevel().getValue());
		}else{
			request.setMember_level(EnumMemberLevel.Normal.getValue());
		}
		request.setPayment_type((short)paymentType.getValue());
		request.setTraceId(guid);
		List<MetaMhotel> mhotels=new LinkedList<MetaMhotel>();
		for(HotelIdAttr hotelIdAttr:hotelIdAttrs){
			int hotelId=Integer.valueOf(hotelIdAttr.getHotelId());
			if(hotelIdAttr.getHotelCodes()!=null&&hotelIdAttr.getHotelCodes().size()>0){
				MetaMhotel mhotel=new MetaMhotel();
				mhotel.setMhotel_id(hotelId);
				mhotel.setShotel_id(new LinkedList<Integer>());
				for(String hotelCode:hotelIdAttr.getHotelCodes()){
					mhotel.getShotel_id().add(Integer.valueOf(hotelCode));
				}
				mhotels.add(mhotel);
			}else{
				MetaMhotel mhotel=new MetaMhotel();
				mhotel.setMhotel_id(hotelId);
				mhotels.add(mhotel);
			}
		}
		request.setMhotel(mhotels);
		try {
			long start = System.currentTimeMillis();
			GetBaseRatePlanDRRGiftResponse response=ThriftUtils.getMetaRatePlanDrrGift(request, server_ip, server_port, server_timeout);
			long end=System.currentTimeMillis();
			log.setElapsedTime(String.valueOf(end-start));
			Gson gson=new Gson();
//			System.out.println(gson.toJson(response));
//			System.out.println(gson.toJson(request));
			if(response!=null&&response.return_code==0){
				AbstractGoodsAdapter<HotelRatePlan, GetBaseRatePlanDRRGiftResponse> adapter=new RatePlanAdapter();
				adapter.setFilter(hotelCodeFilterType,shotelCooperationTypeMap, isCn);
				ratePlans=adapter.toNBObject(response);
			}else if(response.return_code>0){
//				Gson gson=new Gson();
				log.setRequestBody(gson.toJson(request));
				log.setBusinessErrorCode(String.valueOf(response.return_code));
				log.setExceptionMsg(response.getReturn_msg());
				ratePlans=new ArrayList<HotelRatePlan>();
			}else{
				throw new RuntimeException(response.getReturn_msg());
			}
		} catch (Exception ex) {
			Gson gson=new Gson();
			log.setRequestBody(gson.toJson(request));
			log.setException(ex);
			log.setExceptionMsg(ex.getMessage());
			CheckListUtil.error(log);
			throw new RuntimeException("RatePlan:"+ex.getMessage(),ex);
		}
		CheckListUtil.info(log);
		return ratePlans;
	}
}
