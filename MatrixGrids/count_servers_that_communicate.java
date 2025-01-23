class Solution {
    public int countServers(int[][] grid) {
        int rowLen = grid.length, colLen = grid[0].length;
        int[] rowCount = new int[rowLen];
        int[] colCount = new int[colLen];

        for (int r = 0; r < rowLen; r++) {
            for (int c = 0; c < colLen; c++) {
                if (grid[r][c] == 1) {
                    rowCount[r] += 1;
                    colCount[c] += 1;
                }
            }
        }

        int result = 0;
        for (int r = 0; r < rowLen; r++) {
            for (int c = 0; c < colLen; c++) {
                if (grid[r][c] == 1 && 
                (rowCount[r] > 1 || colCount[c] > 1)) {
                    result += 1;
                } 
            }
        }
        
        // Time Complexity: O(r * c)
        // Space Complexity: O(r + c)
        return result;
    }
}
