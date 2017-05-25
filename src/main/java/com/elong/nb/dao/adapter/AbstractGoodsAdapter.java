package com.elong.nb.dao.adapter;

import java.util.List;

public abstract class AbstractGoodsAdapter<E,T> {
	public abstract List<E> toNBObject(T goodsObject);
}
