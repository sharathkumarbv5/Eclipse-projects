package com.kodnest.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class MainApp {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Sharu");
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/kodnest5";
		String username="root";
		String password="root";
		Connection connection= DriverManager.getConnection(url, username, password);
		String sql="insert into student5 values(?,?)";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=scan.nextLine();
		System.out.println("Enter the age");
		int age=scan.nextInt();
		Student st=new Student(name ,age);
		String sname=st.getName();
		int sage=st.getAge();
		connection.setAutoCommit(false);
		//creating the statement
		PreparedStatement statement= connection.prepareStatement(sql);
		statement.setString(1,sname);
		statement.setInt(2,sage);
		int executeUpdate=statement.executeUpdate();
		statement.executeUpdate(executeUpdate +"-success");
		//executing the sql statement
		//			String str="insert into student5 values('sharu',25)";
		//	     statement.execute(str);
		scan.close();
	}

}
