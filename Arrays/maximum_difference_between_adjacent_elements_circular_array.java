class Solution {
    public int maxAdjacentDistance(int[] nums) {
        // start end and need to check loop

        int n = nums.length;
        int max = Math.abs(nums[0] - nums[n-1]);
        for (int i = 0; i < n-1; i++) {
                max = Math.max(Math.abs(nums[i]-nums[i+1]), max);        
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return max;
    }
}
