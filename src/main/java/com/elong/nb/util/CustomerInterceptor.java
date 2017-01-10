/**   
 * @(#)CustomerInterceptor.java	2016年12月14日	下午3:43:01	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.util;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.lang.StringUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.velocity.runtime.directive.Parse;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ctc.wstx.stax.WstxOutputFactory;

/**
 * (类型功能说明描述)
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2016年12月14日 下午3:43:01   user     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		zhangyang.zhu  
 * @version		1.0  
 * @since		JDK1.7
 */
public class CustomerInterceptor extends AbstractPhaseInterceptor<Message>{
	private static Logger logger=LogManager.getLogger("generateSingleXMLLogger");
	public CustomerInterceptor(){
		super(Phase.RECEIVE);
	}

	/**   
	 * (构造函数说明)  
	 *   
	 * @param phase   
	 */
//	public CustomerInterceptor(String phase) {
//		super(Phase.RECEIVE);
//	}

	/** 
	 * (方法说明描述) 
	 *
	 * @param message
	 * @throws Fault 
	 *
	 * @see org.apache.cxf.interceptor.Interceptor#handleMessage(org.apache.cxf.message.Message)    
	 */
	@Override
	public void handleMessage(Message message) throws Fault {
		//System.out.println("---------receive--------");
		InputStream is = message.getContent(InputStream.class);
		 if(is != null)
             message.setContent(InputStream.class, is);
		 //StringBuffer out = new StringBuffer();
		 ByteArrayOutputStream   baos   =   new   ByteArrayOutputStream();   
	        int   i=-1;   
	        try {
				while((i=is.read())!=-1){   
				baos.write(i);   
				}
				if(StringUtils.isNotBlank(baos.toString())){
					String data=checkXmlChar(baos.toString());
					is=new ByteArrayInputStream(data.getBytes());
				 	if(is!=null){
				 		message.setContent(InputStream.class, is);
				 	}
				}
			} catch (IOException e1) {
				logger.error("method:CustomerInterceptor", e1);
			}   
//	     byte[] b = new byte[4096];
//	     try {
//			for (int n; (n = is.read(b)) != -1;) {
//			      out.append(new String(b, 0, n));
//			 }
//			//System.out.println(out.toString());
//			String data=checkXmlChar(out.toString());
			
//	 	is=new ByteArrayInputStream(data.getBytes());
//	 	if(is!=null){
//	 		message.setContent(InputStream.class, is);
//	 	}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	
	}
	public static String checkXmlChar(String data) {  
//        StringBuffer appender = new StringBuffer("");  
//          
//        if (StringUtils.isNotBlank(data)) {  
//            appender = new StringBuffer(data.length());  
//              
//            for (int i = 0; i < data.length(); i++) {  
//                char ch = data.charAt(i);  
//                if ((ch == 0x9) || (ch == 0xA) || (ch == 0xD)  
//                        || ((ch >= 0x20) && (ch <= 0xD7FF))  
//                        || ((ch >= 0xE000) && (ch <= 0xFFFD))  
//                        || ((ch >= 0x10000) && (ch <= 0x10FFFF)))  
//                    appender.append(ch);  
//            }  
//        }  
//          
//        String result = appender.toString();  
//          
//        return result.replaceAll("]]>", "");  
		return data.replace("&#x", "<![CDATA[&#x]]>");
    }  

}
