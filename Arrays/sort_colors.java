class Solution {
    public void sortColors(int[] nums) {
        int zeroP = 0, twoP = nums.length-1, i = 0;
        while (i <= twoP) {
            if (nums[i] == 0) {
                swap(nums, zeroP, i);
                zeroP++;
                i++;
            } else if (nums[i] == 2) {
                swap(nums, twoP, i);
                twoP--;
            } else {
                i++;
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
    }

    private void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
