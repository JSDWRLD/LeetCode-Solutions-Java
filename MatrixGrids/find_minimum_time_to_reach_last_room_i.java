class Solution {
    public int minTimeToReach(int[][] moveTime) {
        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

        // 2d array, where dist[i][j] = curr dist, all infinity first
        int r = moveTime.length, c = moveTime[0].length;
        int[][] distance = new int[r][c];
        for (int[] row : distance) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        
        // priority queue that takes a triple, storing the time, and indices
        // enqueue the source with 0 time, and 0,0 pos
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        pq.offer(new int[] {0,0,0});
        
        while (!pq.isEmpty()) { 
            int[] curr = pq.poll(); // -> vertices * extractions
            int currTime = curr[0];
            int currI = curr[1], currJ = curr[2];
            
            for (int[] direction : dirs) {
                int nextI = currI + direction[0];
                int nextJ = currJ + direction[1];

                // Not valid, skip this direction
                if (nextI < 0 || nextJ < 0 || nextI >= r || nextJ >= c) continue;

                // We will always take the maximum time out of the edges
                int nextDist = Math.max(currTime, moveTime[nextI][nextJ]) + 1;
                if (distance[nextI][nextJ] > nextDist) {
                    distance[nextI][nextJ] = nextDist;

                    // edges * inserts
                    pq.offer(new int[] {nextDist, nextI, nextJ}); 
                }
            }
        }


        // Consider r*c = k
        // Time Complexity: O(k * log(k)) -> k vertices and edges
        // Space Complexity: O(k) -> Distance array, and priority queue
        return distance[r-1][c-1];
    }
}
