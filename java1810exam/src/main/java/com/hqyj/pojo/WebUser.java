package com.hqyj.pojo;

import java.io.Serializable;

public class WebUser implements Serializable{
	private int webId;
	private String webName;
	private String webPassword;
	public int getWebId() {
		return webId;
	}
	public void setWebId(int webId) {
		this.webId = webId;
	}
	public String getWebName() {
		return webName;
	}
	public void setWebName(String webName) {
		this.webName = webName;
	}
	public String getWebPassword() {
		return webPassword;
	}
	public void setWebPassword(String webPassword) {
		this.webPassword = webPassword;
	}
	public WebUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "WebUser [webId=" + webId + ", webName=" + webName + ", webPassword=" + webPassword + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + webId;
		result = prime * result + ((webName == null) ? 0 : webName.hashCode());
		result = prime * result + ((webPassword == null) ? 0 : webPassword.hashCode());
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
		WebUser other = (WebUser) obj;
		if (webId != other.webId)
			return false;
		if (webName == null) {
			if (other.webName != null)
				return false;
		} else if (!webName.equals(other.webName))
			return false;
		if (webPassword == null) {
			if (other.webPassword != null)
				return false;
		} else if (!webPassword.equals(other.webPassword))
			return false;
		return true;
	}
	
}
