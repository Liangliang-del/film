package com.ll.biz;

import java.util.List;

import com.ll.po.Cinema;

public interface ICinemaBiz {

	//添加影院
	public int addCin(Cinema c);
	
	//查询影院
	public List<Cinema> findAllCinema();
	
	//分页查询
	public List<Cinema> findByPage(int page,int rows);
	
	//查询分页总页数
	public int pageTotal();
}
