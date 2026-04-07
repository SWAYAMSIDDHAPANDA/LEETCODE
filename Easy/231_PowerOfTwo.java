// Problem: 231_Power of Two
// Link: https://leetcode.com/problems/power-of-two/

// Approach:
// A number is a power of two if it has exactly one '1' in its binary representation.
// Example:
// 1  -> 0001
// 2  -> 0010
// 4  -> 0100
// 8  -> 1000
//
// Trick:
// n & (n - 1) removes the lowest set bit.
// If result becomes 0, then only one bit was set.
// Also ensure n > 0 (since negative numbers and 0 are not powers of two).

// Time Complexity: O(1)
// (Single bitwise operation)

// Space Complexity: O(1)

class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n > 0) && (n & (n - 1)) == 0;
    }
}
