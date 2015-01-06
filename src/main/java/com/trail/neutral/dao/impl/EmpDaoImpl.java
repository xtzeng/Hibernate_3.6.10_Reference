package com.trail.neutral.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.trail.neutral.dao.IEmpDao;
import com.trail.neutral.dao.base.BaseDao2;
import com.trail.neutral.po.Emp;

@Repository("empDaoImpl")
public class EmpDaoImpl  extends BaseDao2 implements IEmpDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Emp> queryAllEmps() {
		List<Emp> emps = null;                         
		emps = getSqlMapClientTemplate().queryForList("selectAllEmps", Emp.class);
		return emps;
	}

}
