class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k) return false;

        int[] freqMap = new int[26];
        for (char c : s.toCharArray()) {
            freqMap[c - 'a'] += 1;
        }
        
        int oddFreq = 0;
        for (int freq : freqMap) {
            if (freq % 2 != 0) oddFreq += 1;
        }

        // If there are more odds than k then not possible
        // leetcode k = 3 not possible because 5 odds
        // evens you can always construct any amount of strings
        // if len s >= k, example: s = elde k = 2
        // ele + ede valid but if k = 1, 
        // we cannot because we will always have an extra odd freq
        if (oddFreq > k) return false;
        
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return true;
    }
}
