package com.kodnest.project1;
import java.util.PriorityQueue;
public class KthLargestElement {

	public static int findKthLargest(int[] nums, int k) {
        // Create a min-heap to maintain the K largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            if (minHeap.size() < k) {
                // If the heap has less than K elements, add the element
                minHeap.offer(num);
            } else if (num > minHeap.peek()) {
                // If the current element is greater than the smallest in the heap, replace it
                minHeap.poll();
                minHeap.offer(num);
            }
        }

        return minHeap.peek(); 
    }

    public static void main(String[] args) {
        int[] nums = {10, 4, 12, 9, 87, 34};
        int k = 3; // Replace with the desired value of K
        int kthLargest = findKthLargest(nums, k);
        System.out.println("Kth Largest Element: " + kthLargest);
    }

}		 