package com.ll.biz.impl;

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

}
