package com.elong.nb.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang3.StringUtils;

import com.elong.nb.common.gson.DateTypeAdapter;
import com.elong.nb.common.gson.EnumTypeAdapter;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.model.bean.Inventory;
import com.elong.nb.model.inventory.InventoryResult;
import com.elong.nb.model.rate.RateCondition;
import com.elong.nb.model.rate.RateResult;
import com.elong.nb.model.rate.bean.Rate;
import com.elong.nb.util.DateUtil;
import com.elong.nb.util.HttpUtil;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;

public class DataTestRate {
	private static SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static void main(String[] args) {
		Date maxDate=DateUtil.getDate(DateUtil.addDays(new Date(), 14));
		SimpleDateFormat sdff=new SimpleDateFormat("yyyy.MM.dd");
		String json=HttpUtil.httpPost("http://10.39.128.39:8080/nbapi-"+sdff.format(new Date())+"/%25%7brole%7d/_search", "{\"size\":2000,\"query\":{\"query_string\":{\"query\":\"methodName:getRates\",\"use_dis_max\":true}}}",null);
		JSONObject jsonObject = JSONObject.fromObject(json);
		String str1=jsonObject.get("hits").toString();
//		System.out.println(str1);
		JSONObject jsonObject1 = JSONObject.fromObject(str1);
		String str2=jsonObject1.get("hits").toString();
//		System.out.println(str2);
		JSONArray jArray=JSONArray.fromObject(str2);
		for(int i=0;i<jArray.size();i++){
			Date minDate=null;
			String str3=jArray.get(i).toString();
//			System.out.println(str3);
			JSONObject jsonObject3 = JSONObject.fromObject(str3);
			String str4=jsonObject3.get("_source").toString();
//			System.out.println(str4);
			JSONObject jsonObject4 = JSONObject.fromObject(str4);
			String url1="http://10.88.25.65:8971/OpenApiWeb/api/Hotel/GetRates";
			String url2="http://nbapi-data.vip.elong.com/OpenApiWeb/api/Hotel/GetRates";
			
			//jsonObject=JSONObject.fromObject();
			//jsonObject=JSONObject.fromObject(jsonObject.get("hits").toString());
			String param=jsonObject4.getString("parameters");//"[\"{\"Guid\":\"9180d15b-6059-4b70-b788-aa9309801d08\",\"Local\":\"zh_CN\",\"ProxyInfo\":{\"PrepaySettlementRateMode\":1,\"SecondSecretKey\":\"\",\"CommentUserKey\":\"\",\"OrderFrom\":\"5880\",\"IsOnlyStraight\":false,\"SellChannel\":4,\"SearchOrderType\":0,\"UserName\":\"2f2612c9494f83ac0345fa23d4a049d6\",\"EnabledCouponReadRole\":false,\"OrderContactType\":0,\"CardNo\":\"2000000002460712127\",\"UserGroup\":0,\"MemberLevel\":1,\"EnabledElongNoteReadRole\":true,\"EnabledCommentReadRole\":false,\"EnabledPrepaySettlment\":true,\"EnabledInstantConfirm\":false,\"LowestProfitPercent\":0,\"BookingChannel\":16,\"IsFilterSEMHotel\":false,\"PrepaySettlementRate\":\"0.05\",\"EnabledInvoiceRole\":false,\"IntegerPriceType\":0,\"ProxyId\":\"AP0045311\",\"EnabledVirtualCardForPrepay\":true,\"EnabledPrepayProducts\":true,\"PrepayCommisionLevel\":3,\"EnabledSpecialRate\":false,\"EnabledVirtualCardForGuarantee\":false,\"EnableReturnAgentcyRateCost\":false,\"Supplier\":\"\",\"EnabledCouponRole\":false,\"AgencyCommisionLevel\":3,\"ClientIp\":\"124.172.245.60\",\"AppKey\":\"4929dc7f\"},\"Request\":{\"PaymentType\":\"Prepay\",\"EndDate\":\"2017-05-06T00:00:00+08:00\",\"StartDate\":\"2017-04-21T00:00:00+08:00\",\"HotelIds\":\"90818029\",\"Options\":\"2\"},\"Version\":1.1}\"]";
			String str=param.replace('[', ' ').replace(']', ' ').trim().replace("\\","");;
			int length=str.lastIndexOf("\"");
			str=str.substring(1, length);
//			try{
//				str="{\"Version\":3.0,\"Local\":\"zh_CN\",\"Request\":{\"HotelIds\":\"02301095,02201622,91762083,02004046,91620462,92101575,90035418,02003290,10601006,02040014\",\"StartDate\":\"2017-05-26T08:27:34+08:00\",\"EndDate\":\"2017-06-09T00:00:00+08:00\",\"PaymentType\":\"Prepay\"},\"ProxyInfo\":{\"AgencyCommisionLevel\":\"LOW\",\"PrepayCommisionLevel\":\"LOW\",\"UserName\":\"d3821ed05dd3193d9dcbc7beadba3476\",\"AppKey\":\"a1b03f2d\",\"UserGroup\":0,\"ProxyId\":\"AP0049496\",\"CardNo\":2000000004630496355,\"OrderFrom\":6137,\"MemberLevel\":\"Normal\",\"SellChannel\":\"B\",\"BookingChannel\":\"OnLine\",\"SearchOrderType\":\"OrderFrom\",\"OrderContactType\":\"NoNeed\",\"IsFilterSEMHotel\":false,\"EnabledPrepayProducts\":true,\"EnabledPrepaySettlment\":true,\"PrepaySettlementRate\":0.05,\"PrepaySettlementRateMode\":2,\"EnabledVirtualCardForPrepay\":true,\"EnabledVirtualCardForGuarantee\":false,\"EnabledSpecialRate\":false,\"EnabledInstantConfirm\":false,\"EnabledInvoiceRole\":false,\"EnabledElongNoteReadRole\":false,\"EnabledCouponReadRole\":false,\"EnabledCouponRole\":false,\"Supplier\":\"\",\"EnableForcedGuaranteeOrder\":false,\"EnableIgnoreCheckingDuplicatedOrder\":false,\"EnableReturnAgentcyRateCost\":false,\"EnableGroupCoupon\":false,\"EnabledVirtualCardForGroup\":false,\"IgnoreCheckGuestName\":false,\"EnabledCommentReadRole\":false,\"CommentUserKey\":\"\",\"MaxDays\":180,\"IntegerPriceType\":0,\"IsOnlyStraight\":false,\"LowestProfitPercent\":0.0,\"IsCustomerPriceIntoSalePrice\":false},\"Guid\":\"7f4b2001-e8f6-4275-bf74-5b37df82c7ed\"}";
//				RestRequest<RateCondition> req=toReq(str, RateCondition.class, null);
//				if(req.getRequest().getEndDate().after(maxDate)){
//					req.getRequest().setEndDate(maxDate);
//				}
//				minDate=req.getRequest().getStartDate();
//				req.setVersion(3.0);
//				str=toJsonReq(req);
//			}catch(Exception e){
//				
//			}
			String data1=HttpUtil.httpPost(url1,str,null);
			String data2=HttpUtil.httpPost(url2,str,null);
			try {
//				RestRequest<InventoryCondition> restRequest = toReq(str,
//						InventoryCondition.class, null);
				if(!data1.equals(data2)){
					System.out.println("<--------------");
					System.out.println(str);
					System.out.println(data1);
					System.out.println(data2);
					System.out.println("-------------->");
					File file =new File("javaio-appendfile.txt");

				      //if file doesnt exists, then create it
				      if(!file.exists()){
				       file.createNewFile();
				      }

				      //true = append file
				      FileWriter fileWritter = new FileWriter(file.getName(),true);
				             BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
				             bufferWritter.write(data1);
				             bufferWritter.close();

				}
//				Thread.sleep(500);
				RestResponse<RateResult> response1=toResponse(data1, RateResult.class, null);
				RestResponse<RateResult> response2=toResponse(data2, RateResult.class, null);
				Map<String,Rate> map1=getMap(response1,minDate,maxDate);
				Map<String,Rate> map2=getMap(response2,minDate,maxDate);
////				System.out.println(str);
////				System.out.println("<----------------");
////				System.out.println(url1+"|...............|"+url2);
////				System.out.println("---------------->");
				boolean is=compare(map1,map2,false);
				is=is&&compare(map2,map1,true);
				if(!is){
					System.out.println(str);
				}
//				System.out.println("<----------------");
//				System.out.println(url2+"|...............|"+url1);
//				System.out.println("---------------->");
//				compare(map2,map1,"2vs1");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println(str); 
		}
		System.out.println("");
		System.out.println("task is over"); 
	}
	static Map<String,Rate> getMap(RestResponse<RateResult> response1,Date minDate,Date maxDate){
		Map<String,Rate> map1=new HashMap<String, Rate>();
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
		if(response1!=null&&response1.getResult()!=null&&response1.getResult().getRates()!=null){
			for(Rate rate:response1.getResult().getRates()){
				Date start=minDate.after(rate.getStartDate())?minDate:rate.getStartDate();
				Date end=maxDate.after(rate.getEndDate())?rate.getEndDate():maxDate;
				while(start.getTime()<end.getTime()){
					map1.put(rate.getHotelID()+"|"+rate.getHotelCode()+"|"+rate.getRoomTypeId()+"|"+rate.getRateplanId()+"|"+sd.format(start), rate);
					start=DateUtil.addDays(start, 1);
				}
			}
		}
		return map1;
	}
	static boolean compare(Map<String,Rate> map1,Map<String,Rate> map2,boolean isContainOnly){
		boolean result=true;
		for(String key:map1.keySet()){
			StringBuilder record=new StringBuilder();
			if(map2.containsKey(key)){
				if(isContainOnly){
					continue;
				}
				Rate inv1=map1.get(key);
				Rate inv2=map2.get(key);
				if(!(inv2.getStatus()==inv1.getStatus())){
					result=false;
					record.append("Status"+" 1:"+inv1.getStatus()+" 2:"+inv2.getStatus());
					record.append("\t");
				}
				if(!(inv2.getAddBed().equals(inv1.getAddBed()))){
					result=false;
					record.append("AddBed"+" url1:"+inv1.getAddBed()+" url2:"+inv2.getAddBed());
					record.append("\t");
				}
				if(!(inv2.getCurrencyCode().equals(inv1.getCurrencyCode()))){
					result=false;
					record.append("CurrencyCode "+" url1:"+inv1.getCurrencyCode()+" url2:"+inv2.getCurrencyCode());
					record.append("\t");
					//System.out.print("key"+key+"CurrencyCode "+" url1:"+inv1.getCurrencyCode()+" url2:"+inv2.getCurrencyCode()+" v:"+log);
				}
				if(!(inv2.getMember().equals(inv1.getMember()))){
//					if("23:59:59".equals(inv2.getEndTime())){
//						int hour=12;
//						if(inv2.getEndDate().getTime()>inv1.getEndDate().getTime()){
//							hour=-12;
//						}
//						GregorianCalendar gc = new GregorianCalendar();
//						gc.setTime(inv2.getEndDate());
//						gc.add(java.util.Calendar.HOUR_OF_DAY, hour);
//						if(gc.getTimeInMillis()!=inv1.getEndDate().getTime()){
//							result=false;
//							System.out.println("key"+key+"getEndDate() not same"+" url1:"+sdf.format(inv1.getEndDate())+" url2:"+sdf.format(inv2.getEndDate())+" v:"+log);
//						}
//					}else{
						result=false;
						record.append("Member "+" url1:"+inv1.getMember()+" url2:"+inv2.getMember());
						record.append("\t");
						//System.out.print("key"+key+"Member "+" url1:"+inv1.getMember()+" url2:"+inv2.getMember()+" v:"+log);
//					}
				}
				if(!(inv2.getMemberCost().equals(inv1.getMemberCost()))){
					result=false;
					record.append("MemberCost"+" url1:"+inv1.getMemberCost()+" url2:"+inv2.getMemberCost());
					record.append("\t");
					//System.out.print("key"+key+"MemberCost"+" url1:"+inv1.getMemberCost()+" url2:"+inv2.getMemberCost()+" v:"+log);
				}
//				if(!(inv2.getPriceID().equals(inv1.getPriceID()))){
//					result=false;
//					record.append("PriceID"+" url1:"+inv1.getPriceID()+" url2:"+inv2.getPriceID());
//					record.append("\t");
//					//System.out.print("key"+key+"PriceID"+" url1:"+inv1.getPriceID()+" url2:"+inv2.getPriceID()+" v:"+log);
//				}
				if(!(inv2.getWeekend().equals(inv1.getWeekend()))){
					result=false;
					record.append("Weekend"+" 1:"+inv1.getWeekend()+" url2:"+inv2.getWeekend());
					record.append("\t");
					//System.out.print("key"+key+"Weekend"+" url1:"+inv1.getWeekend()+" url2:"+inv2.getWeekend());
					
				}
				if(!(inv2.getWeekendCost().equals(inv1.getWeekendCost()))){
					result=false;
					record.append("WeekendCost"+" 1:"+inv1.getWeekendCost()+" 2:"+inv2.getWeekendCost());
					record.append("\t");
					//System.out.print("key"+key+"WeekendCost"+" url1:"+inv1.getWeekendCost()+" url2:"+inv2.getWeekendCost());
				}
			}else{
//				result=false;
//				record.append("not contain the key");
//				record.append("\t");
				//System.out.print("not contain the key");
			}
			if(StringUtils.isNotEmpty(record)){
				System.out.println(key+": "+record.toString());
			}
		}
		return result;
	}
	
	@SuppressWarnings("rawtypes")
	public static <T> RestResponse<T> toResponse(String resultJson,
			Type typeObj, Map<Class, TypeAdapter> adapters)
			throws IOException {
		String json = resultJson;

		//RequestAttributes ra = RequestContextHolder.getRequestAttributes();
		//ra.setAttribute(Constants.ELONG_REQUEST_JSON, json == null ? "" : json,
		//		ServletResponseAttributes.SCOPE_REQUEST);

		GsonBuilder gsonBuilder = new GsonBuilder();
		// 添加枚举适配器
		gsonBuilder.registerTypeHierarchyAdapter(Enum.class,
				new EnumTypeAdapter());
		gsonBuilder.registerTypeAdapter(Date.class, new DateTypeAdapter());
		if (adapters != null && !adapters.isEmpty()) {
			for (Entry<Class, TypeAdapter> e : adapters.entrySet()) {
				gsonBuilder.registerTypeAdapter(e.getKey(), e.getValue());
			}
		}

		Type objectType = type(RestResponse.class, typeObj);
		RestResponse res = gsonBuilder.create().fromJson(json, objectType);

		//if (res != null && res.getGuid() != null && res.getGuid().length() > 0)
		//	ra.setAttribute(Constants.ELONG_REQUEST_REQUESTGUID, req.getGuid(),
		//			ServletRequestAttributes.SCOPE_REQUEST);

		return res;
	}
	@SuppressWarnings("rawtypes")
	public static <T> RestRequest<T> toReq(String request,
			Class<T> clazz, Map<Class, TypeAdapter> adapters)
			throws IOException {
		String json = request;

//		RequestAttributes ra = RequestContextHolder.getRequestAttributes();
//		ra.setAttribute(Constants.ELONG_REQUEST_JSON, json == null ? "" : json,
//				ServletRequestAttributes.SCOPE_REQUEST);

		GsonBuilder gsonBuilder = new GsonBuilder();
		// 添加枚举适配器
		gsonBuilder.registerTypeHierarchyAdapter(Enum.class,
				new EnumTypeAdapter());
		gsonBuilder.registerTypeAdapter(Date.class, new DateTypeAdapter());
		if (adapters != null && !adapters.isEmpty()) {
			for (Entry<Class, TypeAdapter> e : adapters.entrySet()) {
				gsonBuilder.registerTypeAdapter(e.getKey(), e.getValue());
			}
		}

		Type objectType = type(RestRequest.class, clazz);
		RestRequest req = gsonBuilder.create().fromJson(json, objectType);

//		if (req != null && req.getGuid() != null && req.getGuid().length() > 0)
//			ra.setAttribute(Constants.ELONG_REQUEST_REQUESTGUID, req.getGuid(),
//					ServletRequestAttributes.SCOPE_REQUEST);

		return req;
	}
	@SuppressWarnings("rawtypes")
	public static String toJsonResponse(RestResponse resp, double version) {
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.registerTypeAdapter(Date.class, new DateTypeAdapter());
		if (version > 0)
			gsonBuilder.setVersion(version);
		String json = gsonBuilder.create().toJson(resp, RestResponse.class);
		return json;
	}
	@SuppressWarnings("rawtypes")
	public static String toJsonReq(RestRequest resp) {
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.registerTypeAdapter(Date.class, new DateTypeAdapter());
		String json = gsonBuilder.create().toJson(resp, RestRequest.class);
		return json;
	}
	static ParameterizedType type(final Class raw, final Type... args) {
		return new ParameterizedType() {
			public Type getRawType() {
				return raw;
			}

			public Type[] getActualTypeArguments() {
				return args;
			}

			public Type getOwnerType() {
				return null;
			}
		};
	}
}
