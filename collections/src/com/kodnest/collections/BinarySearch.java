package com.kodnest.collections;
import java.util.Scanner;
public class BinarySearch 
{
	public static void main(string[] args)
	{
		int swap;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter the size of array");
		for(int i=0;i<n;i++) 
		{
			a[i]=s.nextInt();
		
		}
		for(int i=0;i<(n-1);i++)
		{
			for(int k=0;k<(n-i-1);k++)
			{
				if(a[k]>a[k+1])
				{
					swap=a[k];
					a[k]=a[k+1];
					a[k+1]=swap;
				}
			}
		}

		System.out.println("sorted list ");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
			s.close();
		}
	}
}

