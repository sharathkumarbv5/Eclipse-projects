package com.kn.loopings;

import java.util.Scanner;

public class WhileLoop4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! Please enter the Number to be Multiplied");
		int n = scan.nextInt();
		int i = 1;
		while(i <= 10) {
			System.out.println(n + "*" + i + "=" + (n*i));
			i++;
		}
		scan.close();
	}

}
