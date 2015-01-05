package com.leadtone.ibatis.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.leadtone.ibatis.dao.IUserDao;
import com.leadtone.ibatis.domain.User;


public class UserDaoImpl extends SqlMapClientDaoSupport implements IUserDao {

	
	//继承UserDao跟继承SqlMapClientDaoSupport是一样的，因为也UserDao也继承了SqlMapClientDaoSupport
	//注意这里的SqlMapClient接口的声明和下面的static静态代码都不需要了，
    // 因为这里继承了spring提供的ibatis模板template类SqlMapClientDaoSupport，不是用原生的SqlMapClient
    //private static SqlMapClient sqlMapClient=null;
	/*
	static{
		Reader reader=null;
		try {
			reader=Resources.getResourceAsReader("com/leadtone/ibatis/sqlmap/SqlMapConfig.xml");
			sqlMapClient=SqlMapClientBuilder.buildSqlMapClient(reader);
			
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	*/
	public void addUser(User user) {
		getSqlMapClientTemplate().insert("addUser", user);
	}

	public User queryUserByUser(User user) {
		System.out.println("---UserDaoImpl---");
		return (User) this.getSqlMapClientTemplate().queryForObject("selectUserByUser", user);
		
	}
/*
* 这里主要演示一个模拟用户登录系统验证的操作，主要用了queryUserByUser(User user)方法
*/

	@Override
	public List<User> queryAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User queryUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> queryUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUserBySequence(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}
}

