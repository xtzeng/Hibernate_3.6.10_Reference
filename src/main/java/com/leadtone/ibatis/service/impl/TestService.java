package com.leadtone.ibatis.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.leadtone.ibatis.dao.ibatis.TestDaoImpl;

@Service("testService")
public class TestService {

	@Resource(name="testDaoImpl")
	private TestDaoImpl testDaoImpl;
	
	public void tt() {
		testDaoImpl.tt();
	}
}
