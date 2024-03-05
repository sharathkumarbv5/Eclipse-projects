package com.kodnest.expect;

public class Main {

	public static void main(String[] args) {
		Task.method3();	
		
	}
}
class Task extends Exception{
	static void method3() {
		method1();
	}

	private static void method1() {
	
			try {
				System.out.println(3/0);
			}
			catch(Exception e) {
				System.out.println("Handled");
			}
		
		
	}
}
