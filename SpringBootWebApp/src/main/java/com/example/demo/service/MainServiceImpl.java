package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MainDao;
import com.example.demo.entity.Student;

@Service
public class MainServiceImpl implements MainService{

	@Autowired
	private MainDao mainDao;
	
	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println("In Service Layer : " +student);
		mainDao.saveStudent(student);
	}

}
