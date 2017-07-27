package com.elong.nb.dao.adapter.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.elong.hotel.goods.ds.thrift.GetBasePrice4NbRequest;
import com.elong.hotel.goods.ds.thrift.GetBasePrice4NbResponse;
import com.elong.hotel.goods.ds.thrift.HotelBasePriceRequest;
import com.elong.nb.agent.ProductForNBServiceContract.EnumPayMentType;
import com.elong.nb.agent.ProductForNBServiceContract.GetHotelRoomPriceRequest;
import com.elong.nb.agent.ProductForNBServiceContract.GetHotelRoomPriceResponse2;
import com.elong.nb.agent.ProductForNBServiceContract.IProductForNBServiceContract;
import com.elong.nb.agent.thrift.utils.ThriftUtils;
import com.elong.nb.checklist.CheckListUtil;
import com.elong.nb.common.model.ProxyAccount;
import com.elong.nb.common.util.CommonsUtil;
import com.elong.nb.dao.adapter.AbstractGoodsAdapter;
import com.elong.nb.dao.adapter.RateAdapter;
import com.elong.nb.data.biglog.BigLog;
import com.elong.nb.model.HotelIdAttr;
import com.elong.nb.model.bean.enums.EnumPaymentType;
import com.elong.nb.model.rate.bean.Rate;
import com.elong.nb.util.DateUtil;
import com.elong.nb.util.MathUtil;
import com.google.gson.Gson;

@Repository
public class RateRepository {

	private static final String server_ip = CommonsUtil.CONFIG_PROVIDAR.getProperty("goods.server_ip");
	private static final int server_port = Integer.valueOf(CommonsUtil.CONFIG_PROVIDAR.getProperty("goods.server_port"));
	private static int server_timeout = Integer.valueOf(CommonsUtil.CONFIG_PROVIDAR.getProperty("goods.rate.server_timeout"));
	@Resource
	private IProductForNBServiceContract productForNBServiceContract;

	public GetHotelRoomPriceResponse2 getRate(ProxyAccount proxyInfo, String mHotelId, String sHotelId, Date startDate, Date endDate,
			EnumPaymentType paymentType, String guid) {
		BigLog log = new BigLog();
		GetHotelRoomPriceResponse2 response = null;

		log.setUserLogType(guid);
		log.setAppName("IProductForNBServiceContract");
		log.setTraceId(UUID.randomUUID().toString());
		log.setSpan("1.1");

		GetHotelRoomPriceRequest req = new GetHotelRoomPriceRequest();
		req.setBookingChannel(MathUtil.Log(proxyInfo.getBookingChannel().getValue(), 2).intValue());
		req.setCustomerLevel(proxyInfo.getMemberLevel().getValue());
		req.setSellChannel(MathUtil.Log(proxyInfo.getSellChannel().getValue(), 2).intValue());
		// 支付类型转换
		EnumPayMentType settlementType = paymentType == EnumPaymentType.Prepay ? EnumPayMentType.PRE_PAY
				: EnumPayMentType.PAY_TO_HOTEL_BY_CUSTOMER_SELF;
		req.setSettlementType(settlementType);
		req.setHotelID(sHotelId);
		req.setStartDate(DateUtil.toDateTime(startDate));
		req.setEndDate(DateUtil.toDateTime(endDate));
		log.setServiceName("getHotelRoomPrice");
		log.setRequestBody("-");
		long start = System.currentTimeMillis();
		try {
			response = this.productForNBServiceContract.getHotelRoomPrice(req);
			log.setElapsedTime(String.valueOf(System.currentTimeMillis() - start));
		} catch (Exception ex) {
			log.setElapsedTime(String.valueOf(System.currentTimeMillis() - start));
			log.setException(ex);
			log.setExceptionMsg(ex.getMessage());
			log.setResponseCode("1");
			CheckListUtil.error(log);
			throw new RuntimeException("getHotelRoomPrice", ex);
		}
		CheckListUtil.info(log);
		return response;
	}

	/**
	 * 商品库获取价格接口
	 * @param proxyInfo
	 * @param hotelIdAttrs
	 * @param startDate
	 * @param endDate
	 * @param paymentType
	 * @param guid
	 * @return
	 */
	public List<Rate> getRates(ProxyAccount proxyInfo, List<HotelIdAttr> hotelIdAttrs, Date startDate, Date endDate,
			EnumPaymentType paymentType, String guid) {
		List<Rate> rates = null;
		BigLog log = new BigLog();
		log.setUserLogType(guid);
		log.setAppName("RateRepository");
		log.setTraceId(guid);
		log.setSpan("1.1");
		log.setServiceName("getRates");
		GetBasePrice4NbRequest request = new GetBasePrice4NbRequest();
		request.setBooking_channel(proxyInfo.getBookingChannel().getValue());
		request.setSell_channel(proxyInfo.getSellChannel().getValue());
		request.setMember_level(proxyInfo.getMemberLevel().getValue());
		request.setPayment_type((short) paymentType.getValue());
		request.setTraceId(guid);
		request.setStart_date((int) (startDate.getTime() / 1000));
		request.setEnd_date((int) (endDate.getTime() / 1000));
		List<HotelBasePriceRequest> hotelBases = new LinkedList<HotelBasePriceRequest>();
		for (HotelIdAttr hotelIdAttr : hotelIdAttrs) {
			int hotelId = Integer.valueOf(hotelIdAttr.getHotelId());
			if (hotelIdAttr.getHotelCodes() != null && hotelIdAttr.getHotelCodes().size() > 0) {
				for (String hotelCode : hotelIdAttr.getHotelCodes()) {
					HotelBasePriceRequest hotelBase = new HotelBasePriceRequest();
					hotelBase.setMhotel_id(hotelId);
					hotelBase.setShotel_id(Integer.valueOf(hotelCode));
					hotelBases.add(hotelBase);
				}
			} else {
				HotelBasePriceRequest hotelBase = new HotelBasePriceRequest();
				hotelBase.setMhotel_id(hotelId);
				hotelBases.add(hotelBase);
			}
		}
		request.setHotel_base_price_request(hotelBases);
		try {
			long start = System.currentTimeMillis();
			GetBasePrice4NbResponse response = ThriftUtils.getMetaPrice4Nb(request, server_ip, server_port, server_timeout);
			long end = System.currentTimeMillis();
			log.setElapsedTime(String.valueOf(end - start));
			if (response != null && response.return_code == 0) {
				AbstractGoodsAdapter<Rate, GetBasePrice4NbResponse> adapter = new RateAdapter();
				rates = adapter.toNBObject(response);
			} else if (response.return_code > 0) {
				Gson gson = new Gson();
				log.setRequestBody(gson.toJson(request));
				log.setBusinessErrorCode(String.valueOf(response.return_code));
				log.setExceptionMsg(response.getReturn_msg());
				rates = new ArrayList<Rate>();
			} else {
				throw new RuntimeException(response.getReturn_msg());
			}
		} catch (Exception ex) {
			Gson gson = new Gson();
			log.setRequestBody(gson.toJson(request));
			log.setException(ex);
			log.setExceptionMsg(ex.getMessage());
			CheckListUtil.error(log);
			throw new RuntimeException("Rate:" + ex.getMessage(), ex);
		}
		CheckListUtil.info(log);
		return rates;
	}
}
