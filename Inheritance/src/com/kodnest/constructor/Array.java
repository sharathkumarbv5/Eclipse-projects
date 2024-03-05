package com.kodnest.constructor;
import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int[]b =new int[scan.nextInt()];
	for(int i=1;i<=b.length-1;i++) {
		System.out.print(i+" ");
		scan.close();
	}
	}
}
