package com.elong.nb.checklist;

import org.apache.commons.lang3.StringUtils;

import com.elong.nb.data.biglog.BigLog;
import com.elong.springmvc_enhance.utilities.ActionLogHelper;

public class CheckListUtil {
	public static void info(BigLog bigLog){
		int responseCode=0;
		if(!StringUtils.isEmpty(bigLog.getBusinessErrorCode())){
			responseCode=Integer.valueOf(bigLog.getBusinessErrorCode());
		}
		ActionLogHelper.businessLog(bigLog.getTraceId(), true, bigLog.getServiceName(),
				bigLog.getAppName(),null, StringUtils.isEmpty(bigLog.getElapsedTime())?0:Integer.valueOf(bigLog.getElapsedTime()), responseCode, bigLog.getExceptionMsg(), bigLog.getResponseBody(),bigLog.getRequestBody());
	}
	public static void error(BigLog bigLog){
		ActionLogHelper.businessLog(bigLog.getTraceId(), false, bigLog.getServiceName(),
				bigLog.getAppName(),bigLog.getException(), StringUtils.isEmpty(bigLog.getElapsedTime())?0:Integer.valueOf(bigLog.getElapsedTime()), 0, null, bigLog.getResponseBody(),bigLog.getRequestBody());
	}
}
