class Solution {
    public int minOperations(int[] nums) {
        
        int count = 0;
        for (int i = 2; i < nums.length; i++)
        {
            if (nums[i - 2] == 0)
            {
                nums[i] = nums[i] == 0 ? 1 : 0;
                nums[i-1] = nums[i-1] == 0 ? 1 : 0;
                nums[i-2] = nums[i-2] == 0 ? 1 : 0;
                count++;
            } 
        }

        for (int n: nums)
        {
            if (n == 0) return -1;
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return count;
    }
}
