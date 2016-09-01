package com.elong.nb.model.effectivestatuscheck;

import java.util.UUID;

public class SoaRestRequest<T> {

	 public SoaRestRequest() 
     {
         this.from = "NBAPI";
         //this.logId = Guid.NewGuid().ToString();
         UUID uuid = UUID.randomUUID();
         this.logId =uuid.toString();
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
	public T getRealRequest() {
		return realRequest;
	}
	public void setRealRequest(T realRequest) {
		this.realRequest = realRequest;
	}
     
     
}
