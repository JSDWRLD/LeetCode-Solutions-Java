class Solution {
    public int findMaxForm(String[] strs, int m, int n) {

        // Smallest sub problem is that being allowed 0 ones and 0 zeros,
        // what is the maximum we can take of any string? it is 0.
        // This is based on the digit count of said binary string.
      
        // Dp is built based on the allowed ones and zeros
        // m = zero, n = one
        int[][] dp = new int[m+1][n+1];
        // O(s)
        for (String curr : strs) {
            
            // Count current zeros and ones
            int currZero = 0, currOne = 0;
            // theta (l)
            for (char c : curr.toCharArray()) {
                if (c == '0') currZero++;
                else if (c == '1') currOne++;
            }

            // O (m * n)
            // m = zero, n = one
            // Start a maximum and iterate down
            for (int i = m; i >= currZero; i--) {
                for (int j = n; j >= currOne; j--) {
                    
                    // Take the current string or dont take
                    int takeCurr = dp[i - currZero][j- currOne] + 1;
                    int dontTakeCurr = dp[i][j];
                    dp[i][j] = Math.max(takeCurr, dontTakeCurr);
                }
            }
        }

        // s is for number of strings in STRS
        // Time Complexity: O(s * m * n)
        // Space Complexity: O(m * n)
        return dp[m][n];
    }
}
