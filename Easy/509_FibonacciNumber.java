// Problem: 509_Fibonacci Number
// Link: https://leetcode.com/problems/fibonacci-number/

// Approach:
// Use recursion based on the definition:
// fib(n) = fib(n-1) + fib(n-2)
// Base cases: fib(0) = 0, fib(1) = 1

// Time Complexity: O(2^n)

// Space Complexity: O(n)

class Solution {
    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
