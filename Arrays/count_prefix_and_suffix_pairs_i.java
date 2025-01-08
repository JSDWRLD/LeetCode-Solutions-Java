class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int result = 0;
        for (int i = 0; i < words.length; i++) 
            for (int j = i+1; j < words.length; j++) 
                if (isPrefixAndSuffix(words[i], words[j])) 
                    result += 1;

        // Time Complexity: O(n^2)
        // Space Complexity: O(1)
        return result;
    }

    private boolean isPrefixAndSuffix(String str1, String str2) {
        int str1Len = str1.length(), str2Len = str2.length();
        if (str1Len <= str2Len) {
            String prefix = str2.substring(0, str1Len);
            String suffix = str2.substring(str2Len-str1Len, str2Len);

            if (str1.equals(prefix) && str1.equals(suffix)) return true;
            else return false;
        }

        return false;
    }
}
