package com.hqyj.controller.web;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hqyj.shiro.MyToken;

@Controller(value="webloginaction")
@RequestMapping("/web")
public class LoginAction {
	
	@RequestMapping("/login")
	public String login(){
		return "web/login";
	}
	
	@RequestMapping("/exam")
	public String exam(){
		return "web/exam";
	}
	
	@RequestMapping("/dologin")
	@ResponseBody
	public String dologin(String name,String password){
		Subject currentUser = SecurityUtils.getSubject();
		//登陆逻辑
		if (!currentUser.isAuthenticated()) {
			MyToken token = new MyToken(name, password);
			token.setType(0);//标识为前端登陆
			token.setRememberMe(true);
			try {
				//执行登陆逻辑
				currentUser.login(token);
			} catch (AuthenticationException e) {
				// TODO: handle exception
				return "fail";
			}
		}
		return "success";
	}
}
