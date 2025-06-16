class Solution {
    public int maximumDifference(int[] nums) {
        int min = nums[0], max = -1;
        for (int i = 1; i < nums.length; i++) {
            if (min < nums[i]) {
                max = Math.max(max, nums[i] - min);
            } else {
                min = nums[i];
            }
        }
        
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return max;
    }
}
