// Problem: 7_Reverse Integer
// Link: https://leetcode.com/problems/reverse-integer/

// Approach:
// Extract digits one by one using modulo (% 10)
// Build the reversed number by multiplying previous result by 10
// Important:
// Before updating rev, check for overflow:
// If rev > Integer.MAX_VALUE / 10 OR rev < Integer.MIN_VALUE / 10, then, overflow
// In that case, return 0

// Time Complexity: O(log n)
// (n = number of digits in x)

// Space Complexity: O(1)

class Solution {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int dig = x % 10;

            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = rev * 10 + dig;
            x /= 10;
        }

        return rev;
    }
}
