package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Student;
import com.util.MyDatabase;

public class StudentDao {

	public int insertStudent(Student s) {
		int check=0;
		
		Connection con=MyDatabase.createConnection();
		PreparedStatement pst=null;
		String sql="insert into Student(name,city,percentage)values(?,?,?)";
		try {
			pst=con.prepareStatement(sql);
			pst.setString(1,s.getName());
			pst.setString(2,s.getCity());
			pst.setDouble(3,s.getPercentage());
			check=pst.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			MyDatabase.closeConnection(pst, con);
		}
		
		return check;
	}
}
