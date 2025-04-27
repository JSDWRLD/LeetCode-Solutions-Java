class Solution {
    public int countSubarrays(int[] nums) {
        int count = 0;
        for (int i = 2; i < nums.length; i++) {
            if (isGood(nums[i-2], nums[i-1], nums[i])) count++;
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return count;
    }

    private boolean isGood(int first, int second, int third) {
        return second % 2 == 0 && first+third == (second/2);
    }
}
