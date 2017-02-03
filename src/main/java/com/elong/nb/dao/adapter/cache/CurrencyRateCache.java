/**   
 * @(#)CurrencyRateRepository.java	2016年10月14日	下午5:22:28	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.dao.adapter.cache;


import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Repository;

import com.elong.nb.cache.ICacheKey;
import com.elong.nb.cache.RedisManager;
import com.elong.nb.model.bean.enums.EnumCurrencyCode;

/**
 * (类型功能说明描述)
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2016年10月14日 下午5:22:28   user     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		zhangyang.zhu  
 * @version		1.0  
 * @since		JDK1.7
 */
@Repository
public class CurrencyRateCache {
	private static RedisManager redis = RedisManager.getInstance("redis_job","redis_job");
	private static ICacheKey KEY_CURRENCY=new ICacheKey() {
		
		@Override
		public String getKey() {
			return "data.currency";
		}
		
		@Override
		public int getExpirationTime() {
			return -1;
		}
	};
	public Double getCurrencyRate(EnumCurrencyCode currencyCode) throws Exception{
		double rate=new Double(1.0);
		try {
			if(currencyCode.equals(EnumCurrencyCode.RMB)||currencyCode.equals(EnumCurrencyCode.CNY)){
				rate=new Double(1.0);
			}else {
				String rateStr=redis.hashGet(KEY_CURRENCY, currencyCode.toString());
				if(StringUtils.isNotBlank(rateStr)){
					rate=new Double(rateStr);
				}
			}
		} catch (Exception e) {
			throw e;
		}
		return rate;
	}
}
