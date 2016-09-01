/**   
 * @(#)ResponseResult.java	2016年7月22日	下午2:21:59	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.model.bookingdata;

/**
 * (类型功能说明描述)
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2016年7月22日 下午2:21:59   zhangyang.zhu     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		zhangyang.zhu  
 * @version		1.0  
 * @since		JDK1.7
 */
public class ResponseResult {
	//0:sucess,-1:fail
	private int code;
	private String message;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
