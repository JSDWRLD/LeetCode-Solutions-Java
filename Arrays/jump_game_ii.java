class Solution {
    public int jump(int[] nums) {
        int totalJumps = 0;

        int currEnd = 0, maxJump = 0;

        for (int i = 0; i < nums.length-1; i++) {
            maxJump = Math.max(maxJump, i + nums[i]);

            if (i == currEnd) {
                currEnd = maxJump;
                totalJumps += 1;
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return totalJumps;
    }
}
