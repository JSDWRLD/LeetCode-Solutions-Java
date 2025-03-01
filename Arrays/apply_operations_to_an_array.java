class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n-1; i++) {
            if (nums[i] == nums[i+1] && nums[i] != 0) {
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }

        int nonzeroEndIndex = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[nonzeroEndIndex] = nums[i];
                nonzeroEndIndex++;
            }
        } 

        while (nonzeroEndIndex < n) {
            nums[nonzeroEndIndex] = 0;
            nonzeroEndIndex++;
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return nums;
    }
}
