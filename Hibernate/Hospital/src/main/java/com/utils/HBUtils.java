package com.utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import model.Bed;
import model.Bill;
import model.Department;
import model.Doctor;
import model.Patient;
import model.Receptionist;
import model.Staff;
import model.Ward;


public class HBUtils {
	
	public static SessionFactory sf=new Configuration()
			.setProperties(p1())
			.addAnnotatedClass(Department.class).addAnnotatedClass(Doctor.class).addAnnotatedClass(Ward.class)
			.addAnnotatedClass(Bed.class).addAnnotatedClass(Patient.class).addAnnotatedClass(Staff.class)
			.addAnnotatedClass(Bill.class).addAnnotatedClass(Receptionist.class)
			.buildSessionFactory();

	private static Properties p1() {
		
		Properties p=new Properties();
		p.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		p.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/hospital");
		p.setProperty("hibernate.connection.username", "root");
		p.setProperty("hibernate.connection.password", "password");
		p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		p.setProperty("hibernate.show_sql", "true");
		p.setProperty("hibernate.format_sql", "true");
		
		return p;
		
	}

	
}
