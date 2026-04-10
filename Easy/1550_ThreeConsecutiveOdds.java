// Problem: 1550_Three Consecutive Odds
// Link: https://leetcode.com/problems/three-consecutive-odds/

// Approach:
// Traverse the array and check every group of 3 consecutive elements.
// If all three are odd, return true.
// Otherwise continue checking.
// If no such group is found, return false.

// Time Complexity: O(n)
// (Single pass through the array)

// Space Complexity: O(1)
// (No extra space used)

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length == 1 || arr.length == 2) {
            return false;
        }

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
                return true;
            }
        }

        return false;
    }
}
