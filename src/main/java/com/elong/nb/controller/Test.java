package com.elong.nb.controller;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.elong.nb.util.HttpUtil;

public class Test {

	@Resource
	HotelDataController controller;
	
	@org.junit.Test
	public void test() throws Exception {

		//HttpServletRequest req=null;
		
		//controller.GetRackRates(req);
	
	String reqData ="{\"Version\":1.26,\"Local\":\"zh_CN\",\"Request\":{\"HotelCodes\":\"00101006\"},\"ProxyInfo\":{\"UserName\":\"Ctrip\",\"UserGroup\":1,\"ProxyId\":\"AP0047691\",\"CardNo\":2000000003624295444,\"OrderFrom\":5931,\"MemberLevel\":\"Normal\",\"SellChannel\":\"A\",\"BookingChannel\":\"OnLine\",\"SearchOrderType\":\"OrderFrom\",\"OrderContactType\":\"Proxy\",\"IsFilterSEMHotel\":false,\"EnabledPrepayProducts\":true,\"EnabledPrepaySettlment\":false,\"PrepaySettlementRate\":0.0001,\"EnabledVirtualCardForPrepay\":false,\"EnabledVirtualCardForGuarantee\":false,\"EnabledSpecialRate\":false,\"EnabledInstantConfirm\":false,\"EnabledInvoiceRole\":false,\"EnabledElongNoteReadRole\":false,\"EnabledCouponReadRole\":true,\"EnabledCouponRole\":false,\"EnableForcedGuaranteeOrder\":false,\"EnableIgnoreCheckingDuplicatedOrder\":false,\"EnableReturnAgentcyRateCost\":false,\"ClientIP\":\"127.0.0.1\",\"EnableGroupCoupon\":false,\"EnabledVirtualCardForGroup\":false,\"MaxDays\":180,\"IgnoreCheckGuestName\":false,\"EnabledCommentReadRole\":false,\"LowestProfitPercent\":0.0,\"IntegerPriceType\":1},\"Guid\":\"c35c3c9a-9fb7-4059-b0f9-5fb8d58d2e7d\"}";
	String res = HttpUtil.httpPost("http://localhost:8080/nb_web_data/api/Hotel/GetRackRates", reqData);
		
	Object obj = res;
		
	}

}
