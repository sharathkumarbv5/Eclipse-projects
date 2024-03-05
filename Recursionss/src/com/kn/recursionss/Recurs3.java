package com.kn.recursionss;

public class Recurs3 {

	public static void main(String[] args) {
		
		display(1);
	}
	
	static void display(int b) {
		int a = 2;
		int c = a*b;
		System.out.println(a+"*"+b+"="+c);
		b++;
		if(b<=10) {
			display(b);
		}
	}

}

//Multiplication in Recursion

