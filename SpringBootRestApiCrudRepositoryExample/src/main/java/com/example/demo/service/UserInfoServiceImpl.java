package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserInfo;
import com.example.demo.repo.UserInfoRepository;

@Service
public class UserInfoServiceImpl implements UserInfoService{

	@Autowired
	private UserInfoRepository userInfoRepository;
	
	@Override
	public void saveUserInfoData(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("In Service Layer : " + userInfo);
		userInfoRepository.save(userInfo);
	}


	@Override
	public UserInfo getLoginData(String uname, String pass) {
		// TODO Auto-generated method stub
		System.out.println("In Service Layer : " + uname + "  " + pass);
		UserInfo userInfo = userInfoRepository.findByUnameAndPass(uname, pass);
		return userInfo;
	}
}
