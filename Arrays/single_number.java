class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;

        for (int n : nums) {
            res = res ^ n;
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return res;
    }
}
