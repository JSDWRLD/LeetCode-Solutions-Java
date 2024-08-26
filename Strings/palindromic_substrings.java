class Solution {
    public int countSubstrings(String s) {
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            // There are two possible conditions, odd and even substring
            // For example, aa would count as a substring so we need to do i+1
            // in order for it to add to res, for odds we can simply do i because we do
            // start-- and end++ of our window
            res += expand(s, i, i);
            res += expand(s, i, i+1);
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return res;
    }
    
    // Time Complexity: O(n)
    private int expand(String s, int start, int end) {
        int count = 0;

        // Continue to increment counter as long as conditions apply
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
            count++;
        }

        // If current is not palindromic we return 0 default
        return count;
    }
}
