package com.kn.controlconstructs;

import java.util.Scanner;

public class ControlConstructs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n == 0) {
			System.out.println("The result is zero");
		}
		scan.close();
	}

}
