package com.kn.array;

import java.util.Scanner;

public class fact {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("User!plz Enter the number");
		int n=s.nextInt();
		int frist =0;
		int sec=1;
		for(int i=2;i<=n;i++) {
			int next=frist+sec;
			System.out.println(next+" ");
			frist=sec;
			sec=next;
			
			
		}
		s.close();
		
		
		}
	
}
