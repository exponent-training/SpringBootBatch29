package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Employee;
import com.example.demo.service.HomeService;

@Controller
public class HomeController {
	
	@Autowired
	private HomeService homeService;

	@RequestMapping(value = "/")
	public String getIndexPage() {
		
		return "index";
	}
	
	@RequestMapping(value = "/log")
	public String getLoginData(@RequestParam("uname") String un,@RequestParam String pass ) {
		System.out.println("Login Credentials : " + un + "  " + pass);
		return "success";
	}
	
	@RequestMapping(value = "/reg")
	public String getRegisterData(@ModelAttribute Employee employee ) {
		System.out.println("Register Data : " + employee);
		homeService.saveEmployeeData(employee);
		return "index";
	}
}
