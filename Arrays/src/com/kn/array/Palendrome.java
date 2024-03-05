package com.kn.array;

import java.util.Scanner;

public class Palendrome {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String pel=s.nextLine();
	if(findpal(pel)) {
		System.out.println("palindrome");
	}else {
		System.out.println("not palindrome");

	}
	s.close();
}
public static boolean findpal(String pel) {
	String a=new StringBuffer(pel).reverse().toString();
	return a.equals(pel);
}
}




