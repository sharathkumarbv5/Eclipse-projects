package com.kn.arithmeticOperators;

import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the four float values");
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		float c = scan.nextFloat();
		float d = scan.nextFloat();
		System.out.println("the sum is = "+(a+b));
		System.out.println("the difference is ="+(a-b));
		System.out.println("the product is ="+(a*b));
		System.out.println("the quotient is ="+(a/b));
		System.out.println("the remainder is ="+(a%b));
		
	}

}
