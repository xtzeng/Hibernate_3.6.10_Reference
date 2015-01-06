package com.trail.neutral.po;  
  
import java.io.Serializable;  
import java.sql.Timestamp;
  
public class User implements Serializable{  
      
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;  
    private String name;  
    private String password;  
    private String qx;  
    private String memo;
    
    private Timestamp lastUpdateTime;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getQx() {
		return qx;
	}
	public void setQx(String qx) {
		this.qx = qx;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Timestamp getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Timestamp lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	} 
    
    
}
