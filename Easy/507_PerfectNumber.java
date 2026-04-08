// Problem: 507_Perfect Number
// Link: https://leetcode.com/problems/perfect-number/

// Approach:
// A perfect number is a number equal to the sum of its proper divisors (excluding itself).
// Iterate from 1 to num/2 and add all divisors.
// If the sum equals num, return true; otherwise false.

// Time Complexity: O(n)
// (Loop runs up to n/2)

// Space Complexity: O(1)

class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }
}
