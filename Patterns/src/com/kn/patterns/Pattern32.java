package com.kn.patterns;

public class Pattern32 {

	public static void main(String[] args) {
		for(int i =1; i<=4; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print((char)(j+102));
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
