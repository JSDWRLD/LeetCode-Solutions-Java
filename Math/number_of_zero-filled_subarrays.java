class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long streak = 0;
        long result = 0;

        for (int n : nums) {
            if (n == 0) {
                streak++;
                result += streak;
            }
            else {
                streak = 0;
            }
        }
        
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return result;
    }
}
