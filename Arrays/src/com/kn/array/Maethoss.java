package com.kn.array;

import java.util.Scanner;

public class Maethoss {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String S=s.nextLine();
int count;
//to lowercase he given string 
S=S.toLowerCase();
//to split the given string in to words
String word[]=S.split(" ");
for(int i=0;i<word.length;i++) {
	count=1;

	for(int j=i+1;j<word.length;j++) {

		if(word[i].equals(word[j])) {
			count++;

			word[j]="0";
			
		}

	
		
	}
	if(count>1&&word[i]!="0") 
		System.out.println(word[i]);


	s.close();
}

}

	}
