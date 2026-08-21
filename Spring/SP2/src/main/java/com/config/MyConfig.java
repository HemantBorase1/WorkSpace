package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.model.Student;

@Configuration
public class MyConfig {

	@Bean
	public Student m1() {
		Student s=new Student();
		return s;
		
	}
}
