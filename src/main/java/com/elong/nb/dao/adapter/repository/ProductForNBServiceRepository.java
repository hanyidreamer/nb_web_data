package com.elong.nb.dao.adapter.repository;

import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.elong.nb.agent.ProductForNBServiceContract.GetRatePlanBaseInfoRequest;
import com.elong.nb.agent.ProductForNBServiceContract.GetRatePlanBaseInfoResponse2;
import com.elong.nb.agent.ProductForNBServiceContract.IProductForNBServiceContract;
import com.elong.springmvc_enhance.utilities.ActionLogHelper;

@Repository
public class ProductForNBServiceRepository {

	@Resource(name = "productForNBServiceContract")
	IProductForNBServiceContract productForNBServiceContract;

	public GetRatePlanBaseInfoResponse2 getRatePlanBaseInfo(GetRatePlanBaseInfoRequest request) {
		try {
			long start = System.currentTimeMillis();
			GetRatePlanBaseInfoResponse2 res = productForNBServiceContract.getRatePlanBaseInfo(request);
			ActionLogHelper.businessLog(UUID.randomUUID().toString(), true, "getRatePlanBaseInfo", "IProductForNBServiceContract", null,
					(System.currentTimeMillis() - start), 0, null, null, "");
			return res;
		} catch (Exception e) {
			ActionLogHelper.businessLog(UUID.randomUUID().toString(), false, "getRatePlanBaseInfo", "IProductForNBServiceContract", e, 0,
					0, e.getMessage(), null, "");
			throw new RuntimeException(e);
		}
	}
}
