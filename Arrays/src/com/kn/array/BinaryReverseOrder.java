package com.kn.array;

public class BinaryReverseOrder {

	public static void main(String[] args) {
		int a [] = {'a' , 'b' , 'c' , 'd' , 'e' };
		for(int i = a.length-1; i>=0; i--) {
			System.out.print((char)a[i]+" ");
		}
	}

}
