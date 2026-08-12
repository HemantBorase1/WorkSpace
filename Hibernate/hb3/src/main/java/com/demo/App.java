package com.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Gift;
import com.model.Laptop;
import com.model.Student;
import com.utils.HBUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     
    	Session session=HBUtils.sf.openSession();
    	Transaction tx=session.beginTransaction();
    	
    	
        Gift g=session.get(Gift.class, 3);
        System.out.println(g.getStudent());
    	
//    	Laptop l=session.get(Laptop.class, 3);
//    	Student s=session.get(Student.class, 2);
//    	
//    	
//    	System.out.println(l.getStudent());
//    	System.out.println(s.getLaptop());
    	tx.commit();
    	session.close();
    }
}
