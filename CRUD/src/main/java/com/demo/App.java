package com.demo;

import com.dao.Studentdao;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
     
      Studentdao sd=new Studentdao();
      
      Student s=new Student();
   /*   s.setName("Atharva");
      s.setCity("Yavatmal");
      s.setPercentage(80.80);
      System.out.println(sd.insertStudent(s));
    */
     // System.out.println(sd.deleteStudentById(2));
      
    s=sd.findStudentById(1);
     s.setName("Hemant");
     System.out.println(sd.updateStudent(s));
     System.out.println(sd.findStudentById(1));
    }
}
