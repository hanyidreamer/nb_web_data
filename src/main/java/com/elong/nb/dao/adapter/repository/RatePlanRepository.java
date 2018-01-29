/**
 * 
 */
package com.elong.nb.dao.adapter.repository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSON;
import com.elong.hotel.goods.ds.thrift.GetBaseRatePlanDRRGiftRequest;
import com.elong.hotel.goods.ds.thrift.GetBaseRatePlanDRRGiftResponse;
import com.elong.hotel.goods.ds.thrift.MetaMhotel;
import com.elong.nb.agent.thrift.utils.ThriftUtils;
import com.elong.nb.checklist.CheckListUtil;
import com.elong.nb.common.model.EnumAgencyLevel;
import com.elong.nb.common.model.EnumBookingChannel;
import com.elong.nb.common.model.EnumMemberLevel;
import com.elong.nb.common.model.EnumPrepayLevel;
import com.elong.nb.common.model.EnumSellChannel;
import com.elong.nb.common.model.ProxyAccount;
import com.elong.nb.common.util.CommonsUtil;
import com.elong.nb.dao.adapter.AbstractGoodsAdapter;
import com.elong.nb.dao.adapter.RatePlanAdapter;
import com.elong.nb.data.biglog.BigLog;
import com.elong.nb.model.HotelIdAttr;
import com.elong.nb.model.bean.enums.EnumPaymentType;
import com.elong.nb.model.rateplan.HotelRatePlan;
import com.google.gson.Gson;

/**
 * @author user
 *
 */
@Repository
public class RatePlanRepository {

	private Logger logger = Logger.getLogger(RatePlanRepository.class);

	private static final String server_ip = CommonsUtil.CONFIG_PROVIDAR.getProperty("goods.server_ip");
	private static final int server_port = Integer.valueOf(CommonsUtil.CONFIG_PROVIDAR.getProperty("goods.server_port"));
	private static int server_timeout = Integer.valueOf(CommonsUtil.CONFIG_PROVIDAR.getProperty("goods.rp.server_timeout"));

	public List<HotelRatePlan> getRatePlans(ProxyAccount proxyInfo, List<HotelIdAttr> hotelIdAttrs, EnumPaymentType paymentType,
			Map<String, EnumPaymentType> hotelCodeFilterType, boolean isCn, String options, String guid, double requestVersion) {
		List<HotelRatePlan> ratePlans = null;
		BigLog log = new BigLog();
		log.setUserLogType(guid);
		log.setAppName("RatePlanRepository");
		log.setTraceId(guid);
		log.setSpan("1.1");
		log.setServiceName("getRatePlans");
		GetBaseRatePlanDRRGiftRequest request = new GetBaseRatePlanDRRGiftRequest();
		if (proxyInfo.getBookingChannel() != null) {
			request.setBooking_channel(proxyInfo.getBookingChannel().getValue());
		} else {
			request.setBooking_channel(EnumBookingChannel.OnLine.getValue());
		}
		if (proxyInfo.getSellChannel() != null) {
			request.setSell_channel(proxyInfo.getSellChannel().getValue());
		} else {
			request.setSell_channel(EnumSellChannel.A.getValue());
		}
		if (proxyInfo.getMemberLevel() != null) {
			request.setMember_level(proxyInfo.getMemberLevel().getValue());
		} else {
			request.setMember_level(EnumMemberLevel.Normal.getValue());
		}
		request.setPayment_type((short) paymentType.getValue());
		request.setTraceId(guid);
		if (options != null && options.contains("2")) {
			// 产品类型：bitmap存储, 第0位：单独销售；第1位：打包销售；第2位：隐价产品；第3位：酒店杀价；第4位：限时抢；第5位：钟点房；第6位：团购产品;第7位：国际酒店产品；第8位：周边价格；第9位：9元/半价抢
			request.setProduct_type(33);// 2^0+2^5=33,返回单独销售和钟点房
		}
		addHotelLevelFilter(request, proxyInfo);// 增加现付等级、预付等级过滤参数
		List<MetaMhotel> mhotels = new LinkedList<MetaMhotel>();
		for (HotelIdAttr hotelIdAttr : hotelIdAttrs) {
			int hotelId = Integer.valueOf(hotelIdAttr.getHotelId());
			if (hotelIdAttr.getHotelCodes() != null && hotelIdAttr.getHotelCodes().size() > 0) {
				MetaMhotel mhotel = new MetaMhotel();
				mhotel.setMhotel_id(hotelId);
				mhotel.setShotel_id(new LinkedList<Integer>());
				for (String hotelCode : hotelIdAttr.getHotelCodes()) {
					mhotel.getShotel_id().add(Integer.valueOf(hotelCode));
				}
				mhotels.add(mhotel);
			} else {
				MetaMhotel mhotel = new MetaMhotel();
				mhotel.setMhotel_id(hotelId);
				mhotels.add(mhotel);
			}
		}
		request.setMhotel(mhotels);
		try {
			logger.info("traceId = " + guid + ",goods Request = " + JSON.toJSONString(request));
			long start = System.currentTimeMillis();
			GetBaseRatePlanDRRGiftResponse response = ThriftUtils.getMetaRatePlanDrrGift(request, server_ip, server_port, server_timeout);
			long end = System.currentTimeMillis();
			log.setElapsedTime(String.valueOf(end - start));
			Gson gson = new Gson();
			if (response != null && response.return_code == 0) {
				AbstractGoodsAdapter<HotelRatePlan, GetBaseRatePlanDRRGiftResponse> adapter = new RatePlanAdapter();
				adapter.setFilter(hotelCodeFilterType, isCn, requestVersion);
				ratePlans = adapter.toNBObject(response);
			} else if (response.return_code > 0) {
				log.setRequestBody(gson.toJson(request));
				log.setBusinessErrorCode(String.valueOf(response.return_code));
				log.setExceptionMsg(response.getReturn_msg());
				ratePlans = new ArrayList<HotelRatePlan>();
			} else {
				throw new RuntimeException(response.getReturn_msg());
			}
		} catch (Exception ex) {
			Gson gson = new Gson();
			log.setRequestBody(gson.toJson(request));
			log.setException(ex);
			log.setExceptionMsg(ex.getMessage());
			CheckListUtil.error(log);
			throw new RuntimeException("RatePlan:" + ex.getMessage(), ex);
		}
		CheckListUtil.info(log);
		return ratePlans;
	}

	/** 
	 * 商品库入参增加现付等级、预付等级过滤参数
	 *
	 * @param productAttribute
	 */
	private void addHotelLevelFilter(GetBaseRatePlanDRRGiftRequest goodsRequest, ProxyAccount proxyInfo) {
		EnumAgencyLevel enumAgencyLevel = proxyInfo.getAgencyCommisionLevel();
		List<Integer> cash_pay_hotel_level_filter = new ArrayList<Integer>();
		if (EnumAgencyLevel.LOW == enumAgencyLevel) {
			cash_pay_hotel_level_filter.add(EnumAgencyLevel.LOW.getValue());
			cash_pay_hotel_level_filter.add(EnumAgencyLevel.MIDDLE.getValue());
			cash_pay_hotel_level_filter.add(EnumAgencyLevel.HIGH.getValue());
		} else if (EnumAgencyLevel.MIDDLE == enumAgencyLevel) {
			cash_pay_hotel_level_filter.add(EnumAgencyLevel.MIDDLE.getValue());
			cash_pay_hotel_level_filter.add(EnumAgencyLevel.HIGH.getValue());
		} else if (EnumAgencyLevel.HIGH == enumAgencyLevel) {
			cash_pay_hotel_level_filter.add(EnumAgencyLevel.HIGH.getValue());
		} else if (enumAgencyLevel == null || EnumAgencyLevel.NOLIMIT.equals(enumAgencyLevel)) {
			cash_pay_hotel_level_filter = null;
		}
		goodsRequest.setCash_pay_hotel_level_filter(cash_pay_hotel_level_filter);

		EnumPrepayLevel enumPrepayLevel = proxyInfo.getPrepayCommisionLevel();
		List<Integer> pre_pay_hotel_level_filter = new ArrayList<Integer>();
		if (EnumPrepayLevel.LOW == enumPrepayLevel) {
			pre_pay_hotel_level_filter.add(EnumPrepayLevel.LOW.getValue());
			pre_pay_hotel_level_filter.add(EnumPrepayLevel.MIDDLE.getValue());
			pre_pay_hotel_level_filter.add(EnumPrepayLevel.HIGH.getValue());
		} else if (EnumPrepayLevel.MIDDLE == enumPrepayLevel) {
			pre_pay_hotel_level_filter.add(EnumPrepayLevel.MIDDLE.getValue());
			pre_pay_hotel_level_filter.add(EnumPrepayLevel.HIGH.getValue());
		} else if (EnumPrepayLevel.HIGH == enumPrepayLevel) {
			pre_pay_hotel_level_filter.add(EnumPrepayLevel.HIGH.getValue());
		} else if (enumPrepayLevel == null || EnumPrepayLevel.NOLIMIT.equals(enumPrepayLevel)) {
			pre_pay_hotel_level_filter = null;
		}
		goodsRequest.setPre_pay_hotel_level_filter(pre_pay_hotel_level_filter);
	}

}
