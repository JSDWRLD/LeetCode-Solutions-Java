class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        boolean[] visit = new boolean[n]; // Keeps track of visited
        boolean[] inStack = new boolean[n]; // Keeps track of node currently ongoing

        for (int node = 0; node < n; node++) {
            dfs(node, graph, visit, inStack);
        }
        
        // dfs to check 
        List<Integer> safeNodes = new ArrayList<>();
        for (int node = 0; node < n; node++) {
            if (!inStack[node]) safeNodes.add(node);
        }
        
        // Time Complexity: O(v + e)
        // Space Complexity: O(v)
        return safeNodes;
    }

    // Detect cycle or unsafe nodes
    private boolean dfs(int node, int[][] edges, boolean[] visit, boolean[] inStack) {
        if (inStack[node]) return true; // true means node unsafe
        if (visit[node]) return false; // node visisted return false, already safe

        visit[node] = true; 
        inStack[node] = true;
        // for each neighbor of the vertex/node check
        for (int neigh : edges[node]){
            if (dfs(neigh, edges, visit, inStack)) return true; // if neigh has a cycle, return true
        }

        // inStack = false == safe node
        inStack[node] = false;
        return false;
    }
}

// Note terminal nodes
// traverse edges, then see if the vertex of the edge is terminal
// 0: [[1,2],
// 1: [2,3],
// 2: [5],
// 3: [0],
// 4: [5],
// 5: [], Terminal
// 6: []] Terminal
// array len is 0 == terminal note index as the number
// set: 5, 6
