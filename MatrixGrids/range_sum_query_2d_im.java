class NumMatrix {
    private int[][] prefixSum;
    // O (n)
    public NumMatrix(int[][] matrix) {
        // Map entire matrix
        int n = matrix.length, m = matrix[0].length;
        prefixSum = new int[n+1][m+1];

        // Build prefix sum, by adding the left and right minus the top left
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                prefixSum[r+1][c+1] = prefixSum[r+1][c] + prefixSum[r][c+1] -
                                      prefixSum[r][c] + matrix[r][c];
            }
        }
    }
    
    // O (1)
    public int sumRegion(int row1, int col1, int row2, int col2) {
        // Subtract the left section and the top section. Add back the top left section of prefix sum
        // The reason being is because we subtracted it twice.
        return prefixSum[row1][col1] + prefixSum[row2+1][col2+1] - prefixSum[row1][col2+1] - prefixSum[row2+1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
