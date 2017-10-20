/**   
 * @(#)LogCollectService.java	2017年10月20日	上午11:18:20	   
 *     
 * Copyrights (C) 2017艺龙旅行网保留所有权利
 */
package com.elong.nb.service;

import com.elong.nb.common.model.ProxyAccount;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.model.rateplan.RatePlanResult;

/**
 * 业务监控日志手机service
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年10月20日 上午11:18:20   suht     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		suht  
 * @version		1.0  
 * @since		JDK1.7
 */
public interface LogCollectService {

	/** 
	 * rp接口查询业务监控日志收集
	 *
	 * @param proxyAccount
	 * @param response
	 */
	public void writeRateplanLog(ProxyAccount proxyAccount, RestResponse<RatePlanResult> response);

}
