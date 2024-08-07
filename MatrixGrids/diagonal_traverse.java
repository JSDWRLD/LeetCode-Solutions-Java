class Solution {
    public int[] findDiagonalOrder(int[][] m) {
        int lenR = m.length, lenC = m[0].length;
        int row = 0, col = 0; // Indexes
        boolean goingUp = true; // Indicator for the direction we are going

        int[] res = new int[lenR*lenC];
        int i = 0;

        // Continue traversal until our res array is filled
        while (i != lenR*lenC) {
            if (goingUp) {
                // Traverse upward until we are out of bounds
                while (row >= 0 && col < lenC) {
                    res[i] = m[row][col];
                    row--;
                    col++;
                    i++;
                }
                if (col == lenC) {
                    // Reset Base Case 1
                    row += 2;
                    col -= 1;
                } else { 
                    // Reset Base Case 2
                    row += 1;
                }
                // Reset direction of diagonal traversal
                goingUp = false;
            } else {
                // Traverse downward until out of bounds
                while (col >= 0 && row < lenR) {
                    res[i] = m[row][col];
                    row++;
                    col--;
                    i++;
                }
                if (row == lenR) {
                    // Reset Base Case 1
                    col += 2;
                    row -= 1;
                } else {
                    // Reset Base Case 2
                    col += 1;
                }
                // Reset direction of diagonal traversal
                goingUp = true;
            }
        }

        // Time Complexity: O(r * c)
        // Space Complexity: O(1)
        return res;
    }
}
