package com.kn.array;

public class AllPurmutationsOfString {
	private static String swapString(String a, int i, int j) {
		char[] b=a.toCharArray();
		char ch ;
		b[i]=b[j];
		ch=b[j];
		return String.valueOf(b);		

	}
	public static void generatePermutation(String str,int start,int end) {
		if(start==end-1)
			System.out.println(str);
		else {
			for(int i=start;i<end;i++) {
			str=swapString(str,start,i);
			generatePermutation(str,start,end);
			str=swapString(str,start,i);
		}
		}}
	
	public static void main(String[] args) {
		String str="ABC";
		int len=str.length();
		System.out.println("ALL THE PURMUTATIONS OF THE STRING ARE:");
		generatePermutation(str,0,len);
	}

}
