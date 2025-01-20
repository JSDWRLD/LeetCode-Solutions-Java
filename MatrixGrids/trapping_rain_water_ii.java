class Solution {
    public int trapRainWater(int[][] heightMap) {
        int n = heightMap.length, m = heightMap[0].length;
        boolean[][] visited = new boolean[n][m];
        Queue<Node> heap = new PriorityQueue<>();

        // Check the two side columns
        for(int i = 0; i < n; i++){
            visited[i][0] = true;
            visited[i][m - 1] = true;
            heap.add(new Node(i, 0, heightMap[i][0]));
            heap.add(new Node(i, m - 1, heightMap[i][m - 1]));
        }
        // Check the top/bottom rows
        for(int j = 0; j < m; j++){
            visited[0][j] = true;
            visited[n - 1][j] = true;
            heap.add(new Node(0, j, heightMap[0][j]));
            heap.add(new Node(n - 1, j, heightMap[n - 1][j]));
        }

        int ans = 0;
        int[] dx = {0, 0, 1, -1}, dy = {1, -1, 0, 0}; // Directions
        while(!heap.isEmpty()){
            Node cur = heap.poll();

            // Check each direction
            for(int k = 0; k < 4; k++){
                int x = cur.x + dx[k];
                int y = cur.y + dy[k];
                // If we have a valid index and its not visited
                if(x >= 0 && y >= 0 && x < n && y < m && !visited[x][y]){
                    visited[x][y] = true;
                    
                    // If the current node's height is taller than
                    // the heightmap's new direction height then add to answer
                    // we already boxed out the edges before.
                    ans += Math.max(0, cur.h - heightMap[x][y]);
                    // Add the current direction to heap
                    heap.add(new Node(x, y, Math.max(cur.h, heightMap[x][y])));
                }
            }
        }

        // Time Complexity: O(n * m)
        // Space Complexity: O(n * m)
        return ans;
    }

    class Node implements Comparable<Node>{
        int x, y, h;
        Node(int x, int y, int h){
            this.x = x;
            this.y = y;
            this.h = h;
        }
        public int compareTo(Node that){
            return this.h - that.h;
        }
    }
}
