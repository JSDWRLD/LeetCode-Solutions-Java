class Solution {
    public int maxProduct(int[] nums) {
        // Trick: To make use of max and min place holders to hold long subarray chains
        int result = nums[0], max = nums[0], min = nums[0];

        // See how big of a subarray we can make
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];

            // Put into a tempMax to avoid mutating original max before calculating our min so far
            int tempMax = Math.max(curr, Math.max(curr*max, curr*min));
            min = Math.min(curr, Math.min(curr*min, curr*max));

            // The reason we need to maintain a minimum value so far
            // is because if we run into another negative there is a chance
            // that that could be the max product.
            max = tempMax;
            result = Math.max(max, result);
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return result;
    }
}
