package com.kodnest.JDBC;
import java.sql.Connection;
import java.sql.Statement;

import java.sql.DriverManager;
import java.sql.SQLException;
public class DelRecord {

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
				String str="update student set name='sharathu' where id=3";
		System.out.println("success");
			
	}

}
