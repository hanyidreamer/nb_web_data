package com.elong.nb.model.rateplan.fornb;

public class ResponseBase<T> {

	private String exceptionMsg;
	private String logId;
	private int responseCode;
	private String serverName;
	private T realResponse;

	public String getExceptionMsg() {
		return exceptionMsg;
	}

	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public T getRealResponse() {
		return realResponse;
	}

	public void setRealResponse(T realResponse) {
		this.realResponse = realResponse;
	}
}
