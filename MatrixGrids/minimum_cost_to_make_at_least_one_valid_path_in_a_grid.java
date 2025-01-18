class Solution {

    private final int[][] dirs = {
        {0, 1},
        {0, -1},
        {1, 0},
        {-1, 0}
    };

    public int minCost(int[][] grid) {
        int numRows = grid.length, numCols = grid[0].length;

        // Initialize our minimum cost array which will track cost to reach
        // each cell
        int [][] minCost = new int[numRows][numCols];
        for (int [] row : minCost) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        Deque<int[]> deque = new ArrayDeque<>();
        deque.offerFirst(new int[] {0,0});
        minCost[0][0] = 0;

        while (!deque.isEmpty()) {
            int[] curr = deque.pollFirst();
            int row = curr[0], col = curr[1];

            // Try all four directions
            for (int dir = 0; dir < 4; dir++) {
                int newRow = row + dirs[dir][0];
                int newCol = col + dirs[dir][1];
                int cost = (grid[row][col] != (dir + 1)) ? 1 : 0;

                // If position is valid and we found a better path
                if (
                    isValid(newRow, newCol, numRows, numCols) &&
                    minCost[row][col] + cost < minCost[newRow][newCol]
                ) {
                    minCost[newRow][newCol] = minCost[row][col] + cost;

                    // Add to back if cost=1, front if cost=0
                    if (cost == 1) {
                        deque.offerLast(new int[] { newRow, newCol });
                    } else {
                        deque.offerFirst(new int[] { newRow, newCol });
                    }
                }
            }
        }

        // Time Complexity: O(n * m)
        // Space Complexity: O(n * m)
        return minCost[numRows - 1][numCols - 1];
    }

    private boolean isValid(int row, int col, int numRows, int numCols) {
        return row >= 0 && row < numRows && col >= 0 && col < numCols;
    }
}

// Anytime you see a down arrow take it unless on last row
// if on last row prioritize going straight
//
