class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] bStringMax = new int[26];
        // O(m)
        for (String b : words2) {
            int[] temp = countCharFreq(b);
            // O(1)
            for (int i = 0; i < 26; i ++) {
                bStringMax[i] = Math.max(bStringMax[i], temp[i]);
            }
        }

        // O(n)
        List<String> universalStrings = new ArrayList<>();
        for (String a : words1) {
            int[] temp = countCharFreq(a);

            boolean isValid = true;
            // O(1)
            for (int i = 0; i < 26; i++) {
                if (temp[i] < bStringMax[i]) {
                    isValid = false;
                    continue;
                }
            }

            if (isValid) universalStrings.add(a);
        }

        // Time Complexity: O(n*k + m*k)
        // Space Complexity: O(n), n is maximum strings in words1 that can be universal
        return universalStrings;
    }
    // O(k)
    private int[] countCharFreq(String word) {
        int[] charFreq = new int[26];
        for (char c: word.toCharArray()) {
            charFreq[c - 'a'] += 1;
        }
        return charFreq;
    }
}
