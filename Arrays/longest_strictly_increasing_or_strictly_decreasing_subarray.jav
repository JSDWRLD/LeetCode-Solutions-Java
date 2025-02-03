class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max = 1;

        int prev = nums[0], incrLen = 1, decrLen = 1;
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            if (prev < curr) {
                decrLen = 1;
                incrLen += 1;
                max = Math.max(incrLen, max);
            } else if (prev > curr) {
                incrLen = 1;
                decrLen += 1;
                max = Math.max(decrLen, max);
            } else {
                incrLen = 1;
                decrLen = 1;
            }
            prev = curr;
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return max;
    }
}
