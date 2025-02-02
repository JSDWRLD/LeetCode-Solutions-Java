class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        if (n == 1) return true;

        int countRotation = 0;
        for (int i = 1; i < nums.length; i++) {
            int prev = nums[i-1], curr = nums[i];
            if (prev > curr) countRotation += 1;
        }

        if (nums[0] < nums[n-1]) countRotation += 1;

        // Only one case of where prev > curr is valid, otherwise original wasn't sorted
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return countRotation <= 1;
    }
}

// 3, 4, 5, 1, 2
// One count where prev > curr 5/1
// 2, 1, 3, 4
// two counts where prev > curr, 2/1 and 2/4
// 6, 7, 7, 5
// only one count prev > curr 7/5
