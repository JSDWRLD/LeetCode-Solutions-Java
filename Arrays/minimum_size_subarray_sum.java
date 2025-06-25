class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE, sum = 0, start = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                minLen = Math.min(minLen, i - start + 1);
                sum -= nums[start++];
            }
        }

        // Time Compexity: O(n), max of 2n iterations
        // Space Complexity: O(1)
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}


// [2,3,1,2,4,3]
// min length, of subarray == 7
// 3, 2
