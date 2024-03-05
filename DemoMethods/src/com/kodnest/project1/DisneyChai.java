package com.kodnest.project1;

public class DisneyChai {

	public static void main(String[] args) {
		getbill();
		//getbill(4,40);
		//getbill(4,"Masala Chai");
	}
	static void getbill() {
		System.out.println("Bill -1");
	}
	static void getbill(long a , byte b) {
		System.out.println("Bill -2");
	}
	static void getbill(int quantity , String type) {
		System.out.println("Bill -3"); 
	}
	static void getbill(double a , String b) {
		System.out.println("Bill -4");
	}
}
