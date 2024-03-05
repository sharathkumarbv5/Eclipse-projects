package com.kn.randomsolutions;

import java.util.Scanner;

public class EvenOddDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! Please Enter The Number: ");
		int n = scan.nextInt();
		int sum = 0;
		while(n > 0) {
			int remainder = n % 10;
			int quotient = n / 10;
			n = quotient;
		}
//		if(rem % 2 == 0)
//		{
//			evensum = evensum + rem;
//			
//			System.out.println("Even Number: " +evensum);
//		}
//		else {
//			oddsum = oddsum + rem;
//			}
//			System.out.println("Odd Number: " +oddsum);
//		}
	}}


