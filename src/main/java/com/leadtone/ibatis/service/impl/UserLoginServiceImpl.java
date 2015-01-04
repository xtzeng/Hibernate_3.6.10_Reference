package com.leadtone.ibatis.service.impl;

import com.leadtone.ibatis.dao.IUserDao;
import com.leadtone.ibatis.domain.User;
import com.leadtone.ibatis.service.IUserLoginService;

public class UserLoginServiceImpl implements IUserLoginService {

	private IUserDao userDao;

	public IUserDao getUserDao() {
		return userDao;
	}
	
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
	public boolean isLoginUser(User user) {
		return null!=userDao.queryUserByUser(user)?true:false;
	}

}