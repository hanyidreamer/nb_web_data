package com.elong.nb.dao.adapter.repository;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.elong.nb.agent.ProductForNBServiceContract.EnumPayMentType;
import com.elong.nb.agent.ProductForNBServiceContract.GetHotelRoomPriceRequest;
import com.elong.nb.agent.ProductForNBServiceContract.GetHotelRoomPriceResponse2;
import com.elong.nb.agent.ProductForNBServiceContract.IProductForNBServiceContract;
import com.elong.nb.common.model.ProxyAccount;
import com.elong.nb.model.bean.enums.EnumPaymentType;
import com.elong.nb.util.DateUtil;
import com.elong.nb.util.MathUtil;
@Repository
public class RateRepository {
	@Resource
	private IProductForNBServiceContract ProductForNBServiceContract;
	
	public GetHotelRoomPriceResponse2 getRate(ProxyAccount proxyInfo,
			String mHotelId, String sHotelId, Date startDate, Date endDate,
			EnumPaymentType paymentType) {
		GetHotelRoomPriceRequest req = new GetHotelRoomPriceRequest();
		req.setBookingChannel(MathUtil.Log(
				proxyInfo.getBookingChannel().getValue(), 2).intValue());
		req.setCustomerLevel(proxyInfo.getMemberLevel().getValue());
		req.setSellChannel(MathUtil.Log(proxyInfo.getSellChannel().getValue(),
				2).intValue());
		//支付类型转换
		EnumPayMentType settlementType=paymentType==EnumPaymentType.Prepay?EnumPayMentType.PAY_TO_HOTEL_BY_CUSTOMER_SELF:EnumPayMentType.PAY_TO_HOTEL_BY_CUSTOMER_SELF;
		req.setSettlementType(settlementType);
		req.setHotelID(sHotelId);
		req.setStartDate(DateUtil.toDateTime(startDate));
		req.setEndDate(DateUtil.toDateTime(endDate));
		GetHotelRoomPriceResponse2 response = this.ProductForNBServiceContract
				.getHotelRoomPrice(req);
		return response;
	}
}
