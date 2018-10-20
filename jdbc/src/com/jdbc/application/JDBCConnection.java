package com.jdbc.application;


import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConnection {
	
	private static final String url="jdbc:mysql://localhost:3306/jdbc";
	private static final String user="root";
	private static final String password="123456";
	
	
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = (Connection) DriverManager.getConnection(url,user,password);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select id,name from user"); 
		
		while(rs.next()){
			System.out.println("id : "+rs.getInt("id")+" , "+"name : "+rs.getString("name")+" ");
		}
	}
}
