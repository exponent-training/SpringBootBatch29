package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public class HomeDaoImpl implements HomeDao{

	@Autowired
	private SessionFactory sf;
	
	@Override
	public void saveEmployeeData(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("in Dao Layer : " + employee);
		Session session = sf.openSession();
		session.save(employee);
		session.beginTransaction().commit();
	}

	@Override
	public List<Employee> getLoginCredentials(String uname, String pass) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<Employee>(); 
		if("admin".equals(uname) && "admin".equals(pass)) {
		  Session session = sf.openSession();
		  list = session.createQuery("from Employee").getResultList();
		}
		
		 return list;
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Employee employee = session.get(Employee.class, id);
		return employee;
	}

	@Override
	public List<Employee> getUpdatedData(Employee employee) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(employee);
		session.getTransaction().commit();
		List<Employee> list = session.createQuery("from Employee").getResultList();
		return list;
	}
	

}
