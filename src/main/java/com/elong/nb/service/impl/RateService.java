package com.elong.nb.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.elong.nb.common.model.ProxyAccount;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.dao.adapter.cache.M_SRelationCache;
import com.elong.nb.dao.adapter.repository.RateRepository;
import com.elong.nb.model.HotelIdAttr;
import com.elong.nb.model.bean.enums.EnumPaymentType;
import com.elong.nb.model.rate.RateCondition;
import com.elong.nb.model.rate.RateResult;
import com.elong.nb.model.rate.bean.Rate;
import com.elong.nb.rule.agent.SettlementPriceRuleCommon;
import com.elong.nb.rule.agent.enums.EnumSystem;
import com.elong.nb.rule.agent.model.RateWithRule;
import com.elong.nb.service.IRateService;
import com.elong.nb.util.DateUtil;

@Service
public class RateService implements IRateService {

	@Resource
	private RateRepository rateRepository;
	@Resource
	private M_SRelationCache m_SRelationCache;

	@Override
	public RestResponse<RateResult> getRates(RestRequest<RateCondition> request, ProxyAccount proxyAccount) throws Exception {
		RestResponse<RateResult> response = new RestResponse<RateResult>(request.getGuid());
		RateResult result = new RateResult();
		// 如果没有预付权限，则不查询预付产品的价格
		if (!proxyAccount.getEnabledPrepayProducts()) {
			if (request.getRequest().getPaymentType() == EnumPaymentType.Prepay) {
				result.setRates(new ArrayList<Rate>());
				response.setResult(result);
				return response;
			} else if (request.getRequest().getPaymentType() == EnumPaymentType.All) {
				request.getRequest().setPaymentType(EnumPaymentType.SelfPay);
			}
		}
		List<Rate> rates = new ArrayList<Rate>();
		rates = getGoodsRate(proxyAccount, request.getRequest().getHotelIds(), request.getRequest().getHotelCodes(), request.getRequest()
				.getStartDate(), request.getRequest().getEndDate(), request.getRequest().getPaymentType(),
				proxyAccount.getLowestProfitPercent(), request.getGuid());
		result.setRates(rates);
		response.setResult(result);
		return response;
	}

	/**
	 * 商品库获取价格
	 * @param proxyInfo
	 * @param mhotelId
	 * @param shotelId
	 * @param startDate
	 * @param endDate
	 * @param paymentType
	 * @param lowestProfitPercent
	 * @param guid
	 * @return
	 * @throws Exception
	 */
	private List<Rate> getGoodsRate(ProxyAccount proxyInfo, String mhotelId, String shotelId, Date startDate, Date endDate,
			EnumPaymentType paymentType, double lowestProfitPercent, String guid) throws Exception {
		List<Rate> result = new ArrayList<Rate>();
		// 仅提供昨天和近180天的房态数据
		int days = proxyInfo.getMaxDays() != null ? proxyInfo.getMaxDays() : 90;
		Date date = DateUtil.addDays(new Date(), -1);
		if (startDate.getTime() < date.getTime()) {
			startDate = DateUtil.addDays(new Date(), -1);
		}
		if (endDate.getTime() > DateUtil.addDays(new Date(), days).getTime()) {
			endDate = DateUtil.addDays(new Date(), days);
		}
		startDate = DateUtil.getDate(startDate);
		endDate = DateUtil.getDate(endDate);
		String[] mHotelIdArray = null;
		if (StringUtils.isNotEmpty(mhotelId)) {
			mhotelId = mhotelId.replaceAll(" ", "");
		}
		List<HotelIdAttr> hotelIdAttrs = new LinkedList<HotelIdAttr>();
		if (StringUtils.isBlank(shotelId)) {
			mHotelIdArray = mhotelId.split(",");
			for (int i = 0; i < mHotelIdArray.length; i++) {
				HotelIdAttr hotelIdAttr = new HotelIdAttr();
				hotelIdAttr.setHotelId(mHotelIdArray[i]);
				hotelIdAttrs.add(hotelIdAttr);
			}
		} else {
			HotelIdAttr hotelIdAttr = new HotelIdAttr();
			hotelIdAttr.setHotelId(mhotelId);
			List<String> list = Arrays.asList(shotelId.replaceAll(" ", "").split(","));
			hotelIdAttr.setHotelCodes(list);
			hotelIdAttrs.add(hotelIdAttr);
		}
		List<Rate> response = this.rateRepository.getRates(proxyInfo, hotelIdAttrs, startDate, endDate, paymentType, guid);
		Date validDate = DateUtil.addYears(DateUtil.getDate(new Date()), 1);

		List<String> hotelCodeList = new ArrayList<String>();
		for (Rate item : response) {
			String hotelCode = item.getHotelCode();
			if (hotelCodeList.contains(hotelCode))
				continue;
			hotelCodeList.add(hotelCode);
		}
		// 预付及现付需要返回底价的价格数据
		SettlementPriceRuleCommon settlementCommon = null;
		if (paymentType == EnumPaymentType.All || paymentType == EnumPaymentType.Prepay || proxyInfo.getEnableReturnAgentcyRateCost()) {
			settlementCommon = new SettlementPriceRuleCommon(proxyInfo, hotelCodeList, EnumSystem.Data);
		}
		for (Rate item : response) {
			Date rateEndDate = item.getEndDate();
			if (rateEndDate.getTime() > validDate.getTime()) {
				rateEndDate = validDate;
			}
			if (item.getMember() <= 0) {
				continue;
			}
			if (lowestProfitPercent > 0) {
				double profitPercent = (item.getMember() - item.getMemberCost()) / item.getMember();
				if (profitPercent * 100 < lowestProfitPercent) {
					continue;
				}
			}
			Date rateStartDate = item.getStartDate();
			double member = item.getMember();
			member = toIntegerPrice(member, proxyInfo.getIntegerPriceType());

			double weekend = item.getWeekend();
			weekend = toIntegerPrice(weekend, proxyInfo.getIntegerPriceType());
			// 预付及现付需要返回结算价
			if (paymentType == EnumPaymentType.All || paymentType == EnumPaymentType.Prepay || proxyInfo.getEnableReturnAgentcyRateCost()) {
				double costPrice = item.getMemberCost();
				List<RateWithRule> memberRateList = settlementCommon.getSettlementPrice(costPrice, member, item.getHotelCode(),
						rateStartDate, rateEndDate);
				double weekendCost = item.getWeekendCost();
				List<RateWithRule> weekendRateList = settlementCommon.getSettlementPrice(weekendCost, weekend, item.getHotelCode(),
						rateStartDate, rateEndDate);
				if (memberRateList != null && weekendRateList != null && memberRateList.size() == weekendRateList.size()) {
					for (int j = 0; j < memberRateList.size(); j++) {
						Rate rate = new Rate();
						rate.setHotelID(item.getHotelID());
						rate.setHotelCode(item.getHotelCode());
						rate.setMember(member);
						rate.setEndDate(memberRateList.get(j).getEndDate());
						rate.setStartDate(memberRateList.get(j).getStartDate());
						rate.setMemberCost(memberRateList.get(j).getCost());
						rate.setRateplanId(item.getRateplanId());
						rate.setRoomTypeId(item.getRoomTypeId());

						rate.setStatus(item.getStatus());
						rate.setWeekend(weekend);
						rate.setWeekendCost(weekendRateList.get(j).getCost());
						rate.setAddBed(item.getAddBed());
						rate.setPriceID(item.getPriceID());
						rate.setCurrencyCode(item.getCurrencyCode());
						result.add(rate);
					}
				}
			} else {
				Rate rate = new Rate();
				rate.setHotelID(item.getHotelID());
				rate.setHotelCode(item.getHotelCode());
				rate.setMember(member);
				rate.setEndDate(rateEndDate);
				rate.setStartDate(item.getStartDate());
				rate.setMemberCost(-1d);
				rate.setRateplanId(item.getRateplanId());
				rate.setRoomTypeId(item.getRoomTypeId());

				rate.setStatus(item.getStatus());
				rate.setWeekend(weekend);
				rate.setWeekendCost(-1d);
				rate.setAddBed(item.getAddBed());
				rate.setPriceID(item.getPriceID());
				rate.setCurrencyCode(item.getCurrencyCode());
				result.add(rate);
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
