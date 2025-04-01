class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        
        // each dp index stores the maximum points we can
        // get from the current i to n-1 range
        long[] dp = new long[n];
        dp[n-1] = questions[n-1][0];      
        for (int i = n-2; i >= 0; i--) {
            int skipIndex = questions[i][1] + i + 1;
            int val = questions[i][0];

            // If the skipIndex is within bounds we 
            // check the value of taking it vs not taking it
            // otherwise we compare its current value to the previous ones
            dp[i] = skipIndex < n ? 
                Math.max(dp[skipIndex] + val, dp[i+1]) : 
                Math.max(val, dp[i+1]);
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return dp[0];
    }
}
