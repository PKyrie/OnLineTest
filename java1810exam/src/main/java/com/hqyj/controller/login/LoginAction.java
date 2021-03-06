package com.hqyj.controller.login;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hqyj.service.SysUserLoginService;
import com.hqyj.shiro.MyToken;

@Controller
public class LoginAction {
	@Resource
	private SysUserLoginService sysUserLoginService;
	@RequestMapping("/login")
	@ResponseBody
	public String dologin(HttpServletRequest request){
		return sysUserLoginService.doLogin(request);
	}
}
