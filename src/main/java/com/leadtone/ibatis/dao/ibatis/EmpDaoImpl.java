package com.leadtone.ibatis.dao.ibatis;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.leadtone.ibatis.dao.IEmpDao;
import com.leadtone.ibatis.dao.base.BaseDao2;
import com.leadtone.ibatis.domain.Emp;

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
