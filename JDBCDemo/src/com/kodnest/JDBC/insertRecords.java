package com.kodnest.JDBC;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertRecords {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Sharu");
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/kodnest";
		String username="root";
		String password="root";
		Connection connection= DriverManager.getConnection(url, username, password);
		//System.out.println(connection+"connection Success");

		String sql="insert into student values(?,?)";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the ID");
		int id=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the name");
		String name=scan.nextLine();

		
		//creating the statement
		PreparedStatement statement= connection.prepareStatement(sql);
		statement.setInt(1,id);
		statement.setString(2,name);
		int executeUpdate=statement.executeUpdate();
		statement.executeUpdate(executeUpdate +"-success");


		//executing the sql statement
		String str1="insert into student values(2,'sharuu')";
		String str2="insert into student values(3,'sharuu')";
		String str3="insert into student values(4,'sharuu')";
		String str4="insert into student values(5,'sharuu')";
		
//				stmt.execute(str);
//				stmt.execute(str1);
//		
//				stmt.execute(str2);
//				stmt.execute(str3);
//		
//				stmt.execute(str4);


		//		System.out.println("success");
	}

}
