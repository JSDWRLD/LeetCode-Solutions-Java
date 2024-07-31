class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        if (sum % 2 != 0) return false;

        Boolean[][] dp = new Boolean[nums.length][(sum/2) + 1];

        // S is sum of all nums
        // Time Complexity: O(N * S)
        // Space Complexity: O(N * S)
        return knapsackRecurse(nums, sum/2, 0, dp);
    }

    private boolean knapsackRecurse(int[] nums, int target, int index, Boolean[][] dp) {
        if (target == 0) return true; // Target == 0 we found partition
        if (index >= nums.length) return false; // Out of bounds return false, not found

        if (dp[index][target] != null) return dp[index][target];
        // Decision 1 goes first, if condition not met we skip over index
        // and keep checking
        if (nums[index] <= target) 
            if (knapsackRecurse(nums, target - nums[index], index + 1, dp)) {
                dp[index][target] = true;
                return true;
            }

        // Skip over and check next index for above condition until true or out of bounds, false
        dp[index][target] = knapsackRecurse(nums, target, index + 1, dp);
        return dp[index][target];
    }
}
