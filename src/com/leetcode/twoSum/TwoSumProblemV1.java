package com.leetcode.twoSum;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSumProblemV1 {

    public static void main(String[] args) {
        int[] result = solve(new int[]{-1, -2, -3, -4, -5}, -8);
        System.out.println("1:" + result[0] + " 2:" + result[1]);
    }

    /**
     * O(n2)
     */
    public static int[] solve(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("no result");
    }

}
