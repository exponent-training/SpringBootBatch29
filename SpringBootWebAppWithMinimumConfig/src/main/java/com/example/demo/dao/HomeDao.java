package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Employee;

public interface HomeDao {

	void saveEmployeeData(Employee employee);
	
	List<Employee> getLoginCredentials(String uname,String pass);
	
	Employee getEmployee(int id);
	
	List<Employee> getUpdatedData(Employee employee);


}
