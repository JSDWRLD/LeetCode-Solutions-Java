class Solution {
    public int prefixCount(String[] words, String pref) {
        int result = 0, prefLen = pref.length();

        for (String word : words) {
            if (word.length() >= prefLen && 
            word.substring(0, prefLen).equals(pref)) 
                result += 1;
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return result;
    }
}
