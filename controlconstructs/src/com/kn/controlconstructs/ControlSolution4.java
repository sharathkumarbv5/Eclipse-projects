package com.kn.controlconstructs;

import java.util.Scanner;

public class ControlSolution4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! Please enter an Number");
		int num = scan.nextInt();
		if(num == 0) {
			System.out.println("Zero");
		}
		else if(num>0){
			System.out.println("Positive");
		}
		else {
			System.out.println("Negative");
		}
		scan.close();
	}

}
