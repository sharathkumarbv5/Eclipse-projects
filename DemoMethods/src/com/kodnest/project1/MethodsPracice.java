package com.kodnest.project1;

import java.util.Scanner;

public class MethodsPracice {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two int values");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("sum is"+(a+b));
		System.out.println("sub is"+(a-b));
		System.out.println("mul is"+(a*b));
		System.out.println("div is"+(a/b));
		System.out.println("mod is"+(a%b));
	}public static int add(int a ,int b)
	{
		return a+b;
	}
	public static int sub(int a ,int b)
	{
		return a-b;
	}public static int mul(int a ,int b)
	{
		return a*b;
	}
	public static int div(int a ,int b)
	{
		return a/b;
	}
	public static int mod(int a ,int b)
	{
		return a%b;
	}
}
