package com.elong.nb.repository;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.elong.nb.agent.NorthBoundForAPIService.AddValueInfoSimple;
import com.elong.nb.agent.NorthBoundForAPIService.AddValuePolicyInfo;
import com.elong.nb.agent.NorthBoundForAPIService.ArrayOfHotelDetail;
import com.elong.nb.agent.NorthBoundForAPIService.DRRInfo;
import com.elong.nb.agent.NorthBoundForAPIService.DictionaryEntry;
import com.elong.nb.agent.NorthBoundForAPIService.EnumBookRuleForHotel;
import com.elong.nb.agent.NorthBoundForAPIService.EnumCutType;
import com.elong.nb.agent.NorthBoundForAPIService.EnumDRRRule;
import com.elong.nb.agent.NorthBoundForAPIService.EnumFeeType;
import com.elong.nb.agent.NorthBoundForAPIService.EnumMeasureUnit;
import com.elong.nb.agent.NorthBoundForAPIService.EnumPrepayRule;
import com.elong.nb.agent.NorthBoundForAPIService.EnumVouchMoneyType;
import com.elong.nb.agent.NorthBoundForAPIService.EnumVouchRule;
import com.elong.nb.agent.NorthBoundForAPIService.HotelBookingRule;
import com.elong.nb.agent.NorthBoundForAPIService.HotelDetail;
import com.elong.nb.agent.NorthBoundForAPIService.HotelRatePlanCondition;
import com.elong.nb.agent.NorthBoundForAPIService.INorthBoundForAPIService;
import com.elong.nb.agent.NorthBoundForAPIService.PrePayInfo;
import com.elong.nb.agent.NorthBoundForAPIService.RatePlanBaseInfo;
import com.elong.nb.agent.NorthBoundForAPIService.RoomTypeInfo;
import com.elong.nb.agent.NorthBoundForAPIService.VouchInfo;
import com.elong.nb.agent.ProductForNBServiceContract.GetRatePlanBaseInfoRequest;
import com.elong.nb.agent.ProductForNBServiceContract.GetRatePlanBaseInfoResponse2;
import com.elong.nb.agent.ProductForNBServiceContract.IProductForNBServiceContract;
import com.elong.nb.agent.SupplierService.GetSupplierInfoBySupplierIDRequest;
import com.elong.nb.agent.SupplierService.GetSupplierInfoBySupplierIDResponse;
import com.elong.nb.agent.SupplierService.ISupplierServiceContract;
import com.elong.nb.agent.SupplierService.InvoiceMode;
import com.elong.nb.common.model.EnumLocal;
import com.elong.nb.common.model.ProxyAccount;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.dao.adapter.cache.M_SRelationRepository;
import com.elong.nb.model.bean.enums.EnumBookingRule;
import com.elong.nb.model.bean.enums.EnumDateType;
import com.elong.nb.model.bean.enums.EnumDrrFeeType;
import com.elong.nb.model.bean.enums.EnumDrrPreferential;
import com.elong.nb.model.bean.enums.EnumDrrRuleCode;
import com.elong.nb.model.bean.enums.EnumGuaranteeChangeRule;
import com.elong.nb.model.bean.enums.EnumGuaranteeMoneyType;
import com.elong.nb.model.bean.enums.EnumGuestTypeCode;
import com.elong.nb.model.bean.enums.EnumInvoiceMode;
import com.elong.nb.model.bean.enums.EnumPaymentType;
import com.elong.nb.model.bean.enums.EnumPrepayChangeRule;
import com.elong.nb.model.bean.enums.EnumPrepayCutPayment;
import com.elong.nb.model.bean.enums.EnumValueAddPriceOption;
import com.elong.nb.model.rateplan.HotelGift;
import com.elong.nb.model.rateplan.HotelRatePlan;
import com.elong.nb.model.rateplan.MSHotelRelation;
import com.elong.nb.model.rateplan.MSRoomRelation;
import com.elong.nb.model.rateplan.RatePlan;
import com.elong.nb.model.rateplan.RatePlanCondition;
import com.elong.nb.model.rateplan.SupplierRatePlan;
import com.elong.nb.util.DateUtil;

@Repository
public class RatePlanRepository {
	
	private static Logger LocalMsg = LogManager
			.getLogger(RatePlanRepository.class);
	
	@Resource
	M_SRelationRepository mSRelationRepository;
	@Resource(name="northBoundForAPIService")
	INorthBoundForAPIService northBoundForAPIService;
	@Resource(name="productForNBServiceContract")
	IProductForNBServiceContract productForNBServiceContract;
	@Resource(name="supplierService")
	ISupplierServiceContract supplierServiceContract;
	@Resource
	HotelGiftRepository hotelGiftRepository;
	
	public List<HotelRatePlan> GetRatePlans(RestRequest<RatePlanCondition> request)
    {
        List<HotelRatePlan> result = new LinkedList<HotelRatePlan>();
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
        //List<String[]> sHotelIdArrays = M_SRelationRepository.GetSHotelIds(mHotelArrays);
        List<String[]> sHotelIdArrays = M_SRelationRepository.GetSHotelIds(mHotelArrays);
        
        //test
        //String[] test = new String[1];
        //test[0]="20101001";
        //sHotelIdArrays.add(test);
        //end test
        
        HashSet<String> sHotelIdSet = new HashSet<String>();
        //int index = 0;

        //默认携程5931，去哪300573
        //string[] orderFroms = CommonRepository.GetAppServerConfig("hotel.rp.filtersupplier", "5931,300573").Split(',');

        for (String[] ids : sHotelIdArrays)
        {
            if (ids == null || ids.length <= 0 || ids[0]==null)
                continue;

            //String mhotelId = mHotelArrays[index];
            for (String shotelId : ids)
            {
                //if (orderFroms.Contains(request.ProxyInfo.OrderFrom.ToString())) 
                if (request.getProxyInfo().isIsOnlyStraight())
                {
                    //只保留艺龙直签，其他供应商的rp都过滤
                    MSHotelRelation hotelRelation = M_SRelationRepository.GetHotelRelation(shotelId);
                    if (hotelRelation != null)
                    {
                        int type = mSRelationRepository.GetCooperationTypeBySupplierID(hotelRelation.getSupplierId());
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
        int pageCount = (int)Math.ceil((sHotelIdSet.size() * 1.0 / pageSize));
        pageSize = (int)Math.ceil((sHotelIdSet.size()) * 1.0 / pageCount);

        //string cv = CommonRepository.GetAppServerConfig("hotel.data.rp.parallel", "0");
        
        LinkedList<String> al = new LinkedList<String>();
        int count=0;
        String str= new String();
        for(String s : sHotelIdSet)
        {
           if(count<pageSize)
           {
        	   if(count ==pageSize-1)
        	    str+=s;
        	   else
        	    str+=s+",";
           }
           else
           {
        	   al.add(str);
        	   count=0;
        	   str=new String();
           }
        }
        
        if(str.length()>0)
        {
        	if(str.contains(","))
        	    str= str.substring(0, str.lastIndexOf(","));
            al.add(str);
        }
        
            //for (int pageIndex = 1; pageIndex <= pageCount; pageIndex++)
            //String sHotelIds = String.Join(",", sHotelIdSet.Skip((pageIndex - 1) * pageSize).Take(pageSize));

        HashMap<String,HotelRatePlan> hashHotel =new HashMap<String,HotelRatePlan>();
        
            for(String sHotelIds : al)
            {
                switch (request.getRequest().getPaymentType().getValue())
                {
                    case 2: //EnumPaymentType.Prepay:
                        if (request.getProxyInfo().getEnabledPrepayProducts()) 
                        	MergeHotelRatePlans(result,hashHotel,GetRatePlans(request.getLocal(), null, sHotelIds, EnumPaymentType.Prepay, request.getProxyInfo(), request.getVersion(), request.getRequest().getOptions()));
                        break;
                    case 1://EnumPaymentType.SelfPay:
                        MergeHotelRatePlans(result,hashHotel,GetRatePlans(request.getLocal(), null, sHotelIds, EnumPaymentType.SelfPay, request.getProxyInfo(), request.getVersion(), request.getRequest().getOptions()));
                        break;
                    case 0: //EnumPaymentType.All:
                        MergeHotelRatePlans(result,hashHotel,GetRatePlans(request.getLocal(), null, sHotelIds, EnumPaymentType.SelfPay, request.getProxyInfo(), request.getVersion(), request.getRequest().getOptions()));
                        if (request.getProxyInfo().getEnabledPrepayProducts()) 
                        	MergeHotelRatePlans(result,hashHotel,GetRatePlans(request.getLocal(), null, sHotelIds, EnumPaymentType.Prepay, request.getProxyInfo(), request.getVersion(), request.getRequest().getOptions()));
                        break;
                }
            }
        


        if (request.getVersion() > 1.10)
        {
            //获取礼品相关信息                
                for (HotelRatePlan hotel : result)
                {
                    hotel.setGifts(new LinkedList<HotelGift>());
                    for (SupplierRatePlan s : hotel.getSuppliers())
                    {
                    	List<HotelGift> list = hotelGiftRepository.GetHotelGiftBySHotelId(s.getHotelCode());
                        if (list != null && list.size() > 0)
                            hotel.getGifts().addAll(list);
                    }
                }
        }
        
        return result;
    }
	
	//将MHotel对应的多个HotelCode的SHotel合并起来
    private void MergeHotelRatePlans(List<HotelRatePlan> result,HashMap<String,HotelRatePlan> hashHotel, List<HotelRatePlan> hotels)
    {
        for (HotelRatePlan shotel : hotels)
        {
            HotelRatePlan mhotel =null; //result.FirstOrDefault(x => x.HotelID == shotel.HotelID);
            //if (mhotel == null)
        	if(!hashHotel.containsKey(shotel.getHotelID()))
            {
                result.add(shotel);
                hashHotel.put(shotel.getHotelID(),shotel);
            }
            else
            {
            	mhotel = hashHotel.get(shotel.getHotelID());
            	
                if (shotel.getSuppliers() != null && shotel.getSuppliers().size() > 0)
                {
                    for (SupplierRatePlan supplier : shotel.getSuppliers())
                    {
                    	SupplierRatePlan s =null; 
                    	//mhotel.Suppliers.FirstOrDefault(x => x.HotelCode == supplier.HotelCode);                
                    	for(SupplierRatePlan mhotelSupp : mhotel.getSuppliers())
                    	{
                    		if(mhotelSupp.getHotelCode() !=null && mhotelSupp.getHotelCode().equals(supplier.getHotelCode()))
                    			s= mhotelSupp;
                    	}
                    	
                    	if (s == null)
                        {
                    		if(mhotel.getSuppliers()==null)
                    		{
                    			List<SupplierRatePlan> suppList = new LinkedList<SupplierRatePlan>();
                    			mhotel.setSuppliers(suppList);
                    		}
                            mhotel.getSuppliers().add(supplier);
                            
                        }
                        else
                        {
                        	
                            //merge bookingRules
                            for (com.elong.nb.model.bean.base.BaseBookingRule br : supplier.getBookingRules())
                            {        	
                            	com.elong.nb.model.bean.base.BaseBookingRule br2 = null;
                            	for(com.elong.nb.model.bean.base.BaseBookingRule ru: s.getBookingRules())
                            	{
                            		if(ru.getDateType() == br.getDateType() &&
	                                    ru.getEndDate() == br.getEndDate() &&
	                                    ru.getRoomTypeIds() == br.getRoomTypeIds() &&
	                                    ru.getStartDate() == br.getStartDate() &&
	                                    ru.getTypeCode() == br.getTypeCode() )
                            		{
                            			br2 =ru;
                            		}
                            	}
                            	
                                if (br2 == null)
                                {
                                	if(s.getBookingRules()==null)
                                	{
                                		s.setBookingRules(new LinkedList<com.elong.nb.model.bean.base.BaseBookingRule>());
                                	}
                                    s.getBookingRules().add(br);
                                }
                            }
                        }
                    }
                }
                if (shotel.getRatePlans() != null && shotel.getRatePlans().size() > 0)
                {
                	if(mhotel.getRatePlans() ==null)
                	{
                		mhotel.setRatePlans(new LinkedList<RatePlan>());
                	}
                    mhotel.getRatePlans().addAll(shotel.getRatePlans());
                }
            }
        }
    }
    
    public List<HotelRatePlan> GetRatePlans(EnumLocal language, String mHotelId, String shotelId, EnumPaymentType paymentType, ProxyAccount proxyInfo, double requestVersion, String options)
    {
    	HotelRatePlanCondition condition = new HotelRatePlanCondition();
    	condition.setOrderId(proxyInfo.getOrderFrom());
    	condition.setCardNo(proxyInfo.getCardNo());
        condition.setLanguage(language.toString());
    	condition.setHotelId(shotelId);
    	condition.setSettlementType(paymentType.toString());
    	condition.setGuestType("1");
    	condition.setPriceModel("1");
    	condition.setPriceType("1");
    	condition.setProductType("1");
        
    	//.SearchHotelRatePlanList(condition);
    	ArrayOfHotelDetail response = northBoundForAPIService.searchHotelRatePlanList(condition);

        List<HotelRatePlan> result = new LinkedList<HotelRatePlan>();

        if(response==null || response.getHotelDetail()==null )
        	return result;
        
        for (HotelDetail hotel : response.getHotelDetail())
        {
            //result.Add(new HotelRatePlan
            //{
            //    HotelID = mHotelId == null ? this.M_SRelationRepository.GetMHotelId(hotel.HotelBaseInfo.HotelId) : mHotelId,
            //    RatePlans = GetRatePlans(hotel, language, proxyInfo, requestVersion, options),
            //    Suppliers = GetSuppliers(hotel, language),
            //});
        	HotelRatePlan rp = new HotelRatePlan();
        	if(hotel.getHotelBaseInfo() !=null)
        	{
        	  rp.setHotelID(mHotelId == null ? mSRelationRepository.GetMHotelId(hotel.getHotelBaseInfo().getHotelId()) : mHotelId);
        	}
        	  rp.setRatePlans(GetRatePlans(hotel, language, proxyInfo, requestVersion, options));
            rp.setSuppliers(GetSuppliers(hotel, language));
        	result.add(rp);
        }

        return result;
    }
    
    private List<RatePlan> GetRatePlans(HotelDetail hotel, EnumLocal language, ProxyAccount proxyInfo, double requestVersion, String options)
    {
        List<RatePlan> result = new LinkedList<RatePlan>();
        
        List<Integer> levels = new LinkedList<Integer>();
        int CooperationType = 0;
        if (requestVersion >= 1.27) 
        {
            if (proxyInfo.isIsOnlyStraight())
            {
                CooperationType = 1;
            }
            else 
            {
            	if(hotel!=null && hotel.getHotelBaseInfo()!=null 
            			&& hotel.getHotelBaseInfo().getHotelId()!=null 
            			&& !hotel.getHotelBaseInfo().getHotelId().isEmpty())
            	{
	                //获取合作类型，是艺龙直签还是其它供应商
	            	MSHotelRelation hotelRelation = M_SRelationRepository.GetHotelRelation(hotel.getHotelBaseInfo().getHotelId());
	                if (hotelRelation != null)
	                {
	                    int type = mSRelationRepository.GetCooperationTypeBySupplierID(hotelRelation.getSupplierId());
	                    //CooperationType=1为直签，2为非直签，0为未知
	                    CooperationType = type;
	                }
            	}
            }
           
        }

        if(hotel==null || hotel.getRoomBaseInfos() == null || hotel.getRoomBaseInfos().getRoomTypeInfo()==null)
        	return result;
        
        for (RoomTypeInfo roomType : hotel.getRoomBaseInfos().getRoomTypeInfo())
        {
        	if(roomType.getRoomRate()==null || roomType.getRoomRate().getRatePlans()==null 
        			|| roomType.getRoomRate().getRatePlans().getRatePlanBaseInfo()==null)
        		continue;
        	
            for (RatePlanBaseInfo oldrp : roomType.getRoomRate().getRatePlans().getRatePlanBaseInfo())
            {
                //EnumPaymentType payType = Tools.ParseEnum<EnumPaymentType>(oldrp.SettlementType, EnumPaymentType.Prepay);
                // 全部，仅用于检索All(0), 前台自付SelfPay(1), 预付Prepay(2);
            	EnumPaymentType payType =EnumPaymentType.Prepay;
            	if(oldrp.getSettlementType()==null ||oldrp.getSettlementType().equals("") ||oldrp.getSettlementType().equals("2"))
            		payType =EnumPaymentType.Prepay;
            	else if(oldrp.getSettlementType().equals("0"))
            		payType =EnumPaymentType.All;
            	else if(oldrp.getSettlementType().equals("1"))
            		payType =EnumPaymentType.Prepay;
            	
            	RatePlan rp = new RatePlan();
                {
                	if(hotel.getHotelBaseInfo() !=null)
                      rp.setHotelCode(hotel.getHotelBaseInfo().getHotelId());
                    rp.setRatePlanId(oldrp.getRatePlanID());
                    //RatePlanCode = oldrp.RatePlanCode,
                    rp.setRatePlanName(language == EnumLocal.zh_CN ? oldrp.getCNRatePlanName() : oldrp.getENGRatePlanName());
                    rp.setRoomTypeIds(oldrp.getRatePlanRoomTypeId());
                    //CustomerType = (EnumGuestTypeCode)Enum.Parse(typeof(EnumGuestTypeCode), oldrp.PriceType),
                    
                    //Tools.ParseEnum<EnumGuestTypeCode>(oldrp.getPriceType(), EnumGuestTypeCode.Chinese)
                    //客人国籍类别：1-统一价；2-内宾；3-外宾；4-港澳台；5-日本
                    EnumGuestTypeCode gtype =EnumGuestTypeCode.Chinese;
                    if(oldrp.getPriceType().equals("1"))
                    	gtype =EnumGuestTypeCode.All;
                    else if(oldrp.getPriceType().equals("2"))
                    	gtype = EnumGuestTypeCode.Chinese;
                    else if(oldrp.getPriceType().equals("3"))
                    	gtype = EnumGuestTypeCode.OtherForeign;
                    else if(oldrp.getPriceType().equals("4"))
                    	gtype = EnumGuestTypeCode.HongKong;
                    else if(oldrp.getPriceType().equals("5"))
                    	gtype = EnumGuestTypeCode.Japanese;
                    rp.setCustomerType(gtype);
                    
                    rp.setIsLimitTimeSale(oldrp.getIsLimitTimeSale() == 1);

                    rp.setProductTypes(ParseProductType(oldrp.getProductType(), oldrp.getBookingChannel(), IsHourPayRoom(oldrp.getCNRatePlanName())));
                    if(oldrp.getStartTime() !=null)
                      rp.setStartTime(oldrp.getStartTime().toString("HH:mm:ss"));
                    if(oldrp.getEndTime() !=null)
                      rp.setEndTime(oldrp.getEndTime().toString("HH:mm:ss"));
                    rp.setMinAdvHours(oldrp.getMinAdvanceBookingDays());
                    rp.setMaxAdvHours(oldrp.getMaxAdvanceBookingDays());
                    rp.setMinDays(oldrp.getMinStayDays());
                    rp.setMaxDays(oldrp.getMaxStayDays());
                    rp.setMinAmount(oldrp.getMinCheckinRooms());
                    rp.setPaymentType(payType);
                    rp.setDrrRules(GetDrrRules(oldrp, language));
                    rp.setGuaranteeRules((payType == EnumPaymentType.SelfPay) ? GetGuaranteeRules(oldrp, language) : null);
                    rp.setPrepayRules((payType == EnumPaymentType.Prepay) ? GetPrepayRules(oldrp, language) : null);
                    //Promotions = GetPromotionRules(oldrp, language),
                    rp.setValueAdds(GetValueAddRules(oldrp, language));
                    rp.setCooperationType(CooperationType);
                    //Coupon = coupon,
                    //Gifts = requestVersion >= 1.11 ? null : null,
                };

                if (options!=null && !options.isEmpty())
                {
                    //var arr = options.Split(new char[] { ',' }, StringSplitOptions.RemoveEmptyEntries);
                	String[] arr =options.split(",");
                	LinkedList<String> alOptions =new LinkedList<String>();
                	for(String s : arr)
                	{
                		alOptions.add(s);
                	}
                		
                    if (alOptions.contains("1")) //BookingChannels
                    {
                        rp.setBookingChannels("1");
                        
                        GetRatePlanBaseInfoRequest req =  new GetRatePlanBaseInfoRequest();
                        if(hotel.getHotelBaseInfo()!=null)
                           req.setHotelID(hotel.getHotelBaseInfo().getHotelId());
                        req.setRatePlanID(oldrp.getRatePlanID());
                        GetRatePlanBaseInfoResponse2 r = productForNBServiceContract.getRatePlanBaseInfo(req);
                        
                        if (r != null && r.getResult() != null && r.getResult().getResponseCode() == 0 && r.getRatePlanBaseInfo() != null)
                        {
                            int c = 0;
                            if(r.getRatePlanBaseInfo().getRawBookingChannel()!=null)
                            	c=r.getRatePlanBaseInfo().getRawBookingChannel();
                            
                            List<Integer> channels = new LinkedList<Integer>();
                            if ((c & 2) == 2) channels.add(1);
                            if ((c & 4) == 4) channels.add(2);
                            if ((c & 16) == 16) channels.add(3);
                            if (channels.size() > 0)
                            {
                            	//"1,2,3,44,55"
                                //rp.setBookingChannels(string.Join(",", channels));
                            	String str=",";
                            	for(int i : channels)
                            	{
                            		str+=i;
                            	}
                            	rp.setBookingChannels(str.substring(1));
                            }
                        }
                    }
                }

                //rp 会员等级
                levels = new LinkedList<Integer>();
                if ((oldrp.getCustomerLevel() & 1024) == 1024)
                {
                    levels.add(0);
                }
                if ((oldrp.getCustomerLevel() & 1) == 1)
                {
                    levels.add(1);
                }
                if ((oldrp.getCustomerLevel() & 2) == 2)
                {
                    levels.add(2);
                }
                if ((oldrp.getCustomerLevel() & 4) == 4)
                {
                    levels.add(3);
                }
                if ((oldrp.getCustomerLevel() & 8) == 8)
                {
                    levels.add(4);
                }

                
                //levels.toArray(lev);
               int[] lev = new int[levels.size()]; 
               for(int i=0;i<levels.size();i++)
               {
            	   lev[i] = levels.get(i);
               }
                rp.setCustomerLevel(lev);

                result.add(rp);
            }
        }

        return result;
    }
    
    
    
    private List<com.elong.nb.model.bean.base.BaseDrrRule> GetDrrRules(RatePlanBaseInfo oldrp, EnumLocal language)
    {
        List<com.elong.nb.model.bean.base.BaseDrrRule> result = new LinkedList<com.elong.nb.model.bean.base.BaseDrrRule>();
        
        if(oldrp ==null || oldrp.getRatePlanDRRList()==null || oldrp.getRatePlanDRRList().getDRRInfo()==null)
        	return result;
        
        for (DRRInfo rule : oldrp.getRatePlanDRRList().getDRRInfo())
        {
        	com.elong.nb.model.bean.base.BaseDrrRule brule = new com.elong.nb.model.bean.base.BaseDrrRule();
            {
            	//Tools.ParseEnum<EnumDrrRuleCode>(rule.DRRRule.GetHashCode().ToString(), EnumDrrRuleCode.DRRBookAhead)
            	EnumDrrRuleCode drrRuleEnum=EnumDrrRuleCode.DRRBookAhead;
            	if(rule.getDRRRule()==EnumDRRRule.DRR_BOOK_AHEAD)
            		drrRuleEnum = EnumDrrRuleCode.DRRBookAhead;
            	else if(rule.getDRRRule()==EnumDRRRule.DRR_CHECK_IN_WEEK_DAY)
            		drrRuleEnum = EnumDrrRuleCode.DRRCheckInWeekDay;
            	else if(rule.getDRRRule()==EnumDRRRule.DRR_STAY_LAST_NIGHT)
            		drrRuleEnum = EnumDrrRuleCode.DRRStayLastNight;
            	else if(rule.getDRRRule()==EnumDRRRule.DRR_STAY_PER_LAST_NIGHT)
            		drrRuleEnum = EnumDrrRuleCode.DRRStayPerLastNight;
            	else if(rule.getDRRRule()==EnumDRRRule.DRR_STAY_PER_ROOM_PER_NIGHT)
            		drrRuleEnum = EnumDrrRuleCode.DRRStayPerRoomPerNight;
            	else if(rule.getDRRRule()==EnumDRRRule.DRR_STAY_THE_NIGHT_AND_AFTER)
            		drrRuleEnum = EnumDrrRuleCode.DRRStayTheNightAndAfter;
            	else if(rule.getDRRRule()==EnumDRRRule.DRR_STAY_WEEK_DAY)
            		drrRuleEnum = EnumDrrRuleCode.DRRStayWeekDay;
            	else if(rule.getDRRRule()==EnumDRRRule.NONE)
            		drrRuleEnum = EnumDrrRuleCode.None;
                brule.setTypeCode(drrRuleEnum);
                
                //Tools.ParseEnum<EnumDrrPreferential>(rule.MoneyOrPercent.GetHashCode().ToString(), EnumDrrPreferential.Scale)
                EnumDrrPreferential drrPre = EnumDrrPreferential.Scale;
                if(rule.getMoneyOrPercent() == EnumMeasureUnit.MONEY)
                	drrPre =EnumDrrPreferential.Cash;
                else if(rule.getMoneyOrPercent() == EnumMeasureUnit.SCALE)
                	drrPre =EnumDrrPreferential.Scale;
                brule.setCashScale(drrPre);
                
                if(rule.getMoneyOrPercentValue() !=null)
                   brule.setDeductNum(rule.getMoneyOrPercentValue().doubleValue());
                
                //Tools.ParseEnum<EnumDateType>(rule.DateType.GetHashCode().ToString(), EnumDateType.CheckInDay)
                EnumDateType dateType = EnumDateType.CheckInDay;
                if(rule.getDateType()==com.elong.nb.agent.NorthBoundForAPIService.EnumDateType.BOOK_DAY)
                	dateType=EnumDateType.BookDay; 
                else if(rule.getDateType()==com.elong.nb.agent.NorthBoundForAPIService.EnumDateType.CHECK_IN_DAY)
                	dateType=EnumDateType.CheckInDay; 
                else if(rule.getDateType()==com.elong.nb.agent.NorthBoundForAPIService.EnumDateType.STAY_DAY)
                	dateType=EnumDateType.StayDay; 
                brule.setDateType(dateType);
                
                brule.setDescription(language == EnumLocal.zh_CN ? rule.getCNDescription() : rule.getENDescription());
                if(rule.getStartDate()!=null)
                   brule.setStartDate(rule.getStartDate().toDate());
                if(rule.getEndDate() !=null)
                   brule.setEndDate(rule.getEndDate().toDate());
                
                //Tools.ParseEnum<EnumDrrFeeType>(rule.FeeType.GetHashCode().ToString(), EnumDrrFeeType.WeekendFee)
                EnumDrrFeeType drrFee = EnumDrrFeeType.WeekendFee;
                if(rule.getFeeType() == EnumFeeType.WEEKDAY_FEE)
                	drrFee= EnumDrrFeeType.WeekdayFee;
                else if(rule.getFeeType() == EnumFeeType.WEEKEND_FEE)
                	drrFee= EnumDrrFeeType.WeekendFee;
                brule.setFeeType(drrFee);
                
                if(rule.getIsWeekEffective() !=null)
                   brule.setWeekSet(GetWeekSet(rule.getIsWeekEffective().getInt()));
                if(rule.getRuleValues()!=null)
                    brule.setCheckInNum(GetRuleValue(rule.getRuleValues().getDictionaryEntry(), "CheckInNum"));
                if(rule.getRuleValues() !=null)
                   brule.setDayNum(GetRuleValue(rule.getRuleValues().getDictionaryEntry(), "DayNum"));
                if(rule.getRuleValues() !=null)
                   brule.setLastDayNum(GetRuleValue(rule.getRuleValues().getDictionaryEntry(), "LastDayNum"));
                if(rule.getRuleValues()!=null)
                   brule.setEveryCheckInNum(GetRuleValue(rule.getRuleValues().getDictionaryEntry(), "EveryCheckInNum"));
                if(rule.getRuleValues() !=null)
                   brule.setWhichDayNum(GetRuleValue(rule.getRuleValues().getDictionaryEntry(), "WhichDayNum"));
                brule.setRoomTypeIds(rule.getRoomTypeIds());
            }
            result.add(brule);
        }
        return result;
    }
    
    private String GetWeekSet(List<Integer> week)
    {
        String result ="";
        if(week==null || week.size()<=0)
        	return result;
        
        for (int i = 1; i < 7; i++)
        {
            if (week.get(i) == 1)
            {
                result += "," + i;
            }
        }
        if (week.get(0) == 1)
        {
            result += ",7";
        }
        //return result.Trim(',');
        if(result.contains(","))
           return result.substring(1);
        
        return result;
    }
    
    private int GetRuleValue(List<DictionaryEntry> rules, String key)
    {
    	if(rules ==null || rules.size()<=0)
    		return -1;
    	
        int result;
        //var entry = rules.FirstOrDefault(item => item.Key.ToString() == key);
        DictionaryEntry entry =null;
        for(DictionaryEntry dictEntry:rules)
        {
        	if(dictEntry.getKey()!=null && dictEntry.getKey().toString().equals(key))
        	{
        		entry = dictEntry;
        	}
        }
        
        
        if (entry !=null && entry.getKey() != null && entry.getValue() != null 
        		&& !entry.getKey().toString().isEmpty() 
        		&& !entry.getValue().toString().isEmpty())
        {
            
                try
                {
                    result = Integer.parseInt(entry.getValue().toString());
                }
                catch(Exception e)//若转换失败，则使用默认值返回 -1
                {
                	LocalMsg.error(e.getMessage());
                    result = -1;
                }     
        }
        else
        {
            result =-1;
        }

        return result;
    }
    
    private Date GetRuleValue_Date(List<DictionaryEntry> rules, String key)
    {
    	if(rules ==null || rules.size()<=0)
    		return new Date();
    	
        Date result;
        //var entry = rules.FirstOrDefault(item => item.Key.ToString() == key);
        DictionaryEntry entry =null;
        for(DictionaryEntry dictEntry:rules)
        {
        	if(dictEntry.getKey()!=null && dictEntry.getKey().toString().equals(key))
        	{
        		entry = dictEntry;
        	}
        }
        
        
        if (entry !=null && entry.getKey() != null && entry.getValue() != null 
        		&& !entry.getKey().toString().isEmpty() 
        		&& !entry.getValue().toString().isEmpty())
        {
            
                try
                {
                    result = DateUtil.toDate(entry.getValue().toString());
                }
                catch(Exception e)//若转换失败，则使用默认值返回 -1
                {
                	LocalMsg.error(e.getMessage());
                    result = new Date();
                }     
        }
        else
        {
            result = new Date();
        }

        return result;
    }
    
    private String GetRuleValue_String(List<DictionaryEntry> rules, String key)
    {
    	if(rules ==null || rules.size()<=0)
    		return "";
    	
        String result;
        //var entry = rules.FirstOrDefault(item => item.Key.ToString() == key);
        DictionaryEntry entry =null;
        for(DictionaryEntry dictEntry:rules)
        {
        	if(dictEntry.getKey()!=null && dictEntry.getKey().toString().equals(key))
        	{
        		entry = dictEntry;
        	}
        }
        
        
        if (entry !=null && entry.getKey() != null && entry.getValue() != null 
        		&& !entry.getKey().toString().isEmpty() 
        		&& !entry.getValue().toString().isEmpty())
        {
            
                try
                {
                    result = entry.getValue().toString();
                }
                catch(Exception e)//若转换失败，则使用默认值返回 -1
                {
                	LocalMsg.error(e.getMessage());
                    result = "";
                }     
        }
        else
        {
            result ="";
        }

        return result;
    }
    
    private boolean GetRuleValue_bool(List<DictionaryEntry> rules, String key)
    {
    	if(rules ==null || rules.size()<=0)
    		return false;
    	
        boolean result;
        //var entry = rules.FirstOrDefault(item => item.Key.ToString() == key);
        DictionaryEntry entry =null;
        for(DictionaryEntry dictEntry:rules)
        {
        	if(dictEntry.getKey()!=null && dictEntry.getKey().toString().equals(key))
        	{
        		entry = dictEntry;
        	}
        }
        
        
        if (entry !=null && entry.getKey() != null && entry.getValue() != null 
        		&& !entry.getKey().toString().isEmpty() 
        		&& !entry.getValue().toString().isEmpty())
        {
            
                try
                {
                    result = Boolean.parseBoolean(entry.getValue().toString());
                }
                catch(Exception e)//若转换失败，则使用默认值返回 -1
                {
                	LocalMsg.error(e.getMessage());
                    result = false;
                }     
        }
        else
        {
            result =false;
        }

        return result;
    }
    
    //private static Regex _hourPayRegex = new Regex("(\\d点)|(\\d:\\d)", RegexOptions.Compiled);
    public boolean IsHourPayRoom(String name)
    {
    	if(name ==null || name.isEmpty())
    		return false;
    	
        //钟点、小时、半日房
        //\d点、8:0
    	//boolean isRegex = name.matches("(//d点)|(//d://d)");
    	boolean isRegex = name.matches("(\\d点)|(\\d:\\d)");
        if (name.contains("小时") || name.contains("钟点") || name.contains("半日房") 
        		|| isRegex) 
        	return true;
        
        return false;
    }
    
  /// <summary>
    /// 
    /// 3---限时抢购
    /// 4--钟点房 
    /// 
    /// </summary>
    /// <param name="strProductType">16---限时抢购,32--钟点房</param>
    /// <returns></returns>
    public String ParseProductType(String strProductType, int bookingchanel, boolean isHourPayRoom)
    {
        String productTypes ="";
        int pt = Integer.parseInt("0" + strProductType);
        if ((pt & 16) == 16) productTypes += "3,";
        if (isHourPayRoom || (pt & 32) == 32) productTypes += "4,";
        if ((bookingchanel & 2) == 0 && (bookingchanel & 16) == 16) productTypes += "5,";
        //买一送一 productType值是2的14次方
        if ((pt & 16384) == 16384)
        {
            productTypes = "101";
        }
        if (productTypes.equals("")) 
        {
        	productTypes = null;
        }
        else
        {
            //productTypes = productTypes.TrimEnd(new char[] { ',' }); //123,
        	if(productTypes.contains(","))
               productTypes = productTypes.substring(0, productTypes.lastIndexOf(","));
        }
        return productTypes;
    }
    
    private List<com.elong.nb.model.bean.base.BaseGuaranteeRule> GetGuaranteeRules(RatePlanBaseInfo oldrp, EnumLocal language)
    {
        List<com.elong.nb.model.bean.base.BaseGuaranteeRule> result = new LinkedList<com.elong.nb.model.bean.base.BaseGuaranteeRule>();
        
        if(oldrp==null || oldrp.getRatePlanVouchRuleList()==null 
        		|| oldrp.getRatePlanVouchRuleList().getVouchInfo()==null)
        	return result;
        
        for (VouchInfo rule : oldrp.getRatePlanVouchRuleList().getVouchInfo())
        {
        	com.elong.nb.model.bean.base.BaseGuaranteeRule temp = new com.elong.nb.model.bean.base.BaseGuaranteeRule();
             
            	 if(rule.getStartDate() !=null)
                    temp.setStartDate(rule.getStartDate().toDate());
            	 if(rule.getEndDate()!=null)
                    temp.setEndDate(rule.getEndDate().toDate());
                 temp.setStartTime(rule.getArriveStartTime());
                 temp.setEndTime(rule.getArriveEndTime());
                 temp.setAmount(rule.getRoomCount());
                 
                 //Tools.ParseEnum<EnumGuaranteeChangeRule>(rule.VouchChangeRule.GetHashCode().ToString(), EnumGuaranteeChangeRule.NoChange)
                 EnumGuaranteeChangeRule gcrule = EnumGuaranteeChangeRule.NoChange;
                 if(rule.getVouchChangeRule()==EnumVouchRule.VOUCH_NEED_CHECKIN_24_HOUR)
                	 gcrule = EnumGuaranteeChangeRule.NeedCheckin24hour;
                 else if(rule.getVouchChangeRule()==EnumVouchRule.VOUCH_NEED_CHECKIN_TIME)
                	 gcrule = EnumGuaranteeChangeRule.NeedCheckinTime;
                 else if(rule.getVouchChangeRule()==EnumVouchRule.VOUCH_NEED_SOME_DAY)
                	 gcrule = EnumGuaranteeChangeRule.NeedSomeDay;
                 temp.setChangeRule(gcrule);
                 
                 //Tools.ParseEnum<com.elong.api.hotel.model.rest.enums.EnumDateType>(rule.DateType.GetHashCode().ToString(), model.rest.enums.EnumDateType.StayDay)
                 EnumDateType dateType = EnumDateType.CheckInDay;
                 if(rule.getDateType()==com.elong.nb.agent.NorthBoundForAPIService.EnumDateType.BOOK_DAY)
                 	dateType=EnumDateType.BookDay; 
                 else if(rule.getDateType()==com.elong.nb.agent.NorthBoundForAPIService.EnumDateType.CHECK_IN_DAY)
                 	dateType=EnumDateType.CheckInDay; 
                 else if(rule.getDateType()==com.elong.nb.agent.NorthBoundForAPIService.EnumDateType.STAY_DAY)
                 	dateType=EnumDateType.StayDay; 
                 temp.setDateType(dateType);
                 
                 temp.setDescription(language == EnumLocal.zh_CN ? rule.getCNDescription() : rule.getENDescription());
                 temp.setIsAmountGuarantee(rule.isIsRoomCountVouch());
                 temp.setIsTimeGuarantee(rule.isIsArriveTimeVouch());
                 
                 //Tools.ParseEnum<EnumGuaranteeMoneyType>(rule.VouchMoneyType.GetHashCode().ToString(), EnumGuaranteeMoneyType.FullNightCost)
                 EnumGuaranteeMoneyType moneyType = EnumGuaranteeMoneyType.FullNightCost;
                 if(rule.getVouchMoneyType() ==EnumVouchMoneyType.FIRST_NIGHT_COST)
                	 moneyType =EnumGuaranteeMoneyType.FirstNightCost;
                 temp.setGuaranteeType(moneyType);
                 
                 if(rule.getIsWeekEffective() !=null)
                    temp.setWeekSet(GetWeekSet(rule.getIsWeekEffective().getInt()));

                 if(rule.getRuleValues() !=null)
                 {
                    temp.setDay(GetRuleValue_Date(rule.getRuleValues().getDictionaryEntry(), "DayNum"));
                    temp.setHour( GetRuleValue(rule.getRuleValues().getDictionaryEntry(), "HourNum"));
                    temp.setTime(GetRuleValue_String(rule.getRuleValues().getDictionaryEntry(), "TimeNum"));
                    temp.setIsTomorrow(GetRuleValue_bool(rule.getRuleValues().getDictionaryEntry(), "IsTomorrow"));
                 }
             

            //如果是无条件担保，需要将取消条款中的 最早到店时间前N小时修改成 到店日24点前N+10小时---这样就是将最早到店时间默认为14点
            if (!temp.getIsAmountGuarantee() && !temp.getIsTimeGuarantee() && temp.getChangeRule() == EnumGuaranteeChangeRule.NeedCheckinTime)
            {
                temp.setChangeRule(EnumGuaranteeChangeRule.NeedCheckin24hour);
                temp.setHour(temp.getHour() + 10);
                temp.setDescription(temp.BuildDescription(language == EnumLocal.zh_CN));
            }

            result.add(temp);
        }
        return result;
    }
    
    private List<com.elong.nb.model.bean.base.BasePrepayRule> GetPrepayRules(RatePlanBaseInfo oldrp, EnumLocal language)
    {
        List<com.elong.nb.model.bean.base.BasePrepayRule> result = new LinkedList<com.elong.nb.model.bean.base.BasePrepayRule>();
        if(oldrp ==null || oldrp.getRatePlanPrePayRuleList()==null 
        		|| oldrp.getRatePlanPrePayRuleList().getPrePayInfo()==null)
        	return result;
        
        for (PrePayInfo rule : oldrp.getRatePlanPrePayRuleList().getPrePayInfo())
        {
        	//给酒店的预付规则不需要返回给合作伙伴
            if (rule.getTarget() == com.elong.nb.agent.NorthBoundForAPIService.EnumRuleTarget.HOTEL) 
            {
                continue;
            }
            
            com.elong.nb.model.bean.base.BasePrepayRule basePrepay = new com.elong.nb.model.bean.base.BasePrepayRule();
            //Tools.ParseEnum<EnumPrepayChangeRule>(rule.PrepayChangeRule.GetHashCode().ToString(), EnumPrepayChangeRule.PrepayNoChange)
            EnumPrepayChangeRule prepayrule = EnumPrepayChangeRule.PrepayNoChange;
            if(rule.getPrepayChangeRule() == EnumPrepayRule.PREPAY_NEED_ONE_TIME)
            	prepayrule = EnumPrepayChangeRule.PrepayNeedOneTime;
            else if(rule.getPrepayChangeRule() == EnumPrepayRule.PREPAY_NEED_SOME_DAY)
            	prepayrule = EnumPrepayChangeRule.PrepayNeedSomeDay;
            basePrepay.setChangeRule(prepayrule);
            
            //Tools.ParseEnum<com.elong.api.hotel.model.rest.enums.EnumDateType>(rule.DateType.GetHashCode().ToString(), model.rest.enums.EnumDateType.CheckInDay)
            EnumDateType dateType = EnumDateType.CheckInDay;
            if(rule.getDateType()==com.elong.nb.agent.NorthBoundForAPIService.EnumDateType.BOOK_DAY)
            	dateType=EnumDateType.BookDay; 
            else if(rule.getDateType()==com.elong.nb.agent.NorthBoundForAPIService.EnumDateType.CHECK_IN_DAY)
            	dateType=EnumDateType.CheckInDay; 
            else if(rule.getDateType()==com.elong.nb.agent.NorthBoundForAPIService.EnumDateType.STAY_DAY)
            	dateType=EnumDateType.StayDay; 
            basePrepay.setDateType(dateType);
            
            if(rule.getStartDate() !=null)
               basePrepay.setStartDate(rule.getStartDate().toDate());
            if(rule.getEndDate() !=null)
               basePrepay.setEndDate(rule.getEndDate().toDate());
            
            //Tools.ParseEnum<EnumPrepayCutPayment>(rule.CutTypeAfter.GetHashCode().ToString(), EnumPrepayCutPayment.FristNight)
            EnumPrepayCutPayment after = EnumPrepayCutPayment.FristNight;
            if(rule.getCutTypeAfter()==EnumCutType.MONEY)
            	after = EnumPrepayCutPayment.Money;
            else if(rule.getCutTypeAfter()==EnumCutType.PERCENT)
            	after = EnumPrepayCutPayment.Percent;
            basePrepay.setCashScaleFirstAfter(after);
            
            //Tools.ParseEnum<EnumPrepayCutPayment>(rule.CutTypeBefor.GetHashCode().ToString(), EnumPrepayCutPayment.FristNight)
            EnumPrepayCutPayment before = EnumPrepayCutPayment.FristNight;
            if(rule.getCutTypeBefor()==EnumCutType.MONEY)
            	before = EnumPrepayCutPayment.Money;
            else if(rule.getCutTypeBefor()==EnumCutType.PERCENT)
            	before = EnumPrepayCutPayment.Percent;
            basePrepay.setCashScaleFirstBefore(before);
            
            basePrepay.setDeductFeesAfter(rule.isCutAfterChangeTime() ? 1 : 0);
            basePrepay.setDeductFeesBefore(rule.isCutBeforChangeTime() ? 1 : 0);
            if(rule.getCutNumAfter() !=null)
               basePrepay.setDeductNumAfter(rule.getCutNumAfter().doubleValue());
            if(rule.getCutNumBefor() !=null)
               basePrepay.setDeductNumBefore(rule.getCutNumBefor().doubleValue());
            basePrepay.setDescription(language == EnumLocal.zh_CN ? rule.getCNDescription() : rule.getENDescription());
            if(rule.getIsWeekEffective() !=null)
               basePrepay.setWeekSet(GetWeekSet(rule.getIsWeekEffective().getInt()));

            if(rule.getRuleValues() !=null)
            {
	            basePrepay.setHour(GetRuleValue(rule.getRuleValues().getDictionaryEntry(), "HourNum"));
	            basePrepay.setHour2(GetRuleValue(rule.getRuleValues().getDictionaryEntry(), "HourNum2"));
	            basePrepay.setTime(GetRuleValue_String(rule.getRuleValues().getDictionaryEntry(), "TimeNum"));
	            basePrepay.setDateNum(GetRuleValue_Date(rule.getRuleValues().getDictionaryEntry(), "DateNum"));
            }
            
            result.add(basePrepay);
        }
        //如果没有预付规则，则加入一条默认的‘不允许变更取消’
        if (result.size() == 0)
        {
        	com.elong.nb.model.bean.base.BasePrepayRule base = new com.elong.nb.model.bean.base.BasePrepayRule();
            
                base.setChangeRule(EnumPrepayChangeRule.PrepayNoChange);
                base.setDateType(EnumDateType.CheckInDay);
                
                //DateTime.Today.AddDays(-1)
                Date d =new Date();
                Calendar cdday = Calendar.getInstance();
                cdday.add(Calendar.DATE, 1);
                d = cdday.getTime();
                base.setStartDate(d);
                
                //DateTime.Today.AddYears(1)
                Calendar cdyear = Calendar.getInstance();
                cdyear.add(Calendar.YEAR, 1);
                Date dtyear = cdyear.getTime();
                base.setEndDate(dtyear);
                
                base.setCashScaleFirstAfter(EnumPrepayCutPayment.Percent);
                base.setCashScaleFirstBefore(EnumPrepayCutPayment.Percent);
                base.setDeductFeesAfter(100);
                base.setDeductFeesBefore(100);
               
                //new List<int>{ 1, 1, 1, 1, 1, 1, 1 }
                List<Integer> intList = new LinkedList<Integer>();
                intList.add(1);
                intList.add(1);
                intList.add(1);
                intList.add(1);
                intList.add(1);
                intList.add(1);
                intList.add(1);
                base.setWeekSet(GetWeekSet(intList));
                base.setDescription(language == EnumLocal.zh_CN ? "一经预订成功不可变更/取消。" : "Once the order has been submitted successfully,  it won't be possible to change or cancel it.");
                base.setDeductNumAfter(100);
                base.setDeductNumBefore(100);
                
                //DateTime.Today.AddDays(-1)
                Calendar cd = Calendar.getInstance();
                cd.add(Calendar.DATE, -1);
                Date dt = cd.getTime();
                base.setDateNum(dt);
                
                base.setHour(0);
                base.setHour2(0);
                base.setTime("18:00:00");
            
        	
            result.add(base);
        }

        return result;
    }
    
    
    private List<com.elong.nb.model.bean.base.BaseValueAddRule> GetValueAddRules(RatePlanBaseInfo oldrp, EnumLocal language)
    {
        List<com.elong.nb.model.bean.base.BaseValueAddRule> result = new LinkedList<com.elong.nb.model.bean.base.BaseValueAddRule>();
        
        if(oldrp==null || oldrp.getRateplanRelationAddValue() ==null 
        		|| oldrp.getRateplanRelationAddValue().getAddValueInfoSimple()==null)
        	return result;
        
        for (AddValueInfoSimple rule : oldrp.getRateplanRelationAddValue().getAddValueInfoSimple())
        {
        	com.elong.nb.model.bean.base.BaseValueAddRule baserule = new com.elong.nb.model.bean.base.BaseValueAddRule();
            
                baserule.setDescription( GetAdditionalServiceRDisciption(rule, language));
                baserule.setTypeCode(rule.getBusinessCode());
                baserule.setIsInclude( rule.getIsInclude() == 1);
                
                //Tools.ParseEnum<EnumValueAddPriceOption>(rule.PriceDefaultOption.ToString(), EnumValueAddPriceOption.Percent)
                // 无None(0),金额Money(1),比例Percent(2)    
                EnumValueAddPriceOption priceOpt =EnumValueAddPriceOption.Percent;
                if(rule.getPriceDefaultOption()==0)
                	priceOpt=EnumValueAddPriceOption.None;
                else if(rule.getPriceDefaultOption()==1)
                	priceOpt=EnumValueAddPriceOption.Money;
                baserule.setPriceOption(priceOpt);
                
                if(rule.getPrice() !=null)
                   baserule.setPrice(rule.getPrice().doubleValue());
                
                //Tools.ParseEnum<EnumValueAddPriceOption>(rule.SinglePriceDefaultOption.ToString(), EnumValueAddPriceOption.Percent)
                // 无None(0),金额Money(1),比例Percent(2)  
                EnumValueAddPriceOption addPrice = EnumValueAddPriceOption.Percent;
                if(rule.getSinglePriceDefaultOption()==1)
                	addPrice =EnumValueAddPriceOption.Money;
                else if(rule.getSinglePriceDefaultOption()==0)
                	addPrice= EnumValueAddPriceOption.None;
                baserule.setExtOption(addPrice);
                
                if(rule.getSinglePrice() !=null)
                   baserule.setExtPrice(rule.getSinglePrice().doubleValue());
                baserule.setIsExtAdd(rule.isIsAdd());
                baserule.setAmount( rule.getShare());

                //StartDate = DateTime.MinValue,
                //EndDate = DateTime.MinValue,// 
                //CurrencyCode = "",// 
                //WeekSet = "",//
            
            result.add(baserule);
        }

        if(oldrp==null || oldrp.getAddValuePolicyList()==null 
        		|| oldrp.getAddValuePolicyList().getAddValuePolicyInfo() ==null)
        	return result;
        
        for (AddValuePolicyInfo rule : oldrp.getAddValuePolicyList().getAddValuePolicyInfo())
        {
        	String cnDescription="";
        	String enDescription="";
        	if(rule.getStartDate()!=null && rule.getEndDate() !=null)
        	{
	            cnDescription = rule.getStartDate().toString("yyyy-MM-dd") + " - " + rule.getEndDate().toString("yyyy-MM-dd") + ((rule.getIsInclude() == 0) ? " 不含早餐" : " 包含 " + rule.getShare() + " 份早餐");
	            enDescription = rule.getStartDate().toString("yyyy-MM-dd") + " - " + rule.getEndDate().toString("yyyy-MM-dd") + ((rule.getIsInclude() == 0) ? " no breakfast" : " includes " + rule.getShare() + " breakfast");
        	}
        	
            com.elong.nb.model.bean.base.BaseValueAddRule base =  new com.elong.nb.model.bean.base.BaseValueAddRule();
            
            	base.setDescription(language == EnumLocal.zh_CN ? cnDescription : enDescription);
            	base.setTypeCode("99");
            	base.setIsInclude(rule.getIsInclude() == 1);
            	//Tools.ParseEnum<EnumValueAddPriceOption>(rule.PriceDefaultOption.ToString(), EnumValueAddPriceOption.Percent)
            	// 无None(0),金额Money(1),比例Percent(2)    
                EnumValueAddPriceOption priceOpt =EnumValueAddPriceOption.Percent;
                if(rule.getPriceDefaultOption()==0)
                	priceOpt=EnumValueAddPriceOption.None;
                else if(rule.getPriceDefaultOption()==1)
                	priceOpt=EnumValueAddPriceOption.Money;
            	base.setPriceOption(priceOpt);
            	
                base.setPrice(rule.getPrice());
                
                //Tools.ParseEnum<EnumValueAddPriceOption>(rule.SinglePriceDefaultOption.ToString(), EnumValueAddPriceOption.Percent)
                // 无None(0),金额Money(1),比例Percent(2)  
                EnumValueAddPriceOption addPrice = EnumValueAddPriceOption.Percent;
                if(rule.getSinglePriceDefaultOption()==1)
                	addPrice =EnumValueAddPriceOption.Money;
                else if(rule.getSinglePriceDefaultOption()==0)
                	addPrice= EnumValueAddPriceOption.None;
                base.setExtOption(addPrice);
                
                base.setExtPrice(rule.getSinglePrice());
                base.setIsExtAdd(rule.getIsAdd() == 1);
                base.setAmount(rule.getShare());
                if(rule.getStartDate() !=null)
                   base.setStartDate(rule.getStartDate().toDate());
                if(rule.getEndDate() !=null)
                   base.setEndDate(rule.getEndDate().toDate());
                base.setCurrencyCode(rule.getCurrencyCode());
                
                //rule.IsWeekEffective.Select(c => Convert.ToInt32(c.ToString())).ToList()
                if(rule.getIsWeekEffective() !=null)
                   base.setWeekSet(GetWeekSet(rule.getIsWeekEffective().getChar()));
            
            result.add(base);
        }
        return result;
    }
    
    private String GetAdditionalServiceRDisciption(AddValueInfoSimple addValue, EnumLocal language)
    {
    	if(addValue ==null)
    		return "";
    	
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();


        if (true)
        {
            if (addValue.getIsInclude() == 1)
            {
                if (addValue.getShare() > 0)
                    if (language == EnumLocal.zh_CN)
                    {
                        sb1.append(addValue.getShare() + "份" + addValue.getAddValueCNName() + ",");
                    }
                    else
                    {
                        sb1.append(" " + addValue.getShare() + " " + addValue.getAddValueENGName() + ",");
                    }
                else
                    if (language == EnumLocal.zh_CN)
                    {
                        sb1.append(addValue.getAddValueCNName() + ",");
                    }
                    else
                    {
                        sb1.append(addValue.getAddValueENGName() + ",");
                    }

            }
            if (addValue.isIsAdd())
            {
                if (language == EnumLocal.zh_CN)
                {
                    sb2.append("1份" + addValue.getAddValueCNName());
                }
                else
                {
                    sb2.append(" 1 " + addValue.getAddValueENGName());
                }

                if (addValue.getSinglePriceDefaultOption() == 1)
                {
                    if (language == EnumLocal.zh_CN)
                    {
                    	//addValue.getSinglePrice().ToString("0.00").TrimEnd('0').TrimEnd('.') + " 元,"
                        sb2.append(" " + addValue.getSinglePrice().doubleValue() + " 元,");
                    }
                    else
                    {
                    	//addValue.SinglePrice.ToString("0.00").TrimEnd('0').TrimEnd('.') + " ,"
                        sb2.append(" RMB " + addValue.getSinglePrice().doubleValue()+ " ,");
                    }

                }
                else
                {
                    if (language == EnumLocal.zh_CN)
                    {
                        sb2.append("首晚房费的" + addValue.getSinglePrice() + "%,");
                    }
                    else
                    {
                    	//+addValue.SinglePrice + "%" + " of the first night room rate. ,"
                        sb2.append(addValue.getSinglePrice() + "%" + " of the first night room rate. ,");
                    }
                }
            }
        }


        if (language == EnumLocal.zh_CN)
        {
            if (sb1.length() != 0)
            {
            	//"包含" + sb1.ToString().TrimEnd(',') + ";"
            	String temp1 ="";
            	if(sb1.toString().contains(","))
            	  temp1 =sb1.toString().substring(0,sb1.toString().lastIndexOf(","));
            	else
            		temp1 = sb1.toString();
                sb3.append("包含" + temp1+ ";");
            }
            if (sb2.length() != 0)
            {
            	//"单加" + sb2.ToString().TrimEnd(',')
            	String temp1 ="";
            	if(sb2.toString().contains(","))
            	  temp1 =sb2.toString().substring(0,sb2.toString().lastIndexOf(","));
            	else
            		temp1 = sb2.toString();
            	
                sb3.append("单加" + temp1);
            }
        }
        else
        {
            if (sb1.length() != 0)
            {
            	//" Including " + sb1.ToString().TrimEnd(',') + ";"
            	String temp1 ="";
            	if(sb1.toString().contains(","))
            	  temp1 =sb1.toString().substring(0,sb1.toString().lastIndexOf(","));
            	else
            		temp1 = sb1.toString();
            	
                sb3.append(" Including " + temp1+ ";");
            }
            if (sb2.length() != 0)
            {
            	//" every additional one costs " + sb2.ToString().TrimEnd(',')
            	String temp1 ="";
            	if(sb2.toString().contains(","))
            	  temp1 =sb2.toString().substring(0,sb2.toString().lastIndexOf(","));
            	else
            		temp1 = sb2.toString();
            	
                sb3.append(" every additional one costs " + temp1);
            }
        }


        if (language == EnumLocal.zh_CN)
        {
            return sb3.toString().equals("") ? "" : "附加服务：" + sb3.toString();
        }
        return sb3.toString().equals("") ? "" : "Other service：" + sb3.toString();
    }
    
    private List<SupplierRatePlan> GetSuppliers(HotelDetail hotel, EnumLocal language)
    {
        List<SupplierRatePlan> result = new LinkedList<SupplierRatePlan>();
        if(hotel==null ||hotel.getHotelBaseInfo() ==null)
        	return result;
        
        EnumInvoiceMode InvoiceMode = EnumInvoiceMode.Hotel;
        MSHotelRelation hotelRelation = M_SRelationRepository.GetHotelRelation(hotel.getHotelBaseInfo().getHotelId());
        if (hotelRelation != null)
        {
            InvoiceMode = GetInvoiceMode(hotelRelation.getSupplierId());
        }

        SupplierRatePlan suprp = new SupplierRatePlan();
        
            suprp.setBookingRules(GetBookingRules(hotel, language));
            
            if( hotel.getHotelBaseInfo() !=null)
            {
	            suprp.setHotelCode( hotel.getHotelBaseInfo().getHotelId());
	            suprp.setWeekendStart(hotel.getHotelBaseInfo().getWeekEndStart());
	            suprp.setWeekendEnd(hotel.getHotelBaseInfo().getWeekEndEnd());
	            List<MSRoomRelation> msList = mSRelationRepository.GetMSRoomRelation(hotel.getHotelBaseInfo().getHotelId());
	            suprp.setRooms(msList);
            }
            suprp.setInvoiceMode(InvoiceMode);
        
        result.add(suprp);
        
        if (result.size()>0 && (result.get(0).getRooms() == null || result.get(0).getRooms().size() == 0))
        {
            result.get(0).setRooms(new LinkedList<MSRoomRelation>());
            List<MSRoomRelation> rooms = new LinkedList<MSRoomRelation>();
            
            List<String> ids = new LinkedList<String>();
            if(hotel.getRoomBaseInfos() !=null && hotel.getRoomBaseInfos().getRoomTypeInfo()!=null)
            {
	            for (RoomTypeInfo room : hotel.getRoomBaseInfos().getRoomTypeInfo())
	            {
	            	//ids.AddRange(room.RoomTypeId.Split(','));
	            	if(room.getRoomTypeId() !=null && !room.getRoomTypeId().isEmpty())
	            	{
		            	for(String str : room.getRoomTypeId().split(","))
		            	{
		            		ids.add(str);
		            		MSRoomRelation ro = new MSRoomRelation();
		            		ro.setRoomId(str);
		            		ro.setRoomTypeId(str);
		            		rooms.add(ro);
		            	}
	            	}
	            }
            }

            //result[0].Rooms = ids.Distinct().Select(rid => new MSRoomRelation { RoomId = rid, RoomTypeId = rid }).ToList();
            result.get(0).setRooms(rooms);
        }

        return result;
    }

    private List<com.elong.nb.model.bean.base.BaseBookingRule> GetBookingRules(HotelDetail hotel, EnumLocal language)
    {
        HashMap<Long, HotelBookingRule> dict = new HashMap<Long, HotelBookingRule>();

        if (hotel!=null &&hotel.getHotelBaseInfo() !=null 
        		&& hotel.getHotelBaseInfo().getHotelBookingRuleList() != null
        		&&hotel.getHotelBaseInfo().getHotelBookingRuleList().getHotelBookingRule() !=null)
        {
            for (HotelBookingRule rule : hotel.getHotelBaseInfo().getHotelBookingRuleList().getHotelBookingRule())
            {
                if (!dict.containsKey(rule.getID()))
                {
                    dict.put(rule.getID(), rule);
                }
            }

        }
        if (hotel !=null && hotel.getRoomBaseInfos() != null 
        		&& hotel.getRoomBaseInfos().getRoomTypeInfo() !=null)
        {
            for (RoomTypeInfo room : hotel.getRoomBaseInfos().getRoomTypeInfo())
            {
                if (room.getRoomBookingRuleList() != null && room.getRoomBookingRuleList().getHotelBookingRule() !=null)
                {
                    for (HotelBookingRule rule : room.getRoomBookingRuleList().getHotelBookingRule())
                    {
                        if (!dict.containsKey(rule.getID()))
                        {
                            dict.put(rule.getID(), rule);
                        }
                    }
                }
            }
        }

        List<com.elong.nb.model.bean.base.BaseBookingRule> result = new LinkedList<com.elong.nb.model.bean.base.BaseBookingRule>();
        for (HotelBookingRule rule : dict.values())
        {
        	
        	com.elong.nb.model.bean.base.BaseBookingRule temp = new com.elong.nb.model.bean.base.BaseBookingRule();
             
            //Tools.ParseEnum<com.elong.api.hotel.model.rest.enums.EnumDateType>(rule.DateType.GetHashCode().ToString(), model.rest.enums.EnumDateType.CheckInDay)
        	EnumDateType dateType = EnumDateType.CheckInDay;
            if(rule.getDateType()==com.elong.nb.agent.NorthBoundForAPIService.EnumDateType.BOOK_DAY)
            	dateType=EnumDateType.BookDay; 
            else if(rule.getDateType()==com.elong.nb.agent.NorthBoundForAPIService.EnumDateType.CHECK_IN_DAY)
            	dateType=EnumDateType.CheckInDay; 
            else if(rule.getDateType()==com.elong.nb.agent.NorthBoundForAPIService.EnumDateType.STAY_DAY)
            	dateType=EnumDateType.StayDay; 
        	temp.setDateType(dateType);
        	
        	temp.setDescription(language == EnumLocal.zh_CN ? rule.getCNDescription() : rule.getENDescription());
            if(rule.getStartDate()!=null)
        	   temp.setStartDate(rule.getStartDate().toDate());
        	if(rule.getEndDate() !=null)
        	  temp.setEndDate(rule.getEndDate().toDate());
        	temp.setStartHour(rule.getStartHour());
        	temp.setEndHour(rule.getEndHour());
        	temp.setRoomTypeIds(rule.getRoomTypeID());
        	
        	//Tools.ParseEnum<EnumBookingRule>(rule.HotelBooKingRule.GetHashCode().ToString(), EnumBookingRule.NeedPhoneNo)
        	EnumBookingRule br = EnumBookingRule.NeedPhoneNo;
        	if(rule.getHotelBooKingRule()==EnumBookRuleForHotel.FOREIGNER_NEED_EN_NAME)
        		br = EnumBookingRule.ForeignerNeedEnName;
        	else if(rule.getHotelBooKingRule()==EnumBookRuleForHotel.NEED_NATIONALITY)
        		br = EnumBookingRule.NeedNationality;
        	else if(rule.getHotelBooKingRule()==EnumBookRuleForHotel.NONE_RULE)
        		br = EnumBookingRule.NoneRule;
        	else if(rule.getHotelBooKingRule()==EnumBookRuleForHotel.PER_ROOM_PER_NAME)
        		br = EnumBookingRule.PerRoomPerName;
        	else if(rule.getHotelBooKingRule()==EnumBookRuleForHotel.REJECT_CHECKIN_TIME)
        		br = EnumBookingRule.RejectCheckinTime;
        	temp.setTypeCode(br);
            
            temp.setDescription(temp.BuildDescription(language == EnumLocal.zh_CN));
            
            result.add(temp);
        }
        return result;
    }

    private EnumInvoiceMode GetInvoiceMode(int SupplierID)
    {
        try
        {
        	GetSupplierInfoBySupplierIDRequest req =new GetSupplierInfoBySupplierIDRequest();
            req.setSupplierID(SupplierID);
            
            GetSupplierInfoBySupplierIDResponse response = supplierServiceContract.getSupplierInfoBySupplierID(req);
            if (response!=null && response.getResult()!=null && response.getResult().getResponseCode() == 0)
            {
                if (response.getSupplierBaseInfo() != null && response.getSupplierBaseInfo().getSupplierInvoiceInfo() != null)
                {
                	//return (EnumInvoiceMode)response.getSupplierBaseInfo().getSupplierInvoiceInfo().getInvoiceMode();
                	EnumInvoiceMode invoiceMode =EnumInvoiceMode.Elong;
                	if(response.getSupplierBaseInfo().getSupplierInvoiceInfo().getInvoiceMode() ==InvoiceMode.ELONG_AFTER)
                		invoiceMode = EnumInvoiceMode.Elong;
                	else if(response.getSupplierBaseInfo().getSupplierInvoiceInfo().getInvoiceMode() ==InvoiceMode.HOTEL)
                		invoiceMode = EnumInvoiceMode.Hotel;
                	else if(response.getSupplierBaseInfo().getSupplierInvoiceInfo().getInvoiceMode() ==InvoiceMode.NO_SENSE)
                		invoiceMode = EnumInvoiceMode.NoSense;
                	return invoiceMode;
                }
            }

            return EnumInvoiceMode.Elong;
        }
        catch(Exception e)
        {
        	LocalMsg.error(e.getMessage());
            return EnumInvoiceMode.Elong;
        }
    }
    
    
}
