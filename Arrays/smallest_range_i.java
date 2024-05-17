class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = nums[0], max = nums[0];
        for(int curr : nums) {
            if(min > curr) min = curr;
            if(max < curr) max = curr;
        }
        
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        if(min + k >= max - k) return 0;
        else return (max - k) - (min + k);
    }
}
