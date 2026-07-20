package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args )
    {
       Connection con=null;
       PreparedStatement pst=null;
       int check=0;
       try {
    	   Class.forName("com.mysql.cj.jdbc.Driver");
    	   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jap88", "root", "password");
    	   String sql="insert into user(name,city)values('Pratik','Nagpur')";
    	   pst=con.prepareStatement(sql);
    	   check=pst.executeUpdate();
    	   System.out.println("Connected Successfully");
       }catch(SQLException | ClassNotFoundException e) {
    	   e.printStackTrace();
       }finally {
    	   try {
    		   pst.close();
    		   con.close();
    	   }catch (SQLException e) {
    		   e.printStackTrace();
    	   }
       }
       System.out.print(check);
    }
}
