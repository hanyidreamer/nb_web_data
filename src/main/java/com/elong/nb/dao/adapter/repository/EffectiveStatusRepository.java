package com.elong.nb.dao.adapter.repository;

import java.util.Date;
import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.elong.nb.common.util.CommonsUtil;
import com.elong.nb.common.util.DateUtils;
import com.elong.nb.model.common.DataRestRequestCommon;
import com.elong.nb.model.common.DataRestResponseCommon;
import com.elong.nb.model.effectivestatuscheck.EffectiveStatus;
import com.elong.nb.model.effectivestatuscheck.EffectiveStatusRequest;
import com.elong.nb.model.effectivestatuscheck.EffectiveStatusResponse;
import com.elong.nb.util.HttpUtil;

@Repository
public class EffectiveStatusRepository {

	private static final String EFFECTIVEURL=getEffectiveStatusServiceURL("/rest/com/elong/hotel/product/entity/req/nbapi/EffectiveStatusRequest");
//	private static Logger logger = LogManager.getLogger("biglog");
    private static String getEffectiveStatusServiceURL(String query){
    		String url = CommonsUtil.CONFIG_PROVIDAR.getProperty("EffectiveStatusBaseURL");
        if (url==null ||url.isEmpty()){
        		throw new RuntimeException("EFFECTIVEURL URL配置错误，请联系系统管理员");
        }
        return url + query;
    }
    /**
     * 获取对象有效性状态
     * @param mhotelId
     * @param roomTypeId
     * @param ratePlanId
     * @param ArrivalDate
     * @param DepartureDate
     * @param errorCode
     * @param retryTimes
     * @return
     */
    public EffectiveStatus getEffectiveStatus(String mhotelId, String roomTypeId, int ratePlanId, Date ArrivalDate, Date DepartureDate, StringBuilder errorCode,int retryTimes){
        EffectiveStatus effectiveStatus = null;
        String url = EFFECTIVEURL;
        DataRestRequestCommon<EffectiveStatusRequest> req = new DataRestRequestCommon<EffectiveStatusRequest>();
        EffectiveStatusRequest eff = new EffectiveStatusRequest();
        	eff.setMhotelId(mhotelId);
        	eff.setRoomTypeId(roomTypeId);
        	eff.setRatePlanId(ratePlanId);
        	eff.setCheckinDate(DateUtils.convertDate(ArrivalDate, "yyyy-MM-dd"));
        	eff.setCheckoutDate(DateUtils.convertDate(DepartureDate, "yyyy-MM-dd") );
        req.setRealRequest(eff);
		String data = JSON.toJSONString(req);
		DataRestResponseCommon<EffectiveStatusResponse> result = HttpUtil.getDataRestResponse(url,"requestJson="+data,"application/x-www-form-urlencoded",new DataRestResponseCommon<EffectiveStatusResponse>() ,new TypeReference<DataRestResponseCommon<EffectiveStatusResponse>>(){});//JSON.parseObject(responseStr);
		if(result.getRealResponse()!=null){
			effectiveStatus=result.getRealResponse().getEffectiveStatus();
		}
        return effectiveStatus;
    }
}
