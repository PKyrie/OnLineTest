package com.hqyj.aspect;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.jni.Thread;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.hqyj.dao.SysUserLogDao;
import com.hqyj.pojo.SysUserLog;
import com.hqyj.service.SysUserLoginService;
import com.hqyj.service.SysUserService;

@Aspect
@Component
public class SysUserLogAspect {
	
	@Resource
	private SysUserLogDao sysUserLogDao;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
	
	private Executor doLogThread = Executors.newSingleThreadExecutor();
	
	@AfterReturning(value="execution(* com.hqyj.service.SysUserLoginService.doLogin(..))",returning="result")
	public void doLog(JoinPoint jp,String result){
		if (SysUserLoginService.SUCCESS.equals(result)) {
			Object[] args = jp.getArgs();
			if (args.length==1 && args[0] instanceof HttpServletRequest) {
				HttpServletRequest request = (HttpServletRequest)args[0];
				SysUserLog sysUserLog = new SysUserLog();
				sysUserLog.setSysUserLogId(UUID.randomUUID().toString());
				sysUserLog.setSysUserName(request.getParameter("name"));
				Date date = new Date();
				sysUserLog.setSysUserLogDate(sdf.format(date));
				sysUserLog.setSysUserAddress(request.getRemoteAddr());
				doLogThread.execute(()->{
					sysUserLogDao.insertNewLog(sysUserLog);
					try {
						java.lang.Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				});
				
				
			}
		}
	}
	
}
