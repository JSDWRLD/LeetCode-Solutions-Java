class Solution {
    public int largestIsland(int[][] grid) {
        // Make a map for sum of island
        // Make another dfs function to get sum of island 1+dfs call
        // then as we iterate through creating the islands, the key for them
        // is going be starting at 2 incrementing up
        // the reason is because we have a 0, 1
        int n = grid.length, islandNum = 2;
        HashMap<Integer, Integer> islandSumMap = new HashMap<>();
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == 1) {
                    int sum = dfsMarkIsland(grid, r, c, islandNum);
                    islandSumMap.put(islandNum, sum);
                    islandNum += 1;
                } 
            }
        }

        if (islandSumMap.size() == 0) return 1; // No 1's, we can make size 1
        if (islandSumMap.size() == 1) {
            --islandNum;
            return (islandSumMap.get(islandNum) == n*n)
                ? islandSumMap.get(islandNum) // No zeros
                : islandSumMap.get(islandNum) + 1; // If its one island but there are zeros
        }

        // Once we made our island map check what happens when we flip 0->1
        // add the sum of the islands U,D,L,R then +1
        int maxIslandSize = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == 0) {
                    // Call external func to
                    // sum up all the neighbors + 1 and return, pass map
                    int connectedSize = getConnectedSum(grid, r, c, islandSumMap);
                    maxIslandSize = Math.max(maxIslandSize, connectedSize);
                }
            }
        }

        // Time Complexity: O(r*c)
        // Space Complexity: O(r*c)
        return maxIslandSize;
    }

    private int getConnectedSum(
        int[][] grid, 
        int r, 
        int c, 
        HashMap<Integer, Integer> islandSumMap
    ) {
        int[][] dirs = new int[][] {{1,0}, {-1,0}, {0,1}, {0,-1}};
        
        int sum = 1;
        Set<Integer> neighboringIslands = new HashSet<>();
        for (int[] d : dirs) {
            int newRow = r+d[0], newCol = c+d[1];
            if (newRow >= 0 
                && newCol >= 0 
                && newRow < grid.length 
                && newCol < grid.length
                && grid[newRow][newCol] > 1
            ) {
                int islandNum = grid[newRow][newCol];
                neighboringIslands.add(islandNum);
            }
        }

        for (int islandNum : neighboringIslands)
            sum += islandSumMap.get(islandNum);

        return sum;
    }

    private int dfsMarkIsland(int[][] grid, int r, int c, int islandNum) {
        if (r < 0 || c < 0 ||
            r >= grid.length ||
            c >= grid.length ||
            grid[r][c] != 1
            ) return 0;
        
        grid[r][c] = islandNum;
        return 1 + dfsMarkIsland(grid, r+1, c, islandNum) 
            + dfsMarkIsland(grid, r-1, c, islandNum) 
            + dfsMarkIsland(grid, r, c+1, islandNum) 
            + dfsMarkIsland(grid, r, c-1, islandNum);
    }
}   
