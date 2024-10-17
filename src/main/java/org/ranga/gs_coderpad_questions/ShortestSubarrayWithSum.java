package org.ranga.gs_coderpad_questions;

public class ShortestSubarrayWithSum {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 10, 2, 1};
        int K1 = 12;
        System.out.println("Shortest subarray length: " + shortestSubarray(arr1, K1));

        int[] arr2 = {5, 8, 50, 4};
        int K2 = 50;
        System.out.println("Shortest subarray length: " + shortestSubarray(arr2, K2));
    }

    public static int shortestSubarray(int[] nums, int k){
        int j=0, sum = 0, minLength =Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];

            while (sum >= k) {
                minLength = Math.min(minLength, i-j+1);
                sum  -=nums[j++];
            }
        }
        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }
}
