class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int n : nums) {
            // Log base 10 can get digitCount
            int digits = (int)(Math.floor(Math.log10(n))) + 1;
            if (digits % 2 == 0) count++;
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return count;
    }
}
