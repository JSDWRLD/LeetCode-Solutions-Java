class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // we implement this utilizing the sliding window technique
        int start = 0;
        double sum = 0;
        double max = Integer.MIN_VALUE;
        
        for(int end = 0; end < nums.length; end++){
            // we add current index to sum
            sum += nums[end];

            // once we hit k size we slide the window
            if((end - start + 1) == k) {
                max = Math.max(max, sum/(double)k);
                // to slide our window we minus the start value and increment
                sum -= nums[start];
                start++;
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return max;
    }
}
