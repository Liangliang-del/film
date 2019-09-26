package com.ll.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ll.biz.ICinemaBiz;
import com.ll.po.Cinema;

@Controller
public class CinemaController {
	@Autowired
	private ICinemaBiz cinemaBizImpl;
	
	@RequestMapping(value="/findCinema")
	@ResponseBody
	public List<Cinema> testFindCinema(){
		System.out.println("---------testFindCinema");
		return cinemaBizImpl.findAllCinema();
	}
	
	@RequestMapping(value="/findByPage")
	@ResponseBody
	public List<Cinema> findByPage(/*@RequestParam("page") Integer page,@RequestParam("rows") Integer rows*/
			int page,int rows){
		System.out.println(".......findByPage:page="+page+",rows="+rows);
		return cinemaBizImpl.findByPage(page, rows);
	}
	
	@RequestMapping(value="/pageTotal")
	@ResponseBody
	public Integer pageTotal(){
		System.out.println("--------------------pageTotal");
		return cinemaBizImpl.pageTotal();
	}
	
}
