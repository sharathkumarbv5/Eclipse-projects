package com.kn.array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		System.out.println("User! Please enter the Size of the Array");
		Scanner scan = new Scanner(System.in);
		byte size = scan.nextByte();
		byte[]a = new byte[size];
		System.out.println("User please enter the " +size + " elements");
		for(int i =0; i<=size-1; i++) {
			a[i] = scan.nextByte();
		}
		System.out.println("The Elements are: ");
		for(int i = 0; i<=size-1; i++) {
			System.out.println(a[i]);
		}
		scan.close();
	}

}
