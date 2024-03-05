package com.kodnest.collections;

import java.util.Scanner;

public class SprialMatrix {

	public static void main(string[] args) {

		Scanner scanner = new Scanner(System.in);

		// Get the number of rows and columns for the matrix from the user
		System.out.print("Enter the number of rows: ");
		int rows = scanner.nextInt();

		System.out.print("Enter the number of columns: ");
		int columns = scanner.nextInt();

		// Generate and display the spiral matrix
		int[][] spiralMatrix = generateSpiralMatrix(rows, columns);

		System.out.println("Spiral Matrix:");
		displayMatrix(spiralMatrix);

		// Close the scanner to avoid resource leaks
		scanner.close();
	}

	// Function to generate a spiral matrix
	public static int[][] generateSpiralMatrix(int rows, int columns) {
		int[][] matrix = new int[rows][columns];

		int value = 1;
		int top = 0, bottom = rows - 1, left = 0, right = columns - 1;

		while (top <= bottom && left <= right) {
			// Traverse top row
			for (int i = left; i <= right; i++) {
				matrix[top][i] = value++;
			}
			top++;

			// Traverse right column
			for (int i = top; i <= bottom; i++) {
				matrix[i][right] = value++;
			}
			right--;

			// Traverse bottom row
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					matrix[bottom][i] = value++;
				}
				bottom--;
			}

			// Traverse left column
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					matrix[i][left] = value++;
				}
				left++;
			}
		}

		return matrix;
	}

	// Function to display a matrix
	public static void displayMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int element : row) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}
	}
}


