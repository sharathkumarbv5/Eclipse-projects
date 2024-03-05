package com.kn.demostrings;

public class DS15 {           //reverse a string

	public static void main(String[] args) {
		String s = "program";
		String s1="";
		for(int i = s.length()-1; i>=0;i--) {
			s1 = s1 + s.charAt(i);
		}
		System.out.println(s1);  //margorp
	}

}
