package com.elong.nb.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.elong.nb.agent.ProductForNBServiceContract.GetHotelRoomPriceResponse2;
import com.elong.nb.agent.ProductForNBServiceContract.PriceInfoForNB;
import com.elong.nb.common.model.ProxyAccount;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.dao.adapter.cache.M_SRelationCache;
import com.elong.nb.dao.adapter.repository.RateRepository;
import com.elong.nb.model.bean.enums.EnumPaymentType;
import com.elong.nb.model.rate.RateCondition;
import com.elong.nb.model.rate.RateResult;
import com.elong.nb.model.rate.bean.Rate;
import com.elong.nb.service.IRateService;
import com.elong.nb.util.DateUtil;

@Service
public class RateService implements IRateService {
	@Resource
	private RateRepository rateRepository;
	@Resource
	private M_SRelationCache m_SRelationCache;

	@Override
	public RestResponse<RateResult> getRates(RestRequest<RateCondition> request)
			throws Exception {

		RestResponse<RateResult> response = new RestResponse<RateResult>(
				request.getGuid());
		RateResult result = new RateResult();
		// 如果没有预付权限，则不查询预付产品的价格
		if (!request.getProxyInfo().getEnabledPrepayProducts()) {
			if (request.getRequest().getPaymentType() == EnumPaymentType.Prepay) {
				result.setRates(new ArrayList<Rate>());
				response.setResult(result);
				return response;
			} else if (request.getRequest().getPaymentType() == EnumPaymentType.All) {
				request.getRequest().setPaymentType(EnumPaymentType.SelfPay);
			}
		}

		List<Rate> rates = new ArrayList<Rate>();
		if (request.getRequest().getPaymentType() == EnumPaymentType.All) {
			rates.addAll(getRate(request.getProxyInfo(), request.getRequest().getHotelIds(), request.getRequest().getHotelCodes(),
					request.getRequest().getStartDate(), request.getRequest().getEndDate(), EnumPaymentType.SelfPay, request
							.getProxyInfo().getLowestProfitPercent(),request.getGuid()));
			rates.addAll(getRate(request.getProxyInfo(), request.getRequest().getHotelIds(), request.getRequest().getHotelCodes(),
					request.getRequest().getStartDate(), request.getRequest().getEndDate(), EnumPaymentType.Prepay, request
							.getProxyInfo().getLowestProfitPercent(),request.getGuid()));
		} else {
			rates.addAll(getRate(request.getProxyInfo(), request.getRequest().getHotelIds(), request.getRequest().getHotelCodes(),
					request.getRequest().getStartDate(), request.getRequest().getEndDate(), request.getRequest().getPaymentType(), request.getProxyInfo()
							.getLowestProfitPercent(),request.getGuid()));
		}
		result.setRates(rates);
		response.setResult(result);
		return response;
	}

	public List<Rate> getRate(ProxyAccount proxyInfo, String mHotelId,
			String sHotelId, Date startDate, Date endDate,
			EnumPaymentType paymentType, double lowestProfitPercent,String guid)
			throws Exception {
		List<Rate> result = new ArrayList<Rate>();
		// 仅提供昨天和近180天的房态数据
		int days = proxyInfo.getMaxDays() != null ? proxyInfo.getMaxDays() : 90;
		Date date= DateUtil.addDays(new Date(), -1);
		if (startDate.getTime()<date.getTime()) {
			startDate = DateUtil.addDays(new Date(), -1);
		}
		if (endDate.getTime()>DateUtil.addDays(new Date(), days).getTime()) {
			endDate = DateUtil.addDays(new Date(), days);
		}
		String[] mHotelIdArray = null;
		List<String[]> sHotelIdArrays = null;
		if (StringUtils.isBlank(sHotelId)) {
			mHotelIdArray = mHotelId.split(",");
			sHotelIdArrays = m_SRelationCache.getSHotelIds(mHotelIdArray);
		} else {
			mHotelIdArray = new String[] { mHotelId };
			sHotelIdArrays = new ArrayList<String[]>();
			sHotelIdArrays.add(sHotelId.split(","));

		}
		for (int i = 0; i < mHotelIdArray.length; i++) {
			if (sHotelIdArrays == null || sHotelIdArrays.size() <= 0) {
				break;
			}
			String[] sHotelIdArray = sHotelIdArrays.get(i);
			if (sHotelIdArray == null || sHotelIdArray.length <= 0) {
				continue;
			}
			sHotelId = StringUtils.join(sHotelIdArray, ',');
			GetHotelRoomPriceResponse2 response = this.rateRepository.getRate(
					proxyInfo, mHotelIdArray[i], sHotelId, startDate, endDate,
					paymentType,guid);
			if (response != null && response.getResult() != null
					&& response.getResult().getResponseCode() == 0) {
				if (response.getPriceInfoList() != null) {
					if (response.getPriceInfoList().getPriceInfoForNB() != null) {
						Date validDate = DateUtil.addYears(DateUtil.getDate(new Date()), 1);
						for (PriceInfoForNB item : response.getPriceInfoList()
								.getPriceInfoForNB()) {
							Date rateEndDate = item.getEndDate().toDate();
							rateEndDate = item.getEndDate() != null ? item.getEndDate().toDate() : DateUtil.getMinValue();
							if (rateEndDate.getTime()>validDate.getTime()){
								rateEndDate = validDate;
							}
							if (item.getMemberRate() == null) {
								continue;
							}
							if (lowestProfitPercent > 0) {
								double profitPercent = (item.getMemberRate().doubleValue() - item.getGenSaleCost().doubleValue())/ item.getMemberRate().doubleValue();
								if (profitPercent * 100 < lowestProfitPercent) {
									continue;
								}
							}
							Rate rate = new Rate();
							rate.setHotelID(mHotelIdArray[i]);
							rate.setHotelCode(item.getHotelID());
							double member = item.getMemberRate() != null ? item.getMemberRate().doubleValue() : -1d;
							member = toIntegerPrice(member,proxyInfo.getIntegerPriceType());
							rate.setMember(member);
							rate.setEndDate(rateEndDate);
							Double membserCose = (paymentType == EnumPaymentType.Prepay || proxyInfo.getEnableReturnAgentcyRateCost()) ? proxyInfo.getSettlementPrice(
											item.getGenSaleCost() != null ? item.getGenSaleCost().doubleValue() : -1d,
											item.getMemberRate() != null ? item.getMemberRate().doubleValue() : -1d, false): -1d;
							rate.setMemberCost(membserCose);
							rate.setRateplanId(item.getRatePlanID());
							rate.setRoomTypeId(item.getRoomTypeID());
							rate.setStartDate(item.getStartDate() != null ? item.getStartDate().toDate() : DateUtil.getMinValue());
							rate.setStatus(item.getIsEffective() != null&& item.getIsEffective() == 1);
							double weekend = item.getWeekendMemberRate() != null ? item.getWeekendMemberRate().doubleValue() : -1d;
							weekend = toIntegerPrice(weekend,proxyInfo.getIntegerPriceType());
							rate.setWeekend(weekend);
							double weekendCost = (paymentType == EnumPaymentType.Prepay || proxyInfo.getEnableReturnAgentcyRateCost()) ? proxyInfo.getSettlementPrice(
											item.getWeekendSaleCost() != null ? item.getWeekendSaleCost().doubleValue() : -1d,
											item.getWeekendMemberRate() != null ? item.getWeekendMemberRate().doubleValue() : -1d, false): -1d;
							rate.setWeekendCost(weekendCost);
							rate.setAddBed(item.getAllowAddBed() == 1 ? item.getAddBedRate().doubleValue() : -1d);
							rate.setPriceID(item.getPriceID());
							rate.setCurrencyCode(item.getCurrencyCode());
							result.add(rate);
						}
					}
				}
			} else if (response.getResult() != null&& StringUtils.isNotBlank(response.getResult().getErrorMessage())) {
				throw new RuntimeException(String.format("Inner Error: %s", response.getResult().getErrorMessage()));
			}
		}
		return result;
	}

	// 0=不处理,1=Round,2=Ceil
	private double toIntegerPrice(double price, int convertType) {
		if (convertType == 1)
			return Math.round(price);
		if (convertType == 2)
			return Math.ceil(price);
		return price;
	}
}
