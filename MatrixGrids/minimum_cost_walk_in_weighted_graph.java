class Solution {

    private int[] parent;
    private int[] depth;
    
    // Use union find
    public int[] minimumCost(int n, int[][] edges, int[][] query) {
        parent = new int[n];
        depth = new int[n];
        int[] cost = new int[n];

        for (int i = 0; i < n; i++)
        {
            parent[i] = -1;
            cost[i] = Integer.MAX_VALUE; // neutral number
        }

        for (int[] edge : edges)
        {
            union(edge[0], edge[1]);
        }

        // Bitwise add the weight of component
        for (int[] edge : edges)
        {
            int root = find(edge[0]);
            cost[root] &= edge[2]; 
        }

        int[] answer = new int[query.length];
        for (int i = 0; i < query.length; i++)
        {
            int root1 = find(query[i][0]);
            int root2 = find(query[i][1]);
            answer[i] = root1 == root2 ? cost[root1]: -1;
        }

        // 3 arrays only, and we are traverse each node at most once
        // Time Complexity: O(m + n)
        // Space Complexity: O(n) 
        return answer;
    }

    private int find(int node)
    {
        if (parent[node] == -1) return node;
        return find(parent[node]);
    }

    private void union(int node1, int node2)
    {
        int root1 = find(node1);
        int root2 = find(node2);
        if (root1 == root2) return;

        // comp with largest depth is always new rep
        if (depth[root1] < depth[root2])
        {
            int temp = root1;
            root1 = root2;
            root2 = temp;
        }

        // merge groups 
        parent[root2] = root1;
        
        // If the two roots are of the same depth increment.
        if (depth[root1] == depth[root2])
        {
            depth[root1]++;
        }
    }
}
