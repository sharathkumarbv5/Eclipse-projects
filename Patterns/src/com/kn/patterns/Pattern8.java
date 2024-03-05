package com.kn.patterns;

public class Pattern8 {

	public static void main(String[] args) {
		for(int k = 1; k<=4; k++) {
			for(int i = 1; i<=3; i++) {
				System.out.print("*");		
			}
			System.out.print(" ");
			for(int j = 1; j<=4; j++) {
				System.out.print("$");
			}
			System.out.println();
	}
	}

}
/*  Java Program For this pattern
		*** $$$$
		*** $$$$
		*** $$$$ 
*/