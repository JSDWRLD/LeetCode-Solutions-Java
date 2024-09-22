class Solution {
    public void moveZeroes(int[] nums) {
        int p1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[p1];
                nums[p1] = temp;
                p1 += 1;
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
    }
}

