package com.elong.nb.dao.adapter.repository;

import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.elong.nb.agent.ProductForNBServiceContract.GetRatePlanBaseInfoRequest;
import com.elong.nb.agent.ProductForNBServiceContract.GetRatePlanBaseInfoResponse2;
import com.elong.nb.agent.ProductForNBServiceContract.IProductForNBServiceContract;
import com.elong.nb.common.checklist.Constants;
import com.elong.nb.common.checklist.EnumNBLogType;
import com.elong.nb.common.checklist.NBActionLogHelper;
import com.elong.nb.util.ThreadLocalUtil;

@Repository
public class ProductForNBServiceRepository {

	@Resource(name = "productForNBServiceContract")
	IProductForNBServiceContract productForNBServiceContract;

	public GetRatePlanBaseInfoResponse2 getRatePlanBaseInfo(GetRatePlanBaseInfoRequest request) {
		Object userName = ThreadLocalUtil.get(Constants.ELONG_REQUEST_USERNAME);
		String userNameStr = userName == null ? null : (String) userName;
		try {
			long start = System.currentTimeMillis();
			GetRatePlanBaseInfoResponse2 res = productForNBServiceContract.getRatePlanBaseInfo(request);
			NBActionLogHelper.businessLog(UUID.randomUUID().toString(), true, "getRatePlanBaseInfo", "IProductForNBServiceContract", null,
					(System.currentTimeMillis() - start), 0, null, null, "", userNameStr, EnumNBLogType.DAO);
			return res;
		} catch (Exception e) {
			NBActionLogHelper.businessLog(UUID.randomUUID().toString(), false, "getRatePlanBaseInfo", "IProductForNBServiceContract", e, 0,
					0, e.getMessage(), null, "", userNameStr, EnumNBLogType.DAO);
			throw new RuntimeException(e);
		}
	}
}
