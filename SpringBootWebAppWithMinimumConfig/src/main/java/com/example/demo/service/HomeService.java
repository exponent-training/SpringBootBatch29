package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;


public interface HomeService {

	void saveEmployeeData(Employee employee);
	
	List<Employee> getLoginCredentials(String uname,String pass);
	
	Employee getEmployee(int id);
	
	List<Employee> getUpdatedData(Employee employee);
}
