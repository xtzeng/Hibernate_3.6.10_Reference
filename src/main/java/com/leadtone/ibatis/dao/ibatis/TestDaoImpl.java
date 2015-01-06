package com.leadtone.ibatis.dao.ibatis;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.leadtone.ibatis.dao.base.BaseDao;
import com.leadtone.ibatis.domain.User;

//@Repository("testDaoImpl")
public class TestDaoImpl extends BaseDao<Object>{
	
	public void tt() {
		List<User> users = new ArrayList<User>();
		this.selectList("selectAllUsers", User.class);
	}
	
	
}
