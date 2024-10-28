class Solution {
    public boolean validTree(int n, int[][] edges) {
        // 1st step is to create a Adj List to do DFS on Graph
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++)
            adjList.add(new ArrayList<>());
        
        for (int[] e : edges) {
            adjList.get(e[0]).add(e[1]);
            adjList.get(e[1]).add(e[0]);
        }

        // Stack will mimic the recursive call stack
        // Seen set is used to avoid a infinite loop
        Stack<Integer> stack = new Stack<>();
        Set<Integer> seen = new HashSet<>();
        stack.push(0); // 0 is the 1st node to start since 0-(n-1)
        seen.add(0);

        // Do DFS
        while (!stack.isEmpty()) {
            int node = stack.pop();

            // Check Adj List of current node
            for (int neighbor : adjList.get(node)) {
                // If we already seen our node its not a tree
                if (seen.contains(neighbor))
                    return false;
                
                // Add to stack to process node potentially
                stack.push(neighbor);
                seen.add(neighbor);

                // We must remove the link that goes in opposite direction
                // This will make sure our "Tree" has no cycles
                adjList.get(neighbor).remove(Integer.valueOf(node));
            }
        }
        // V is node, E is edge
        // Time Complexity: O(v + e)
        // Space Complexity: O(v + e)
        return seen.size() == n;
    }
}
