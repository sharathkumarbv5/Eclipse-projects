package com.kn.array;
import java.util.Scanner;
public class evenorodd {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		String result=(a%2==0) ?"even":"odd";
		System.out.println(result);
		s.close();
	}
}
