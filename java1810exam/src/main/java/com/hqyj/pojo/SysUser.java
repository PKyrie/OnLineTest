package com.hqyj.pojo;

import java.io.Serializable;

public class SysUser implements Serializable{
	private int sysId;
	private String sysName;
	private String sysPassword;
	public int getSysId() {
		return sysId;
	}
	public void setSysId(int sysId) {
		this.sysId = sysId;
	}
	public String getSysName() {
		return sysName;
	}
	public void setSysName(String sysName) {
		this.sysName = sysName;
	}
	public String getSysPassword() {
		return sysPassword;
	}
	public void setSysPassword(String sysPassword) {
		this.sysPassword = sysPassword;
	}
	public SysUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SysUser [sysId=" + sysId + ", sysName=" + sysName + ", sysPassword=" + sysPassword + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sysId;
		result = prime * result + ((sysName == null) ? 0 : sysName.hashCode());
		result = prime * result + ((sysPassword == null) ? 0 : sysPassword.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SysUser other = (SysUser) obj;
		if (sysId != other.sysId)
			return false;
		if (sysName == null) {
			if (other.sysName != null)
				return false;
		} else if (!sysName.equals(other.sysName))
			return false;
		if (sysPassword == null) {
			if (other.sysPassword != null)
				return false;
		} else if (!sysPassword.equals(other.sysPassword))
			return false;
		return true;
	}
	
	
}
