package com.kn.cast;

import java.util.Scanner;

public class TypeInfo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of Integers ");
		int a = scan.nextInt();
		System.out.println("The value of Integers is = "+a);
		System.out.println("The value of Byte Is");
		byte b = scan.nextByte();
		System.out.println("The Value of Byte is = "+b);
		System.out.println("The value of Long is");
		long l = scan.nextLong();
		System.out.println("The Value of Long is = "+l);
		System.out.println("The Value of Float is");
		float f = scan.nextFloat();
		System.out.println("The value of float is = " +f);
		System.out.println("The value of double is");
		double d = scan.nextDouble();
		System.out.println("The value of double = "+d);
		System.out.println("The value of boolean is");
		boolean bo = scan.nextBoolean();
		System.out.println("The value of boolean is = "+bo);
		System.out.println ("The value of Char is");
		char ch = scan.next().charAt(0);
		System.out.println("The value of char is =" + ch);
		
		
		
	}

}
