package com.example.demo.service;

import java.util.List;

import com.example.demo.model.UserInfo;

public interface UserInfoService {

	void saveUserInfoData(UserInfo userInfo);
	
	UserInfo getLoginData(String uname,String pass);
	
	List<UserInfo> getAllData();
	
	UserInfo getEditData(int id);
	
	void updateUserInfo(UserInfo userInfo);
	
	void deleteData(int id);
}
