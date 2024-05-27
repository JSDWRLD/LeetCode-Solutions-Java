class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        // 0-indexed sort
        while (i < nums.length) {
            int j = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[j]) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            } else {
                i++;
            }
        }

        for (int m = 0; m < nums.length; m++) {
            if (nums[m] != m) {
                // return the out of place index
                return m;
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return nums.length;
    }
}
