class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int twoIndex = 0;

        for (int oneIndex = 0; oneIndex < str1.length() && twoIndex < str2.length(); oneIndex++) {
            
            // Check each case
            if (str1.charAt(oneIndex) == str2.charAt(twoIndex) || 
                str1.charAt(oneIndex)+1 == str2.charAt(twoIndex) ||
                str1.charAt(oneIndex)-25 == str2.charAt(twoIndex)) {
                    twoIndex++;
                }
        }


        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return twoIndex == str2.length();
    }
}

// Case 1: Chars are the same check next char in str2
// Case 2: str1 char + 1 can equal char in str2
// Case 3: str1 char is z and we circle around to a and it matches
