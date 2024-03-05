package com.kn.array;

public class RegularExpToCheckIfStringIsANumber {

	public static void main(String[] args) {
		String regex = "[0-9]+";
		String data = "23343453";
		System.out.println("Is Number: "+ data.matches(regex));
	}

}
