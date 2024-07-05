class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == '1') {
                    count++;
                    dfs(grid, row, col);
                }
            }
        }

        // Time Complexity: O(r * c)
        // Space Complexity: O(r * c), call stack
        return count;
    }

    private void dfs(char[][] grid, int row, int col) {
        if (
            row >= grid.length ||
            col >= grid[0].length ||
            row < 0 || 
            col < 0 || 
            grid[row][col] == '0' 
            ) return;
        
        // Ensuring we mark all the connecting 1's are explored
        grid[row][col] = '0';
        dfs(grid, row + 1, col);
        dfs(grid, row, col + 1);
        dfs(grid, row - 1, col);
        dfs(grid, row, col - 1);
    }
}
