package com.example.demo.service;

import java.util.List;

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


	@Override
	public List<UserInfo> getAllData() {
		// TODO Auto-generated method stub
		List<UserInfo> ulist = (List<UserInfo>)userInfoRepository.findAll();
		return ulist;
	}


	@Override
	public UserInfo getEditData(int id) {
		// TODO Auto-generated method stub
		UserInfo userInfo = userInfoRepository.findById(id).get();
		return userInfo;
	}


	@Override
	public void updateUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		userInfoRepository.save(userInfo);
	}


	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		userInfoRepository.deleteById(id);
	}
}
