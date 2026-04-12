// Problem: 342_Power of Four
// Link: https://leetcode.com/problems/power-of-four/

// Approach:
// A number is a power of four if:
// 1. It is positive
// 2. It has only one set bit → (n & (n - 1)) == 0  (power of 2)
// 3. It satisfies n % 3 == 1 (property of powers of 4)
// Combining all conditions gives the result.

// Time Complexity: O(1)
// Constant time operations

// Space Complexity: O(1)

class Solution {
    public boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && n % 3 == 1;
    }
}
