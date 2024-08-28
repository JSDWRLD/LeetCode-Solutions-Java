class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();

        // Time Complexity: O(n * 2^n)
        // Space Complexity: O(n)
        backtrack(s, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(String s, int start, List<String> currPath, List<List<String>> res) {
        // Exit Case to add to res
        if (start == s.length()) {
            res.add(new ArrayList<>(currPath));
            return;
        }

        // Exploring all possible partitions O(2^n)
        for (int end = start+1; end <= s.length(); end++) {
            // If curr substring is a palindrome add to curr path
            if (isPalindrome(s, start, end-1)) {
                currPath.add(s.substring(start, end));
                
                // Recursively check other partitions for palindromes
                backtrack(s, end, currPath, res);

                // Backtrack to explore other options, 
                // we remove from currPath
                currPath.remove(currPath.size() - 1);
            }
        }
    }

    // Helper method to check if this is a palidrome, O(n)
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) 
            if (s.charAt(left++) != s.charAt(right--))
                return false;

        return true;
    }
}
