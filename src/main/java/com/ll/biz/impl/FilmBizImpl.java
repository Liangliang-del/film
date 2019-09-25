package com.ll.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ll.biz.IFilmBiz;
import com.ll.mapper.FilmMapper;
import com.ll.po.Film;
@Service
public class FilmBizImpl implements IFilmBiz {
	
	@Autowired
	private FilmMapper mapper;

	@Override
	public int addFilm(Film f) {
		return mapper.insert(f);
	}

}
