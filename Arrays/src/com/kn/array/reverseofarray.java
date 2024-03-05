package com.kn.array;

import java.util.Arrays;

public class reverseofarray {
	public static void main(String[] args) {
		
		        int[] originalArray = {1, 2, 3, 4, 5};

		        System.out.println("Original Array: " + Arrays.toString(originalArray));

		        reverseArray(originalArray);

		        // Display the reversed array
		        System.out.println("Reversed Array: " + Arrays.toString(originalArray));
		    }

		    // Method to reverse the elements of an array
		    private static void reverseArray(int[] arr) {
		        int start = 0;
		        int end = arr.length - 1;

		        while (start < end) {
		            // Swap elements at start and end indices
		            int temp = arr[start];
		            arr[start] = arr[end];
		            arr[end] = temp;

		            // Move indices towards the center
		            start++;
		            end--;
		        }
		    

		
	}

}
