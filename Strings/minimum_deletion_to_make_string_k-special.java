class Solution {
    public int minimumDeletions(String word, int k) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        
        int res = word.length();
        for (int freqA : freq) {
            int currDelete = 0;
            for (int freqB : freq) {
                if (freqA > freqB) 
                    currDelete += freqB;
                else if (freqB > freqA + k) 
                    currDelete += freqB - (freqA + k);
            }

            res = Math.min(res, currDelete);
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return res;
    }
}
// freq count

//"aabcaba" k = 0
// aaaabbc
// 
// a: 4
// b: 2
// c: 1
