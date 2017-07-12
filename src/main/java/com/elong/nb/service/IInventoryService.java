/**   
 * @(#)IInventory.java	2016年5月30日	下午6:46:34	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.service;

import java.io.IOException;

import com.elong.nb.common.model.ProxyAccount;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.model.inventory.InventoryCondition;
import com.elong.nb.model.inventory.InventoryResult;

/**
 * (类型功能说明描述)
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2016年5月30日 下午6:46:34   Administrator     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		Administrator  
 * @version		1.0  
 * @since		JDK1.7
 */
public interface IInventoryService {

	RestResponse<InventoryResult> getInventories(RestRequest<InventoryCondition> restRequest, ProxyAccount proxyAccount)
			throws IOException, Exception;

	RestResponse<InventoryResult> getInventoriesForBooking(RestRequest<InventoryCondition> restRequest, ProxyAccount proxyAccount)
			throws Exception;
}
