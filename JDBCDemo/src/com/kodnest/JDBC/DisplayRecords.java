package com.kodnest.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayRecords {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Sharu");
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/kodnest";
		String username="root";
		String password="root";
		Connection connection= DriverManager.getConnection(url, username, password);
		//System.out.println(connection+"connection Success");
		//creating the statement
		Statement stmt = connection.createStatement();
		//executing the sql statement
		String str="select* from student";
		ResultSet rs=stmt.executeQuery(str);
		System.out.println("success");
		
	
	}

}
