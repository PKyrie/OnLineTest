package com.hqyj.service;

import javax.servlet.http.HttpServletRequest;


import com.hqyj.pojo.SysUser;

public interface SysUserLoginService {
	
	public static final String SUCCESS = "success";
	
	public SysUser findByNameAndPwd(String sysName,String sysPassword);
	
	public String doLogin(HttpServletRequest request);
}
