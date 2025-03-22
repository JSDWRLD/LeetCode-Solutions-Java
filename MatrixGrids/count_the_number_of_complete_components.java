class Solution {

    private int[] parent;
    private int[] size;

    public int countCompleteComponents(int n, int[][] edges) {
        parent = new int[n];
        size = new int[n];

        // O(n)
        for (int i = 0; i < n; i++) {
            parent[i] = -1;
            size[i] = 1;
        }

        // O(m)
        for (int[] edge : edges) {
            union(edge[0], edge[1]);
        }

        // O(n + m)
        HashMap<Integer, Integer> edgeCount = new HashMap<>();
        for (int[] edge : edges) {
            int root = find(edge[0]);
            edgeCount.put(root, edgeCount.getOrDefault(root, 0) + 1);
        }

        // O(n)
        int complete = 0;
        for (int vertex = 0; vertex < n; vertex++) {
            if (parent[vertex] == -1) {
                int expect = (size[vertex] *(size[vertex] - 1))/2;
                if (!edgeCount.containsKey(vertex)) complete++;
                else if (expect == edgeCount.get(vertex)) complete++;
            }
        }


        // Time Complexity: O(n + m)
        // Space Complexity: O(n)
        return complete;
    }

    private void union(int node1, int node2) {
        int root1 = find(node1);
        int root2 = find(node2);
        if (root1 == root2) return;

        if (size[root1] > size[root2]) {
            parent[root2] = root1;
            size[root1] += size[root2];
        } else {
            parent[root1] = root2;
            size[root2] += size[root1];
        }
    }

    private int find(int node) {
        if (parent[node] == -1) return node;
        return find(parent[node]);
    }
}
