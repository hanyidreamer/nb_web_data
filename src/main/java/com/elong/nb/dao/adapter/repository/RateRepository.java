package com.elong.nb.dao.adapter.repository;

import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSON;
import com.elong.nb.agent.ProductForNBServiceContract.EnumPayMentType;
import com.elong.nb.agent.ProductForNBServiceContract.GetHotelRoomPriceRequest;
import com.elong.nb.agent.ProductForNBServiceContract.GetHotelRoomPriceResponse2;
import com.elong.nb.agent.ProductForNBServiceContract.IProductForNBServiceContract;
import com.elong.nb.common.biglog.BigLog;
import com.elong.nb.common.model.ProxyAccount;
import com.elong.nb.model.bean.enums.EnumPaymentType;
import com.elong.nb.util.DateUtil;
import com.elong.nb.util.MathUtil;
@Repository
public class RateRepository {
	@Resource
	private IProductForNBServiceContract productForNBServiceContract;
	private static Logger logger = LogManager.getLogger("biglog");
	public GetHotelRoomPriceResponse2 getRate(ProxyAccount proxyInfo,
			String mHotelId, String sHotelId, Date startDate, Date endDate,
			EnumPaymentType paymentType,String guid) {
		BigLog log = new BigLog();
		log.setUserLogType(guid);
		log.setAppName("data_wcf");
		log.setTraceId(UUID.randomUUID().toString());
		log.setSpan("1.1");
		
		GetHotelRoomPriceRequest req = new GetHotelRoomPriceRequest();
		req.setBookingChannel(MathUtil.Log(
				proxyInfo.getBookingChannel().getValue(), 2).intValue());
		req.setCustomerLevel(proxyInfo.getMemberLevel().getValue());
		req.setSellChannel(MathUtil.Log(proxyInfo.getSellChannel().getValue(),
				2).intValue());
		//支付类型转换
		EnumPayMentType settlementType=paymentType==EnumPaymentType.Prepay?EnumPayMentType.PRE_PAY:EnumPayMentType.PAY_TO_HOTEL_BY_CUSTOMER_SELF;
		req.setSettlementType(settlementType);
		req.setHotelID(sHotelId);
		req.setStartDate(DateUtil.toDateTime(startDate));
		req.setEndDate(DateUtil.toDateTime(endDate));
		log.setServiceName("IProductForNBServiceContract.getHotelRoomPrice");
		log.setRequestBody(JSON.toJSONString(req));
		long start = System.currentTimeMillis();
		GetHotelRoomPriceResponse2 response = this.productForNBServiceContract
				.getHotelRoomPrice(req);
		log.setElapsedTime(String.valueOf(System.currentTimeMillis()-start));
		logger.info(log.toString());
		return response;
	}
}
