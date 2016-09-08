package com.elong.nb.repository;

import java.util.Date;

import org.springframework.stereotype.Repository;

import com.elong.nb.common.model.RestResponse;
import com.elong.nb.common.util.CommonsUtil;
import com.elong.nb.common.util.DateUtils;
import com.elong.nb.model.HotelListResponse;
import com.elong.nb.model.effectivestatuscheck.EffectiveStatus;
import com.elong.nb.model.effectivestatuscheck.EffectiveStatusRequest;
import com.elong.nb.model.effectivestatuscheck.EffectiveStatusResponse;
import com.elong.nb.model.effectivestatuscheck.SoaRestRequest;
import com.elong.nb.model.effectivestatuscheck.SoaRestResponse;
import com.elong.nb.util.HttpUtil;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

@Repository
public class EffectiveStatusRepository {

	private Gson gson=new Gson();
	
    private String GetEffectiveStatusServiceURL(String query)
    {
        //String url = EffectiveStatusBaseURL;
    	String url = CommonsUtil.CONFIG_PROVIDAR.getProperty("EffectiveStatusBaseURL");
        if (url==null ||url.isEmpty())
        {
             //#if DEBUG
            //url = "http://192.168.67.34:8110";
            //#else
          url = "http://jcp.mis.elong.com:8110";

        }
        return url + query;
    }
    /// <summary>
    /// 获取对象有效性状态
    /// </summary>
    /// <param name="mhotelId"></param>
    /// <param name="roomTypeId"></param>
    /// <param name="ratePlanId"></param>
    /// <param name="ArrivalDate"></param>
    /// <param name="DepartureDate"></param>
    /// <param name="errorCode"></param>
    /// <returns></returns>
    public EffectiveStatus GetEffectiveStatus(String mhotelId, String roomTypeId, int ratePlanId, Date ArrivalDate, Date DepartureDate, StringBuilder errorCode,int retryTimes)
    {
        EffectiveStatus effectiveStatus = null;
        String url = GetEffectiveStatusServiceURL("/rest/com/elong/hotel/product/entity/req/nbapi/EffectiveStatusRequest");
        SoaRestRequest<EffectiveStatusRequest> req = new SoaRestRequest<EffectiveStatusRequest>();
        
        EffectiveStatusRequest eff = new EffectiveStatusRequest();
        	eff.setMhotelId(mhotelId);
        	eff.setRoomTypeId(roomTypeId);
        	eff.setRatePlanId(ratePlanId);
        	eff.setCheckinDate(DateUtils.convertDate(ArrivalDate, "yyyy-MM-dd"));
        	eff.setCheckoutDate(DateUtils.convertDate(DepartureDate, "yyyy-MM-dd") );
        req.setRealRequest(eff);
        
        try
        {
        String data = gson.toJson(req, SoaRestRequest.class);
        //String responseStr = HttpUtil.httpPost(url, "?requestJson="+data);
        String responseStr = HttpUtil.httpPostData(url+"?requestJson=",data);
        
        if (responseStr !=null && !responseStr.isEmpty())
        {
            //var result = Newtonsoft.Json.JsonConvert.DeserializeObject<SoaRestResponse<EffectiveStatusResponse>>(response.Data);

        	SoaRestResponse<EffectiveStatusResponse> result = gson.fromJson(responseStr,  new TypeToken<SoaRestResponse<EffectiveStatusResponse>>() {
                                                                                                          }.getType());
        	
            if (result != null && result.getResponseCode() == 0 && result.getRealResponse() != null && result.getRealResponse().getResponseCode() == 0)
            {
                effectiveStatus = result.getRealResponse().getEffectiveStatus();
                errorCode.append("0");
            }
            else
            {
                errorCode.append("-1");
            }
        }
        else if (retryTimes > 0)
        {
            return GetEffectiveStatus(mhotelId, roomTypeId, ratePlanId, ArrivalDate, DepartureDate,errorCode,retryTimes-1);
        }
        
        }
        catch(Exception e)
        {
        
        }
        
        return effectiveStatus;
    }
}
