// Problem: 58_Length of Last Word
// Link: https://leetcode.com/problems/length-of-last-word/

// Approach:
// We traverse the string from the end.
// First, we skip any trailing spaces.
// Then, we count characters until we encounter a space.
// The count represents the length of the last word.

// Time Complexity: O(n)

// Space Complexity: O(1)

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                if (count > 0) {
                    return count;
                }
            }
        }
        return count;
    }
}
