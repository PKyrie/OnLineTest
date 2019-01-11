package com.hqyj.dao;

import org.apache.ibatis.annotations.Param;

import com.hqyj.pojo.SysUser;

public interface SysUserLogin {
	public SysUser findByNameAndPwd(@Param("sysName")String sysName,@Param("sysPassword")String sysPassword);
}
