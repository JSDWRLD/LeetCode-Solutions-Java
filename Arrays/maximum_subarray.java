class Solution {
    public int maxSubArray(int[] nums) {
        int result = nums[0], maxSub = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            // 2 Decisions, Add the curr to rest or if 
            // subarray < starting a new subarray we chose 
            // to start the new subarray all together
            maxSub = Math.max(maxSub + nums[i], nums[i]);
            result = Math.max(result, maxSub);
        }
        
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return result;
    }
}
