package com.kn.demostrings;

public class DS7 {

	public static void main(String[] args) {
		String s = "program";
		for(int i=0; i<s.length();i++) {
			if(i%2==0) {
				System.out.println(s.charAt(i));
			}
				
		}
		System.out.println("===============");
		
		
		for(int j=0; j<s.length();j++) {
			if(j%2!=0) {
				System.out.println(s.charAt(j));
		
	}
			}
		System.out.println("===============");
		
	for(int k = 0;k<s.length();k++) {
	if((k % 3 == 0)&&(k % 2 == 0)) {
		System.out.println(s.charAt(k));
	}
	}
	}
}
	
		


