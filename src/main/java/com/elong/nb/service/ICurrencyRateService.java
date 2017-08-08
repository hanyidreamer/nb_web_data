/**   
 * @(#)ICurrencyRateService.java	2016年10月14日	下午5:19:44	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.service;

import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.model.bean.ExchangeRateCondition;
import com.elong.nb.model.bean.ExchangeRateResult;

/**
 * (类型功能说明描述)
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2016年10月14日 下午5:19:44   user     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		zhangyang.zhu  
 * @version		1.0  
 * @since		JDK1.7
 */
public interface ICurrencyRateService {

	public RestResponse<ExchangeRateResult> getCurrencyRate(RestRequest<ExchangeRateCondition> restRequest) throws Exception;

}
