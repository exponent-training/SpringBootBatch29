package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {

	
	void saveEmployeeInfo(Employee employee);
	
	List<Employee> getAll();
	
	
}
