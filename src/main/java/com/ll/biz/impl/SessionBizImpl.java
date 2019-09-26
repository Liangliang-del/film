package com.ll.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ll.biz.ISessionBiz;
import com.ll.mapper.SessionMapper;
import com.ll.po.Session;

@Service
public class SessionBizImpl implements ISessionBiz {
	
	@Autowired
	private SessionMapper mapper;

	@Override
	public int addSession(Session s) {
		return mapper.insert(s);
	}

}
