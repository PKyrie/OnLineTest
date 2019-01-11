package com.hqyj.service;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.SysUserLogin;
import com.hqyj.pojo.SysUser;
import com.hqyj.shiro.MyToken;
@Service
public class SysUserLoginServiceImpl implements SysUserLoginService {
	
	@Autowired
	private SysUserLogin sysUserLogin;
	@Override
	public SysUser findByNameAndPwd(String sysName, String sysPassword) {
		// TODO Auto-generated method stub
		return sysUserLogin.findByNameAndPwd(sysName, sysPassword);
	}
	@Override
	public String doLogin(HttpServletRequest request) {
		// 1.获取验证码，校验，如果成功，执行登陆，如果失败，返回
		String code = request.getParameter("code");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String serverCode = (String) request.getSession().getAttribute("piccode");
		if (serverCode.equalsIgnoreCase(code)) {
			// 验证码正确
			// 执行登陆逻辑
			Subject currentUser = SecurityUtils.getSubject();
			// 登陆逻辑
			if (!currentUser.isAuthenticated()) {
				// 是否被登陆过
				// UsernamePasswordToken用于存放当前的账号和密码
				MyToken token = new MyToken(name, password);
				token.setRememberMe(true);
				try {
					currentUser.login(token);
				} catch (AuthenticationException e) {
					// TODO: handle exception
					return "fail";
				}
			}
			return "success";
		} else {
			return "error";
		}
	}

}
