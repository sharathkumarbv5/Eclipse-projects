package com.kodnest.collections;

import java.util.Scanner;

public class TwoDArray {

	public static void main(string[] args) {
		System.out.println("enter frist size");
		Scanner s=new Scanner(System.in);
		int q=s.nextInt();
		System.out.println("enter second size");
		int w=s.nextInt();
		int[][] a=new int[q][w];
		System.out.print("Enter the  array elements");
		for(int i=0;i<q;i++) {
			for(int j=0;j<w;j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");

				a[i][j]=s.nextInt();
			}}
			System.out.println("elements are");
			for(int i=0;i<q;i++) {
				for(int j=0;j<w;j++) {
					System.out.print(a[i][j]+" ");
				

			}
System.out.println();
s.close();
		}
	}

}
