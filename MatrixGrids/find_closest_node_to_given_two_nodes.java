class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        int[] dist1 = new int[n];
        int[] dist2 = new int[n];
        Arrays.fill(dist1, Integer.MAX_VALUE);
        Arrays.fill(dist2, Integer.MAX_VALUE);
        bfs(edges, node1, dist1);
        bfs(edges, node2, dist2);

        int minDist = Integer.MAX_VALUE, minDistNode = -1;
        for (int node = 0; node < n; node++) {
            if (minDist > Math.max(dist1[node], dist2[node])) {
                minDist = Math.max(dist1[node], dist2[node]);
                minDistNode = node;
            }
        }
        
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return minDistNode;
    }

    private void bfs(int[] edges, int src, int[] dist) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(src);

        boolean[] visit = new boolean[edges.length];

        dist[src] = 0;
        while (!q.isEmpty()) {
            int curr = q.poll();

            // break cycles
            if (visit[curr]) continue;

            visit[curr] = true;
            int neigh = edges[curr];
            if (neigh != -1 && !visit[neigh]) {
                dist[neigh] = dist[curr] + 1;
                q.offer(neigh);
                
            }
        }
    }
}
