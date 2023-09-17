package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
	public String getLoginData(@RequestParam("uname") String un,@RequestParam String pass,Model model ) {
		System.out.println("Login Credentials : " + un + "  " + pass);
		List<Employee> elist = homeService.getLoginCredentials(un, pass);
		model.addAttribute("list", elist);
		return "success";
	}
	
	@RequestMapping(value = "/reg")
	public String getRegisterData(@ModelAttribute Employee employee ) {
		System.out.println("Register Data : " + employee);
		homeService.saveEmployeeData(employee);
		return "index";
	}
	
	@RequestMapping(value = "/edit")
	public String getEditingData(@RequestParam int id,Model model) {
		System.out.println("Id Check : " + id);
		Employee employee = homeService.getEmployee(id);
		model.addAttribute("emp", employee);
		return "edit";
	}
	
	@RequestMapping(value = "/up")
	public String getUpdatedData(@ModelAttribute Employee employee,Model model) {
		System.out.println("Updated Data : " + employee);
		List<Employee> elist = homeService.getUpdatedData(employee);
		model.addAttribute("list", elist);
		return "success";
	}
}
