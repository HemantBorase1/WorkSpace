package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfiguration;
import com.dao.EmployeeDao;
import com.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
        
        EmployeeDao ed=context.getBean(EmployeeDao.class);
        
        Employee e=new Employee();
        e.setName("PD");
        e.setDesignation("Java Developer");
        e.setCompany("Dixit Jwellers");
        e.setSalary(1000.14);
        System.out.println(ed.insertEmployee(e));
        
    }
}
