package com.ustglobal.empapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class EmployeeDaoImpl {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		try
		{
			//step1 load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//step 2 get the connection 
			String url = "jdbc:mysql://localhost:3306/ust_data?user=root&password=root";
			conn =DriverManager.getConnection(url);
			
			//step 3 Issue Query
			
			String sql = "  select * from employee";
			stmt = conn.createStatement();
			int count =stmt.executeUpdate(sql);
			
			//step 4 Read the Result
			System.out.println(count + " rows inserted ");
			
		}
		catch(SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)
				{
					conn.close();
				}
				if(stmt != null)
				{
					stmt.close();
				}
				
			} catch(SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
