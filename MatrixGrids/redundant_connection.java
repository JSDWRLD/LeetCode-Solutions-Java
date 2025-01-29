class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        // Stores the edges
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < edges.length; i++) {
            adjList.add(new ArrayList<>());
        }

        // We use num-1 for 0 indexing
        for (int[] e : edges) {
            boolean[] visited = new boolean[edges.length];
            // e[0] source, e[1] target
            int source = e[0]-1, target = e[1]-1;
            if (isConnected(adjList, source, target, visited)) return e;
            // Undirected graph must have both
            adjList.get(source).add(target);
            adjList.get(target).add(source);
        }

        // DFS is O(V + E) but v and e are equal
        // Time Complexity: O(n^2)
        // Space Complexity: O(n), n edges in adjList
        return new int[] {-1, -1};
    }
    
    // Perform DFS
    private boolean isConnected(
        List<List<Integer>> adjList, 
        int source,
        int target,
        boolean[] visited
    ) {
        visited[source] = true;

        // Cycle detected
        if (source == target) return true;

        boolean connected = false;
        for (int adj : adjList.get(source)) {
            if (!visited[adj])
                connected = connected || isConnected(adjList, adj, target, visited);
        }

        return connected;
    }
}

        // Make adj list
        // iterate over edges
        // check if edge is already is connected
        // connection means that we find it on a dfs path from 
        // the source to target node
        // if not connected then add to adj list
        // if it is connected return that edge
