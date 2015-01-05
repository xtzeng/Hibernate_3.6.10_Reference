package com.leadtone.ibatis.dao.base;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.ibatis.sqlmap.client.SqlMapClient;

public class BaseDao2 extends SqlMapClientDaoSupport{

	@Resource(name="sqlMapClient")
	private SqlMapClient sqlMapClient;
	
	
	@PostConstruct
	public void initSqlMapClient() {
		super.setSqlMapClient(sqlMapClient);
	}
	
}
