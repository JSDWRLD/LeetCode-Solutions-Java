class Solution {
    public long countSubarrays(int[] nums, long k) {
        int left = 0;
        long runningSum = 0;

        long count = 0;
        for (int right = 0; right < nums.length; right++) {
            runningSum += nums[right];

            // we always exit since k >= 1
            while (runningSum*(right-left+1) >= k) {
                runningSum -= nums[left++];
            }

            // The score of the subarray <= k, also count the individual numbers
            count += right-left+1; // + 1 to count the actual 
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return count;
    }
}
