package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckProfileController {

	@Value(value = "${myapp}")
	private String myapp;
	
	@GetMapping(value = "/check")
	public String getProfileData() {
		return "My Active Profile Is : "+ myapp;
	}
}
