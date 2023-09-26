package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailSendingConrtoller {
	
	@Autowired
	JavaMailSender javaMailSender;

	@GetMapping(value = "/sendMail")
	public String sendingEmail() {
		
		SimpleMailMessage message = new SimpleMailMessage();
		
		message.setCc("ajasshaikh8390@gmail.com");
		message.setSubject("This is test mail.");
		message.setText("Hi Team, This is testing mail.");
		
		javaMailSender.send(message);
		
		return "Successfully Send.";
	}
}
