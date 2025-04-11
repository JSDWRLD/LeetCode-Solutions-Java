class Solution {
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) {
            return -1;
        }

        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < connections.length; i++) {
            adjList.get(connections[i][0]).add(connections[i][1]);
            adjList.get(connections[i][1]).add(connections[i][0]);
        }

        int sourceNodes = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                sourceNodes++;
                dfs(adjList, i, visited);
            }
        }


        // Minus the connected one
        // We know there are enough edges because connections.size() > n-1
        // Time Complexity: O(v + e)
        // Space Complexity: O(v + e)
        return sourceNodes - 1;
    }

    private void dfs(List<List<Integer>> adjList, int node, boolean[] visited) {
        visited[node] = true;

        for (int n : adjList.get(node)) {
            if (visited[n]) continue;
            visited[n] = true;
            dfs(adjList, n, visited);
        }
    }
}
