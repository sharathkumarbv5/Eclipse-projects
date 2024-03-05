package com.kn.demostrings;
import java.util.*;
import java.util.Arrays;

	public class TestClass {

		



		    public static void main(String[] args) {
		        // Read input from STDIN
		        String wifiPassword = "dd4dd"; // Replace with actual input

		        // Generate and print valid passwords
		        String result = generateValidPasswords(wifiPassword);
		        System.out.println(result);
		    }

		    private static String generateValidPasswords(String password) {
		        char[] passwordChars = password.toCharArray();
		        Arrays.sort(passwordChars); // Sort characters

		        // Use permutations to generate all possible arrangements
		        StringBuilder validPasswords = new StringBuilder();
		        generatePermutations(passwordChars, validPasswords, 0);

		        return validPasswords.toString().trim();
		    }

		    private static void generatePermutations(char[] password, StringBuilder result, int index) {
		        if (index == password.length) {
		            // Append the current permutation to the result if it starts with a letter
		            if (Character.isLetter(password[0])) {
		                result.append(password).append(" ");
		            }
		        } else {
		            for (int i = index; i < password.length; i++) {
		                // Swap characters
		                char temp = password[index];
		                password[index] = password[i];
		                password[i] = temp;

		                // Recursively generate permutations
		                generatePermutations(password, result, index + 1);

		                // Swap back to backtrack
		                temp = password[index];
		                password[index] = password[i];
		                password[i] = temp;
		            }
		        }
		    }
		}