class Solution {
    public boolean exist(char[][] board, String word) {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (dfs(board, word, r, c, 0)) {
                    return true;
                } 
            }
        }

        // Time Complexity: O(R * C * dfs)
        // Space Complexity: O(1)
        return false;
    }
    
    // DFS Backtracking approach, Time Complexity of DFS is 4^wordlength dfs calls
    private boolean dfs(char[][] board, String word, int r, int c, int curr) {
        if (curr == word.length()) return true;
        if (r < 0 || c < 0 || r >= board.length|| c >= board[0].length || board[r][c] != word.charAt(curr)) return false;
        
        boolean exists = false;
        if (board[r][c] == word.charAt(curr)) {
            board[r][c] += 105; // Mark character so we don't reuse in this iteration
            exists = 
                dfs(board, word, r+1, c, curr + 1) ||
                dfs(board, word, r-1, c, curr + 1) ||
                dfs(board, word, r, c+1, curr + 1) ||
                dfs(board, word, r, c-1, curr + 1);

            board[r][c] -= 105; // Restore character in this check iteration
        }

        return exists;
    }
}
