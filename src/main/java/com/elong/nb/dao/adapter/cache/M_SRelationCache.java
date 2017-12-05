package com.elong.nb.dao.adapter.cache;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Repository;

import com.elong.nb.agent.SupplierService.ISupplierServiceContract;
import com.elong.nb.ms.agent.HotelDataServiceAgent;

@Repository
public class M_SRelationCache {
	
	@Resource(name = "supplierService")
	private ISupplierServiceContract supplierServiceContract;

	/**
	 * 获取hotelCode
	 * 
	 * @param mHotelIds
	 * @return
	 * @throws Exception 
	 */
	public List<String[]> getSHotelIds(String[] mHotelIds) {
		List<String[]> sHotelIdArrays = new ArrayList<String[]>();
		Map<String, String> msHotelIdMap = HotelDataServiceAgent.getShotelIdsByMhotelId(mHotelIds);
		if (mHotelIds != null && mHotelIds.length > 0) {
			for (String mHotelId : mHotelIds) {
				String sHotelIdStr = msHotelIdMap.get(mHotelId);
				if (StringUtils.isEmpty(sHotelIdStr)) {
					sHotelIdArrays.add(new String[] {});
				} else {
					sHotelIdArrays.add(StringUtils.split(sHotelIdStr, ",", -1));
				}
			}
		}
		return sHotelIdArrays;
	}

	public String getMHotelId(String sHotelID) {
		Map<String, String> smHotelIdMap = HotelDataServiceAgent.getMhotelIdByShotelId(new String[] { sHotelID });
		String mHotelId = smHotelIdMap.get(sHotelID);
		return StringUtils.isEmpty(mHotelId) ? sHotelID : mHotelId;
	}
	
}
