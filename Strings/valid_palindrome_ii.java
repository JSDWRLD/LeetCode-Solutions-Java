class Solution {
    public boolean validPalindrome(String s) {
        int start = 0, end = s.length()-1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return checkPalindrome(s, start+1, end) || 
                       checkPalindrome(s, start, end-1);
            }

            start++;
            end--;
        }

        // checkPalindrome will never be called more than twice
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return true;
    }

    private boolean checkPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }

        return true;
    }
}
