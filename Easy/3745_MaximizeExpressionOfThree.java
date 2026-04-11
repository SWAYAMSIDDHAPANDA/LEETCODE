// Problem: 3745_Maximize Expression of Three Numbers
// Link: https://leetcode.com/problems/maximize-expression-of-three-elements/

// Approach:
// To maximize (a + b - c):
// - Choose the two largest numbers for a and b
// - Choose the smallest number for c
//
// So after sorting:
// a = nums[n-1]
// b = nums[n-2]
// c = nums[0]

// Time Complexity: O(n log n)
// (Due to sorting)

// Space Complexity: O(1)

class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        return nums[n - 1] + nums[n - 2] - nums[0];
    }
}
