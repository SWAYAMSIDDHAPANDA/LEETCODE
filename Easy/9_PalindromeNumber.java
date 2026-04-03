// Problem: 9_Palindrome Number
// Link: https://leetcode.com/problems/palindrome-number/

// Approach:
// We reverse the given number by extracting its digits one by one.
// Then we compare the reversed number with the original number.
// If both are equal, the number is a palindrome; otherwise, it is not.

// Time Complexity: O(log₁₀(n))
// Space Complexity: O(1)

class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        for (int i = x; i > 0; i = i / 10) {
            reverse = reverse * 10 + (i % 10);
        }
        if (x == reverse) {
            return true;
        }
        return false;
    }
}
