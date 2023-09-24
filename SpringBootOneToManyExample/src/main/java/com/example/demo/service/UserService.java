package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.model.User;

public interface UserService {

	void saveUserInfo(User user);
	
	void buyProduct(String email,Product product);
	
	User getUserUsingId(int id);
}
