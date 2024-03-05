package com.kn.loopings;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! Please enter the Number to be Multiplied");
		int n = scan.nextInt();
		for(int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "=" + (n*i));
		}
		scan.close();
	}

}
