package com.kn.loopings;

import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! Please Enter the  value : ");
		int n = scan.nextInt();
		for(int i = 2; i<=n; i=i+2) {
			System.out.println(i);
		
		}
		scan.close();
		}
	}


