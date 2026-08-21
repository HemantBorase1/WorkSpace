package com.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee> {
	

	public Employee mapRow(ResultSet rs,int rowNum) throws SQLException{
		Employee e=new Employee();
		e.setId(rs.getInt("id"));
		e.setName(rs.getString("name"));
		e.setCompany(rs.getString("company"));
		e.setDesignation(rs.getString("designation"));
		e.setSalary(rs.getDouble("salary"));
		return e;
	}
}
