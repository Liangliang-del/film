package com.ll.biz.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ll.biz.ICinemaBiz;
import com.ll.mapper.CinemaMapper;
import com.ll.po.Cinema;
@Service
public class CinemaBizImpl implements ICinemaBiz {
	
	@Autowired
	private CinemaMapper mapper;

	@Override
	public int addCin(Cinema c) {
		return mapper.insert(c);
	}
	
	@Override
	public List<Cinema> findAllCinema() {
		return mapper.selectByExample(null);
	}

	/**
	 * page 第几页
	 * rows 每页显示多少行
	 */
	@Override
	public List<Cinema> findByPage(int page, int rows) {
		Map<String, Integer> map=new HashMap<String,Integer>();
		map.put("page", (page-1)*rows);
		map.put("rows", rows);
		return mapper.findByPage(map);
	}

	@Override
	public int pageTotal() {
		return mapper.getTotal();
	}

}
