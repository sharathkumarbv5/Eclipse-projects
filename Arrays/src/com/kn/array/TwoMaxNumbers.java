package com.kn.array;

public class TwoMaxNumbers {

	public void printTwoMaxNumbers(int[] num) {
		int maxOne = 0;
		int maxTwo = 0;
		for(int n:num) {
			if(maxOne < n) {
				maxTwo = maxOne;
				maxOne = n;
			} else if(maxTwo < n) {
				maxTwo = n;
			}
		}
		System.out.println("First Max Number: "+maxOne);
		System.out.println("Second Max Number: "+maxTwo);
	}		
}
