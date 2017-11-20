package com.elong.nb.dao.adapter;

import java.util.List;
import java.util.Map;

import com.elong.nb.model.bean.enums.EnumPaymentType;

public abstract class AbstractGoodsAdapter<E, T> {

	public abstract List<E> toNBObject(T goodsObject);

	public abstract void setFilter(Map<String, EnumPaymentType> hotelCodeFilterType, boolean isCn);
}
