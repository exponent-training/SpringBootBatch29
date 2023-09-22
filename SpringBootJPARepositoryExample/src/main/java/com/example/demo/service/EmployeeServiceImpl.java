package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void saveEmployeeInfo(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("In Service Layer : " + employee);
		employeeRepository.save(employee);

	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

}
