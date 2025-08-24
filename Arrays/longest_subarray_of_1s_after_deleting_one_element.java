class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int maxLen = 0;
        int zeroCount = 0;
x
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            // Shrink the window from the left if more than one zero is found
            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            // Calculate the current window length and update the maximum
            maxLen = Math.max(maxLen, right - left);
        }

        return maxLen;
    }
}
