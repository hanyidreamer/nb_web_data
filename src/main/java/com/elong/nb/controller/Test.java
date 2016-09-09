/*
package com.elong.nb.controller;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.elong.nb.model.effectivestatuscheck.EffectiveStatusRequest;
import com.elong.nb.model.effectivestatuscheck.EffectiveStatusResponse;
import com.elong.nb.model.effectivestatuscheck.SoaRestRequest;
import com.elong.nb.model.effectivestatuscheck.SoaRestResponse;
import com.elong.nb.util.HttpUtil;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class Test {

	@Resource
	HotelDataController controller;
	
	private Gson gson=new Gson();
	
	private Integer max;
	
	
	public Integer getMax() {
		return max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}

	@org.junit.Test
	public void test() throws Exception {

		//HttpServletRequest req=null;
		
		//controller.GetRackRates(req);
		
		//testJson();
		
		Integer a = this.getMax();
		a=0;
		//testString();
		
		//TestListObject();
		
		
		//List<String> al=new ArrayList<String>();
		 //StringBuilder str=new StringBuilder();
		
		//AL(al,str);
		
	try
	{
		ratePlan();
		
		//bookingData();
		
		//rackRates();
	}
	catch(Exception e)
	{
		
	}
		
	}
	
	void testJson()
	{
SoaRestRequest<EffectiveStatusRequest> req = new SoaRestRequest<EffectiveStatusRequest>();
        
        EffectiveStatusRequest eff = new EffectiveStatusRequest();
        	eff.setMhotelId("123");
        	eff.setRoomTypeId("444");
        	eff.setRatePlanId(555);
        	//eff.setCheckinDate(new Date());
        	//eff.setCheckoutDate( new Date());
        req.setRealRequest(eff);
        
       
        String data = gson.toJson(req, SoaRestRequest.class);
        
        SoaRestRequest<EffectiveStatusRequest> str =gson.fromJson(data, new TypeToken<SoaRestRequest<EffectiveStatusRequest>>() {
        }.getType());
         
        
        Object obj =str;
	}
	
	void AL(List<String> al ,StringBuilder str)
	{
		//al = new ArrayList<String>();
		al.add("abc");
		al.add("123");
		str.append("abc");
		str.append("123");
	}
	
	
	void testString()
	{
		String str=",";
		str+="123";
    	str =str.substring(1);
    	
    	String str2="";
		str2+="123,";
    	str2 =str2.substring(0,str2.lastIndexOf(","));
    	
    	String str3=str2;
	}
	
	void TestListObject()
	{
		List<String> list= new ArrayList<String>();
		list.add("abc");
		
		List<String> l2=null;
				
		Object obj = list;
		if(obj instanceof List<?>)
		{
			List<?> l = (List<?>)obj;
			
			if(l.get(0) instanceof String)
			{
		      l2= (List<String>)obj;
			}
		}
	}
	
	void ratePlan() throws Exception
	{
		String reqData ="{\"Version\":1.26,\"Local\":\"zh_CN\",\"Request\":{\"HotelIds\":\"20101001\",\"PaymentType\":\"Prepay\",\"Options\":\"1\"},\"ProxyInfo\":{\"UserName\":\"Ctrip\",\"UserGroup\":1,\"ProxyId\":\"AP0047691\",\"CardNo\":2000000003624295444,\"OrderFrom\":5931,\"MemberLevel\":\"Normal\",\"SellChannel\":\"A\",\"BookingChannel\":\"OnLine\",\"SearchOrderType\":\"OrderFrom\",\"OrderContactType\":\"Proxy\",\"IsFilterSEMHotel\":false,\"EnabledPrepayProducts\":true,\"EnabledPrepaySettlment\":false,\"PrepaySettlementRate\":0.0001,\"EnabledVirtualCardForPrepay\":false,\"EnabledVirtualCardForGuarantee\":false,\"EnabledSpecialRate\":false,\"EnabledInstantConfirm\":false,\"EnabledInvoiceRole\":false,\"EnabledElongNoteReadRole\":false,\"EnabledCouponReadRole\":true,\"EnabledCouponRole\":false,\"EnableForcedGuaranteeOrder\":false,\"EnableIgnoreCheckingDuplicatedOrder\":false,\"EnableReturnAgentcyRateCost\":false,\"ClientIP\":\"127.0.0.1\",\"EnableGroupCoupon\":false,\"EnabledVirtualCardForGroup\":false,\"MaxDays\":180,\"IgnoreCheckGuestName\":false,\"EnabledCommentReadRole\":false,\"LowestProfitPercent\":0.0,\"IntegerPriceType\":1},\"Guid\":\"fc4e936c-b63c-4e87-8437-df6413aa7d35\"}";
				
	    String res = HttpUtil.httpPost("http://localhost:8080/nb_web_data/api/Hotel/GetRatePlans", reqData);
			
		Object obj = res;
		
		obj=obj;
	}
	
	void bookingData() throws Exception
	{
		String reqData ="{\"Version\":1.26,\"Local\":\"zh_CN\",\"Request\":{\"HotelId\":\"90847741\",\"HotelCode\":\"90847741\",\"RoomId\":\"0001\",\"RoomTypeId\":\"0001\",\"RatePlanId\":1024736,\"ArrivalDate\":\"2016-09-17T00:00:00\",\"DepartureDate\":\"2016-09-19T00:00:00\",\"PaymentType\":\"SelfPay\"},\"ProxyInfo\":{\"UserName\":\"Ctrip\",\"UserGroup\":1,\"ProxyId\":\"AP0047691\",\"CardNo\":2000000003624295444,\"OrderFrom\":5931,\"MemberLevel\":\"Normal\",\"SellChannel\":\"A\",\"BookingChannel\":\"OnLine\",\"SearchOrderType\":\"OrderFrom\",\"OrderContactType\":\"Proxy\",\"IsFilterSEMHotel\":false,\"EnabledPrepayProducts\":true,\"EnabledPrepaySettlment\":false,\"PrepaySettlementRate\":0.0001,\"EnabledVirtualCardForPrepay\":false,\"EnabledVirtualCardForGuarantee\":false,\"EnabledSpecialRate\":false,\"EnabledInstantConfirm\":false,\"EnabledInvoiceRole\":false,\"EnabledElongNoteReadRole\":false,\"EnabledCouponReadRole\":true,\"EnabledCouponRole\":false,\"EnableForcedGuaranteeOrder\":false,\"EnableIgnoreCheckingDuplicatedOrder\":false,\"EnableReturnAgentcyRateCost\":false,\"ClientIP\":\"127.0.0.1\",\"EnableGroupCoupon\":false,\"EnabledVirtualCardForGroup\":false,\"MaxDays\":180,\"IgnoreCheckGuestName\":false,\"EnabledCommentReadRole\":false,\"LowestProfitPercent\":0.0,\"IntegerPriceType\":1},\"Guid\":\"72b5f17a-f6b3-4a51-bd4c-82747b6cdd20\"}";
		
		String res = HttpUtil.httpPost("http://localhost:8080/nb_web_data/api/Hotel/GetBookingData", reqData);
			
		Object obj = res;
		
		obj=obj;
	}
	
	
	void rackRates() throws Exception
	{
		String reqData ="{\"Version\":1.26,\"Local\":\"zh_CN\",\"Request\":{\"HotelCodes\":\"00101006\"},\"ProxyInfo\":{\"UserName\":\"Ctrip\",\"UserGroup\":1,\"ProxyId\":\"AP0047691\",\"CardNo\":2000000003624295444,\"OrderFrom\":5931,\"MemberLevel\":\"Normal\",\"SellChannel\":\"A\",\"BookingChannel\":\"OnLine\",\"SearchOrderType\":\"OrderFrom\",\"OrderContactType\":\"Proxy\",\"IsFilterSEMHotel\":false,\"EnabledPrepayProducts\":true,\"EnabledPrepaySettlment\":false,\"PrepaySettlementRate\":0.0001,\"EnabledVirtualCardForPrepay\":false,\"EnabledVirtualCardForGuarantee\":false,\"EnabledSpecialRate\":false,\"EnabledInstantConfirm\":false,\"EnabledInvoiceRole\":false,\"EnabledElongNoteReadRole\":false,\"EnabledCouponReadRole\":true,\"EnabledCouponRole\":false,\"EnableForcedGuaranteeOrder\":false,\"EnableIgnoreCheckingDuplicatedOrder\":false,\"EnableReturnAgentcyRateCost\":false,\"ClientIP\":\"127.0.0.1\",\"EnableGroupCoupon\":false,\"EnabledVirtualCardForGroup\":false,\"MaxDays\":180,\"IgnoreCheckGuestName\":false,\"EnabledCommentReadRole\":false,\"LowestProfitPercent\":0.0,\"IntegerPriceType\":1},\"Guid\":\"c35c3c9a-9fb7-4059-b0f9-5fb8d58d2e7d\"}";
		String res = HttpUtil.httpPost("http://localhost:8080/nb_web_data/api/Hotel/GetRackRates", reqData);
			
		Object obj = res;
		
		obj=obj;
	}
	
	

}
*/