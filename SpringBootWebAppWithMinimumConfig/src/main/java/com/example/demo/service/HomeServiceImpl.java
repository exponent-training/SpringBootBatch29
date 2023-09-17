package com.example.demo.service;

import java.util.List;

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

	@Override
	public List<Employee> getLoginCredentials(String uname, String pass) {
		// TODO Auto-generated method stub
		return homeDao.getLoginCredentials(uname, pass);
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return homeDao.getEmployee(id);
	}

	@Override
	public List<Employee> getUpdatedData(Employee employee) {
		// TODO Auto-generated method stub
		return homeDao.getUpdatedData(employee);
	}

}
