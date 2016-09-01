package com.elong.nb.model.bookingdata;

public class OrderFromResult {

	/// <summary>
    /// 200:成功，-1：orderFromId有误  -2：代理不存在 其他：失败
   /// </summary>
   private int code;
   
   private OrderFromData data;

   private String msg;

public int getCode() {
	return code;
}

public void setCode(int code) {
	this.code = code;
}

public OrderFromData getData() {
	return data;
}

public void setData(OrderFromData data) {
	this.data = data;
}

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}
   
   
}
