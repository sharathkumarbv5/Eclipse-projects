package com.kn.array;

import java.util.Scanner;

public class FibonacciSeries {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	for(int i=0;i<=a;i++) {

	System.out.println(findfibo(i)+" ");

}
s.close();
}
private static int findfibo(int a) {
		if(a<=1) {
			return a;
		
	}
		else {
			return findfibo(a-1)+findfibo(a-2);
		}
}
}
