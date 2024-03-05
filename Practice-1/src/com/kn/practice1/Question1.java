/*
 * WAJP to declare and intialize two float values and find the difference of it?
 */
package com.kn.practice1;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! Please enter a float number : 1 =  ");
		float f1 = scan.nextFloat();
		
		System.out.println("User! Please enter a float number : 2  = ");
		float f2 = scan.nextFloat();
		float result = f1 -f2;
		System.out.println("The Difference between the Two Float Values = " +result);
		
	}

}
