class Solution {

    // O(1) Space
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        int prev = nums[0], adj = Math.max(nums[0], nums[1]), curr;

        for (int i = 2; i < nums.length; i++) {
            curr = Math.max(adj, nums[i] + prev);
            prev = adj;
            adj = curr;
        }
        
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return Math.max(prev, adj);
    }
}

// O(n) Space
//     public int rob(int[] nums) {
//         if (nums.length == 1) return nums[0];
//         if (nums.length == 2) return Math.max(nums[0], nums[1]);

//         // Initialize our dp array to remove sub problems
//         // we start off with first 2 values
//         int[] dp = new int[nums.length];
//         dp[0] = nums[0]; // curr + behind adj
//         dp[1] = Math.max(nums[0], nums[1]); // Adj to curr

//         for (int i = 2; i < nums.length; i++) {
//             dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
//         }

//         // Time Complexity: O(n)
//         // Space Complexity: O(n)
//         return dp[nums.length-1];
//     }

