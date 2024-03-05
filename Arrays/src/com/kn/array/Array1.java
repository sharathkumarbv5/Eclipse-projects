package com.kn.array;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		System.out.println("User! Please enter the Size of the Array");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[]a = new int[size];
		System.out.println("User please enter the " +size + " elements");
		for(int i =0; i<=size-1; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("The Elements are: ");
		for(int i = 0; i<=size-1; i++) {
			System.out.println(a[i]);
		}
		scan.close();
	}
	

}
