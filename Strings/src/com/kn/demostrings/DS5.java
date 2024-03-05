package com.kn.demostrings;

public class DS5 {

	public static void main(String[] args) {
		String s = "program";
		
		//-->using for loop
		
		//for(int i = 0; i<s.length(); i++) {
			//System.out.print(s.charAt(i));
		
		//-->using while loop
		
		//int i = 0;
		//while(i<s.length()) {
			//System.out.println(s.charAt(i));
			//i++;
		
		//--> using do while loop
		
		int i = 0;
		do {
			System.out.println(s.charAt(i));
			i++;
		}while(i<s.length());
	}

}
