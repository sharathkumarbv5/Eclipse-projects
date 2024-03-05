package com.kodnest.project1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BankInsert {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			System.out.println("jdbc");
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost/kodnest";
			String username="root";
			String password="root";
			Connection connection= DriverManager.getConnection(url, username, password);
			String sql="insert into bank values(?,?,?)";
			Scanner s=new Scanner(System.in);
			System.out.println("enter the ID");
			int id=s.nextInt();
			s.nextLine();
			System.out.println("Enter the name");
			String name=s.nextLine();
			s.nextLine();
			System.out.println("Enter the balance");
			int bal=s.nextInt();
			PreparedStatement p=connection.prepareStatement(sql);
			p.setInt(1, id);
			p.setString(2, name);
			p.setInt(3, bal);
			int u=p.executeUpdate();
			System.out.println("successfully inserted"+u);
		    s.close();
	}

}
