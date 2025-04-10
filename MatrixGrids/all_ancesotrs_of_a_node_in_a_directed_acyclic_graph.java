class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        // v + e 
        int[] indegree = new int[n];
        for (int i = 0; i < edges.length; i++) {
            adjList.get(edges[i][0]).add(edges[i][1]);
            indegree[edges[i][1]]++;
        }

        // v
        Queue<Integer> sourceNodes = new LinkedList<>();
        for (int i =0; i < n; i++) {
            if (indegree[i] == 0) sourceNodes.add(i);
        }

        // v + e
        List<Integer> topologicalOrder = new ArrayList<>();
        while (!sourceNodes.isEmpty()) {
            int curr = sourceNodes.remove();
            topologicalOrder.add(curr);

            // Iterate through children
            for (int child : adjList.get(curr)) {
                indegree[child]--;
                if (indegree[child] == 0) sourceNodes.add(child);
            }
        }

        // v 
        List<List<Integer>> ancestorsList = new ArrayList<>();
        List<Set<Integer>> ancestorsSetList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ancestorsList.add(new ArrayList<>());
            ancestorsSetList.add(new HashSet<>());
        }

        // V^2 + e
        for (int node : topologicalOrder) {
            for (int neighbor : adjList.get(node)) {
                ancestorsSetList.get(neighbor).add(node);
                // Add all ancestors of the parent node
                ancestorsSetList.get(neighbor).addAll(ancestorsSetList.get(node));
            }
        }

        // For each node's set list, check if it contains the node
        // add to the resulting ancestor list
        for (int i = 0; i < n; i++) {
            for (int node = 0; node < n; node++) {
                if (node == i) continue;
                if (ancestorsSetList.get(i).contains(node)) {
                    ancestorsList.get(i).add(node);
                }
            }
        }

        // Time Complexity: O(v^2 + e)
        // Space Complexity: O(v^2 + e)
        return ancestorsList;
    }
}
