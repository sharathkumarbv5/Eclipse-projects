package com.kn.loopings;

import java.util.Scanner;

public class WhileLoop2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! Please enter the n Natural Numbers value :");
		int n = scan.nextInt();
		int i = 1;
		while(i<=n) {
			System.out.println(i);
			i++;			
		}
		scan.close();
		
	}

}
