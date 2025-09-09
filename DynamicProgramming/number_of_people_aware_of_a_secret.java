class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        long MOD = 1_000_000_007;
        long[] dp = new long[n+1];
        // day 0 no one knows
        dp[1] = 1;
        // dp[i] = number of people who first learn the secret on day i

        // winTotal = number of people who are currently allowed to share the secret
        // people enter the window at (i - delay)
        // people leave the window at (i - forget)
        long winTotal = 0;
        for (int i = 2; i <= n; i++) {
            // lets us know when we can start
            // add and sub arithmetic
            int enterTime = i - delay;
            int forgetTime = i - forget;

            if (enterTime >= 1) {
                winTotal = (winTotal + dp[enterTime] % MOD) % MOD;
            }

            if (forgetTime >= 1) {
                // add mod to avoid large negative number, mod after
                winTotal = (winTotal - dp[forgetTime] + MOD) % MOD;
            }

            dp[i] = winTotal;
        }

        // sum up all the people that are allowed to share secret
        // aka they know
        long ans = 0;
        int startIndex = Math.max(1, n-forget+1);
        for (int i = startIndex; i <= n; i++) {
            ans = (ans + dp[i]) % MOD; 
        }
        
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return (int)ans;
    }
}


// state that depends on prev state
// what state?
// state = how many new people found out on day
// day i = how many people sharing
// base case = 1 person
