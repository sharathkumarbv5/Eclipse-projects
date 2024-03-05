package com.kodnest.collections;

import java.util.Scanner;

public class SelectionSort {

	public static void main(string[] args) {
	
		        Scanner scanner = new Scanner(System.in);

		        // Get the dimensions of the 2D array from the user
		        System.out.print("Enter the number of rows: ");
		        int rows = scanner.nextInt();

		        System.out.print("Enter the number of columns: ");
		        int columns = scanner.nextInt();

		        // Declare and initialize a 2D array based on user input
		        int[][] matrix = new int[rows][columns];

		        // Get the elements of the 2D array from the user
		        System.out.println("Enter the elements of the 2D array:");

		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < columns; j++) {
		                System.out.print("Enter element at position (" + i + ", " + j + "): ");
		                matrix[i][j] = scanner.nextInt();
		            }
		        }

		        // Display the elements of the 2D array
		        System.out.println("Elements of the 2D array:");

		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < columns; j++) {
		                System.out.print(matrix[i][j] + " ");
		            }
		            System.out.println(); // Move to the next line after each row
		        }

		        // Close the scanner to avoid resource leaks
		        scanner.close();
		    }


	}


