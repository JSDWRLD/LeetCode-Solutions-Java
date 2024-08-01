class Solution {
    public void sortColors(int[] nums) {
        
        // Time Complexity: O(n log n)
        // Space Complexity: O(1)
        qs(nums, 0, nums.length-1);
    }

    private void qs(int[] nums, int begin, int end) {
        if (begin < end) {
            int partIndex = partition(nums, begin, end);

            // Calls Quick Sort on each partition until entire array sorted
            qs(nums, begin, partIndex-1);
            qs(nums, partIndex+1, end);
        }
    }

    private int partition(int[] nums, int begin, int end) {
        int i = begin - 1;

        for (int j = begin; j < end; j++) {
            if (nums[j] <= nums[end]) {
                // Swap as long as curr less than pivot
                i++;

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        // Swap pivot to where I, everything less than pivot on left
        int temp = nums[i+1];
        nums[i+1] = nums[end];
        nums[end] = temp;

        // Return area above pivot for Quick Sort
        return i+1;
    }
}
