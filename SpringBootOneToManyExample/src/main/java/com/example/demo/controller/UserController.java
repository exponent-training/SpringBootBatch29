package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/saveUser")
	public String saveUsedrInfo(@RequestBody User user) {
		System.out.println("In controller User Info : " + user);
		userService.saveUserInfo(user);
		return "User Added.";
	}
	
	@GetMapping(value = "/{email}/buyProduct")
	public String buyProduct(@PathVariable String email,@RequestBody Product product) {
		System.out.println("Check All Data : " + email + "  " + product);
		userService.buyProduct(email, product);
		return "Product Buy.";
	}
	
	@GetMapping(value = "/getUser/{id}")
	public User getUserData(@PathVariable int id) {
	 	System.out.println("Check User Id : " + id);
        User user = userService.getUserUsingId(id);
        return user;
	}
}
