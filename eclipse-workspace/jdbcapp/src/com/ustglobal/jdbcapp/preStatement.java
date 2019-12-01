package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;
import java.sql.PreparedStatement;

public class preStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
	     PreparedStatement pstmt =null;
	     try {
	    	 
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url = "jdbc:mysql://localhost:3306/ust_data?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			String sql = "insert into employee values(?,?,?,?)";
		
			pstmt = conn.prepareStatement(sql);
			String empid = args[0];
			int id = Integer.parseInt(empid);
			
			String name = args[1];
			pstmt.setString(2, name);
			
			String empsal = args[2];
			int salary =Integer.parseInt(empsal);
			
			pstmt.setInt(3, salary);
			
			String gender = args[3];
			pstmt.setString(4, gender);
			
			int count =pstmt.executeUpdate();
			
	    	 System.out.println(count+ " row executed");
	    	 
	    	 
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	     
	}

}
