class Solution {
    public void solve(char[][] board) {
        int rowLen = board.length, colLen = board[0].length;
        if (rowLen <= 1 || colLen <= 1) return;
        
        // Checking border for a 'O' and run a DFS to convert
        // O's into a safe character we cannot change in our next pass
        for (int i = 0; i < rowLen || i < colLen; i++) {
            if (i < rowLen && board[i][0] == 'O') {
                convertDFS(board, 'T', i, 0);
            } 
            if (i < rowLen && board[i][colLen-1] == 'O') {
                convertDFS(board, 'T', i, colLen-1);
            }
            if (i < colLen && board[0][i] == 'O') {
                convertDFS(board, 'T', 0, i);
            } 
            if (i < colLen && board[rowLen-1][i] == 'O') {
                convertDFS(board, 'T', rowLen-1, i);
            }
        }

        // Capture O's and turn to X also converting T's back to O's
        for (int r = 0; r < rowLen; r++) {
            for (int c = 0; c < colLen; c++) {
                if (board[r][c] == 'O') board[r][c] = 'X';
                if (board[r][c] == 'T') board[r][c] = 'O';
            }
        }

        // Time Complexity: O (r * c)
        // Space Complexity: O (r * c)
    }

    private void convertDFS(char[][] board, char changeTo, int r, int c) {
        if (r < 0 || c < 0 ||
            r >= board.length ||
            c >= board[0].length ||
            board[r][c] != 'O') {
                return;
            }
        
        board[r][c] = changeTo;
        convertDFS(board, changeTo, r-1, c);
        convertDFS(board, changeTo, r+1, c);
        convertDFS(board, changeTo, r, c-1);
        convertDFS(board, changeTo, r, c+1);
    }
}
