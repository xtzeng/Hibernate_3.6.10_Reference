package com.leadtone.ibatis.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.leadtone.ibatis.dao.ibatis.EmpDaoImpl;

@Service("testService")
public class TestService {

	@Resource(name="empDaoImpl")
	private EmpDaoImpl empDaoImpl;
	
	public void tt() {
		empDaoImpl.queryAllEmps();
	}
}
