class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        int lenR = m.length, lenC = m[0].length; 
        int r = 0, c = -1, d = 1; // Pointers for row and col

        List<Integer> res = new ArrayList<>();
        while (lenR > 0 && lenC > 0) {
            // Move our column pointer from L to R or L to R
            // depending on adding 1 or -1 from c
            for (int i = 0; i < lenC; i++) {
                c += d;
                res.add(m[r][c]);
            }
            lenR--; // Remove the row when finished with it

            // Move our row pointer from Top to Bottom or Bottom to Top
            // depending on adding 1 or -1 from r
            for (int i = 0; i < lenR; i++) {
                r += d;
                res.add(m[r][c]);
            }
            lenC--; // Remove the col when finished with it
            
            d *= -1; // Change our incrementer to decrementer, vice versa
        }

        // Time Complexity: O(r * c)
        // Space Complexity: O(1)
        return res;
    }
}
