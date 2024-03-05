package com.kn.loopings;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! Please print the values of n Numbers :");
		int n = scan.nextInt();
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}while(i<=n);
	scan.close();
	}
	
	

}
