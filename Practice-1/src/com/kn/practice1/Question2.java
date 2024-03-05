package com.kn.practice1;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" User! Please enter the value 1: = ");
		long a1 = scan.nextLong();
		
		System.out.println(" User! Please enter the value 2: = ");
		long a2 = scan.nextLong();
		long quotient = a1 / a2;
		long remainder = a1 % a2;
		System.out.println("the quotient is = " + quotient);
		System.out.println("the remainder is = " + remainder);
		
	}

}
