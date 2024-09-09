class Solution {
    public void nextPermutation(int[] nums) {
        // Visualize array as 1 digit
        int n = nums.length;
        int pivot = n-1;
        while (pivot >= 1 && nums[pivot] <= nums[pivot-1]) {
            --pivot;
        }

        // Swap or Skip depending on if we found a pivot point
        if (pivot != 0) {
            // Find 1st num > pivot
            int i = n-1;
            while (nums[i] <= nums[pivot-1]) i--;
            swap(nums, pivot-1, i);
        }

        // Reverse the right side of pivot
        int left = pivot;
        int right = n-1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1) in place
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
