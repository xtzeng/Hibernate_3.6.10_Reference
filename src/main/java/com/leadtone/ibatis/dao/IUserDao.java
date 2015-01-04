package com.leadtone.ibatis.dao;

import java.util.List;
import com.leadtone.ibatis.domain.User;

public interface IUserDao {
	public List<User> queryAllUsers();
	public User queryUserById(int id);
	public User queryUserByUser(User user);	
	public List<User> queryUserByName(String name);
	
	public void addUser(User user);
	public void addUserBySequence(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(int id);
}