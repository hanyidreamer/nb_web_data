/**   
 * @(#)HttpUtil.java	2016年6月16日	下午7:28:59	   
 *     
 * Copyrights (C) 2016艺龙旅行网保留所有权利
 */
package com.elong.nb.util;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.Consts;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.elong.nb.model.bookingdata.ResponseResult;
import com.google.gson.Gson;
/**
 * (类型功能说明描述)
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2016年6月16日 下午7:28:59   zhangyang.zhu     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		zhangyang.zhu  
 * @version		1.0  
 * @since		JDK1.7
 */
public class HttpUtil {

	protected static Logger logger = LogManager.getLogger(HttpUtil.class);
	private static Gson gson=new Gson();
//	public static String httpPost(String reqUrl,String reqData){
//		return httpPost(reqUrl,reqData,8 * 1000);
//	}
//	public static String httpPost(String reqUrl,String reqData,int timeout){
//		HttpURLConnection conn = null;
//		try{
//			URL url = new URL(reqUrl);
//			conn = (HttpURLConnection) url.openConnection();
//			conn.setRequestMethod("POST");
//			conn.setDoInput(true);// 设置是否从httpUrlConnection读入，默认情况下是true;   
//			conn.setDoOutput(true);
//			conn.setUseCaches(false);   // Post 请求不能使用缓存
//			conn.setConnectTimeout(timeout);
//			conn.setReadTimeout(30 * 1000);
//			conn.setInstanceFollowRedirects(true);
//			conn.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
//			conn.connect();
//	        // DataOutputStream.writeBytes将字符串中的16位的unicode字符以8位的字符形式写道流里面
//			DataOutputStream out = new DataOutputStream(conn.getOutputStream());
//			out.write(reqData.getBytes("UTF-8")); 
//			out.flush();
//	        out.close();
//			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
//			String lines;
//			StringBuilder sb = new StringBuilder();
//			while ((lines = reader.readLine()) != null)
//				sb.append(lines);
//			return sb.toString();
//		}catch(Exception ex){
//			logger.error("http Error,reqUrl:"+reqUrl+",Exception:"+ex.getMessage());
//			throw new RuntimeException(ex);
//			
//		}finally{
//			if(null != conn)try{
//				conn.disconnect();
//			}catch(Exception ex){
//				logger.error("method:httpPost,使用finally块来关闭输入流,Exception:"+ex.getMessage());
//				throw ex;
//				}
//		}
//	}
	
	public static String httpPostData(String reqUrl,String reqData){
		HttpURLConnection conn = null;
		try{
			String enReqData = java.net.URLEncoder.encode(reqData,"UTF-8"); 
			URL url = new URL(reqUrl+enReqData);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setDoInput(true);// 设置是否从httpUrlConnection读入，默认情况下是true;   
			conn.setDoOutput(true);
			conn.setUseCaches(false);   // Post 请求不能使用缓存
			conn.setConnectTimeout(8 * 1000);
			conn.setReadTimeout(30 * 1000);
			conn.setInstanceFollowRedirects(true);
			conn.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
			conn.connect();
	        // DataOutputStream.writeBytes将字符串中的16位的unicode字符以8位的字符形式写道流里面
			//DataOutputStream out = new DataOutputStream(conn.getOutputStream());
			//out.write(reqData.getBytes("UTF-8")); 
			//out.flush();
	        //out.close();
			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
			String lines;
			StringBuilder sb = new StringBuilder();
			while ((lines = reader.readLine()) != null)
				sb.append(lines);
			return sb.toString();
		}catch(Exception ex){
			logger.error("http Error,reqUrl:"+reqUrl+",Exception:"+ex.getMessage());
			throw new RuntimeException(ex);
			
		}finally{
			if(null != conn)try{
				conn.disconnect();
			}catch(Exception ex){
				logger.error("method:httpPost,使用finally块来关闭输入流,Exception:"+ex.getMessage());
				throw ex;
				}
		}
	}
	protected static CloseableHttpClient client = generateHttpClient();
	public static String httpPost(String reqUrl, String reqData, String contentType){
		try{
		long startTime = System.currentTimeMillis();
		URI uri = new URI(reqUrl);
		HttpPost httpPost = new HttpPost(uri);
		contentType = StringUtils.isEmpty(contentType) ? "application/json" : contentType;
		httpPost.addHeader("Content-Type", contentType);
		httpPost.setEntity(new StringEntity(reqData, "UTF-8"));
		CloseableHttpResponse response = client.execute(httpPost);
		InputStream is = response.getEntity().getContent();
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		byte[] b = new byte[1024];
		int len = -1;
		while ((len = is.read(b)) != -1) {
			outputStream.write(b, 0, len);
		}
		is.close();
		outputStream.close();
		response.close();
		long endTime = System.currentTimeMillis();
		logger.debug("httpPost,cost time: " + (endTime - startTime));
		return new String(outputStream.toByteArray());
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	private static CloseableHttpClient generateHttpClient() {
		Registry<ConnectionSocketFactory> socketFactory = RegistryBuilder.<ConnectionSocketFactory> create()
				.register("http", PlainConnectionSocketFactory.INSTANCE).build();
		PoolingHttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager(socketFactory);
		SocketConfig socketConfig = SocketConfig.custom().setTcpNoDelay(true).setSoKeepAlive(true).build();
		connManager.setDefaultSocketConfig(socketConfig);
		ConnectionConfig connectionConfig = ConnectionConfig.custom().setCharset(Consts.UTF_8)
				.setMalformedInputAction(CodingErrorAction.IGNORE).setUnmappableInputAction(CodingErrorAction.IGNORE).build();
		connManager.setDefaultConnectionConfig(connectionConfig);
		connManager.setMaxTotal(65535);
		connManager.setDefaultMaxPerRoute(65535);
		RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(2000).setSocketTimeout(2000)
				.setConnectionRequestTimeout(2000).setCookieSpec(CookieSpecs.IGNORE_COOKIES).build();
		CloseableHttpClient httpClient = HttpClients.custom().setConnectionManager(connManager).setDefaultRequestConfig(requestConfig)
				.build();
		return httpClient;
	}
	 public static com.elong.nb.model.bookingdata.ResponseResult httpGet(String url) throws Exception {
		 ResponseResult result=new ResponseResult();
	        BufferedReader in = null;
	        try {
	            String urlNameString = url ;
	            URL realUrl = new URL(urlNameString);
	            // 打开和URL之间的连接
	            HttpURLConnection  connection = (HttpURLConnection)realUrl.openConnection();
	            connection.setRequestProperty("connection", "Keep-Alive");
	            connection.setRequestProperty("user-agent",
	                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
	            connection.connect();
	            in = new BufferedReader(new InputStreamReader(
	                    connection.getInputStream()));
	            StringBuffer buffer=new StringBuffer();
	            String line;
	            if ((line = in.readLine()) != null) {
	            	buffer.append(line);
	            }
	            result=gson.fromJson(buffer.toString(), ResponseResult.class);
	        } catch (Exception e) {
	        	result.setCode(-1);
	        	result.setMessage(e.getMessage());
	        	logger.error("method:httpGet,发送GET请求出现异常！URL："+url+",Exception:"+e.getMessage());
	        	throw e;
	        }
	        // 使用finally块来关闭输入流
	        finally {
	            try {
	                if (in != null) {
	                    in.close();
	                }
	            } catch (Exception e2) {
	            	result.setCode(-1);
		        	result.setMessage(e2.getMessage());
		        	logger.error("method:httpGet 使用finally块来关闭输入流,Exception:"+e2.getMessage());
		        	throw e2;
	            }
	        }
	        return result;
	    }
	 
	 public static String httpGetData(String reqUrl)throws Exception{
			HttpURLConnection conn = null;
			logger.info("[HTTPGET]开始访问"+reqUrl);
			try{
				long start = System.currentTimeMillis();
				URL url = new URL(reqUrl);
				conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("GET");
				conn.setDoInput(true);// 设置是否从httpUrlConnection读入，默认情况下是true;   
				conn.setDoOutput(false);
				conn.setConnectTimeout(8 * 1000);
				conn.setReadTimeout(60 * 1000);
				conn.connect();
				int code =conn.getResponseCode();
				if(HttpURLConnection.HTTP_OK != code){
					logger.info("http访问错误:"+reqUrl);
					throw new RuntimeException("http访问错误,返回码："+code);
				}
				BufferedReader in=new BufferedReader(new InputStreamReader(conn.getInputStream()));
			      StringBuffer buffer=new StringBuffer();
		            String line;
		            if ((line = in.readLine()) != null) {
		            	buffer.append(line);
		            }
		            String result=buffer.toString();
			//	String result = StreamUtils.copyToString(conn.getInputStream(),Charset.forName("UTF-8"));
				long end = System.currentTimeMillis();
				logger.info("[HTTPGET]访问结果"+",time:" + (end-start));
				return result;
			}catch(Exception ex){
				logger.info("http访问错误:"+reqUrl);
				logger.info("[HTTPGET]访问出错:"+ex);
				ex.printStackTrace();
				throw ex;
			}finally{
				if(null != conn)try{conn.disconnect();}catch(Exception ex){}
			}
		}
}
