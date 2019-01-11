package com.hqyj.service;

import com.hqyj.pojo.WebUser;

public interface WebUserLoginService {
	public WebUser findByNameAndPwd(String webName,String webPassword);
}
