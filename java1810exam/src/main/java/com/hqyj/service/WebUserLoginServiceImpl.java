package com.hqyj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.WebUserLogin;
import com.hqyj.pojo.WebUser;
@Service
public class WebUserLoginServiceImpl implements WebUserLoginService {
	@Autowired
	private WebUserLogin webUserLogin;
	@Override
	public WebUser findByNameAndPwd(String webName, String webPassword) {
		// TODO Auto-generated method stub
		return webUserLogin.findByNameAndPwd(webName, webPassword);
	}

}
