package com.kn.loopings;

import java.util.Scanner;

public class WhileLoop3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! Please enter the n Whole Numbers  :");
		int n = scan.nextInt();
		int i = 0;
		while(i<=n) {
			System.out.println(i);
			i++;			
		}
		scan.close();
	}

}
