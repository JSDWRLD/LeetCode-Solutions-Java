class Solution {
    public long countSubarrays(int[] nums, int k) {
        // Problem wants the subarrays where max element of NUMS, appears
        // k times in the subarray, not max at each subarray
        int max = 0;
        for (int n : nums) max = Math.max(n, max);

        // Initialize vals
        int left = 0, maxFreq = 0, n = nums.length;
        long result = 0;

        // Iterate in O(n)
        for (int right = 0; right < n; right++) {

            if (nums[right] == max) maxFreq++;

            // Still O(n) since we process each element once
            // left never moves backwards so at most n times as well
            // left incremented at most once per right increment
            while (maxFreq >= k) {
                result += n-right;

                if (nums[left] == max) maxFreq--;
                left++;
            }
        }

        // Time Complexity: O(n + n) which is O(n)
        // Space Complexity: O(1)
        return result;
    }
}
