package com.kn.arithmeticOperators;

public class Increment {

	public static void main(String[] args) {
		int a = 20;
		int b = -44;
		b = (-b) + (a--) - (b--) + (a) - (4*b) + (0) + (--b) + (6/4);
		System.out.println(a);
		System.out.println(b);
		

	}

}
