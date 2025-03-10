class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int oneLen = text1.length() + 1, twoLen = text2.length() + 1;
        int[][] dp = new int[oneLen][twoLen];

        for (int i = 0; i < twoLen; i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i < oneLen; i++) {
            dp[i][0] = 0;
            for (int j = 1; j < twoLen; j++) {
                if (text1.charAt(i-1) == text2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        // Time Complexity: O(n * m)
        // Space Complexity: O(n * m)
        return dp[oneLen-1][twoLen-1];
    }
}
