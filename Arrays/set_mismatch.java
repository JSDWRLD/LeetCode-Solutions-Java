class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int j = nums[i] - 1;
            if (nums[i] != nums[j]) {
                // sort
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            } else {
                i++;
            }
        }

        // After sorting, we make sure each index has 
        // its value, index 0 should have 1, so forth
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[] {nums[index], index+1};
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return new int[] {-1, -1};
    }
}
