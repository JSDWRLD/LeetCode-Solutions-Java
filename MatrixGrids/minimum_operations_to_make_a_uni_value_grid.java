class Solution {
    public int minOperations(int[][] grid, int x) {
        int n = grid.length, m = grid[0].length;
        int total = n*m;
        int[] nums = new int[total];
        int nP = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                int curr = grid[r][c];
                nums[nP++] = curr;
            }
        }

        Arrays.sort(nums);
        int median = nums[total/2];
        int ops = 0;
        for (int i = 0; i < total; i++) {
            int curr = nums[i];
            if (curr % x != median % x) return -1;
            // This is to get the number of ops to make curr equal to median
            ops += Math.abs(median - curr) / x;
        }

        // Time Complexity: O(m*n log (m*n))
        // Space Complexity: O(m*n)
        return ops;
    }
}
