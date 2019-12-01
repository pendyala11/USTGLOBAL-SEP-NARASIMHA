package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class UpdateQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Connection conn = null;
     Statement stmt = null;
     
     try {
	     
   
    Driver driver = new Driver();
    
    DriverManager.registerDriver(driver);
    
    String url ="jdbc:mysql://localhost:3306/ust_data?user=root&password=root";
    conn=DriverManager.getConnection(url);
    
    String sql = " update employee set name='kohli' where id=1 ";
    stmt = conn.createStatement();
    int count =stmt.executeUpdate(sql);
    
  //step 4 Read the Result
	System.out.println(count + " rows updated ");
    	 
    	 
	} catch(SQLException e) {
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
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
	}
     
     
	}

}
