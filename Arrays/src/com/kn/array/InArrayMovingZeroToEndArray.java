package com.kn.array;

public class InArrayMovingZeroToEndArray {
	public static void pushZero(int arr[],int n) {
		int count=0;
		for(int i=0;i<n;i++)
			if(arr[i]!=0)
				arr[count++]=arr[i];
		while(count<n)
arr[count++]=0;	
	}
public static void main(String[] args) {
	int arr[]= {1,9,3,4,0,0,9,8,5};
	int n=arr.length;
	pushZero(arr,n);
	System.out.println("array after pushing zeros to the back: ");
	for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");
}
}
