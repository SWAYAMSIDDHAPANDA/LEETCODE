// Problem: 35. Search Insert Position
// Link: https://leetcode.com/problems/search-insert-position/

// Approach:
// Use Binary Search.
// If target is found, return its index.
// If not found, return the position where it should be inserted.
// At the end of the loop, 'start' will be the correct insert position.

// Time Complexity: O(log n)

// Space Complexity: O(1)

class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int m = start + (end - start) / 2;

            if (nums[m] > target) {
                end = m - 1;
            } 
            else if (nums[m] < target) {
                start = m + 1;
            } 
            else {
                return m;
            }
        }
        return start;
    }
}
