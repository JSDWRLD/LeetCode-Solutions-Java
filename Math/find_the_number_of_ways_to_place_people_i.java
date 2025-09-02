class Solution {
    public int numberOfPairs(int[][] points) {
        int n = points.length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            int[] a = points[i];
            for (int j = 0; j < n; j++) {
                int[] b = points[j];

                // if same index, or not A not top left of B 
                if (i == j || !(a[0] <= b[0] && a[1] >= b[1])) {
                    continue; 
                }  

                if (n == 2) {
                    result++;
                    continue;
                }

                // if they are check all the points
                boolean valid = true;
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;

                    int[] p = points[k];
                    if (contains(a[0], a[1], b[0], b[1], p[0], p[1])) {
                        valid = false;
                        break;
                    }
                }

                if (valid) result++;
            }
        }
        
        // Time Complexity: O(n^3)
        // Space Complexity: O(1)
        return result;
    }

    // area check, x1, y1 / x2, y2 / px, py
    public boolean contains(int x1, int y1, int x2, int y2, int px, int py) {

        // Check if the point's coordinates are within the determined ranges
        return (x1 <= px  && px <= x2) && (y2 <= py && py <= y1);
    }
}
