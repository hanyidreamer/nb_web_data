/**   
 * @(#)CommonRepository.java	2016年9月14日	下午6:34:04	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.service.impl;

import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

/**
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2016年9月14日 下午6:34:04   suht     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		suht  
 * @version		1.0  
 * @since		JDK1.7
 */
@Repository
public class CommonRepository {

	private Logger logger = LogManager.getLogger(CommonRepository.class);

	/** 
	 * 本地缓存文件中过滤SHotelIds	
	 *
	 * Set<String> CommonRepository.java filteredSHotelIds
	 */
	private Set<String> filteredSHotelIds = Collections.synchronizedSet(new HashSet<String>());

	/** 
	 * 读取文件中SHotelId,过滤SHotelId
	 *
	 * @return
	 */
	public Set<String> fillFilteredSHotelsIds() {
		if (this.filteredSHotelIds.size() > 0) {
			return filteredSHotelIds;
		}

		String rootPath = Thread.currentThread().getContextClassLoader().getResource("/").getPath();
		String filePath = rootPath + "conf/core/ctriphotelcode.txt";
		File file = new File(filePath);
		if (file.exists()) {
			try {
				List<String> contentList = FileUtils.readLines(file);
				if (contentList != null && contentList.size() > 0) {
					for (String content : contentList) {
						if (StringUtils.isEmpty(content))
							continue;
						filteredSHotelIds.add(content.trim());
					}
				}
				logger.info("FillFilteredSHotelsIds size = ," + filteredSHotelIds.size());
			} catch (Exception ex) {
				String title = "rp在读取携程过滤酒店信息时抛出异常";
				String content = "rp在读取携程过滤酒店信息时抛出异常,异常原因:" + ex.getMessage();
				logger.error("title =" + title + ",content = " + content, ex);
			}
		} else {
			logger.info("FillFilteredSHotelsIds,File Not Exist!!!");
		}
		return filteredSHotelIds;
	}

}
