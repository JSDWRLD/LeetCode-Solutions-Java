class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int rLen = grid.length, cLen = grid[0].length;

        if (rLen < 3 || cLen < 3) return 0;
        
        int count = 0;
        for (int row = 0; row <= rLen - 3; row++) 
            for (int col = 0; col <= cLen - 3; col++) 
                if (checkMagic(row, col, grid)) count++;

        // Time Complexity: O(r * c)
        // Space Complexity: O(r * c)
        return count;
    }

    // Time Complexity is only O(9)
    private boolean checkMagic(int row, int col, int[][] grid) {
        int[] rowSum = new int[3];
        int[] colSum = new int[3];
        boolean[] seen = new boolean[10];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int curr = grid[row+i][col+j];
                rowSum[i] += curr;
                colSum[j] += curr;

                if (curr > 9 || curr == 0 || seen[curr] == true) 
                    return false;

                seen[curr] = true;
            }
        }

        for (int i = 0; i < 3; i++) 
            if (rowSum[i] != colSum[i]) return false;

        int dSum = grid[row][col] + grid[row+1][col+1] + 
                   grid[row+2][col+2];
        int dSum2 = grid[row+2][col] + grid[row+1][col+1] +
                    grid[row][col+2];

        if (dSum != dSum2 || dSum != rowSum[0]) return false;

        
        return true;
    }
}
