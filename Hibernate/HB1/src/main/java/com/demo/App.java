package com.demo;

import org.hibernate.cfg.Configuration;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.model.Student;

public class App {
	public static void main(String[] args) {
		
		Configuration con = new Configuration().configure();
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Student s=new Student();
		s.setName("Hemant");
		s.setAddress("Jalgoan");
		s.setPercentage(81.80);
	    session.save(s);
		tx.commit();
		session.close();
	}
}
