package com.kn.patterns;

public class Pattern20 {

	public static void main(String[] args) {
		for(int i = 1; i <= 11; i++) {
			for(int j = 1; j <= 11; j++) {
				if(j==1 || i+j==12 && i>=6  || i==j  || j==11) {
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


