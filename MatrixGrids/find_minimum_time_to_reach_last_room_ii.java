class Solution {
    public int minTimeToReach(int[][] moveTime) {
        // Define directions for each vertex
        int[][] dirs = new int[][]{ {0,-1}, {0,1}, {-1, 0}, {1,0} };
        int row = moveTime.length, col = moveTime[0].length;

        int[][] dist = new int[row][col];
        for (int[] r : dist) {
            Arrays.fill(r, Integer.MAX_VALUE);
        }

        // Set source to 0
        dist[0][0] = 0;
        
        // make priority queue with quadruplet
        // stores, dist, indices i/j, and whether or not we alternate moves
        // 4th index 0 == add 1, 1  == add 2
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        pq.offer(new int[] {0, 0, 0, 0});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int currDist = curr[0], currI = curr[1], currJ = curr[2];
            int alt = curr[3]; // 0 add 1, 1 add 2

            // Early exit condition
            if (currI == row-1 && currJ == col-1) 
                return dist[currI][currJ];

            // Check all directions
            for (int[] d : dirs) {
                int dI = currI + d[0];
                int dJ = currJ + d[1];

                // Skip if not within bounds
                if (dI < 0 || dJ < 0 || dI >= row || dJ >= col) continue;

                int add = 1;
                if (alt == 1) {
                    add = 2;
                } 

                int nextDist = Math.max(currDist, moveTime[dI][dJ]) + add;
                if (nextDist < dist[dI][dJ]) {
                    dist[dI][dJ] = nextDist;

                    int newAlt;
                    if (alt == 1) newAlt = 0;
                    else newAlt = 1;

                    pq.offer(new int[] {nextDist, dI, dJ, newAlt});
                }
            }
        }
        
        // Let k = r*c
        // Time Complexity: O(k log k) 
        // Space Complexity: O(k)
        return dist[row-1][col-1];
    }
}
