package com.kodnest.project1;

import java.util.Scanner;

public class Metho1 {

	public static void main(String[] args) {
		square ();
	}
	static void square()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter the number");
		int a = scan.nextInt();
		System.out.println("the result is = "+(a*a));
		
		}

}
