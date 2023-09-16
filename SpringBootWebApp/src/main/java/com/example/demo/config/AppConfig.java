package com.example.demo.config;

import java.util.Properties;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.example.demo.entity.Student;

@Configuration
public class AppConfig {
	
	@Value(value = "${db.driverClass}")
	private String dbClass;
	
	@Value(value = "${db.url}")
	private String url;
	
	@Value(value = "${db.username}")
	private String username;
	
	@Value(value = "${db.password}")
	private String password;
	
	@Value(value = "${hibernate.dialect}")
	private String dialect;
	
	
	@Value(value = "${hibernate.show_sql}")
	private String show_sql;
	
	@Value(value = "${hibernate.hbm2ddl}")
	private String hbm2ddl;

//	@Bean
//	public InternalResourceViewResolver viewResolver() {
//		InternalResourceViewResolver ivr = new InternalResourceViewResolver();
//		ivr.setSuffix(".jsp");
//		return ivr;
//	}
	
	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(dbClass);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
		sf.setDataSource(getDataSource());
		
		Properties properties = new Properties();
		properties.setProperty(Environment.DIALECT, dialect);
		properties.setProperty(Environment.SHOW_SQL, show_sql);
		properties.setProperty(Environment.HBM2DDL_AUTO, hbm2ddl);
		
		sf.setHibernateProperties(properties);
		sf.setAnnotatedClasses(Student.class);
		
		return sf;
	}
}
