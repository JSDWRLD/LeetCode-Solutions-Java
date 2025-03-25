class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        // Time Complexity: O(n log n)
        // Space Complexity: O(1)
        return checkCuts(rectangles, 0) || checkCuts(rectangles, 1);
    }

    // dim = 0, check veritcal, dim = 1, check horizontal
    private boolean checkCuts(int[][] rectangles, int dim) {
        Arrays.sort(rectangles, (a,b) -> Integer.compare(a[dim], b[dim]));
        int gapsFound = 0;
        int furthestEnd = rectangles[0][dim + 2];
        for (int i = 1; i < rectangles.length; i++) {
            if (rectangles[i][dim] >= furthestEnd) gapsFound++;
            // Update to next furthest end
            furthestEnd = Math.max(furthestEnd, rectangles[i][dim+2]);
        }

        if (gapsFound >= 2) return true;
        return false;
    }   
}
