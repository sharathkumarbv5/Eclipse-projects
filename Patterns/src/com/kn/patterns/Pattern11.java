package com.kn.patterns;

public class Pattern11 {

	public static void main(String[] args) {
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int k = 1; k <= 2; k++) {
			for(int l = 1; l <= 3; l++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
