package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.HomeDao;
import com.example.demo.entity.Employee;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	private HomeDao homeDao;
	
	@Override
	public void saveEmployeeData(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("In Service Layer : "+ employee);
		homeDao.saveEmployeeData(employee);
	}

}
