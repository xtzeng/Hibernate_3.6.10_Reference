package com.xme.excel;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SpringTest extends AbstractJUnit4SpringContextTests{                     

//	@Resource
//	private TestDaoImpl testDaoImpl;
	
	@Test
	public void testService() {
//		testDaoImpl.tt();
		System.out.println("abc");
	}
	
	
	
}
