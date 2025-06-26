class Solution {
    public int longestSubsequence(String s, int k) {
        // count zeros subsequence so always add to max len
        // iterate through right to left
        // counting the bits, if 1 check if its value still < k
        // each iter increases power by multiple of two

        int zeros = 0;
        char[] sChars = s.toCharArray();
        for (char c : sChars) {
            if (c == '0') zeros++;
        }

        int pow = 1, currValue = 0, ones = 0;
        for (int i = sChars.length-1; i >= 0; i--) {
            if (sChars[i] == '1') {
                // if adding this bit keeps value <= k
                if (currValue + pow <= k) {
                    currValue += pow;
                    ones++;
                }
            }

            // Multiply by power of two
            pow *= 2;
            if (pow > k) break; //overflow
        }

        // Add all zeros to possible ones founds from right to left
        // All zeros are part of final answer because they elongate the final length of subsequence.
        
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return ones + zeros;
    }
}

// 32 16 8 4 2 1
// Sliding window
