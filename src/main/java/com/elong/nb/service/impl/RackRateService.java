package com.elong.nb.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.httpclient.util.DateUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.elong.nb.cache.ICacheKey;
import com.elong.nb.cache.RedisManager;
import com.elong.nb.common.model.RedisKeyConst;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.model.rackrate.RackRateHotel;
import com.elong.nb.model.rackrate.RackRateRequest;
import com.elong.nb.model.rackrate.RackRateResponse;
import com.elong.nb.model.rackrate.RackRateRoomType;
import com.elong.nb.repository.RackRatesRepository;
import com.elong.nb.service.IRackRateService;

@Service
public class RackRateService implements IRackRateService {

	private static final RedisManager redis = RedisManager.getInstance("redis_job", "redis_job");

	@Resource
	private RackRatesRepository rackRatesRepository;

	@Override
	public RestResponse<RackRateResponse> GetRackRates(RestRequest<RackRateRequest> request) {
		String[] hotelCodes = request.getRequest().getHotelCodes().split(",");
		List<RackRateHotel> rackHotels = new ArrayList<RackRateHotel>();
		ICacheKey cacheKey = RedisManager.getCacheKey(RedisKeyConst.KEY_RackRateRecordsSet, 7 * 24 * 3600);
		for (String hcode : hotelCodes) {
			String result = redis.hashGet(cacheKey, hcode);
			if (StringUtils.isNoneEmpty(result)) {
				RackRateHotel hotel = new RackRateHotel();
				hotel.setHotelCode(hcode);
				hotel.setRoomTypes(JSON.parseArray(result, RackRateRoomType.class));
				rackHotels.add(hotel);
			}
		}

		if (rackHotels.size() != hotelCodes.length) {
			rackHotels = rackRatesRepository.GetRackRates(request.getRequest().getHotelCodes());
			for (RackRateHotel hotel : rackHotels) {
				redis.hashPut(cacheKey, hotel.getHotelCode(), JSON.toJSONString(hotel.getRoomTypes()));
			}
		}

		for (RackRateHotel hotel : rackHotels) {
			for (RackRateRoomType room : hotel.getRoomTypes()) {
				Calendar cal = Calendar.getInstance();
				cal.add(Calendar.YEAR, 1);
				if (DateUtil.formatDate(room.getEndDate(), "yyyy-MM-dd").compareTo(DateUtil.formatDate(cal.getTime(), "yyyy-MM-dd")) > 0) {
					room.setEndDate(cal.getTime());
				}
			}
		}

		RestResponse<RackRateResponse> response = new RestResponse<RackRateResponse>(request.getGuid());
		RackRateResponse rackResponse = new RackRateResponse();
		rackResponse.setRackRates(rackHotels);
		response.setResult(rackResponse);
		return response;
	}

}
