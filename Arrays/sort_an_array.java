class Solution {
    public int[] sortArray(int[] nums) {
        for (int gap =  nums.length/2; gap > 0; gap /= 2) {
            for (int i = gap; i < nums.length; i++) {
                int value = nums[i];
                int j = i;

                while (j >= gap && nums[j - gap] > value) {
                    nums[j] = nums[j - gap];
                    j -= gap;
                }

                nums[j] = value;
            }
        }

        // Time Complexity: O(n^r) where 1 < r < 2, shell sort is weird
        // Space Complexity: O(1)
        // Stable: N
        // Online: N
        return nums;
    }
}
