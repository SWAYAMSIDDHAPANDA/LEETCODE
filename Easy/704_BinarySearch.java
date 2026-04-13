// Problem: 704_Binary Search
// Link: https://leetcode.com/problems/binary-search/

// Approach:
// Use Binary Search on a sorted array.
// Compare target with middle element:
// - If equal → return index
// - If target is smaller → search left half
// - If target is larger → search right half
// If not found, return -1

// Time Complexity: O(log n)
// Search space halves every iteration

// Space Complexity: O(1)
// No extra space used

class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int m = start + (end - start) / 2;

            if (nums[m] > target) {
                end = m - 1;
            } else if (nums[m] < target) {
                start = m + 1;
            } else {
                return m;
            }
        }

        return -1;
    }
}
