class Solution {
    private static final int MOD = 1_000_000_007;

    public int numTilings(int n) {
        int[] dp = new int[n+1];
        for (int i = 0; i <= n; i++) {
            if (i > 3) {
                // Times 2 to mirror what we have
                dp[i] = (int)((dp[i-1]*2L + dp[i-3]) % MOD);
            } 
            else if (i == 3)
                dp[i] = 5;
            else if (i == 2)
                dp[i] = 2;
            else if (i == 1)
                dp[i] = 1;
            else if (i == 0)
                dp[i] = 1;
            
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return dp[n]% MOD;
    }
}
