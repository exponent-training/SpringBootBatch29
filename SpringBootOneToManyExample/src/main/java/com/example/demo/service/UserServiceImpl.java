package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.model.User;
import com.example.demo.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void saveUserInfo(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public void buyProduct(String email, Product product) {
		// TODO Auto-generated method stub
		User user = userRepository.findByEmail(email);
		if(user != null) {
			user.getList().add(product);
			userRepository.save(user);
		}
	}

	@Override
	public User getUserUsingId(int id) {
		// TODO Auto-generated method stub
		User user = userRepository.findById(id).get();
		return user;
	}

}
