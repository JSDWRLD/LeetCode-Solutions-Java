class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        // If the starting or ending cell is blocked, return -1
        if (grid[0][0] == 1 || grid[grid.length - 1][grid[0].length - 1] == 1) {
            return -1;
        }

        // Directions for 8 possible moves (right, left, up, down, and diagonals)
        int[][] directions = {
            {0, 1}, {0, -1},  // Right, Left
            {1, 0}, {-1, 0},  // Down, Up
            {1, 1}, {1, -1},  // Bottom-right diagonal, Bottom-left diagonal
            {-1, 1}, {-1, -1} // Top-right diagonal, Top-left diagonal
        };

        int n = grid.length;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1});  // [row, col, distance]
        
        // Mark the starting cell as visited (set it to 1)
        grid[0][0] = 1;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0], c = curr[1], dist = curr[2];

            // If we reached the bottom-right corner, return the distance
            if (r == n - 1 && c == n - 1) {
                return dist;
            }

            // Explore all 8 possible directions
            for (int[] dir : directions) {
                int nr = r + dir[0];  // New row
                int nc = c + dir[1];  // New column

                // Check if the new position is within bounds and is not blocked
                if (nr >= 0 && nr < n && nc >= 0 && nc < n && grid[nr][nc] == 0) {
                    queue.offer(new int[]{nr, nc, dist + 1});
                    grid[nr][nc] = 1;  // Mark as visited
                }
            }
        }

        // If no path was found, return -1

        // Time Complexity: O(r * c)
        // Space Complexity: O(r * c)
        return -1;
    }
}
