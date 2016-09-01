package com.elong.nb.model.effectivestatuscheck;

public class EffectiveStatusResponse {

	private EffectiveStatus effectiveStatus;
    private int responseCode;
	public EffectiveStatus getEffectiveStatus() {
		return effectiveStatus;
	}
	public void setEffectiveStatus(EffectiveStatus effectiveStatus) {
		this.effectiveStatus = effectiveStatus;
	}
	public int getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
    
    
}
