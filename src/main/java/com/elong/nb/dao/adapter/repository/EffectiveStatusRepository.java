package com.elong.nb.dao.adapter.repository;

import java.util.Date;
import java.util.UUID;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.elong.nb.common.util.CommonsUtil;
import com.elong.nb.common.util.DateUtils;
import com.elong.nb.model.effectivestatuscheck.EffectiveStatus;
import com.elong.nb.model.effectivestatuscheck.EffectiveStatusRequest;
import com.elong.nb.model.effectivestatuscheck.EffectiveStatusResponse;
import com.elong.nb.model.effectivestatuscheck.SoaRestRequest;
import com.elong.nb.model.effectivestatuscheck.SoaRestResponse;
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
    public EffectiveStatus getEffectiveStatus(String mhotelId, String roomTypeId, int ratePlanId, Date ArrivalDate, Date DepartureDate, StringBuilder errorCode,int retryTimes)
    {
        EffectiveStatus effectiveStatus = null;
        String url = EFFECTIVEURL;
        SoaRestRequest<EffectiveStatusRequest> req = new SoaRestRequest<EffectiveStatusRequest>();
        
        EffectiveStatusRequest eff = new EffectiveStatusRequest();
        	eff.setMhotelId(mhotelId);
        	eff.setRoomTypeId(roomTypeId);
        	eff.setRatePlanId(ratePlanId);
        	eff.setCheckinDate(DateUtils.convertDate(ArrivalDate, "yyyy-MM-dd"));
        	eff.setCheckoutDate(DateUtils.convertDate(DepartureDate, "yyyy-MM-dd") );
        req.setRealRequest(eff);
//        BigLog log = new BigLog();
//        log.setAppName("data_http");
//        log.setServiceName("com.elong.hotel.product.entity.req.nbapi.EffectiveStatusRequest");
//		log.setTraceId(UUID.randomUUID().toString());
//		log.setSpan("1.1");
		String data = JSON.toJSONString(req);
		long start = System.currentTimeMillis();
        try{
			String responseStr = HttpUtil.httpPostData(url + "?requestJson=",data);
//			log.setElapsedTime(String.valueOf(System.currentTimeMillis()-start));
			if (responseStr != null && !responseStr.isEmpty()) {
				SoaRestResponse<EffectiveStatusResponse> result = JSON.parseObject(responseStr,new TypeReference<SoaRestResponse<EffectiveStatusResponse>>(){});
				if (result != null && result.getResponseCode()==0&&result.getRealResponse()!=null
						&& result.getRealResponse().getResponseCode() == 0) {
					effectiveStatus = result.getRealResponse().getEffectiveStatus();
					errorCode.append("0");
				} else {
					errorCode.append("-1");
				}
			} else if (retryTimes > 0) {
				return getEffectiveStatus(mhotelId, roomTypeId, ratePlanId, ArrivalDate, DepartureDate,errorCode,retryTimes-1);
			}
        }
        catch(Exception e){
//        		log.setException(e);
//			log.setExceptionMsg(e.getMessage());
//			log.setResponseCode("1");
//			logger.info(log.toString());
			throw new RuntimeException("EffectiveStatusRequest",e);
        }
//		logger.info(log.toString());
        return effectiveStatus;
    }
}
