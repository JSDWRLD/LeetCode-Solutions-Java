class Solution {
    public long[] minCost(int n, int[][] roads, int[] appleCost, int k) {
        List<List<int[]>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] edge : roads) {
            int node1 = edge[0]-1;
            int node2 = edge[1]-1;
            int cost = edge[2];
            adjList.get(node1).add(new int[] {node2, cost});
            adjList.get(node2).add(new int[] {node1, cost});
        }

        long[] ans = new long[n];
        for (int node = 0; node < n; node++) { // O (v)
            // do shortest path alg
            // O(vlogv + elogv)
            ans[node] = shortestPath(node, adjList, appleCost, k, n);
        }

        // Time Complexity: O(v(v + e)log v)
        // Space Complexity: O(v + e)
        return ans;
    }

    private long shortestPath(int source, List<List<int[]>> adjList, int[] appleCost, int k, int n) {
        
        int[] travelCost = new int[n];
        Arrays.fill(travelCost, Integer.MAX_VALUE);
        travelCost[source] = 0;

        // Compare the travel cost, a[0] = cost, a[1] = node
        Queue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[] {0, source}); 

        long min = Integer.MAX_VALUE;
        // Build shortest path with edge weights

        // O(vlogv + elogv)
        while (!pq.isEmpty()) {
            int[] curr = pq.poll(); // O(v log v)
            int cost = curr[0];
            int node = curr[1];

            // At each step, update our min to see if total apple cost + travel cost is 
            // minimum
            min = Math.min(min, (long)(appleCost[node] + cost*(k+1)));

            for (int[] pair : adjList.get(node)) { // O(e) aggregate
                int neighbor = pair[0];
                int nextCost = cost + pair[1]; // pair[1] cost
                if (nextCost < travelCost[neighbor]) {
                    pq.offer(new int[] {nextCost, pair[0]}); // O(e log v)
                    travelCost[pair[0]] = nextCost;
                }
            }
        }

        return min;
    }
}
