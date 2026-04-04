// Problem: 258_Add Digits
// Link: https://leetcode.com/problems/add-digits/

// Approach:
// We repeatedly sum the digits of the number until it becomes a single digit.
// Use a loop:
// 1. Extract digits using % 10
// 2. Add them
// 3. Replace the number with the sum
// Repeat until number < 10

// Time Complexity: O(log n)

// Space Complexity: O(1)

class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
