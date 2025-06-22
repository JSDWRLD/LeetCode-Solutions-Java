class Solution {
    private int[][] dirs;
    private boolean[][] visited;
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        dirs = new int[][]{{0,1}, {0,-1}, {1,0}, {-1,0}};
        visited = new boolean[maze.length][maze[0].length];

        // Rows and columns
        // Time Complexity: O(r * c)
        // Space Complexity: O(r * c)
        return dfs(maze, start, destination);
    }
    
    private boolean dfs(int[][] maze, int[] curr, int[] dest) {
        if (visited[curr[0]][curr[1]]) return false;
        if (curr[0] == dest[0] && curr[1] == dest[1]) return true;

        visited[curr[0]][curr[1]] = true;
        for (int[] dir : dirs) {
            int x = curr[0], y = curr[1];
            int dx = dir[0], dy = dir[1];
            while (x >= 0 && x < maze.length && 
                y >= 0 && y < maze[0].length && maze[x][y] == 0) {
                x += dx;
                y += dy;
            }

            if (dfs(maze, new int[] {x-dx, y-dy}, dest)) 
                return true;
        }

        return false;
    }
    // dfs func at start == curr
    // if curr == visited, means we tried starting here and didnt work
    // if curr == dest then true
    // dirs array try each
    // for 4 directions
        // while loop to go to the end of that direction

        // if dfs again then return true
    // else false when break

}
