class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = nums[0], prev = nums[0], sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (prev < nums[i]) {
                sum += nums[i];
                max = Math.max(max, sum);
            } else {
                sum = nums[i];
            }

            prev = nums[i];
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return max;
    }
}
