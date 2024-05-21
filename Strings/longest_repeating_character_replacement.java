class Solution {
    public int characterReplacement(String s, int k) {
        int winStart = 0, res = 0, repeat = 0;
        Map<Character, Integer> freqMap = new HashMap<>();
        
        for (int winEnd = 0; winEnd < s.length(); winEnd++) {
            // update our freqMap
            char right = s.charAt(winEnd);
            freqMap.put(right, freqMap.getOrDefault(right, 0) + 1);
            repeat = Math.max(repeat, freqMap.get(right));

            // we only update our windowSize if winSize - repeating > k
            if (winEnd - winStart + 1 - repeat > k) {
                char left = s.charAt(winStart);
                freqMap.put(left, freqMap.get(left) - 1);
                winStart++;
            }

            // max window size permited
            res = Math.max(res, winEnd - winStart + 1);
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return res;
    }
}
