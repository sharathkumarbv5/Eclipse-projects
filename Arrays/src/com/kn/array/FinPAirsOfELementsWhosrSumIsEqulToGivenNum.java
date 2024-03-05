package com.kn.array;

import java.util.Scanner;

public class FinPAirsOfELementsWhosrSumIsEqulToGivenNum {
	public static void main(String[] args) {
		
	
Student st=new Student();
Scanner s=new Scanner(System.in);
System.out.println("enter the name");
String name =s.nextLine();
System.out.println("enter the age");
int age=s.nextInt();
Student.setname(name);
Student.setage(age);
System.out.println(Student.getname(name));
System.out.println(Student.getage(age));
}
}