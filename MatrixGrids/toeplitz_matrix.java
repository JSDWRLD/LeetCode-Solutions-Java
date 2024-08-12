class Solution {
    public boolean isToeplitzMatrix(int[][] m) {
        HashMap<Integer, Integer> map = new HashMap<>(); // Store diagonals.
        int rLen = m.length, cLen = m[0].length;

        for (int row = 0; row < rLen; row++) {
            for (int col = 0; col < cLen; col++) {
                // Unique identify for each diagonal can be found with
                // row - col, we can use this as a key to store value
                // of the diagonal and check at every step.

                int diagID = row - col + (cLen - 1); // cLen - 1 is offset
                if (map.containsKey(diagID)) 
                    if (map.get(diagID) != m[row][col])
                        return false;

                map.put(diagID, m[row][col]);
            }
        }

        // Time Complexity: O(r * c)
        // Space Complexity: O(d)
        return true;
    }
}
