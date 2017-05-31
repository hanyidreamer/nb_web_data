package com.elong.nb.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.elong.nb.agent.ProductForNBServiceContract.GetHotelRoomPriceResponse2;
import com.elong.nb.agent.ProductForNBServiceContract.PriceInfoForNB;
import com.elong.nb.common.model.ProxyAccount;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.common.util.CommonsUtil;
import com.elong.nb.dao.adapter.cache.M_SRelationCache;
import com.elong.nb.dao.adapter.repository.InventoryRuleRepository;
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

import edu.emory.mathcs.backport.java.util.Arrays;

@Service
public class RateService implements IRateService {
	@Resource
	private RateRepository rateRepository;
	@Resource
	private M_SRelationCache m_SRelationCache;
	@Resource
	private InventoryRuleRepository ruleRepository;
	
	private static final int rateFrom=Integer.valueOf(CommonsUtil.CONFIG_PROVIDAR.getProperty("rate.from"));
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
		if(rateFrom==1){
			rates=getGoodsRate(request.getProxyInfo(), request.getRequest()
					.getHotelIds(), request.getRequest().getHotelCodes(), 
					request.getRequest().getStartDate(), request.getRequest()
							.getEndDate(),request.getRequest().getPaymentType(), request
							.getProxyInfo().getLowestProfitPercent(), request
							.getGuid());
		}else{
			if (request.getRequest().getPaymentType() == EnumPaymentType.All) {
				rates.addAll(getRate(request.getProxyInfo(), request.getRequest()
						.getHotelIds().trim(), request.getRequest().getHotelCodes(),
						request.getRequest().getStartDate(), request.getRequest()
								.getEndDate(), EnumPaymentType.SelfPay, request
								.getProxyInfo().getLowestProfitPercent(), request
								.getGuid()));
				rates.addAll(getRate(request.getProxyInfo(), request.getRequest()
						.getHotelIds().trim(), request.getRequest().getHotelCodes(),
						request.getRequest().getStartDate(), request.getRequest()
								.getEndDate(), EnumPaymentType.Prepay, request
								.getProxyInfo().getLowestProfitPercent(), request
								.getGuid()));
			} else {
				rates.addAll(getRate(request.getProxyInfo(), request.getRequest()
						.getHotelIds().trim(), request.getRequest().getHotelCodes(),
						request.getRequest().getStartDate(), request.getRequest()
								.getEndDate(), request.getRequest()
								.getPaymentType(), request.getProxyInfo()
								.getLowestProfitPercent(), request.getGuid()));
			}
		}
		result.setRates(rates);
		response.setResult(result);
		return response;
	}

	public List<Rate> getRate(ProxyAccount proxyInfo, String mHotelId,
			String sHotelId, Date startDate, Date endDate,
			EnumPaymentType paymentType, double lowestProfitPercent, String guid)
			throws Exception {
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
		String[] mHotelIdArray = null;
		List<String[]> sHotelIdArrays = null;
		if(StringUtils.isNotEmpty(mHotelId)){
			mHotelId=mHotelId.replaceAll(" ", "");
		}
		List<String> hotelCodeList=new LinkedList<String>();
		if (StringUtils.isBlank(sHotelId)) {
			mHotelIdArray = mHotelId.split(",");
			sHotelIdArrays = m_SRelationCache.getSHotelIds(mHotelIdArray);
			if(sHotelIdArrays!=null&&sHotelIdArrays.size()>0){
				for(String[] hotelCodeArray:sHotelIdArrays){
					if(hotelCodeArray!=null&&hotelCodeArray.length>0){
						hotelCodeList.addAll(Arrays.asList(hotelCodeArray));
					}
				}
			}
		} else {
			mHotelIdArray = new String[] { mHotelId };
			sHotelIdArrays = new ArrayList<String[]>();
			sHotelIdArrays.add(sHotelId.trim().split(","));
			hotelCodeList.addAll(Arrays.asList(sHotelId.replaceAll(" ", "").split(",")));
		}
		SettlementPriceRuleCommon settlementCommon=null;
		//预付及现付需要返回底价的价格数据
		if(paymentType==EnumPaymentType.Prepay||proxyInfo.getEnableReturnAgentcyRateCost()){
			settlementCommon=new SettlementPriceRuleCommon(proxyInfo, hotelCodeList, EnumSystem.Data);
		}
		for (int i = 0; i < mHotelIdArray.length; i++) {
			if (sHotelIdArrays == null || sHotelIdArrays.size() <= 0) {
				break;
			}
			List<String> sHotelIdArray = sHotelIdArrays.get(i) != null ? Arrays.asList(sHotelIdArrays.get(i)) : null;
			if (sHotelIdArray == null || sHotelIdArray.size() <= 0) {
				continue;
			}
			//rate接口支持最大hotelId个数是30，此处分条20
			int preCount = 20;
			List<String> shotelIdsList = new LinkedList<String>();
			if (sHotelIdArray.size() >= preCount) {
				int count = sHotelIdArray.size() / preCount;
				if (sHotelIdArray.size() % preCount == 0) {
					count--;
				}
				for (int j = 0; j <= count; j++) {
					int size = (j + 1) * preCount < sHotelIdArray.size() ? (j + 1)
							* preCount
							: sHotelIdArray.size();
					shotelIdsList.add(StringUtils.join(
							sHotelIdArray.subList(j * preCount, size), ','));
				}
			} else {
				shotelIdsList.add(StringUtils.join(sHotelIdArray, ','));
			}
			for (String shotelIds : shotelIdsList) {
				GetHotelRoomPriceResponse2 response = this.rateRepository
						.getRate(proxyInfo, mHotelIdArray[i], shotelIds,
								startDate, endDate, paymentType, guid);
				if (response != null && response.getResult() != null&& response.getResult().getResponseCode() == 0) {
					if (response.getPriceInfoList() != null) {
						if (response.getPriceInfoList().getPriceInfoForNB() != null) {
							Date validDate = DateUtil.addYears(DateUtil.getDate(new Date()), 1);
							for (PriceInfoForNB item : response.getPriceInfoList().getPriceInfoForNB()) {
								Date rateEndDate = item.getEndDate().toDate();
								rateEndDate = item.getEndDate() != null ? item
										.getEndDate().toDate() : DateUtil
										.getMinValue();
								if (rateEndDate.getTime() > validDate.getTime()) {
									rateEndDate = validDate;
								}
								if (item.getMemberRate() == null) {
									continue;
								}
								if (lowestProfitPercent > 0) {
									double profitPercent = (item
											.getMemberRate().doubleValue() - item
											.getGenSaleCost().doubleValue())
											/ item.getMemberRate()
													.doubleValue();
									if (profitPercent * 100 < lowestProfitPercent) {
										continue;
									}
								}
								Date rateStartDate=item.getStartDate() != null ? item.getStartDate().toDate() : DateUtil.getMinValue();
								double member = item.getMemberRate() != null ? item.getMemberRate().doubleValue() : -1d;
								member = toIntegerPrice(member,proxyInfo.getIntegerPriceType());
								
								double weekend = item.getWeekendMemberRate() != null ? item.getWeekendMemberRate().doubleValue():-1d;
								weekend = toIntegerPrice(weekend,proxyInfo.getIntegerPriceType());
								//预付及现付需要返回结算价
								if(paymentType == EnumPaymentType.Prepay||proxyInfo.getEnableReturnAgentcyRateCost()){
									double costPrice=item.getGenSaleCost() != null ? item.getGenSaleCost().doubleValue() : -1d;
									List<RateWithRule> memberRateList=settlementCommon.getSettlementPrice(costPrice, member, item.getHotelID(), rateStartDate, rateEndDate);
									double weekendCost=item.getWeekendSaleCost() != null ? item.getWeekendSaleCost().doubleValue() : -1d;
									List<RateWithRule> weekendRateList=settlementCommon.getSettlementPrice(weekendCost, weekend, item.getHotelID(), rateStartDate, rateEndDate);
									if(memberRateList!=null&&weekendRateList!=null&&memberRateList.size()==weekendRateList.size()){
										for(int j=0;j<memberRateList.size();j++){
											Rate rate = new Rate();
											rate.setHotelID(mHotelIdArray[i]);
											rate.setHotelCode(item.getHotelID());
											rate.setMember(member);
											rate.setEndDate(memberRateList.get(j).getEndDate());
											rate.setStartDate(memberRateList.get(j).getStartDate());
											rate.setMemberCost(memberRateList.get(j).getCost());
											rate.setRateplanId(item.getRatePlanID());
											rate.setRoomTypeId(item.getRoomTypeID());
											
											rate.setStatus(item.getIsEffective() != null&& item.getIsEffective() == 1);
											rate.setWeekend(weekend);
											rate.setWeekendCost(weekendRateList.get(j).getCost());
											rate.setAddBed(item.getAllowAddBed() == 1 ? item
													.getAddBedRate().doubleValue() : -1d);
											rate.setPriceID(item.getPriceID());
											rate.setCurrencyCode(item.getCurrencyCode());
											result.add(rate);
										}
									}
								}else{
									Rate rate = new Rate();
									rate.setHotelID(mHotelIdArray[i]);
									rate.setHotelCode(item.getHotelID());
									rate.setMember(member);
									rate.setEndDate(rateEndDate);
									rate.setStartDate(item.getStartDate() != null ? item.getStartDate().toDate() : DateUtil.getMinValue());
									rate.setMemberCost(-1d);
									rate.setRateplanId(item.getRatePlanID());
									rate.setRoomTypeId(item.getRoomTypeID());
									
									rate.setStatus(item.getIsEffective() != null&& item.getIsEffective() == 1);
									rate.setWeekend(weekend);
									rate.setWeekendCost(-1d);
									rate.setAddBed(item.getAllowAddBed() == 1 ? item.getAddBedRate().doubleValue() : -1d);
									rate.setPriceID(item.getPriceID());
									rate.setCurrencyCode(item.getCurrencyCode());
									result.add(rate);
								}
							}
						}
					}
				} else if (response.getResult() != null&& StringUtils.isNotBlank(response.getResult().getErrorMessage())) {
					throw new RuntimeException(String.format("Inner Error: %s",response.getResult().getErrorMessage()));
				}
			}
		}
		return result;
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
	public List<Rate> getGoodsRate(ProxyAccount proxyInfo, String mhotelId,
			String shotelId, Date startDate, Date endDate,
			EnumPaymentType paymentType, double lowestProfitPercent, String guid)
			throws Exception {
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
		List<String[]> sHotelIdArrays = null;
		if(StringUtils.isNotEmpty(mhotelId)){
			mhotelId=mhotelId.replaceAll(" ", "");
		}
		List<String> hotelCodeList=new LinkedList<String>();
		List<HotelIdAttr> hotelIdAttrs = new LinkedList<HotelIdAttr>();
		if (StringUtils.isBlank(shotelId)) {
			mHotelIdArray = mhotelId.split(",");
			sHotelIdArrays = m_SRelationCache.getSHotelIds(mHotelIdArray);
			if(sHotelIdArrays!=null){
				int arraySize=sHotelIdArrays.size();
				for(int i=0;i<arraySize;i++){
					if(sHotelIdArrays.get(i)!=null){
						HotelIdAttr hotelIdAttr=new HotelIdAttr();
						hotelIdAttr.setHotelId(mHotelIdArray[i]);
						List<String> list=Arrays.asList(sHotelIdArrays.get(i));
						//商品库限制问题 暂不传入
//						hotelIdAttr.setHotelCodes(list);
						hotelCodeList.addAll(list);
						hotelIdAttrs.add(hotelIdAttr);
					}
				}
			}
		} else {
			HotelIdAttr hotelIdAttr=new HotelIdAttr();
			hotelIdAttr.setHotelId(mhotelId);
			List<String> list=Arrays.asList(shotelId.replaceAll(" ", "").split(","));
			hotelIdAttr.setHotelCodes(list);
			hotelCodeList.addAll(list);
			hotelIdAttrs.add(hotelIdAttr);
		}
		SettlementPriceRuleCommon settlementCommon=null;
		//预付及现付需要返回底价的价格数据
		if(paymentType==EnumPaymentType.All||paymentType==EnumPaymentType.Prepay||proxyInfo.getEnableReturnAgentcyRateCost()){
			settlementCommon=new SettlementPriceRuleCommon(proxyInfo, hotelCodeList, EnumSystem.Data);
		}
		List<Rate> response = this.rateRepository.getRates(proxyInfo, hotelIdAttrs, startDate, endDate, paymentType, guid);
		Date validDate = DateUtil.addYears(DateUtil.getDate(new Date()), 1);
		for (Rate item : response) {
			Date rateEndDate = item.getEndDate();
			if (rateEndDate.getTime() > validDate.getTime()) {
				rateEndDate = validDate;
			}
			if (item.getMember() <=0) {
				continue;
			}
			if (lowestProfitPercent > 0) {
				double profitPercent = (item.getMember() - item.getMemberCost())/ item.getMember();
				if (profitPercent * 100 < lowestProfitPercent) {
					continue;
				}
			}
			Date rateStartDate=item.getStartDate();
			double member = item.getMember();
			member = toIntegerPrice(member,proxyInfo.getIntegerPriceType());
			
			double weekend = item.getWeekend(); 
			weekend = toIntegerPrice(weekend,proxyInfo.getIntegerPriceType());
			//预付及现付需要返回结算价
			if(paymentType == EnumPaymentType.All||paymentType == EnumPaymentType.Prepay||proxyInfo.getEnableReturnAgentcyRateCost()){
				double costPrice=item.getMemberCost();
				List<RateWithRule> memberRateList=settlementCommon.getSettlementPrice(costPrice, member, item.getHotelID(), rateStartDate, rateEndDate);
				double weekendCost=item.getWeekendCost();
				List<RateWithRule> weekendRateList=settlementCommon.getSettlementPrice(weekendCost, weekend, item.getHotelID(), rateStartDate, rateEndDate);
				if(memberRateList!=null&&weekendRateList!=null&&memberRateList.size()==weekendRateList.size()){
					for(int j=0;j<memberRateList.size();j++){
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
			}else{
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
