class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        
        List<List<int[]>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        // Build adj List, 0 for red, 1 for blue 
        for (int[] edge : redEdges) {
            adjList.get(edge[0]).add(new int[] {edge[1], 0});
        }
        for (int[] edge : blueEdges) {
            adjList.get(edge[0]).add(new int[] {edge[1], 1});
        }

        // BFS, src is node 0
        int[] dist = new int[n];
        Arrays.fill(dist, -1);
        dist[0] = 0;

        boolean[][] visit = new boolean[n][2];
        Queue<int[]> q = new LinkedList<>();
        // Triple defines, node, steps, and color 
        // 0 red, blue 1
        q.offer(new int[] {0, 0, -1});

        visit[0][1] = visit[0][0] = true;

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int node = curr[0], steps = curr[1], prevColor = curr[2];

            for (int[] neigh : adjList.get(node)) {
                int neighbor = neigh[0];
                int color = neigh[1];
                if (!visit[neighbor][color] && prevColor != color) {
                    int nextStep = steps+1;
                    if (dist[neighbor] == - 1) dist[neighbor] = nextStep;
                    visit[neighbor][color] = true;
                    q.offer(new int[] {neighbor, nextStep, color});
                }
            }
        }

        // Time Complexity: O(v + e)
        // Space Complexity: O(v + e)
        return dist;
    }
}
