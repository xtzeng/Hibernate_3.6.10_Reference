package com.trail.neutral.dao.base;


import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.ibatis.sqlmap.client.SqlMapClient;
public class BaseDao<E> extends SqlMapClientDaoSupport{
	
	@Resource(name="sqlMapClient")
	private SqlMapClient sqlMapClient;
	
	
	@PostConstruct
	public void initSqlMapClient() {
		super.setSqlMapClient(sqlMapClient);
	}
	
	
	@SuppressWarnings("unchecked")
	protected List<E> selectList(String statementName, E objectparameter) {
		List<E> list;
		list = (List<E>) this.getSqlMapClientTemplate().queryForList(statementName, objectparameter);
		return list;
	}

}
