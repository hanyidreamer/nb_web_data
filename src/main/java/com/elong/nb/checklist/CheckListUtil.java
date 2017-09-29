package com.elong.nb.checklist;

import org.apache.commons.lang3.StringUtils;

import com.elong.nb.common.checklist.Constants;
import com.elong.nb.common.checklist.EnumNBLogType;
import com.elong.nb.common.checklist.NBActionLogHelper;
import com.elong.nb.data.biglog.BigLog;
import com.elong.nb.util.ThreadLocalUtil;

public class CheckListUtil {
	public static void info(BigLog bigLog) {
		int responseCode = 0;
		if (!StringUtils.isEmpty(bigLog.getBusinessErrorCode())) {
			responseCode = Integer.valueOf(bigLog.getBusinessErrorCode());
		}
		Object userName = ThreadLocalUtil.get(Constants.ELONG_REQUEST_USERNAME);
		String userNameStr = userName == null ? null : (String) userName;
		NBActionLogHelper.businessLog(bigLog.getTraceId(), true, bigLog.getServiceName(), bigLog.getAppName(), null,
				StringUtils.isEmpty(bigLog.getElapsedTime()) ? 0 : Integer.valueOf(bigLog.getElapsedTime()), responseCode,
				bigLog.getExceptionMsg(), bigLog.getResponseBody(), bigLog.getRequestBody(), userNameStr, EnumNBLogType.DAO);
	}

	public static void error(BigLog bigLog) {
		Object userName = ThreadLocalUtil.get(Constants.ELONG_REQUEST_USERNAME);
		String userNameStr = userName == null ? null : (String) userName;
		NBActionLogHelper.businessLog(bigLog.getTraceId(), false, bigLog.getServiceName(), bigLog.getAppName(), bigLog.getException(),
				StringUtils.isEmpty(bigLog.getElapsedTime()) ? 0 : Integer.valueOf(bigLog.getElapsedTime()), 0, null,
				bigLog.getResponseBody(), bigLog.getRequestBody(), userNameStr, EnumNBLogType.DAO);
	}
}
