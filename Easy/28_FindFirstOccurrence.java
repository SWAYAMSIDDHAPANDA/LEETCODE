// Problem: 28. Find the Index of the First Occurrence in a String
// Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

// Approach:
// We iterate through the main string (haystack) and check every possible substring
// of length equal to the needle. For each position, we extract the substring
// and compare it with the needle. If they match, we return the index.
// If no match is found, return -1.

// Time Complexity: O(n * m)
// n = length of haystack, m = length of needle

// Space Complexity: O(m)
// A temporary substring of length m is created at each iteration

class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i <= ((haystack.length()) - (needle.length())); i++) {
            if ((haystack.substring(i, (i + (needle.length()))).compareTo(needle)) == 0) {
                return i;
            }
        }
        return -1;
    }
}
