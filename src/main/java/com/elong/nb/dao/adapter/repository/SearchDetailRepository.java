/**
 * 
 */
package com.elong.nb.dao.adapter.repository;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.elong.nb.common.gson.DateTypeAdapter;
import com.elong.nb.common.gson.GsonUtil;
import com.elong.nb.common.model.EnumLocal;
import com.elong.nb.common.model.ProxyAccount;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.common.util.CommonsUtil;
import com.elong.nb.data.biglog.BigLog;
import com.elong.nb.model.HotelDetailRequest;
import com.elong.nb.model.HotelListResponse;
import com.elong.nb.model.bean.Hotel;
import com.elong.nb.model.bean.enums.EnumPaymentType;
import com.elong.nb.util.HttpUtil;
import com.google.common.reflect.TypeToken;
import com.google.gson.TypeAdapter;

/**
 * @author user
 *
 */
@Repository
public class SearchDetailRepository {
	private static Logger logger = LogManager.getLogger("biglog");
	private static final String SEARCHURL=CommonsUtil.CONFIG_PROVIDAR.getProperty("InnerDetail.url");
	/**
	 * 获取订单详情
	 * @param guid
	 * @param local
	 * @param proxyInfo
	 * @param arrivalDate
	 * @param departureDate
	 * @param hotelId
	 * @param roomTypeId
	 * @param ratePlanId
	 * @return
	 */
	public RestResponse<HotelListResponse> getHotelDetail(String guid, EnumLocal local,
			ProxyAccount proxyInfo, Date arrivalDate, Date departureDate,
			String hotelId, String roomTypeId, int ratePlanId,EnumPaymentType paymentType) {
		RestRequest<HotelDetailRequest> detailreq = new RestRequest<HotelDetailRequest>();
		detailreq.setGuid(guid);
		detailreq.setLocal(local);
		detailreq.setVersion(10d);
		detailreq.setProxyInfo(proxyInfo);
		HotelDetailRequest request = new HotelDetailRequest();
		request.setArrivalDate(arrivalDate);
		request.setDepartureDate(departureDate);
		request.setHotelIds(hotelId);
		request.setOptions("0");// （仅单酒店有效）0.无1.酒店详情2.房型3.图片
		request.setRatePlanId(ratePlanId);
		request.setRoomTypeId(roomTypeId);
		request.setPaymentType(paymentType);
		detailreq.setRequest(request);
		String reqData = GsonUtil.toJson(detailreq,10d);
		String response = null;
		RestResponse<HotelListResponse> detailres = new RestResponse<HotelListResponse>(
				guid);
		BigLog log = new BigLog();
		log.setUserLogType(guid);
		log.setAppName("data_http");
		log.setTraceId(UUID.randomUUID().toString());
		log.setSpan("1.1");
		log.setServiceName("com.elong.nb.search.InnerDetail");
		long start = System.currentTimeMillis();
		try {
			response = HttpUtil.httpPost(SEARCHURL, reqData, "application/x-www-form-urlencoded");
			log.setElapsedTime(String.valueOf(System.currentTimeMillis()-start));
			logger.info(log.toString());
			if (StringUtils.isNotBlank(response)) {
				Map<Class, TypeAdapter> m = new HashMap<Class, TypeAdapter>();
				m.put(Date.class, new DateTypeAdapter());
				detailres = GsonUtil.toResponse(response,
						new TypeToken<RestResponse<HotelListResponse>>() {
						}.getType(), m);
				return detailres;			}
		} catch (Exception ex) {
			log.setElapsedTime(String.valueOf(System.currentTimeMillis()-start));
			log.setException(ex);
			log.setExceptionMsg(ex.getMessage());
			log.setResponseCode("1");
			logger.info(log.toString());
			throw new RuntimeException("search.InnerDetail",ex);
		}
		return detailres;
	}
}
