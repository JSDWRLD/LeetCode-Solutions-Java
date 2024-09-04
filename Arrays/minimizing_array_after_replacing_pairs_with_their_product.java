class Solution {
    public int minArrayLength(int[] nums, int k) {
        int result = 1;
        long total = nums[0]; // Prevent overflow into int, big numbers

        for(int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            
            // If we find 0 we can make length [0] == 1
            if(curr == 0) return 1;

            // If then reset total to current and add to result,
            if(total * curr > k) {
                total = curr;
                result++;
            } else {
                // Continue to add to running total
                total *= curr;
            }
        }

        // Minimum Length is returned
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return result;
    }
}
