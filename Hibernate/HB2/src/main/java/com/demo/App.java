package com.demo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.dao.EmployeeDao;
import com.model.Employee;
import com.utils.HBUtils;

public class App {
	
	private static List<Employee> pagination2(Session session,int page){
		int size=10;
		Query<Employee> q=session.createQuery("from Employee",Employee.class);
		q.setFirstResult((page-1)*size);
		q.setMaxResults(size);
		return q.list();
	}
	
    public static void main(String[] args) {

    	
    	EmployeeDao e=new EmployeeDao();
    	List<Employee> list= e.findHighestSalariedEmployee();
    	for(Employee em:list) {
    		System.out.println(em);
    	}
    	
    	
    	
    	
    	
    	
    	
//        Session session = HBUtils.sf.openSession();
//        Transaction tx = session.beginTransactio();
//        tx.commit();
//        session.close();
    }
}