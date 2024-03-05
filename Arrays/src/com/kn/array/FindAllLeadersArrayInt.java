package com.kn.array;

import junit.framework.Test;

public class FindAllLeadersArrayInt {
	void printLeaders(int arr[], int size) {
		for (int i = 0; i < size; i++) {
		int j;
		for (j = i + 1; j < size; j++) {
		if (arr[i] <= arr[j])
		break;
		}
		if (j == size) // the loop didn't break
		System.out.print(arr[i] + " ");
		}
		}
		public static void main(String[] args) {
		Test lead = new Test();
		int arr[] = new int[]{25, 10, 2, 4, 1, 3};
		int n = arr.length;
		((FindAllLeadersArrayInt) lead).printLeaders(arr, n);
		}

}
