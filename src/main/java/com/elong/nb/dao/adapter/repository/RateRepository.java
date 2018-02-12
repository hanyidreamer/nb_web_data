package com.elong.nb.dao.adapter.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.elong.hotel.goods.ds.thrift.GetBasePrice4NbRequest;
import com.elong.hotel.goods.ds.thrift.GetBasePrice4NbResponse;
import com.elong.hotel.goods.ds.thrift.HotelBasePriceRequest;
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
import com.google.gson.Gson;

@Repository
public class RateRepository {

	private static final String server_ip = CommonsUtil.CONFIG_PROVIDAR.getProperty("goods.server_ip");
	private static final int server_port = Integer.valueOf(CommonsUtil.CONFIG_PROVIDAR.getProperty("goods.server_port"));
	private static int server_timeout = Integer.valueOf(CommonsUtil.CONFIG_PROVIDAR.getProperty("goods.rate.server_timeout"));

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
		if (startDate.after(endDate))
			return Collections.emptyList();
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
