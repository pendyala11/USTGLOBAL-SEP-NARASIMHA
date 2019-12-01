package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;


public class DynamicSelectQuery {
	public static void main(String[] args) {
		String url ="jdbc:mysql://localhost:3306/ust_data?user=root&password=root";
		String sql ="select * from employee where id=?";
		Connection conn = null;
	     PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			conn =DriverManager.getConnection(url);
			
			pstmt = conn.prepareStatement(sql);
			
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1,id);
		
			rs = pstmt.executeQuery();
			
			if(rs.next())
			{
				int id = rs.getInt("id");
				int salary = rs.getInt("salary");
				String name = rs.getString("gender");
				String gender = rs.getString("gender");
				
				System.out.println("id "+id);
				System.out.println("name is "+name);
				System.out.println("salary is" +salary);
				System.out.println(" gender is "+gender);
				System.out.println(" *************************************");
				
			}
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(conn!=null)
			{
				conn.close();
			}
			if(pstmt!=null)
			{
				pstmt.close();
				
			}
			
				
		}
		

	}

}
