class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currStreak = 0, maxStreak = 0;
        for (int i = 0; i < nums.length; i++) {
            currStreak = nums[i] == 1 ? currStreak+1 : 0;
            maxStreak = Math.max(currStreak, maxStreak);
        }
        
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return maxStreak;
    }
} 
