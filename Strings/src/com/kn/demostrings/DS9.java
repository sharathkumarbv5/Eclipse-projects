package com.kn.demostrings;

public class DS9 {

	public static void main(String[] args) {
		String s1 = "123";
		String s2 = new String("123");
		String s3 = new String("123");
		String s4 = "123";
		String s5 = "456";
		String s6 = new String("456");
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s5));
		System.out.println(s3==s4);
		System.out.println(s5==s6);
		System.out.println(s4.equals(s1));
		
	}

}
