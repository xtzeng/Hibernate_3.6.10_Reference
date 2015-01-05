package com.xme.excel;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.leadtone.ibatis.dao.ibatis.TestDaoImpl;
import com.leadtone.ibatis.service.impl.TestService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SpringTest extends AbstractJUnit4SpringContextTests{                     

	@Resource
	private TestDaoImpl testDaoImpl;
	
	@Test
	public void testService() {
		testDaoImpl.tt();
	}
	
	
	
}
