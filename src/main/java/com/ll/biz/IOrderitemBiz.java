package com.ll.biz;

import java.util.List;

import com.ll.po.Orderitem;
import com.ll.po.OrderitemExample;

public interface IOrderitemBiz {
	public List<Orderitem> findByOrderitem(OrderitemExample example);
}
