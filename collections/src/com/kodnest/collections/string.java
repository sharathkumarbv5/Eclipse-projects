package com.kodnest.collections;
public class string {
	public static void main(String[] args) {

		String s="Asda A reaf";
		String s1="";

		for(int i=0;i<s.length();i++) {
			if(!s1.contains(s.charAt(i)+"")) {
				s1=s1+s.charAt(i); 
			}

			//System.out.println(s.compareToIgnoreCase(s1));
			//System.out.println(s1.equalsIgnoreCase(s));

		}
		System.out.println(s1);
	}}


//	}


