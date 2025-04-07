// Bottom up tabulation
class Solution {
    public boolean canPartition(int[] nums) {
        int total = 0;
        for (int n : nums) total += n;

        // target number is the sum / 2 because they have to be equal
        if (total % 2 != 0) return false; // odd number not possible
        int target = total/2;
    
        // Rows define current number, col defines sum, true if possible
        boolean[][] dp = new boolean[nums.length+1][target+1];
        dp[0][0] = true;
        
        for (int row = 1; row <= nums.length; row++) {
            // Get the current number / item
            int currNum = nums[row-1];
            for (int sum = 0; sum <= target; sum++) {
                if (sum < currNum) {
                    // take previous
                    dp[row][sum] = dp[row-1][sum];
                } else {
                    // Take item or dont take item
                    dp[row][sum] = dp[row-1][sum] || dp[row-1][sum-currNum];
                }
            }
        }

        // If our final block is true that means we can achive our target
        // since we can achieve our target, this implies that there is another
        // equal subset that has the same target value since we took total/2
        // n is the total number of numbers, s is the totalSum/2
        // Time Complexity: O(n * s)
        // Space Complexity: O(n * s)
        return dp[nums.length][target];
    }
}

// Top down memoization 
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
