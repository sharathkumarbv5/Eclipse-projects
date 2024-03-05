package com.kodnest.connection;
import java.sql.*;
import java.util.Scanner;
public class MainApplication {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/kodnest";
		String username="root";
		String password="root";
		String sql="insert into employee values(?,?)";
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the id ");
		int id=scan.nextInt();
		System.out.println("enter the name ");
		String name=scan.next();
		Connection connection= DriverManager.getConnection(url, username, password);
		System.out.println(connection+"~~~~'C'-'o'-'n'-'n'-'e'-'c'-'t'-'i'-'o'-'n'--'S'-'u'-'c'-'c'-'e'-'s'-'s'~~~~");
		PreparedStatement st = connection.prepareStatement(sql);
		st.setInt(1,id);
		st.setString(2, name);
		st.executeUpdate();
		
		System.out.println("~~~'S'-'u'-'c'-'c'-'e'-'s'-'s'~~~");
		st.close();
		scan.close();
		connection.close();
	}
}
