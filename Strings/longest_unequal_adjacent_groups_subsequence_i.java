class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> result = new ArrayList<>();
        result.add(words[0]);
        int num = groups[0];
        for (int i = 1; i < words.length; i++) {
            if (num != groups[i]) {
                result.add(words[i]);
                num = groups[i];
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return result;
    }
}
