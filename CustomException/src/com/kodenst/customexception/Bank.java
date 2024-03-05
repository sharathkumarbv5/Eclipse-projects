package com.kodenst.customexception;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
Scanner s= new Scanner(System.in);
System.out.println("Enter the amount to withdraw");
int amount=s.nextInt();
try {
	withdraw(amount);
} catch (Exception e) {
	e.printStackTrace();
}

}
	static void withdraw(int amount) throws MyException {
		int balance=100;
		if(amount>balance) {
		
			throw new MyException();
		}
	}

}
class MyException extends Exception {
	public MyException() {
		super("Insufficient funds,Try entering a less amount");
	}
}
