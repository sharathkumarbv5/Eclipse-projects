package com.kn.patterns;

public class Pattern13 {

	public static void main(String[] args) {
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= i+4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
