package com.trail.neutral.dao;

import java.util.List;

import com.trail.neutral.po.User;

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