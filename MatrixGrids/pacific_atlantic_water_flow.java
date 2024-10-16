class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        int rowLen = heights.length, colLen = heights[0].length;
        if (rowLen == 0 || colLen == 0 || heights == null) {
            return result;
        }

        // Keep track to see if block is reachable by each ocean
        boolean[][] pacificReachable = new boolean[rowLen][colLen];
        boolean[][] atlanticReachable = new boolean[rowLen][colLen];

        // Pacific Ocean: Checking from Top, Left
        for (int r = 0; r < rowLen; r++) 
            checkIslandBlock(heights, pacificReachable, r, 0);
        for (int c = 0; c < colLen; c++) 
            checkIslandBlock(heights, pacificReachable, 0, c);

        // Atlantic Ocean: Checking from Bottom, Right
        for (int r = rowLen-1; r >= 0; r--) 
            checkIslandBlock(heights, atlanticReachable, r, colLen-1);
        for (int c = colLen-1; c >= 0; c--) 
            checkIslandBlock(heights, atlanticReachable, rowLen-1, c);

        // Cross check the boolean values
        for (int r = 0; r < rowLen; r++) {
            for (int c = 0; c < colLen; c++) {
                if (pacificReachable[r][c] && atlanticReachable[r][c])
                    result.add(new ArrayList<>(Arrays.asList(r, c)));
            }
        }

        // Time Complexity: O(r * c)
        // Space Complexity: O(r * c)
        return result;
    }

    // This method will continue to mark islands TRUE that greater than the current block
    // this is correct because we will start from the ocean and move inward
    private void checkIslandBlock(int[][] heights, boolean[][] reachable, int r, int c) {
        reachable[r][c] = true;

        // From the starting block, check all directions U, D, L, R
        int[][] directions = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
        for (int[] d : directions) {
            int newRow = r + d[0];
            int newCol = c + d[1];

            // Keep moving in that direction if its valid
            if (newRow >= 0 && newRow < heights.length &&
                newCol >= 0 && newCol < heights[0].length &&
                !reachable[newRow][newCol] &&
                heights[r][c] <= heights[newRow][newCol]) {
                    checkIslandBlock(heights, reachable, newRow, newCol);
                }
        }
    }
}
