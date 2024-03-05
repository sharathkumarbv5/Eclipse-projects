package com.kodnest.JDBC;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class UdateRecords {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Sharu");
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/kodnest";
		String username="root";
		String password="root";
		
		String sql="update student set name=? where=?";
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the new name to be set");
		
		String newname=scan.nextLine();
		System.out.println("Enter the ID value where the name needs to updated");
		int newid=scan.nextInt();
	
		
		Connection connection= DriverManager.getConnection(url, username, password);
		
		//System.out.println(connection+"connection Success");
		//creating the statement
		PreparedStatement pt=connection.prepareStatement(sql);	
		pt.setString(1,newname);
		pt.setInt(2,newid);

	int executeUpdate =pt.executeUpdate();
System.out.println("success"+executeUpdate);
	}
}
