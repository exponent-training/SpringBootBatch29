package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	
	@GetMapping(value = "/getAll")
    public List<UserInfo> getAllData() {
		List<UserInfo> userInfoList = userInfoService.getAllData();
		return userInfoList;
	}
	
	@GetMapping(value = "/get/{id}")
	public UserInfo getEditedData(@PathVariable("id") int id) {
		System.out.println("Check Id : " + id);
		UserInfo userInfo = userInfoService.getEditData(id);
		return userInfo;
	}
	
	@PutMapping(value = "/up")
	public String updateUserInfo(@RequestBody UserInfo userInfo) {
		System.out.println("Updated User info : " + userInfo);
		userInfoService.updateUserInfo(userInfo);
		return "UserInfo updated Successfully.";
	}
	
	@DeleteMapping(value = "/del/{id}")
	public String  getDeletedData(@PathVariable("id") int id) {
		System.out.println("Check Id : " + id);
	    userInfoService.deleteData(id);
		return "Successfully Deleted";
	}
}
