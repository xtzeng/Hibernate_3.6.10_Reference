package com.trail.neutral.action.base;

public class NameValueResp {
	private String name;
	private String value;
	
	public NameValueResp(String name,String value){
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
}
