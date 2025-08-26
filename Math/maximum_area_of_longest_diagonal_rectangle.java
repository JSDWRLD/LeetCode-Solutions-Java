class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max = -1;
        int maxArea = 0;
        for (int i = 0; i < dimensions.length; i++) {
            int len = dimensions[i][0];
            int width = dimensions[i][1];
            
            // Doesnt matter if we sqrt or not, just using as metric
            int diag = (len*len) + (width*width);
            int area = len * width;
            if (diag > max) {
                max = diag;
                maxArea = area;
            } else if (diag == max) {
                max = diag;
                maxArea = Math.max(area, maxArea);
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return maxArea;
    }
}
