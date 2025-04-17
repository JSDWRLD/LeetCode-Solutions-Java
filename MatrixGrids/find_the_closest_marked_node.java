class Solution {
    public int minimumDistance(int n, List<List<Integer>> edges, int s, int[] marked) {

        Set<Integer> markedSet = new HashSet<>(); // V
        for (int i = 0; i < marked.length; i++) {
            markedSet.add(marked[i]);
        }
        
        // Make our graph, not the weights of each edge
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) { // V
            graph.add(new ArrayList<>());
        }

        // O(E)
        for (int i = 0; i < edges.size(); i++) {
            List<Integer> edge = edges.get(i);
            graph.get(edge.get(0)).add(new int[] {edge.get(1), edge.get(2)});
        }

        // V
        int[] dist = new int[n]; // stores distance of each edge so far
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[s] = 0;

        // In pq, we store dist at index 0 : vertex at index 1
        Queue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        pq.offer(new int[] {0, s}); // add our source node


        // iterate over pq, take min at each step then check if the node is marked
        // if marked then we can update min with the dist value
        while (!pq.isEmpty()) {

            int[] curr = pq.poll(); // O(v log v)
            int weight = curr[0];
            int vertex = curr[1];

            // if we find a marked vertex
            // immediately return since its min dist already
            if (markedSet.contains(vertex)) return dist[vertex];

            for (int[] neighbor : graph.get(vertex)) { // E 
                int neighVertex = neighbor[0];
                int neighWeight = neighbor[1];
                int nextWeight = neighWeight + weight;

                // Update the dist, and add to pq
                // this way vertices not reachable are never in PQ
                if (nextWeight < dist[neighVertex]) {
                    dist[neighVertex] = nextWeight;
                    // O(e log v)
                    pq.offer(new int[] {nextWeight, neighVertex}); 
                }
            }
        }

        // Time Complexity: O(vlogv + elogv)
        // Space Complexity: O(v + e)
        return -1;
    }   
}
