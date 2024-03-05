package com.kn.array;
import java.util.*;
import java.util.Scanner;

public class arrayreversing {
	public static void main(String[] args) {
		int[]a= {6,1,2,3,4,5};
		int max=findmax(a);
		System.out.println("the maximum element in an array is:--"+max);
		
	
}

	private static int findmax(int[] a) {
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>i) {
				max=a[i];
				
			}
			
		}
		return max;
	}}
