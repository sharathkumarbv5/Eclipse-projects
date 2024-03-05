package com.kn.controlconstructs;

import java.util.Scanner;

public class ControlSolution2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! Please enter the Number");
		int num = scan.nextInt();
		if( num%2 == 0 ) {
			System.out.println("It is an Even Number");
		}
		else {
			System.out.println("It is an Odd Number");
		}
		scan.close();
	}

}
