package com.elong.nb.repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.annotation.Resource;

import com.elong.nb.common.model.RestRequest;
import com.elong.nb.model.bean.enums.EnumPaymentType;
import com.elong.nb.model.rateplan.HotelRatePlan;
import com.elong.nb.model.rateplan.MSHotelRelation;
import com.elong.nb.model.rateplan.RatePlanCondition;

public class RatePlanRepository {
	
	public List<HotelRatePlan> GetRatePlans(RestRequest<RatePlanCondition> request)
    {
        List<HotelRatePlan> result = new ArrayList<HotelRatePlan>();
        if (!request.getProxyInfo().getEnabledPrepayProducts())
        {
            if (request.getRequest().getPaymentType() == EnumPaymentType.Prepay)
            {
                return result;
            }
            else if (request.getRequest().getPaymentType() == EnumPaymentType.All)
            {
                request.getRequest().setPaymentType(EnumPaymentType.SelfPay);
            }
        }


        String[] mHotelArrays = request.getRequest().getHotelIds().split(",");
        List<String[]> sHotelIdArrays = M_SRelationRepository.GetSHotelIds(mHotelArrays);
        HashSet<String> sHotelIdSet = new HashSet<String>();
        int index = 0;

        //默认携程5931，去哪300573
        //string[] orderFroms = CommonRepository.GetAppServerConfig("hotel.rp.filtersupplier", "5931,300573").Split(',');

        for (String[] ids : sHotelIdArrays)
        {
            if (ids == null || ids.length <= 0)
                continue;

            String mhotelId = mHotelArrays[index];
            for (String shotelId : ids)
            {
                //if (orderFroms.Contains(request.ProxyInfo.OrderFrom.ToString())) 
                if (request.getProxyInfo().isIsOnlyStraight())
                {
                    //只保留艺龙直签，其他供应商的rp都过滤
                    MSHotelRelation hotelRelation = M_SRelationRepository.GetHotelRelation(shotelId);
                    if (hotelRelation != null)
                    {
                        int type = this.M_SRelationRepository.GetCooperationTypeBySupplierID(hotelRelation.SupplierId);
                        //CooperationType=1为直签，2为非直签，0为未知
                        if (type == 2)
                        {
                            continue;
                        }
                    }
                }


                sHotelIdSet.add(shotelId);
            }
        }

        int pageSize = 10;
        int pageCount = (int)Math.Ceiling((sHotelIdSet.Count * 1.0 / pageSize));
        pageSize = (int)Math.Ceiling((sHotelIdSet.Count) * 1.0 / pageCount);

        //string cv = CommonRepository.GetAppServerConfig("hotel.data.rp.parallel", "0");
        
        
            for (int pageIndex = 1; pageIndex <= pageCount; pageIndex++)
            {
                string sHotelIds = string.Join(",", sHotelIdSet.Skip((pageIndex - 1) * pageSize).Take(pageSize));
                switch (request.Request.PaymentType)
                {
                    case EnumPaymentType.Prepay:
                        if (request.ProxyInfo.EnabledPrepayProducts) MergeHotelRatePlans(result,
                            GetRatePlans(request.Local, null, sHotelIds, EnumPaymentType.Prepay, request.ProxyInfo, request.Version, request.Request.Options));
                        break;
                    case EnumPaymentType.SelfPay:
                        MergeHotelRatePlans(result,
                            GetRatePlans(request.Local, null, sHotelIds, EnumPaymentType.SelfPay, request.ProxyInfo, request.Version, request.Request.Options));
                        break;
                    case EnumPaymentType.All:
                        MergeHotelRatePlans(result,
                            GetRatePlans(request.Local, null, sHotelIds, EnumPaymentType.SelfPay, request.ProxyInfo, request.Version, request.Request.Options));
                        if (request.ProxyInfo.EnabledPrepayProducts) MergeHotelRatePlans(result,
                            GetRatePlans(request.Local, null, sHotelIds, EnumPaymentType.Prepay, request.ProxyInfo, request.Version, request.Request.Options));
                        break;
                }
            }
        


        if (request.getVersion() > 1.10)
        {
            //获取礼品相关信息                
     
                foreach (var hotel in result)
                {
                    hotel.Gifts = new List<HotelGift>();
                    foreach (var s in hotel.Suppliers)
                    {
                        var list = HotelGiftRepository.GetHotelGiftBySHotelId(s.HotelCode);
                        if (list != null && list.Count > 0)
                            hotel.Gifts.AddRange(list);
                    }
                }
        }
        
        return result;
    }
	
}
