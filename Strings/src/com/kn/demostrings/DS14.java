package com.kn.demostrings;

public class DS14 {               //eliminate duplicate values

	public static void main(String[] args) {
		String s = "program";
		String s1 ="";
		for(int i = 0; i < s.length(); i++) {
			if(!(s1.contains(s.charAt(i)+""))) {
				s1 = s1 + s.charAt(i);
			}
		}
		System.out.println(s1); //progam
	}

}
