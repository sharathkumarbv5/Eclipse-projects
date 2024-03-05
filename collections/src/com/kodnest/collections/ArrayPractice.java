package com.kodnest.collections;
import java.util.*;
public class ArrayPractice {
	public static void main(string[] args) {
		System.out.println("User! please enter the size of array");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int [] a=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<=size-1;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Enter the element to be searched");
		int ele=s.nextInt();
		boolean flag=false;
		for(int i=0;i<size;i++) {
			if(ele==a[i]) {
				flag=true;
				break;
			}
			else {
				flag=false;	
			}
		}
		if(flag==true) {
			System.out.println("present");

		}else {
			System.out.println("not present");
		}		
		s.close();
	}
}
