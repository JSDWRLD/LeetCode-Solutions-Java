class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long res = 0, iMax = 0, diffMax = 0;
        // res == the difference so far times the current k value
        // nums[i] is maximized then value is maximized
        // nums[i] - nums[j] is maximized then value is maximized
        for (int k = 0; k < n; k++) {
            res = Math.max(res, diffMax * nums[k]);
            diffMax = Math.max(diffMax, iMax - nums[k]);
            iMax = Math.max(iMax, nums[k]);
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return res;
    }
}
