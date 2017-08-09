package com.elong.nb.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang3.StringUtils;

import com.elong.nb.common.gson.DateTypeAdapter;
import com.elong.nb.common.gson.EnumTypeAdapter;
import com.elong.nb.common.model.NbapiHttpRequest;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.common.util.HttpClientUtil;
import com.elong.nb.model.bean.Inventory;
import com.elong.nb.model.inventory.InventoryResult;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;

public class DataTestRatePlanCase {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static String url1 = "http://10.88.25.65:8971/OpenApiWeb/api/Hotel/GetRatePlans";
	private static String url2 = "http://10.39.21.82:8971/OpenApiWeb/api/Hotel/GetRatePlans";

	public static void main(String[] args) {
		// readText();
		readHtml();
		System.out.println("task is over");
	}

	static void readHtml() {
		SimpleDateFormat sdff = new SimpleDateFormat("yyyy.MM.dd");
		NbapiHttpRequest nbapiHttpRequest = new NbapiHttpRequest();
		nbapiHttpRequest.setUrl("http://10.39.128.39:8080/nbapi-" + sdff.format(new Date()) + "/%25%7brole%7d/_search");
		nbapiHttpRequest
				.setParamStr("{\"size\":200,\"query\":{\"query_string\":{\"query\":\"methodName:getRatePlans\",\"use_dis_max\":true}}}");
		String json = HttpClientUtil.httpJsonPost(nbapiHttpRequest);
		JSONObject jsonObject = JSONObject.fromObject(json);
		String str1 = jsonObject.get("hits").toString();
		// System.out.println(str1);
		JSONObject jsonObject1 = JSONObject.fromObject(str1);
		String str2 = jsonObject1.get("hits").toString();
		// System.out.println(str2);
		JSONArray jArray = JSONArray.fromObject(str2);
		int errorCount = 0;
		for (int i = 0; i < jArray.size(); i++) {
			String str3 = jArray.get(i).toString();
			// System.out.println(str3);
			JSONObject jsonObject3 = JSONObject.fromObject(str3);
			String str4 = jsonObject3.get("_source").toString();
			// System.out.println(str4);
			JSONObject jsonObject4 = JSONObject.fromObject(str4);

			// jsonObject=JSONObject.fromObject();
			// jsonObject=JSONObject.fromObject(jsonObject.get("hits").toString());
			String param = jsonObject4.getString("parameters");// "[\"{\"Guid\":\"9180d15b-6059-4b70-b788-aa9309801d08\",\"Local\":\"zh_CN\",\"ProxyInfo\":{\"PrepaySettlementRateMode\":1,\"SecondSecretKey\":\"\",\"CommentUserKey\":\"\",\"OrderFrom\":\"5880\",\"IsOnlyStraight\":false,\"SellChannel\":4,\"SearchOrderType\":0,\"UserName\":\"2f2612c9494f83ac0345fa23d4a049d6\",\"EnabledCouponReadRole\":false,\"OrderContactType\":0,\"CardNo\":\"2000000002460712127\",\"UserGroup\":0,\"MemberLevel\":1,\"EnabledElongNoteReadRole\":true,\"EnabledCommentReadRole\":false,\"EnabledPrepaySettlment\":true,\"EnabledInstantConfirm\":false,\"LowestProfitPercent\":0,\"BookingChannel\":16,\"IsFilterSEMHotel\":false,\"PrepaySettlementRate\":\"0.05\",\"EnabledInvoiceRole\":false,\"IntegerPriceType\":0,\"ProxyId\":\"AP0045311\",\"EnabledVirtualCardForPrepay\":true,\"EnabledPrepayProducts\":true,\"PrepayCommisionLevel\":3,\"EnabledSpecialRate\":false,\"EnabledVirtualCardForGuarantee\":false,\"EnableReturnAgentcyRateCost\":false,\"Supplier\":\"\",\"EnabledCouponRole\":false,\"AgencyCommisionLevel\":3,\"ClientIp\":\"124.172.245.60\",\"AppKey\":\"4929dc7f\"},\"Request\":{\"PaymentType\":\"Prepay\",\"EndDate\":\"2017-05-06T00:00:00+08:00\",\"StartDate\":\"2017-04-21T00:00:00+08:00\",\"HotelIds\":\"90818029\",\"Options\":\"2\"},\"Version\":1.1}\"]";
			String str = param.replace('[', ' ').replace(']', ' ').trim().replace("\\", "");
			;
			int length = str.lastIndexOf("\"");
			str = str.substring(1, length);
			nbapiHttpRequest = new NbapiHttpRequest();
			nbapiHttpRequest.setUrl(url1);
			nbapiHttpRequest.setParamStr(str);
			String data1 = HttpClientUtil.httpJsonPost(nbapiHttpRequest);
			nbapiHttpRequest = new NbapiHttpRequest();
			nbapiHttpRequest.setUrl(url2);
			nbapiHttpRequest.setParamStr(str);
			String data2 = HttpClientUtil.httpJsonPost(nbapiHttpRequest);
			try {
				// RestRequest<InventoryCondition> restRequest = toReq(str,
				// InventoryCondition.class, null);
				// RestResponse<InventoryResult> response1 = toResponse(data1,
				// InventoryResult.class, null);
				// RestResponse<InventoryResult> response2 = toResponse(data2,
				// InventoryResult.class, null);
				// Map<String, Inventory> map1 = getMap(response1);
				// Map<String, Inventory> map2 = getMap(response2);
				// System.out.println(str);
				// System.out.println("<----------------");
				// System.out.println(url1+"|...............|"+url2);
				// System.out.println("---------------->");
				boolean is = data1.equals(data2);// compare(map1, map2, " 商品库:", " 产品组:");
				if (!is) {
					errorCount++;
					File file = new File("rateplan_result.txt");

					// if file doesnt exists, then create it
					if (!file.exists()) {
						try {
							file.createNewFile();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

					// true = append file
					FileWriter fileWritter = null;
					try {
						fileWritter = new FileWriter(file.getName(), true);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
					try {
						bufferWritter.write("\n" + str);
						bufferWritter.write("\n" + data1);
						bufferWritter.write("\n" + data2);
						bufferWritter.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(str);
					System.out.println("----------------------------------------------------------------");
				}
				// System.out.println("<----------------");
				// System.out.println(url2+"|...............|"+url1);
				// System.out.println("---------------->");
				// compare(map2,map1,"2vs1");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// System.out.println(str);
		}
		System.out.println(errorCount + "");
	}

	static void readText() {
		try {
			String encoding = "GBK";
			File file = new File("inventory_result.txt");
			if (file.isFile() && file.exists()) { // 判断文件是否存在
				InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);// 考虑到编码格式
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					if (lineTxt.startsWith("{")) {
						String str = lineTxt;
						NbapiHttpRequest nbapiHttpRequest = new NbapiHttpRequest();
						nbapiHttpRequest.setUrl(url1);
						nbapiHttpRequest.setParamStr(str);
						String data1 = HttpClientUtil.httpJsonPost(nbapiHttpRequest);
						nbapiHttpRequest = new NbapiHttpRequest();
						nbapiHttpRequest.setUrl(url2);
						nbapiHttpRequest.setParamStr(str);
						String data2 = HttpClientUtil.httpJsonPost(nbapiHttpRequest);
						try {
							// RestRequest<InventoryCondition> restRequest = toReq(str,
							// InventoryCondition.class, null);
							RestResponse<InventoryResult> response1 = toResponse(data1, InventoryResult.class, null);
							RestResponse<InventoryResult> response2 = toResponse(data2, InventoryResult.class, null);
							Map<String, Inventory> map1 = getMap(response1);
							Map<String, Inventory> map2 = getMap(response2);
							// System.out.println(str);
							// System.out.println("<----------------");
							// System.out.println(url1+"|...............|"+url2);
							// System.out.println("---------------->");
							boolean is = compare(map1, map2, " 商品库:", " 产品组:");
							if (!is) {
								File file1 = new File("inventory_result2.txt");

								// if file doesnt exists, then create it
								if (!file1.exists()) {
									try {
										file1.createNewFile();
									} catch (IOException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}

								// true = append file
								FileWriter fileWritter = null;
								try {
									fileWritter = new FileWriter(file1.getName(), true);
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
								try {
									bufferWritter.write("\n" + str);
									bufferWritter.close();
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println(str);
								System.out.println("----------------------------------------------------------------");
							}
							// System.out.println("<----------------");
							// System.out.println(url2+"|...............|"+url1);
							// System.out.println("---------------->");
							// compare(map2,map1,"2vs1");
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				read.close();
			} else {
				System.out.println("找不到指定的文件");
			}
		} catch (Exception e) {
			System.out.println("读取文件内容出错");
			e.printStackTrace();
		}
	}

	static boolean compare(Map<String, Inventory> map1, Map<String, Inventory> map2, String p1, String p2) {
		boolean result = true;
		for (String key : map1.keySet()) {
			StringBuilder record = new StringBuilder();
			if (map2.containsKey(key)) {
				Inventory inv1 = map1.get(key);
				Inventory inv2 = map2.get(key);
				// if(inv2.getEndDate().getTime()<=0&&inv2.getAvailableDate().after(new
				// Date(117,5,1))){
				// System.out.println(key);
				// }
				// if(1<2)
				// continue;
				if (!(inv2.isStatus() == inv1.isStatus())) {
					result = false;
					record.append("Status " + p1 + inv1.isStatus() + p2 + inv2.isStatus());
					record.append("\t");
					// System.out.println("key"+key+"isStatus not same"+" url1:"+inv1.isStatus()+" url2:"+inv2.isStatus());
				}
				if (!(inv2.getAvailableAmount() == inv1.getAvailableAmount())) {
					result = false;
					record.append("AvailableAmount" + p1 + inv1.getAvailableAmount() + p2 + inv2.getAvailableAmount());
					record.append("\t");
					// System.out.println("key"+key+"getAvailableAmount() not same"+" url1:"+inv1.getAvailableAmount()+" url2:"+inv2.getAvailableAmount()+" v:"+log);
				}
				// if(!(inv2.getAvailableDate().getTime()==inv1.getAvailableDate().getTime())){
				// System.out.println("key"+key+"getAvailableDate() not same"+" url1:"+sdf.format(inv1.getAvailableDate())+" url2:"+sdf.format(inv2.getAvailableDate())+" v:"+log);
				// }
				if (!(inv2.getEndDate().getTime() == inv1.getEndDate().getTime() || inv2.getEndDate().getTime() <= 0)) {
					if ("23:59:59".equals(inv2.getEndTime())) {
						int hour = 12;
						if (inv2.getEndDate().getTime() > inv1.getEndDate().getTime()) {
							hour = -12;
						}
						GregorianCalendar gc = new GregorianCalendar();
						gc.setTime(inv2.getEndDate());
						gc.add(java.util.Calendar.HOUR_OF_DAY, hour);
						if (gc.getTimeInMillis() != inv1.getEndDate().getTime()) {
							result = false;
							record.append("EndDate" + p1 + sdf.format(inv1.getEndDate()) + p2 + sdf.format(inv2.getEndDate()));
							record.append("\t");
							// System.out.println("key"+key+"getEndDate() not same"+" url1:"+sdf.format(inv1.getEndDate())+" url2:"+sdf.format(inv2.getEndDate())+" v:"+log);
						}
					} else {
						result = false;
						record.append("EndDate" + p1 + sdf.format(inv1.getEndDate()) + p2 + sdf.format(inv2.getEndDate()));
						record.append("\t");
						// System.out.println("key"+key+"getEndDate() not same"+" url1:"+sdf.format(inv1.getEndDate())+" url2:"+sdf.format(inv2.getEndDate())+" v:"+log);
					}
				}
				if (!(inv2.getEndTime().equals(inv1.getEndTime()))) {
					result = false;
					record.append("EndTime" + p1 + inv1.getEndTime() + p2 + inv2.getEndTime());
					record.append("\t");
					// System.out.println("key"+key+"getEndTime() not same"+" url1:"+inv1.getEndTime()+" url2:"+inv2.getEndTime()+" v:"+log);
				}
				if (!(inv2.getOverBooking() == inv1.getOverBooking())) {
					result = false;
					record.append("OverBooking" + p1 + inv1.getOverBooking() + p2 + inv2.getOverBooking());
					record.append("\t");
					// System.out.println("key"+key+"getOverBooking() not same"+" url1:"+inv1.getOverBooking()+" url2:"+inv2.getOverBooking()+" v:"+log);
				}
				if (!(inv2.getStartDate().getTime() == inv1.getStartDate().getTime() || inv2.getStartDate().getTime() <= 0)) {
					result = false;
					record.append("StartDate" + p1 + sdf.format(inv1.getStartDate()) + p2 + sdf.format(inv2.getStartDate()));
					record.append("\t");
					// System.out.println("key"+key+"getStartDate() not same"+" url1:"+sdf.format(inv1.getStartDate())+" url2:"+sdf.format(inv2.getStartDate()));

				}
				if (!(inv2.getStartTime().equals(inv1.getStartTime()))) {
					result = false;
					record.append("Status" + p1 + inv1.getStartTime() + p2 + inv2.getStartTime());
					record.append("\t");
					// System.out.println("key"+key+"getStartTime() not same"+" url1:"+inv1.getStartTime()+" url2:"+inv2.getStartTime());
				}
				if (!((inv2.isIsInstantConfirm() == null && inv1.isIsInstantConfirm() == null)
						|| (inv1.isIsInstantConfirm() != null && inv1.isIsInstantConfirm().equals(inv2.isIsInstantConfirm())) || (inv2
						.isIsInstantConfirm() != null && inv2.isIsInstantConfirm().equals(inv1.isIsInstantConfirm())))) {
					result = false;
					record.append("IsInstantConfirm" + p1 + inv1.isIsInstantConfirm() + p2 + inv2.isIsInstantConfirm());
					record.append("\t");
					// System.out.println("key"+key+"IsInstantConfirm not same"+" url1:"+inv1.isIsInstantConfirm()+" url2:"+inv2.isIsInstantConfirm());
				}
				if (!((inv2.getIC_BeginTime() == null && inv1.getIC_BeginTime() == null)
						|| (inv2.getIC_BeginTime() != null && inv2.getIC_BeginTime().equals(inv1.getIC_BeginTime())) || (inv1
						.getIC_BeginTime() != null && inv1.getIC_BeginTime().equals(inv2.getIC_BeginTime())))) {
					result = false;
					record.append("IC_BeginTime" + p1 + inv1.getIC_BeginTime() + p2 + inv2.getIC_BeginTime());
					record.append("\t");
					// System.out.println("key"+key+"getIC_BeginTime() not same"+" url1:"+inv1.getIC_BeginTime()+" url2:"+inv2.getStartDate());
				}
				if (!((inv2.getIC_EndTime() == null && inv1.getIC_EndTime() == null) || (inv2.getIC_EndTime() != null && inv2
						.getIC_EndTime().equals(inv1.getIC_EndTime() != null && inv1.getIC_EndTime().equals(inv2.getIC_EndTime()))))) {
					result = false;
					record.append("IC_EndTime" + p1 + inv1.getIC_EndTime() + p2 + inv2.getIC_EndTime());
					record.append("\t");
					// System.out.println("key"+key+"getIC_EndTime() not same"+" url1:"+inv1.getIC_EndTime()+" url2:"+inv2.getIC_EndTime());
				}

			} else {
				result = false;
				record.append("not contain key");
				record.append("\t");
				// System.out.println("not contain key"+key);
			}
			if (StringUtils.isNotEmpty(record)) {
				File file = new File("inventory_result.txt");

				// if file doesnt exists, then create it
				if (!file.exists()) {
					try {
						file.createNewFile();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				// true = append file
				FileWriter fileWritter = null;
				try {
					fileWritter = new FileWriter(file.getName(), true);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
				try {
					bufferWritter.write("\n" + System.currentTimeMillis() + "-->" + key + ": " + record.toString());
					bufferWritter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println(key + ": " + record.toString());
			}
		}
		return result;
	}

	static Map<String, Inventory> getMap(RestResponse<InventoryResult> response1) {
		Map<String, Inventory> map1 = new HashMap<String, Inventory>();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		if (response1 != null && response1.getResult() != null && response1.getResult().getInventories() != null) {
			for (Inventory inv : response1.getResult().getInventories()) {
				map1.put(
						inv.getHotelID() + "|" + inv.getHotelCode() + "|" + inv.getRoomTypeID() + "|" + sdf1.format(inv.getAvailableDate()),
						inv);
			}
		}
		return map1;
	}

	@SuppressWarnings("rawtypes")
	public static <T> RestResponse<T> toResponse(String resultJson, Type typeObj, Map<Class, TypeAdapter> adapters) {
		try {

			String json = resultJson;

			// RequestAttributes ra =
			// RequestContextHolder.getRequestAttributes();
			// ra.setAttribute(Constants.ELONG_REQUEST_JSON, json == null ? "" :
			// json,
			// ServletResponseAttributes.SCOPE_REQUEST);

			GsonBuilder gsonBuilder = new GsonBuilder();
			// 添加枚举适配器
			gsonBuilder.registerTypeHierarchyAdapter(Enum.class, new EnumTypeAdapter());
			gsonBuilder.registerTypeAdapter(Date.class, new DateTypeAdapter());
			if (adapters != null && !adapters.isEmpty()) {
				for (Entry<Class, TypeAdapter> e : adapters.entrySet()) {
					gsonBuilder.registerTypeAdapter(e.getKey(), e.getValue());
				}
			}

			Type objectType = type(RestResponse.class, typeObj);
			return gsonBuilder.create().fromJson(json, objectType);
		} catch (Exception e) {
			System.out.println(resultJson);
		}
		return null;
	}

	@SuppressWarnings("rawtypes")
	public static <T> RestRequest<T> toReq(String request, Class<T> clazz, Map<Class, TypeAdapter> adapters) throws IOException {
		String json = request;

		// RequestAttributes ra = RequestContextHolder.getRequestAttributes();
		// ra.setAttribute(Constants.ELONG_REQUEST_JSON, json == null ? "" :
		// json,
		// ServletRequestAttributes.SCOPE_REQUEST);

		GsonBuilder gsonBuilder = new GsonBuilder();
		// 添加枚举适配器
		gsonBuilder.registerTypeHierarchyAdapter(Enum.class, new EnumTypeAdapter());
		gsonBuilder.registerTypeAdapter(Date.class, new DateTypeAdapter());
		if (adapters != null && !adapters.isEmpty()) {
			for (Entry<Class, TypeAdapter> e : adapters.entrySet()) {
				gsonBuilder.registerTypeAdapter(e.getKey(), e.getValue());
			}
		}

		Type objectType = type(RestRequest.class, clazz);
		return gsonBuilder.create().fromJson(json, objectType);
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

	static ParameterizedType type(final Class<?> raw, final Type... args) {
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
