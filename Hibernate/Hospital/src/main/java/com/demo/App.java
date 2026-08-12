package com.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.utils.HBUtils;

import model.Department;

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
        
        Department d=new Department();
        d.setName("");
        d.setPhoneno("");
        d.setSpecialization("");
        tx.commit();
        session.close();
    }
}
