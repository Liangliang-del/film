package com.ll.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ll.biz.ICinemaBiz;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"classpath:spring-bean.xml"})
public class TestCinema {
	@Autowired
	private ICinemaBiz cinemaBizImpl;
	
	@Test
	public void findAllCinema(){
		System.out.println(cinemaBizImpl.findAllCinema());
	}
	
	@Test
	public void testFindByPage(){
		System.out.println(cinemaBizImpl.findByPage(1, 5));
	}
	
}
