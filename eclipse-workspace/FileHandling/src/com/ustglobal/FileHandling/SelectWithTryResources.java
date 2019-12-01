package com.ustglobal.FileHandling;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectWithTryResources {

	public static void main(String[] args) {

		try(FileReader reader = new FileReader(new.properties);)
		{
			Class.forName(prop.getProperty("driver-class-name"));
			String url = prop.getProperty("url");
			String sql = prop.getProperty("select-query");
			
			try(Connection conn = DriverManager.getConnection(url,prop);
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(sql)){
				while(rs.next()) {
					System.out.println("id "+rs.getInt("id"));
					System.out.println("name "+rs.getString("name"));
					System.out.println("salary "+rs.getString("sal"));
					System.out.println("gender "+rs.getString("gender"));
				}
				
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
