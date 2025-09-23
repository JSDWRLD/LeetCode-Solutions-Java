class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();
        if (numRows == 1 || numRows >= n) return s; // rows is never greater than input string

        // List of size rows, each one having a string
        // each row is considered its own string
        ArrayList<StringBuilder> rows = new ArrayList<>();
        for (int r = 0; r < numRows; r++) rows.add(new StringBuilder());

        int currRow = 0; // start row 0
        int step = 1; // move forward or backward 1 row

        // we can oscilate the insertion of rows
        for (char c : s.toCharArray()) 
        { // now find a row to place characters
            rows.get(currRow).append(c);

            // increment or decrement
            currRow += step; 
            if (currRow == numRows - 1 || currRow == 0) {
                step *= -1; // flip
            }
        }

        // Concat all rows top down order 0-numRows
        StringBuilder result = new StringBuilder();
        for (StringBuilder r : rows) {
            result.append(r.toString());
        }

        // n is length of input string
        // Time Complexity: O(n)
        // Space Complexity: O(n), rowArray
        return result.toString();
    }
}

