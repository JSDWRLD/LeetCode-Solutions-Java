class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);

        int totalPartitions = 1, min = nums[0];
        for (int i = 1; i < nums.length; i++) 
        {
            if (nums[i] - min > k) // make another partition, upd min
            {
                totalPartitions += 1;
                min = nums[i];
            }
        }

        // Time Complexity: O(n log n)
        // Space Complexity: O(log n) if quicksort
        return totalPartitions;
    }
}
