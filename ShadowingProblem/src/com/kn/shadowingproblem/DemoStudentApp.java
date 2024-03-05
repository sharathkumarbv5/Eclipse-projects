package com.kn.shadowingproblem;

import java.io.InputStream;
import java.util.Scanner;

public class DemoStudentApp {

	public static void main(String[] args) {
		 
		
		Scanner scan = Scanner(System.in);
		System.out.println("User!");
		System.out.println("please enter the name :");
		String name = scan.next();
		System.out.println("enter the age :");
		int age = scan.nextInt();
		System.out.println();
		Student s = new Student ("Lp Reddy", 23, 54, "Banglore", 'M', 45.45f, 935362);
		System.out.println(s.name); 
		System.out.println(s.age);
		System.out.println(s.id);
		System.out.println(s.place);
		System.out.println(s.gender);
		System.out.println(s.marks);
		System.out.println(s.contact_number);
	
	
	}

	private static Scanner Scanner(InputStream in) {
		return null;
	}

}
