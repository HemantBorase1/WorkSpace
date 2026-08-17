package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.dao.StudentDao;
import com.model.Student;
import com.util.MyDatabase;

public class App {
	public static void main(String[] args) {
		StudentDao sd = new StudentDao();
		
	/*
		String[] indianCities = {
				 };
		Random r=new Random();
		for(int i=1;i<=3500;i++) {
			Student s=new Student();
			StringBuilder sb=new StringBuilder();
			for(int j=1;j<=10;j++) {
				sb.append((char)(r.nextInt(26)+65));
			s.setName(sb.toString());
			s.setCity(indianCities[r.nextInt(indianCities.length)]);
			s.setPercentage(r.nextDouble()*100);
			System.out.println(sd.insertStudent(s));
			}
			
		}
		*/
	/*	System.out.println(sd.findStudentByPercentageBetween(10.20, 50.66));
		System.out.println(sd.findStudentByIdAndName(290,"FYFM"));
		System.out.println(sd.findStudentByPercentageNotBetween(0, 20.50));
	*/
		System.out.println(sd.findStudentByNamelike("KR"));
	//	System.out.println(sd.findAllNames("Hemant"));
	}

}
