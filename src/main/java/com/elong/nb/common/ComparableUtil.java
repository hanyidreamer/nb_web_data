/**   
 * @(#)comparable.java	2016年6月1日	下午4:34:56	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.common;

import java.util.ArrayList;
import java.util.List;

/**
 * (类型功能说明描述)
 * 对比两个集合，求交集、并集
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2016年6月1日 下午4:34:56   Administrator     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		Administrator  
 * @version		1.0  
 * @since		JDK1.7
 */
public class ComparableUtil {

	// 去重
	public static List<String> convertDistinctList(List<String> list) {
		List<String> distinctList = new ArrayList<String>();
		for (String i : list) {
			if (!distinctList.contains(i)) {
				distinctList.add(i);
			}
		}
		return distinctList;
	}
}
