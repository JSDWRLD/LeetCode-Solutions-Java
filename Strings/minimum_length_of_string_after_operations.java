class Solution {
    public int minimumLength(String s) {
        int[] freqArray = new int[26];

        for (char c : s.toCharArray()) 
            freqArray[c - 'a'] += 1;

        int length = 0;
        for (int freq : freqArray) {
            if (freq == 0) continue;
            else if (freq % 2 == 0) length += 2;
            else length += 1;
        }

        // If the freq is even we can only reduce to length 2
        // If freq odd then we can reduce to length 1
        // aaaa -> aa // aaa -> a

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return length;
    }
}

// Original Brute Force Approach
class Solution {
    public int minimumLength(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        for (char key : freqMap.keySet()) {
            int freq = freqMap.get(key);
            while (freq >= 3) {
                freq -= 2; // Delete two characters left and right
            }

            freqMap.put(key, freq);
        }

        int resultLength = 0;
        for (int freq : freqMap.values())
            resultLength += freq;

        return resultLength;
    }
}
