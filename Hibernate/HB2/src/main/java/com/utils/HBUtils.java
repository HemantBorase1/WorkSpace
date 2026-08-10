package com.utils;

import java.util.Properties;

//import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class HBUtils {
	
	public static SessionFactory sf=new Configuration()
			.setProperties(p1())
			.addAnnotatedClass(Employee.class)
			.buildSessionFactory();

	private static Properties p1() {
		
		Properties p=new Properties();
		p.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		p.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/jap88");
		p.setProperty("hibernate.connection.username", "root");
		p.setProperty("hibernate.connection.password", "password");
		p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		p.setProperty("hibernate.show_sql", "false");
		p.setProperty("hibernate.format_sql", "true");
		
		return p;
		
	}

	
}
