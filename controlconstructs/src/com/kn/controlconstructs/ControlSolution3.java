package com.kn.controlconstructs;

import java.util.Scanner;

public class ControlSolution3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an Number");
		int num = scan.nextInt();
		if (num > 0) {
			System.out.println("+ve");
		}
		if ( num < 0) {
			System.out.println("-ve");
		}
		if ( num == 0 ) {
			System.out.println("zero");
		}
		scan.close();
	}

}
