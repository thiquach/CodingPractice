package main.java.com.leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println("[TwoSum] Input: " + Arrays.toString(nums) + ", target = " + target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] result = new int[2];

        for (int i=0; i<length; i++) {
            for (int j=i+1; j<length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}