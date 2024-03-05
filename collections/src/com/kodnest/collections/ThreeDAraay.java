package com.kodnest.collections;
import java.util.*;
public class ThreeDAraay {

	public static void main(string[] args) {

		Scanner scanner=new Scanner(System.in);
		// Get the dimensions of the 3D array from the user
		System.out.print("Enter the number of layers: ");
		int layers = scanner.nextInt();

		System.out.print("Enter the number of rows: ");
		int rows = scanner.nextInt();

		System.out.print("Enter the number of columns: ");
		int columns = scanner.nextInt();

		// Declare and initialize a 3D array based on user input
		int[][][] threeDArray = new int[layers][rows][columns];

		// Get the elements of the 3D array from the user
		System.out.println("Enter the elements of the 3D array:");

		for (int i = 0; i < layers; i++) {
			for (int j = 0; j < rows; j++) {
				for (int k = 0; k < columns; k++) {
					System.out.print("Enter element at position (" + i + ", " + j + ", " + k + "): ");
					threeDArray[i][j][k] = scanner.nextInt();
				}
			}
		}

		// Display the elements of the 3D array
		System.out.println("Elements of the 3D array:");

		for (int i = 0; i < layers; i++) {
			for (int j = 0; j < rows; j++) {
				for (int k = 0; k < columns; k++) {
					System.out.print(threeDArray[i][j][k] + " ");
				}
				System.out.println(); // Move to the next line after each row
			}
			System.out.println(); // Add an extra line between layers
		}

		// Close the scanner to avoid resource leaks
		scanner.close();
	}
}


