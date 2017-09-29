package com.elong.nb.dao.adapter.repository;

import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.elong.nb.agent.SupplierService.GetSupplierInfoBySupplierIDRequest;
import com.elong.nb.agent.SupplierService.GetSupplierInfoBySupplierIDResponse;
import com.elong.nb.agent.SupplierService.ISupplierServiceContract;
import com.elong.nb.common.checklist.Constants;
import com.elong.nb.common.checklist.EnumNBLogType;
import com.elong.nb.common.checklist.NBActionLogHelper;
import com.elong.nb.util.ThreadLocalUtil;

@Repository
public class SupplierServiceRepository {

	@Resource(name = "supplierService")
	ISupplierServiceContract supplierServiceContract;

	public GetSupplierInfoBySupplierIDResponse getSupplierInfoBySupplierID(GetSupplierInfoBySupplierIDRequest request) {
		Object userName = ThreadLocalUtil.get(Constants.ELONG_REQUEST_USERNAME);
		String userNameStr = userName == null ? null : (String) userName;
		try {
			long start = System.currentTimeMillis();
			GetSupplierInfoBySupplierIDResponse res = supplierServiceContract.getSupplierInfoBySupplierID(request);
			NBActionLogHelper.businessLog(UUID.randomUUID().toString(), true, "getSupplierInfoBySupplierID", "ISupplierServiceContract",
					null, (System.currentTimeMillis() - start), 0, null, null, "", userNameStr, EnumNBLogType.DAO);
			return res;
		} catch (Exception e) {
			NBActionLogHelper.businessLog(UUID.randomUUID().toString(), false, "getSupplierInfoBySupplierID", "ISupplierServiceContract",
					e, 0, 0, e.getMessage(), null, "", userNameStr, EnumNBLogType.DAO);
			throw new RuntimeException(e);
		}
	}
}
