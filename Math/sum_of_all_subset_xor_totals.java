class Solution {
    private int totalSum;
    public int subsetXORSum(int[] nums) {
        totalSum = 0;
        helper(nums, 0, 0);

        // Time Complexity: O(2^n)
        // Space Complexity: O(n) call stack
        return totalSum;
    }

    private void helper(int[] nums, int i, int sum) {
        if (i >= nums.length) {
            totalSum += sum; 
            return;
        }

        helper(nums, i+1, sum ^ nums[i]);
        helper(nums, i+1, sum);
    }
}
