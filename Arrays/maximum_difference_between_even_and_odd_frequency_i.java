class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c-'a']++;
        }

        int maxOdd = Integer.MIN_VALUE, minEven = Integer.MAX_VALUE;

        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) continue;
            
            if (freq[i] % 2 == 0) {
                minEven = Math.min(minEven, freq[i]);
            } else {
                maxOdd = Math.max(maxOdd, freq[i]);
            }
        }
        
        // Time Complexity: O(n)
        // Space Complexity: O(26)
        return maxOdd - minEven;
    }
}
