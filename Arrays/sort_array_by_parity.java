class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int evenP = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (curr % 2 == 0) {
                nums[i] = nums[evenP];
                nums[evenP] = curr;
                evenP++;
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return nums;
    }
}
