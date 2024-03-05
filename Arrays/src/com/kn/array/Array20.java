package com.kn.array;

import java.util.Scanner;

public class Array20 {

	public static void main(String[] args) {
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
				if(i==1||j==1) {
					System.out.print(a[i][j]+"");
				}
					else {
						System.out.print(" ");



					}}
			System.out.println();
			s.close();
		}}}




