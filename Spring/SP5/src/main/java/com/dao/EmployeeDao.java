package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.model.Employee;
import com.model.EmployeeRowMapper;

@Component
public class EmployeeDao {

	@Autowired
	private JdbcTemplate j;
	
	public int insertEmployee(Employee e) {
	
		String sql="insert into Employee(name,designation,company,salary) values (?,?,?,?)";
		return j.update(sql, new Object[] {e.getName(),e.getDesignation(),e.getCompany(),e.getSalary()});
	}
	
	public int deleteEmployeeById(int id) {
		String sql="delete from Employee where id=?";
		return j.update(sql,id);
	}
	
	public Employee findEmployeeById(int id) {
		String sql="select * from Employee where id=?";
		List<Employee> list=j.query(sql, new EmployeeRowMapper(),id);
		return (!list.isEmpty())?list.get(0):null;
	}
	
	public List<Employee> findAllEmployee(){
		String sql="select * from Employee";
		return j.query(sql, new EmployeeRowMapper());
	}
	
	public int updateEmployee(Employee e) {
		String sql="update Employee set name=?,designation=?,company=?,salary=? where id=?";
		return j.update(sql,new Object[] {e.getName(),e.getDesignation(),e.getCompany(),e.getSalary(),e.getId()});
	}
}
