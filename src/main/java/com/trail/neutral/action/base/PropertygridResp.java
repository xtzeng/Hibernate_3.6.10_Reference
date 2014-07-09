package com.trail.neutral.action.base;

import java.util.List;

public class PropertygridResp {
	
	private int total;	
	private List<NameValueResp> rows;
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<NameValueResp> getRows() {
		return rows;
	}
	public void setRows(List<NameValueResp> rows) {
		this.rows = rows;
	}
	
	
}
