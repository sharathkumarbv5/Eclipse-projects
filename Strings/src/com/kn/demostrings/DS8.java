package com.kn.demostrings;

public class DS8 {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		String s4 = new String("Java");
		System.out.println(s1==s4); //false
		System.out.println(s1==s3); //false
		System.out.println(s2==s3); //false
	}

}
