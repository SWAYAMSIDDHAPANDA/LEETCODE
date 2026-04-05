// Problem: 2108_Find First Palindromic String in the Array
// Link: https://leetcode.com/problems/find-first-palindromic-string-in-the-array/

// Approach:
// Iterate through each word in the array.
// For each word, reverse it using recursion and compare it with the original.
// If both are equal, return the word.
// If no palindrome is found, return an empty string.

// Time Complexity: O(n * m)
// n = number of words, m = length of each word
// (Reversing each word takes O(m))

// Space Complexity: O(m)
// (Recursive stack + substring creation)

class Solution {
    public String firstPalindrome(String[] words) {
        String s = null;
        for (int i = 0; i < words.length; i++) {
            s = words[i];
            if (s.equals(Reverse(s))) {
                return s;
            }
        }
        return "";
    }

    public static String Reverse(String str) {
        if (str.length() == 1) {
            return str;
        }
        return str.charAt(str.length() - 1) + Reverse(str.substring(0, (str.length() - 1)));
    }
}
