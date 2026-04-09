// Problem: 1952_Three Divisors
// Link: https://leetcode.com/problems/three-divisors/

// Approach:
// Count the number of divisors of n by iterating from 1 to n.
// If the count of divisors is exactly 3, return true.

// Time Complexity: O(n)
// (Checking all numbers from 1 to n)

// Space Complexity: O(1)

class Solution {
    public boolean isThree(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        return count == 3;
    }
}
