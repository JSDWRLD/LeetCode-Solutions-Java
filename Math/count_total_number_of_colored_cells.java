class Solution {
    public long coloredCells(int n) {
        // Time Complexity: O(1)
        // Space Complexity: O(1)
       return 1 + (long) 2 * n * (n-1);
    }
}
