package com.trail.neutral.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.trail.neutral.dao.impl.EmpDaoImpl;

@Service("testService")
public class TestService {

	@Resource(name="empDaoImpl")
	private EmpDaoImpl empDaoImpl;
	
	public void tt() {
		empDaoImpl.queryAllEmps();
	}
}
