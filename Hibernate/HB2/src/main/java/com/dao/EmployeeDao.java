package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.model.Employee;
import com.utils.HBUtils;

public class EmployeeDao {

	private Session session=HBUtils.sf.openSession();
	private Transaction tx=session.beginTransaction();
	
	private void closeConnection() {
		tx.commit();
		session.close();
	}
	public List<Employee> findHighestSalariedEmployee(){
		
		List<Employee> list=session.createCriteria(Employee.class)
				.add(Restrictions.eq("salary",session.createCriteria(Employee.class)
						.setProjection(Projections.max("salary"))
						.uniqueResult()))
				        .list();
		         closeConnection();
		
		return list;
	}
}
