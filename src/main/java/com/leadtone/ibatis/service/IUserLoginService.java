package com.leadtone.ibatis.service;

import com.leadtone.ibatis.domain.User;

public interface IUserLoginService {
	public boolean isLoginUser(User user);
}