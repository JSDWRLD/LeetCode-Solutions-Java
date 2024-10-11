class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] foundValid = new boolean[s.length()+1];
        foundValid[0] = true;
        
        for (int i = 1; i <= s.length(); i++) {
            for (String word: wordDict) {
                int start = i - word.length();
                if (start >= 0 && foundValid[start] &&
                s.substring(start, i).equals(word)) {
                    foundValid[i] = true;
                    break;
                }
            }
        }

        // Time Complexity: O(n * m)
        // Space Complexity: O(n)
        return foundValid[s.length()];
    }
}
