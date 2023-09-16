package com.example.demo.dao;

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

}
