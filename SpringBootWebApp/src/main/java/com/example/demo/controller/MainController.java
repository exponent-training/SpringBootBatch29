package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Student;

@Controller
public class MainController {
	
	@RequestMapping(value = "/")
    public String getIndexPage() {
		return "index";
	}
	
	@RequestMapping(value = "/log")
	public String getLoginData(@RequestParam String uname,@RequestParam String pass) {
		System.out.println("Login Data Check :  " + uname + "  " + pass);
		return "success";
	}
	
	@RequestMapping(value = "/reg")
	public String getRegisterData(@ModelAttribute Student student) {
		System.out.println("Register Data : " + student);
		return "index";
	}
}
