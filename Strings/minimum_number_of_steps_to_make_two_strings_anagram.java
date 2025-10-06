class Solution {
    public int minSteps(String s, String t) {
        int[] freqS = new int[26];
        int[] freqT = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freqS[s.charAt(i) - 'a']++;
            freqT[t.charAt(i) - 'a']++;
        }

        int diffs = 0;
        for (int i = 0; i < 26; i++) {
            if (freqT[i] < freqS[i]) diffs += freqS[i] - freqT[i];
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return diffs;
    }
}

// s, b: 2, a:1
// t, b: 1, a:2
// leetcode, practice
// l: 1, e: 3, t: 1, c: 1, o: 1, d: 1
// p: 1, r: 1, a: 1, c: 2, t: 1, i: 1, e: 1
// 6 - 1
