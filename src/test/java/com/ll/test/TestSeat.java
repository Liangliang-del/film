package com.ll.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ll.biz.IOrderitemBiz;
import com.ll.po.OrderitemExample;
import com.ll.po.OrderitemExample.Criteria;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"classpath:spring-bean.xml"})
public class TestSeat {
	@Autowired
	private IOrderitemBiz IOrderitemBizImpl;
	
	@Test
	public void testIOrderitemBizImpl(){
		OrderitemExample example = new OrderitemExample();
		Criteria criteria = example.createCriteria();
		criteria.andFIdEqualTo(1);
		System.out.println(IOrderitemBizImpl.findByOrderitem(example));
	}
}
