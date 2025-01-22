class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int rowLen = isWater.length, colLen = isWater[0].length;
        int[][] result = new int[rowLen][colLen];
        for (int r = 0; r < rowLen; r++) {
            for (int c = 0; c < colLen; c++) {
                result[r][c] = -1;
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        for (int r = 0; r < rowLen; r++) {
            for (int c = 0; c < colLen; c++) {
                if (isWater[r][c] == 1) {
                    result[r][c] = 0;
                    queue.offer(new int[] {r, c});
                }
            }
        }

        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        while (!queue.isEmpty()) {
            int[] currPos = queue.poll();
            int row = currPos[0], col = currPos[1];
            int currValue = result[row][col];
            for (int i = 0; i < 4; i++) {
                int updatedX = row + dx[i];
                int updatedY = col + dy[i];

                if (updatedX >= 0 && updatedY >= 0
                    && updatedX < rowLen && updatedY < colLen
                    && result[updatedX][updatedY] == -1) {
                        result[updatedX][updatedY] = currValue + 1;
                        queue.offer(new int[] {updatedX, updatedY});
                    }
            }
        }

        // Time Complexity: O(r * c)
        // Space Complexity: O(r * c)
        return result;
    }
}
