package com.ustglobal.FileHandling;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Propertiesselect {

	public static void main(String[] args) {
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String path = "new.properties";
		FileReader reader = null;
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
				
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
