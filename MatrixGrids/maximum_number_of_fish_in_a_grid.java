class Solution {
    // Make a directions array
    private int[][] dirs = new int[][] {{1,0}, {-1,0}, {0,1}, {0,-1}};

    public int findMaxFish(int[][] grid) {
        int maxFish = 0;

        // O(r * c)
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] > 0) {
                    // BFS Processes each node only once, we mark visited as we go
                    maxFish = Math.max(maxFish, bfs(grid, r, c));
                }
            }
        }

        // Time Complexity: O(r * c)
        // Space Complexity: O(r * c) all the nodes can be water and we store all in queue
        return maxFish;
    }

    private int bfs(int[][] grid, int r, int c) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {r,c});

        int sum = grid[r][c];
        grid[r][c] = 0;
        while (!queue.isEmpty()) {
            // Check all dirs if it is valid add to the queue
            int[] currCords = queue.remove();
            int row = currCords[0], col = currCords[1];

            for (int[] d : dirs) {
                int newRow = row+d[0], newCol = col+d[1];
                if (isWater(grid, newRow, newCol)) {
                    queue.add(new int[] {newRow, newCol});
                    sum += grid[newRow][newCol];
                    grid[newRow][newCol] = 0;
                }
            }            
        }

        return sum;
    }

    private boolean isWater(int[][] grid, int r, int c) {
        return r >= 0 && c >= 0 && r < grid.length && c < grid[0].length && grid[r][c] > 0;
    }
}
