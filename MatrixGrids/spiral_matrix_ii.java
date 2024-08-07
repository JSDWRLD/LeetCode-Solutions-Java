class Solution {
    public int[][] generateMatrix(int n) {
        int rLen = n, cLen = n;
        int rI = 0, cI = -1, dir = 1, toAdd = 1;

        int[][] res = new int[rLen][cLen];

        while (rLen > 0 && cLen > 0) {
            
            for (int i = 0; i < cLen; i++) {
                cI += dir;
                res[rI][cI] = toAdd;
                toAdd++;
            }
            rLen--;

            for (int i = 0; i < rLen; i++) {
                rI += dir;
                res[rI][cI] = toAdd;
                toAdd++;
            }
            cLen--;

            dir *= -1;
        }

        // Time Complexity: O(r * c)
        // Space Complexity: O(1)
        return res;
    }
}
