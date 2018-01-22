package com.elong.nb.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.elong.nb.common.model.EnumLocal;
import com.elong.nb.common.model.ErrorCode;
import com.elong.nb.common.model.ProxyAccount;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.dao.adapter.cache.M_SRelationCache;
import com.elong.nb.dao.adapter.repository.RatePlanRepository;
import com.elong.nb.model.HotelIdAttr;
import com.elong.nb.model.bean.enums.EnumInvoiceMode;
import com.elong.nb.model.bean.enums.EnumPaymentType;
import com.elong.nb.model.rateplan.HotelRatePlan;
import com.elong.nb.model.rateplan.RatePlan;
import com.elong.nb.model.rateplan.RatePlanCondition;
import com.elong.nb.model.rateplan.RatePlanResult;
import com.elong.nb.model.rateplan.SupplierRatePlan;
import com.elong.nb.service.IRatePlansService;

@Service
public class RatePlansService implements IRatePlansService {

	@Resource
	private RatePlanRepository ratePlanRepository;
	@Resource
	private M_SRelationCache m_SRelationCache;

	public List<HotelRatePlan> getRatePlans(RestRequest<RatePlanCondition> request, ProxyAccount proxyAccount) {
		List<HotelRatePlan> result = new LinkedList<HotelRatePlan>();
		if (!proxyAccount.getEnabledPrepayProducts()) {
			if (request.getRequest().getPaymentType() == EnumPaymentType.Prepay) {
				return result;
			} else if (request.getRequest().getPaymentType() == EnumPaymentType.All) {
				request.getRequest().setPaymentType(EnumPaymentType.SelfPay);
			}
		}
		String[] mHotelArrays = request.getRequest().getHotelIds().replaceAll(" ", "").split(",");
		List<String[]> sHotelIdArrays = m_SRelationCache.getSHotelIds(mHotelArrays);

		result = getRatePlansFromGoods(request.getLocal(), Arrays.asList(mHotelArrays), sHotelIdArrays, request.getRequest()
				.getPaymentType(), proxyAccount, request.getVersion(), request.getRequest().getOptions(), request.getGuid());
		return result;
	}

	public List<HotelRatePlan> getRatePlansFromGoods(EnumLocal language, List<String> mHotelIds, List<String[]> shotelIdArrs,
			EnumPaymentType paymentType, ProxyAccount proxyInfo, double requestVersion, String options, String guid) {
		Map<String, EnumPaymentType> hotelCodeFilterType = new HashMap<String, EnumPaymentType>();
		List<HotelIdAttr> hotelIdAttrs = new LinkedList<HotelIdAttr>();
		for (int i = 0; i < mHotelIds.size(); i++) {
			List<String> showHotelCode = new LinkedList<String>();
			String[] sHotelIds = shotelIdArrs.get(i);
			for (String hotelCode : sHotelIds) {
				showHotelCode.add(hotelCode);
			}
			if (showHotelCode != null && showHotelCode.size() > 0) {
				HotelIdAttr hotelIdAttr = new HotelIdAttr();
				hotelIdAttr.setHotelId(mHotelIds.get(i));
				hotelIdAttr.setHotelCodes(showHotelCode);
				hotelIdAttrs.add(hotelIdAttr);
			}
		}
		if (hotelIdAttrs != null && hotelIdAttrs.size() > 0) {
			List<HotelRatePlan> ratePlans = this.ratePlanRepository.getRatePlans(proxyInfo, hotelIdAttrs, paymentType, hotelCodeFilterType,
					language == EnumLocal.zh_CN, options, guid, requestVersion);
			// supplier上发票模式，取该supplier下所有预付rateplan上数量多的发票模式
			boolean isBookingChannelEmpty = StringUtils.isEmpty(options) || !options.contains("1");
			Map<String, Integer> hotelCodeInvoiceModeMap = new HashMap<String, Integer>();
			for (HotelRatePlan hotelRatePlan : ratePlans) {
				List<RatePlan> ratePlanList = hotelRatePlan.getRatePlans();
				if (ratePlanList == null || ratePlanList.size() == 0)
					continue;
				Iterator<RatePlan> iter = ratePlanList.iterator();
				while (iter.hasNext()) {
					RatePlan ratePlan = iter.next();
					// 过滤直签
					if (proxyInfo.isIsOnlyStraight() && ratePlan.getCooperationType() == 2) {
						iter.remove();
						continue;
					}
					if (isBookingChannelEmpty) {
						ratePlan.setBookingChannels(null);
					}

					if (EnumPaymentType.Prepay != ratePlan.getPaymentType())
						continue;
					String key = ratePlan.getHotelCode() + "_" + ratePlan.getInvoiceMode().toString();
					Integer count = hotelCodeInvoiceModeMap.get(key);
					count = (count == null) ? 0 : count;
					hotelCodeInvoiceModeMap.put(key, count + 1);
				}
			}
			for (HotelRatePlan hotelRatePlan : ratePlans) {
				List<SupplierRatePlan> supplierList = hotelRatePlan.getSuppliers();
				if (supplierList == null || supplierList.size() == 0)
					continue;
				for (SupplierRatePlan supplier : supplierList) {
					String hotelInvoiceKey = supplier.getHotelCode() + "_" + EnumInvoiceMode.Hotel.toString();
					Integer hotelInvoiceCount = hotelCodeInvoiceModeMap.get(hotelInvoiceKey);
					hotelInvoiceCount = (hotelInvoiceCount == null) ? 0 : hotelInvoiceCount;
					String elongInvoiceKey = supplier.getHotelCode() + "_" + EnumInvoiceMode.Elong.toString();
					Integer elongInvoiceCount = hotelCodeInvoiceModeMap.get(elongInvoiceKey);
					elongInvoiceCount = (elongInvoiceCount == null) ? 0 : elongInvoiceCount;
					supplier.setInvoiceMode(hotelInvoiceCount >= elongInvoiceCount ? EnumInvoiceMode.Hotel : EnumInvoiceMode.Elong);
				}
			}
			return ratePlans;
		} else {
			return new LinkedList<HotelRatePlan>();
		}
	}

	@Override
	public RestResponse<RatePlanResult> GetRatePlans(RestRequest<RatePlanCondition> request, ProxyAccount proxyAccount) {
		RestResponse<RatePlanResult> response = new RestResponse<RatePlanResult>(request.getGuid());
		if (request.getRequest().getPaymentType() == EnumPaymentType.Prepay && !proxyAccount.getEnabledPrepayProducts()) {
			response.setCode(ErrorCode.Data_NoPrepayProducts);
		} else {
			RatePlanResult res = new RatePlanResult();
			response.setResult(res);
			response.getResult().setHotels(getRatePlans(request, proxyAccount));
		}
		return response;
	}

}
