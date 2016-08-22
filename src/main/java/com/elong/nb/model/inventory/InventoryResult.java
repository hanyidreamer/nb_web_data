/**   
 * @(#)InventoryResult.java	2016年5月30日	下午6:49:48	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.model.inventory;

import java.util.List;

import com.elong.nb.model.inventory.bean.Inventory;

/**
 * (类型功能说明描述)
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2016年5月30日 下午6:49:48   Administrator     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		Administrator  
 * @version		1.0  
 * @since		JDK1.7
 */
public class InventoryResult {
	private List<Inventory>Inventories;

	public List<Inventory> getInventories() {
		return Inventories;
	}

	public void setInventories(List<Inventory> inventories) {
		Inventories = inventories;
	}
	
}
