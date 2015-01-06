package com.leadtone.ibatis.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.leadtone.ibatis.dao.ibatis.EmpDaoImpl;
import com.leadtone.ibatis.domain.Emp;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class EmpDaoImplTest extends AbstractJUnit4SpringContextTests{

//	@Resource
//	private EmpDaoImpl empDaoImpl;
	
	@Test
	public void testQuryAllEmps() {
		List<Emp> emps = new ArrayList<Emp>();
		
//		emps = empDaoImpl.queryAllEmps();
	}
}
