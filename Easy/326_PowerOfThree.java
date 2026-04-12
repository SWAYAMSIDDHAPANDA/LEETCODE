// Problem: 326_Power of Three
// Link: https://leetcode.com/problems/power-of-three/

// Approach:
// Keep dividing the number by 3 while it is divisible.
// If we can reduce it to 1, then it is a power of 3.
// Otherwise, it is not.

// Time Complexity: O(log n)
// We divide the number by 3 each step

// Space Complexity: O(1)

class Solution {
    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }

        int count = 0;
        for (int i = n; i > 1; i = i / 3) {
            count++;
        }

        return Math.pow(3, count) == n;
    }
}
