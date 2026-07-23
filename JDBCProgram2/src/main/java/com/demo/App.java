package com.demo;

import com.dao.StudentDao;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
       StudentDao sd=new StudentDao();
       Student s=new Student();
       s.setName("Ganesh");
       s.setCity("Nagpur");
       s.setPercentage(77.12);
       System.out.println(sd.insertStudent(s));
    }
}
