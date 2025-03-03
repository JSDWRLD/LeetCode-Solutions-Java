class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        int i = 0;
        int[] ans = new int[nums.length];
        for (int n : nums) {
            if (n < pivot) {
                ans[i++] = n;
            }
        }

        for (int n : nums) {
            if (n == pivot) {
                ans[i++] = n;
            }
        }

        for (int n : nums) {
            if (n > pivot) {
                ans[i++] = n;
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return ans;
    }
}
