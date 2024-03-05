package com.kn.demostrings;
import java.util.*;

public class SumOfShiftedPositions {

    public static void main(String[] args) {
        // Read input from STDIN
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // Calculate the sum S
        int sum = calculateSum(arr);
        
        // Print the output to STDOUT
        System.out.println(sum);
    }

    static int calculateSum(int[] arr) {
        // Create a list of pairs (element, original index)
        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            pairs.add(new Pair(arr[i], i));
        }

        // Sort the list based on the element values
        pairs.sort(Comparator.comparingInt(p -> p.element));

        // Calculate the sum S
        int sum = 0;
        for (int i = 0; i < pairs.size(); i++) {
            sum += (i * pairs.get(i).element);
        }

        return sum;
    }

    static class Pair {
        int element;
        int originalIndex;

        Pair(int element, int originalIndex) {
            this.element = element;
            this.originalIndex = originalIndex;
        }
    }
}
