package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfiguration;
import com.dao.Studentdao;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
      Studentdao sd=context.getBean(Studentdao.class);
      
      Student s=new Student();
      s.setName("Hemant");
      s.setCity("Pune");
      s.setPercentage(81.80);
      System.out.println(sd.insertStudent(s));
    }
}
