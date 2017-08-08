package com.elong.nb.dao.adapter.repository;

import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.elong.nb.agent.SupplierService.GetSupplierInfoBySupplierIDRequest;
import com.elong.nb.agent.SupplierService.GetSupplierInfoBySupplierIDResponse;
import com.elong.nb.agent.SupplierService.ISupplierServiceContract;
import com.elong.springmvc_enhance.utilities.ActionLogHelper;

@Repository
public class SupplierServiceRepository {

	@Resource(name = "supplierService")
	ISupplierServiceContract supplierServiceContract;

	public GetSupplierInfoBySupplierIDResponse getSupplierInfoBySupplierID(GetSupplierInfoBySupplierIDRequest request) {
		try {
			long start = System.currentTimeMillis();
			GetSupplierInfoBySupplierIDResponse res = supplierServiceContract.getSupplierInfoBySupplierID(request);
			ActionLogHelper.businessLog(UUID.randomUUID().toString(), true, "getSupplierInfoBySupplierID", "ISupplierServiceContract",
					null, (System.currentTimeMillis() - start), 0, null, null, "");
			return res;
		} catch (Exception e) {
			ActionLogHelper.businessLog(UUID.randomUUID().toString(), false, "getSupplierInfoBySupplierID", "ISupplierServiceContract", e,
					0, 0, e.getMessage(), null, "");
			throw new RuntimeException(e);
		}
	}
}
