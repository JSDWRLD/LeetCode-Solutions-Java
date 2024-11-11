class Solution {
    public int numDecodings(String s) {
        HashMap<Integer, Integer> memo = new HashMap<>();

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return decoder(s, 0, memo);
    }

    private int decoder(String s, int i, HashMap<Integer, Integer> memo) {
        if (memo.containsKey(i)) return memo.get(i);
        // Example 12 will end on i == len
        if (i == s.length()) return 1;
        // If it starts w 0 return 0 don't add to total ways
        else if (s.charAt(i) == '0') return 0; 
        // Example 1, 2 will end on i == len-1
        else if (i == s.length() - 1) return 1;
        
        int ans = decoder(s, i+1, memo); // Check one digit paths
        
        // Only if the 2 digit path is <= 26
        if (Integer.valueOf(s.substring(i, i+2)) <= 26) {
            ans += decoder(s, i+2, memo); // Check 2 digit paths
        }

        // Place in our memo in case we already solved subproblem
        memo.put(i, ans);
        return ans;
    }
}
