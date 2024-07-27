class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Treat everything like a tuple, these are the 3 rules of the problem
        HashSet<Character>[] rowMap = new HashSet[9];
        HashSet<Character>[] colMap = new HashSet[9];
        HashSet<Character>[] boxMap = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rowMap[i] = new HashSet<>();
            colMap[i] = new HashSet<>();
            boxMap[i] = new HashSet<>();
        }
        
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                // we calculate the boxes that correspond with each other
                int boxNumber = 3 * (row/3) + (col/3);
                char current = board[row][col];

                if (current == '.') continue;

                if (rowMap[row].contains(current) || colMap[col].contains(current) 
                || boxMap[boxNumber].contains(current)) return false;

                rowMap[row].add(current);
                colMap[col].add(current);
                boxMap[boxNumber].add(current);
            }
        }

        // The reason why time complexity is constant is because there are a set amount of possiblities, for example
        // the amount of possible spots a number can be is 81.
        // Time Complexity: O(1)
        // Space Complexity: O(1)
        return true;
    }
}
