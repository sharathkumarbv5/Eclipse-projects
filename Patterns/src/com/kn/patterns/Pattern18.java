package com.kn.patterns;

public class Pattern18 {

	public static void main(String[] args) {
		for(int i = 1; i <= 12; i++) {
			for(int j = 1; j <= 12; j++) {
				if(i==1 ||  j==6 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
				System.out.println();
	}
	}
}


