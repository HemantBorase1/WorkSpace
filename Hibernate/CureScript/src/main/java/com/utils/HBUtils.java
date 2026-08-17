package com.utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Disease;
import com.model.Medicine;
import com.model.NaturalRemedy;
import com.model.Notification;
import com.model.OCRResult;
import com.model.Pharmacist;
import com.model.Pharmacy;
import com.model.Prescription;
import com.model.PriceListing;
import com.model.User;



public class HBUtils {
	
	public static SessionFactory sf=new Configuration()
			.setProperties(p1())
			.addAnnotatedClass(Disease.class)
			.addAnnotatedClass(Medicine.class)
			.addAnnotatedClass(NaturalRemedy.class)
			.addAnnotatedClass(Notification.class)
			.addAnnotatedClass(OCRResult.class)
			.addAnnotatedClass(Pharmacist.class)
			.addAnnotatedClass(Pharmacy.class)
			.addAnnotatedClass(Prescription.class)
			.addAnnotatedClass(PriceListing.class)
			.addAnnotatedClass(User.class)
			.buildSessionFactory();

	private static Properties p1() {
		
		Properties p=new Properties();
		p.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		p.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/CureScript");
		p.setProperty("hibernate.connection.username", "root");
		p.setProperty("hibernate.connection.password", "password");
		p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		p.setProperty("hibernate.show_sql", "true");
		p.setProperty("hibernate.format_sql", "true");
		
		return p;
		
	}

	
}
