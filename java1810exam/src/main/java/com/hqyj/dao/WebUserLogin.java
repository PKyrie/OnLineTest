package com.hqyj.dao;

import org.apache.ibatis.annotations.Param;

import com.hqyj.pojo.WebUser;

public interface WebUserLogin {
	public WebUser findByNameAndPwd(@Param("webName")String webName,@Param("webPassword")String webPassword);
}
