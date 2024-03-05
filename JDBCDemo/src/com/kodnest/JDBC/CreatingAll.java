package com.kodnest.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatingAll {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Jdbc");
		//loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		//connecting information
String url="jdbc:mysql://localhost/kodnestt";
String username="root";
String password="root";

	
		//estabishing connection
	Connection connection=DriverManager.getConnection(url,username,password);
	System.out.println("connected");
	//create the statement
	Statement stm = connection.createStatement();
	//executing the sql statement
	stm.execute("create table studentt(id int, name varchar(20))");
System.out.println("created table");
}}
