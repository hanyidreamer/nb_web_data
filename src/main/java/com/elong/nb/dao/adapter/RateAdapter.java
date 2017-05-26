package com.elong.nb.dao.adapter;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.elong.hotel.goods.ds.thrift.BasePrice;
import com.elong.hotel.goods.ds.thrift.GetBasePrice4NbResponse;
import com.elong.hotel.goods.ds.thrift.MHotelBasePrice;
import com.elong.hotel.goods.ds.thrift.RatePlanBasePrice;
import com.elong.hotel.goods.ds.thrift.SHotelBasePrice;
import com.elong.hotel.goods.ds.thrift.SRoomBasePrice;
import com.elong.nb.common.util.SafeConvertUtils;
import com.elong.nb.model.rate.bean.Rate;

public class RateAdapter extends AbstractGoodsAdapter<Rate, GetBasePrice4NbResponse>{

	@Override
	public List<Rate> toNBObject(GetBasePrice4NbResponse goodsObject) {
		if(goodsObject.getMhotel_base_price()!=null){
			int dataSize=goodsObject.getMhotel_base_price().size();
			if(dataSize>0){
				List<Rate> rates=new LinkedList<Rate>();
				for(int i=0;i<dataSize;i++){
					MHotelBasePrice mhotelBasePrice=goodsObject.mhotel_base_price.get(i);
					if(mhotelBasePrice!=null){
						String hotelId=SafeConvertUtils.ToHotelId(mhotelBasePrice.getMhotel_id());
						if(mhotelBasePrice.getShotel_base_price()!=null){
							int shotelSize=mhotelBasePrice.getShotel_base_price().size();
							for(int j=0;j<shotelSize;j++){
								SHotelBasePrice shotelBasePrice=mhotelBasePrice.getShotel_base_price().get(j);
								String hotelCode=SafeConvertUtils.ToHotelId(shotelBasePrice.getShotel_id());
								if(shotelBasePrice.getSroom_base_price()!=null){
									int roomTypeSize=shotelBasePrice.getSroom_base_price().size();
									for(int k=0;k<roomTypeSize;k++){
										SRoomBasePrice roomTypeBasePrice=shotelBasePrice.getSroom_base_price().get(k);
										String roomTypeId= SafeConvertUtils.ToRoomId(roomTypeBasePrice.getSroom_id());
										if(roomTypeBasePrice.getRateplan_base_price()!=null){
											int rpSize=roomTypeBasePrice.getRateplan_base_price().size();
											for(int l=0;l<rpSize;l++){
												RatePlanBasePrice rpBasePrice=roomTypeBasePrice.getRateplan_base_price().get(l);
												int ratePlanId=rpBasePrice.getRateplan_id();
												if(rpBasePrice.getBase_price()!=null){
													int baseSize=rpBasePrice.getBase_price().size();
													for(int m=0;m<baseSize;m++){
														BasePrice basePrice=rpBasePrice.getBase_price().get(m);
														Rate rate=new Rate();
														rate.setAddBed(basePrice.allow_add_bed?dealPrice(basePrice.add_bed_price):-1d);
														rate.setCurrencyCode(basePrice.getCurrency_code());
														rate.setEndDate(new Date(1000*(long)basePrice.getEnd_date()));
														rate.setHotelCode(hotelCode);
														rate.setHotelID(hotelId);
														rate.setMember(dealPrice(basePrice.getGeneral_price_origin()));
														rate.setMemberCost(dealPrice(basePrice.getGeneral_cost_origin()));
														rate.setPriceID(basePrice.getPrice_id());
														rate.setRateplanId(ratePlanId);
														rate.setRoomTypeId(roomTypeId);
														rate.setStartDate(new Date(1000*(long)basePrice.getStart_date()));
														rate.setStatus(basePrice.getStatus()==1);
														rate.setWeekend(dealPrice(basePrice.getWeekend_price_origin()));
														rate.setWeekendCost(dealPrice(basePrice.getWeekend_cost_origin()));
														rates.add(rate);
													}
												}
											}
										}
									}
								}
							}
						}
					}
					
				}
				return rates;
				
			}
		}
		return null;
	}
	private double dealPrice(long sourcePrice){
		return new Double(Math.round(new Double(sourcePrice)/10))/100;
	}
}