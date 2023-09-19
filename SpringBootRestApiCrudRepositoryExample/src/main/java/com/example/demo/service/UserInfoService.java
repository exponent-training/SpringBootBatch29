package com.example.demo.service;

import com.example.demo.model.UserInfo;

public interface UserInfoService {

	void saveUserInfoData(UserInfo userInfo);
	
	UserInfo getLoginData(String uname,String pass);
}
