package com.kn.cast;

import java.util.Scanner;

public class TypeCast {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter a long value");
		long nextLong = scan.nextLong();
		byte nextByte = scan.nextByte();
		short nextShort = scan.nextShort();
		int nextInt = scan.nextInt();
		float nextFloat = scan.nextFloat();
	}

}