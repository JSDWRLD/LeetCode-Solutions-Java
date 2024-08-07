class Solution {
    public void rotate(int[][] m) {
        int len = m.length, top = 0, bot = len-1;
        
        // Flip the horizontal numbers until we hit center
        while (top < bot) {
            for (int col = 0; col < len; col++) {
                int temp = m[top][col];
                m[top][col] = m[bot][col];
                m[bot][col] = temp;
            }
            top++;
            bot--;
        }

        // Flip diagonally, we can swap diagonally by switching
        // col and row indexes
        for (int row = 0; row < len; row++) {
            for (int col = row+1; col < len; col++) {
                int temp = m[row][col];
                m[row][col] = m[col][row];
                m[col][row] = temp;
            }
        }

        // Time Complexity: O(r * c)
        // Space Complexity: O(1)
    }
}
