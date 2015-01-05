package com.leadtone.ibatis.dao;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.leadtone.ibatis.dao.ibatis.UserDaoImpl;
import com.leadtone.ibatis.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserDaoImplTest extends AbstractJUnit4SpringContextTests{
	
	@Resource
	private UserDaoImpl userDaoImpl;
	
	@Test
	public void testAdd(){
		User user = new User();
		user.setMemo("ddkjlfajdfl");
		user.setName("lilei");
		user.setPassword("xxxxx");
		user.setQx("a");
		userDaoImpl.addUser(user);
	}

}
