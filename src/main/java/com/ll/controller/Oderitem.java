package com.ll.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ll.biz.IOrderitemBiz;
import com.ll.po.Orderitem;
import com.ll.po.OrderitemExample;
import com.ll.po.OrderitemExample.Criteria;

@Controller
public class Oderitem {
	@Autowired
	private IOrderitemBiz orderitemBizImpl;
	
	@RequestMapping("/testSeat")
	public String testSeat(){
		System.out.println("------testSeat");
		return "buyFile";
	}
	
	@RequestMapping("/findSeat")
	@ResponseBody
	public List<Orderitem> findSeat(@RequestParam("cname") String cname,@RequestParam("fid") Integer fid){
		System.out.println("----------findSeat,cname:"+cname+",fid:"+fid);
		OrderitemExample example = new OrderitemExample();
		Criteria criteria = example.createCriteria();
		criteria.andCNameEqualTo(cname);
		criteria.andFIdEqualTo(fid);
		return orderitemBizImpl.findByOrderitem(example);
	}
	
	
}
