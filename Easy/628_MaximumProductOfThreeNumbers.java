// Problem: 628_Maximum Product of Three Numbers
// Link: https://leetcode.com/problems/maximum-product-of-three-numbers/

// Approach:
// Sort the array.
// The maximum product can be either:
// 1. Product of the three largest numbers
// 2. Product of two smallest (possibly negative) numbers and the largest number
// Return the maximum of both.

// Time Complexity: O(n log n)
// (Sorting the array)

// Space Complexity: O(1)
// (Ignoring sorting space)

import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int p1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int p2 = nums[n - 1] * nums[0] * nums[1];

        return Math.max(p1, p2);
    }
}
