class Solution {
    public int orangesRotting(int[][] grid) {
        int rowLen = grid.length, colLen = grid[0].length;
        Queue<int[]> rottenOranges = new LinkedList<>();

        int freshOranges = 0;
        for (int r = 0; r < rowLen; r++) {
            for (int c = 0; c < colLen; c++) {
                if (grid[r][c] == 2) {
                    rottenOranges.add(new int[] {r, c});
                } else if (grid[r][c] == 1) {
                    freshOranges += 1;
                }
            }
        }
        
        // BFS on Graph
        int[][] directions = { {-1,0}, {1,0}, {0,-1}, {0,1} };
        int elapsedTime = 0;
        while (!rottenOranges.isEmpty() && freshOranges != 0) {
            int levelSize = rottenOranges.size();
            elapsedTime += 1;

            for (int i = 0; i < levelSize; i++) {
                int[] rottenOrange = rottenOranges.poll();
                int rottenX = rottenOrange[0];
                int rottenY = rottenOrange[1];

                for (int[] dir : directions) {
                    int updateX = rottenX + dir[0];
                    int updateY = rottenY + dir[1];
                    if (updateX < 0 ||
                        updateY < 0 ||
                        updateX >= rowLen ||
                        updateY >= colLen ||
                        grid[updateX][updateY] != 1) 
                        {
                            continue;
                        }

                    freshOranges -= 1;
                    grid[updateX][updateY] = 2;
                    rottenOranges.offer(new int[] {updateX, updateY});
                }
            }
        }
        
        // Time Complexity: O(r * c)
        // Space Complexity: O(r * c)
        if (freshOranges != 0) return -1;
        return elapsedTime;
    }
}
