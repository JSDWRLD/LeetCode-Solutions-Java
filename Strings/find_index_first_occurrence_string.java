class Solution {
    public int strStr(String haystack, String needle) {
        
        int needleSize = needle.length();

        for (int i = 0; i <= haystack.length() - needleSize; i++){
            // checks index of 0 to needleSize nothing more cause its starting of string
            // if i = 0, 0 + needleSize = needleSize, we check that substring to our needle
            if (haystack.substring(i, i + needleSize).equals(needle)){
                return i;
            }
        }

        // return -1 if not found
        
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return -1;
    }
}
