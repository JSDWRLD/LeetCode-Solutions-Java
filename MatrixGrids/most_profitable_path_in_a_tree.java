class Solution {

    private HashMap<Integer, Integer> bobMap;
    private boolean[] visited;
    private HashMap<Integer, ArrayList<Integer>> adjList;

    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        bobMap = new HashMap<>();
        visited = new boolean[amount.length];
        adjList = new HashMap<>();

        // O(n)
        for (int i = 0; i < amount.length; i++) {
            adjList.put(i, new ArrayList<Integer>());
        }

        // O(n)
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        // Pass is start position and steps taken
        calcBobPath(bob, 0);
        Arrays.fill(visited, false); // Reset visited array 

        Queue<int[]> queue = new LinkedList<>(); // O(n)
        queue.add(new int[] {0,0,0});

        // O(n) manner BFS
        int max = Integer.MIN_VALUE;
        while (!queue.isEmpty()) {
            int[] curr = queue.remove();
            int node = curr[0];
            int steps = curr[1];
            int income = curr[2];
            visited[node] = true;

            // if the amount of stpes bob took to get to the node
            // alice is on is the same then half the amount
            // else add the full amount to income
            if (!bobMap.containsKey(node) || steps < bobMap.get(node) ) {
                income += amount[node];
            } else if (steps == bobMap.get(node)) {
                income += amount[node]/2;
            }

            if (adjList.get(node).size() == 1 && node != 0) {
                max = Math.max(max, income);
            }

            // Go through the adjlist and mark visited as we go
            for (int neigh : adjList.get(node)) {
                if (!visited[neigh]) {
                    queue.add(new int[] {neigh, steps+1, income});
                }
            }

            
            visited[node] = true;
        }
        
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return max;
    }

    // Is always a set pathway // O(n) DFS
    private boolean calcBobPath(int currNode, int steps) {
        bobMap.put(currNode, steps);
        visited[currNode] = true;

        if (currNode == 0) return true;
        
        for (int neigh : adjList.get(currNode)) {
            if (!visited[neigh]) {
                if (calcBobPath(neigh, steps+1)) return true;
            }
        }

        // If this path fails reset
        bobMap.remove(currNode);
        return false;
    }
}
