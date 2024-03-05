package com.kn.controlconstructs;

import java.util.Scanner;

public class ControlSolution1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! Please enter the Age");
		int age = scan.nextInt();
		if(age >= 18) {
			System.out.println("Eligible to Vote");
		}
		if(age < 18) {
			System.out.println("Not Eligible to Vote");
		}
		scan.close();
	}

}
