package com.leadtone.ibatis.dao;

import java.util.List;

import com.leadtone.ibatis.domain.Emp;

public interface IEmpDao {

	public List<Emp> queryAllEmps();
}
