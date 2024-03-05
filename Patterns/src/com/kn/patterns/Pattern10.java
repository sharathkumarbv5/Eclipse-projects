package com.kn.patterns;

public class Pattern10 {

	public static void main(String[] args) {
		for(int k = 1; k<=3; k++) {
			for(int i = 1; i<=3; i++) {
				System.out.print("$");		
			}
			for(int j = 1; j<=2; j++) {
				System.out.print("*");
			}
			for(int j = 1; j<=3; j++) {
			System.out.print("?");
			}
			System.out.println();
		}
	}

}

/*Java Program To Print This Pattern
		$$$**???
		$$$**???
		$$$**???
*/