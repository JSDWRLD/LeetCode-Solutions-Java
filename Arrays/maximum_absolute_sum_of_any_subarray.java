class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int curr = 0;
        int maxSum = nums[0];
        for (int n : nums) {
            curr = Math.max(curr + n, n);
            maxSum = Math.max(curr, maxSum);
        }

        curr = 0;
        int minSum = nums[0];
        for (int n : nums) {
            curr = Math.min(curr + n, n);
            minSum = Math.min(curr, minSum);
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return Math.max(Math.abs(minSum), maxSum);
    }
}
