class Solution {
    public int minimumArea(int[][] grid) {
        // area is just len * height
        // where it equals 1
        // find min col, max col
        // find min row, max row
        int minRow = grid.length, maxRow = 0;
        int minCol = grid[0].length, maxCol = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    minRow = Math.min(minRow, r);
                    maxRow = Math.max(maxRow, r);
                    minCol = Math.min(minCol, c);
                    maxCol = Math.max(maxCol, c);
                }
            }
        }

        // Time Complexity: O(r * c)
        // Space Complexity: O(1)
        return (maxRow - minRow + 1) * (maxCol - minCol + 1);
    }
}
