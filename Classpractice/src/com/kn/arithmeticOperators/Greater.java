package com.kn.arithmeticOperators;

import java.util.Scanner;

public class Greater {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the integer values");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int lowernumber=Math.min(a,b);
		System.out.println("The Lesser value ="+lowernumber);
		scan.close();

	}
	
}
