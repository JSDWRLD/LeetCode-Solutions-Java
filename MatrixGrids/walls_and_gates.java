class Solution {
    public void wallsAndGates(int[][] rooms) {
        Queue<int[]> q = new LinkedList<>();
        int rowLen = rooms.length, colLen = rooms[0].length;

        for (int r = 0; r < rowLen; r++) {
            for (int c = 0; c < colLen; c++) {
                if (rooms[r][c] == 0) {
                    q.add(new int[] {r, c});
                }
            }
        }

        if (q.size() == 0) return;
        int[][] dirs = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int currRow = curr[0], currCol = curr[1];

            for (int[] dir : dirs) {
                int moveX = currRow + dir[0];
                int moveY = currCol + dir[1];
                if (moveX < 0 ||
                    moveY < 0 ||
                    moveX >= rowLen ||
                    moveY >= colLen ||
                    rooms[moveX][moveY] != Integer.MAX_VALUE)
                    {
                        continue;
                    }

                q.add(new int[] {moveX, moveY});

                rooms[moveX][moveY] = rooms[currRow][currCol] + 1;
            }
        }

        // Time Complexity: O (r * c)
        // Space Complexity: O (r * c)
    } 
}
