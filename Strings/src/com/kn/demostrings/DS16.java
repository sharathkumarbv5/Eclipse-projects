package com.kn.demostrings;

public class DS16 {

	public static void main(String[] args) {

		String s  = "program";
		char ch = 'o';
		int count = 0;
		for(int i = 0; i<s.length();i++) {
			if(ch == s.charAt(i)){
				count++;
			}
		}
		System.out.println(ch+" - "+count);      //1
	}

}
