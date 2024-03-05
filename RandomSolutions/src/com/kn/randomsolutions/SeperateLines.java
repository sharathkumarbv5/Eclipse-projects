package com.kn.randomsolutions;

import java.util.Scanner;

public class SeperateLines {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("User! Please Enter The Number:");
		int n = scan.nextInt();
		while (n > 0) {
			int remainder = n % 10;
			int quotient = n / 10;
			n = quotient;
			System.out.println(remainder);
		}
		scan.close();
	}

}
