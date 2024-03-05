package com.kn.demostrings;

public class longString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="java  program is fun";
		String k=s.trim();
		String[] a=s.split(" ");
		String ls=" ";
		int lsl=0;
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>lsl) {
				ls=a[i];
				lsl=a[i].length();
			}

		}

		System.out.println(ls);
	}

}
