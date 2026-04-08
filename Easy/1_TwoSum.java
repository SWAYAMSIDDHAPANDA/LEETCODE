// Problem: 1_Two Sum
// Link: https://leetcode.com/problems/two-sum/

// Approach:
// Using brute force:
// Check every pair (i, j) where i < j
// If nums[i] + nums[j] == target, return their indices

// Time Complexity: O(n^2)
// (Nested loops)

// Space Complexity: O(1)
// (No extra space used)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
