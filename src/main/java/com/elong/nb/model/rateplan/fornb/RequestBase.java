package com.elong.nb.model.rateplan.fornb;

public class RequestBase<T>{
	public RequestBase(){
		this.from="NBAPI";
	}
	private String from;
	private String logId;
	private T realRequest;
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getLogId() {
		return logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}
	/**
	 * @return the realRequest
	 */
	public T getRealRequest() {
		return realRequest;
	}
	/**
	 * @param realRequest the realRequest to set
	 */
	public void setRealRequest(T realRequest) {
		this.realRequest = realRequest;
	}
}
