package com.kn.array;
//Addition of to numbers
import java.util.Scanner;
public class DynamicUserInputToAddtionOfTwoNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("User!Please Enter the Numbers");
		String input=s.nextLine();
		if(ispalindrome(input)) 
		{
			System.out.println("it is a palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		s.close();
	}
	public static boolean ispalindrome(String input) {
		String rev=new StringBuffer(input).reverse().toString();		
		return input.equals(rev);
	}
}
