package com.kodnest.project1;

import java.util.Scanner;

public class Forloop
{
	public static void main(String[] args)
	{
		int count=0;
		System.out.println("enter any number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		for(int i=1;i<=n;i++) 
		{
			if(n%i==0) {
				count++;
			}

		}
		if(count==2) {
			System.out.println("prime number");	
		}else {
			System.out.println("not aprime number");	

		}
	}
}