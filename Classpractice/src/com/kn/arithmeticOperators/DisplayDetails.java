package com.kn.arithmeticOperators;

import java.util.Scanner;

public class DisplayDetails {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the details of the person");
		System.out.println("enter the age of the person = ");
		int age = scan.nextInt();
		System.out.println("enter the name of the person = ");
		String name = scan.next();
		System.out.println("Enter the contact details of the person = ");
		long contact = scan.nextLong();
		System.out.println("Age= "+ age );
		System.out.println("Name= "+ name );
		System.out.println("Contact= "+ contact );
		scan.close();
	}

}
