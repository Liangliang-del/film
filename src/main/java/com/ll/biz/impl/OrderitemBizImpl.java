package com.ll.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ll.biz.IOrderitemBiz;
import com.ll.mapper.OrderitemMapper;
import com.ll.po.Orderitem;
import com.ll.po.OrderitemExample;

@Service
public class OrderitemBizImpl implements IOrderitemBiz {
	@Autowired
	private OrderitemMapper mapper;
	
	@Override
	public List<Orderitem> findByOrderitem(OrderitemExample example) {
		return mapper.selectByExample(example);
	}

}
