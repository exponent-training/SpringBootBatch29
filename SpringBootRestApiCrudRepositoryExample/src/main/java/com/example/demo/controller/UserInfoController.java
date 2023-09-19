package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserInfo;
import com.example.demo.service.UserInfoService;

@RestController
public class UserInfoController {

	@Autowired
	private UserInfoService userInfoService;
	
	@PostMapping(value = "/reg")
	public String getRegisterationData(@RequestBody UserInfo userInfo) {
		System.out.println("Data :" + userInfo);
		userInfoService.saveUserInfoData(userInfo);
		return "UserInfo Registered...!";
	}
	
	@GetMapping(value = "/log")
    public UserInfo getLoginData(@RequestParam String uname,@RequestParam String pass) {
		System.out.println("Login Credentials : " + uname + "  " + pass);
		UserInfo userInfo = userInfoService.getLoginData(uname, pass);
		return userInfo;
	}
	
}
