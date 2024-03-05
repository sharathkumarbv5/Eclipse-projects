package com.kn.randomsolutions;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! Please Enter the Factorial Number : ");
		int n = scan.nextInt();
		int factorial = 1;
		for(int i = 1; i<=n; i++) {
			factorial =( factorial * i );
		}
			System.out.println("The Factorial of the given number is: " +factorial);
			scan.close();
	}
}
		
				
	
	


