package com.kn.array;


public class MissingNumberInArray {
	public static void main(String[] args) {
		int[] A=new int[] {1,2,3,5,6,7};
		int num=0;
		int total=7;
		int Expect=total*((total+1)/2);

		for(int i:A){
			num +=i;
		}
		System.out.println(Expect-num);
	}
}
