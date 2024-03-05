package com.kn.demostrings;

public class DS13 {

	public static void main(String[] args) {
		
		//way 1
		String s1 = "Java";
		
		//way 2
		String s2 = new String ("Program");
		
		//way 3
		char[]ch = {'2','5','7'};
		String s3 = new String(ch);
		
		//way 4
		StringBuilder s4 = new StringBuilder("Super");
		
		//way 5
		StringBuffer s5 = new StringBuffer("Programming");
		
		System.out.println(s1+ " " +s2 + " "+s3 + " " +s4 + " " +s5);
	}

}
