package com.ustglobal.FileHandling;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class MyFirstJDBCWithProperties {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		FileReader reader = null;
		
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			//Step1 load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//Step2 get the connection 
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);
			
			//step 3 Issue Sql Query
			
			
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
