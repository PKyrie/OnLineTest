package com.hqyj.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.hqyj.service.SysUserLoginService;
import com.hqyj.service.WebUserLoginService;

public class MyRealm extends AuthorizingRealm{

	@Autowired
	private SysUserLoginService sysUserLoginService;
	
	@Autowired
	private WebUserLoginService webUserLoginService;
	//授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		return null;
	}

	//认证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		MyToken token2 = (MyToken) token;
		String username = token2.getUsername();
		String password = new String(token2.getPassword()).toString(); 
		//加密后的密文
		String pwd = new SimpleHash("Md5", password, username, 1024).toString();
		
		AuthenticationInfo info = null;
		if (token2.getType()==1) {//后端用户
			if (sysUserLoginService.findByNameAndPwd(username, pwd)!=null) {
				//登陆成功
				info = new SimpleAuthenticationInfo(username, password,getName());
			}else {
				throw new AuthenticationException();
			}
		} else {//前端用户
			if (webUserLoginService.findByNameAndPwd(username, pwd)!=null) {
				//登陆成功
				info = new SimpleAuthenticationInfo(username, password,getName());
			}else {
				throw new AuthenticationException();
			}
		}
		return info;
	}

	public static void main(String[] args) {
		System.out.println(new SimpleHash("Md5", "123456", "小柳子", 1024));
	}
	
}
