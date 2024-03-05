package com.kn.demostrings;

public class UniqueString1
{	
	public static void main(String args[])
	{
		display();
	}
	static void display()
	{
		System.out.println("Recursion");
		display();
	}
}