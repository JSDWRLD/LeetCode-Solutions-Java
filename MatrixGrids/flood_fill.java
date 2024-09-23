class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        fillWithColor(image, sr, sc, color, image[sr][sc]);

        // Time Complexity: O(r * c)
        // Space Complexity: O(r * c)
        return image;
    }

    private void fillWithColor(int[][] image, int r, int c, int color, int start) {
        if (r < 0 || c < 0 || r >= image.length || c >= image[0].length || image[r][c] != start || image[r][c] == color) {
            return;
        }

        image[r][c] = color;
        fillWithColor(image, r-1, c, color, start);
        fillWithColor(image, r+1, c, color, start);
        fillWithColor(image, r, c+1, color, start);
        fillWithColor(image, r, c-1, color, start);
    }
}
