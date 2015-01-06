package com.trail.neutral.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class Emp implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer empno;
	private String ename;
	private String job;
	private Integer mgr;
	private Timestamp hiredate;
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Integer getMgr() {
		return mgr;
	}
	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}
	public Timestamp getHiredate() {
		return hiredate;
	}
	public void setHiredate(Timestamp hiredate) {
		this.hiredate = hiredate;
	}
	
	
}
