/**   
 * @(#)InventoryService.java	2016年5月30日	下午6:48:19	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.service.impl;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

import com.elong.nb.common.gson.GsonUtil;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.common.util.CommonsUtil;
import com.elong.nb.common.util.ValidateUtil;
import com.elong.nb.model.InventoryCondition;
import com.elong.nb.model.InventoryResult;
import com.elong.nb.service.IInventoryService;

/**
 * (类型功能说明描述)
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2016年5月30日 下午6:48:19   Administrator     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		Administrator  
 * @version		1.0  
 * @since		JDK1.7
 */
public class InventoryService implements IInventoryService{
	
	private String idsLessTen=CommonsUtil.CONFIG_PROVIDAR.getProperty("NumberIdsFormatErrorAndLessThanTen.restRequest.Request");

	/** 
	 * (方法说明描述)获得库存接口 
	 *
	 * @param request
	 * @return 
	 * @throws IOException 
	 *
	 * @see com.elong.nb.service.IInventoryService#getInventories(com.elong.nb.common.model.RestRequest)    
	 */
	@Override
	public RestResponse<InventoryResult> getInventories(HttpServletRequest request) throws IOException {
		RestRequest<InventoryCondition> restRequest=GsonUtil.toReq(request, InventoryCondition.class);
		RestResponse<InventoryResult> restResponse=new RestResponse<InventoryResult>(restRequest.getGuid());
		String errorStr=validateInventoryRequest(restRequest);
		if(StringUtils.isNoneBlank(errorStr)){
			restResponse.setCode(errorStr);
		}else {
			//restResponse.getResult().setInventories(inventories);
		}
		return restResponse;
	}
	
	private String validateInventoryRequest(RestRequest<InventoryCondition>restRequest){
		StringBuffer sb=new StringBuffer(ValidateUtil.validateRestRequest(restRequest));
		if(StringUtils.isBlank(restRequest.getRequest().getHotelCodes())&&StringUtils.isBlank(restRequest.getRequest().getHotelIds())){
			sb.append(idsLessTen);
		}
		return sb.toString();
	}

}
