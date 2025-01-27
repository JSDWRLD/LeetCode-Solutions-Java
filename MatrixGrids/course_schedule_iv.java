class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        int[] indegree = new int[numCourses];

        // Add to adjList based on preqs
        for (int[] pair : prerequisites) {
            int preq = pair[0], course = pair[1];
            // if there is no list create then add course
            adjList.computeIfAbsent(preq, key -> new ArrayList<>())
                .add(course);
            indegree[course] += 1; // indegree of the course goes up more dependency
        }

        // Get the nodes we can start with, with no dependencies
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) q.offer(i);
        }

        Map<Integer, HashSet<Integer>> nodePreqs = new HashMap<>();
        // O(n)
        while (!q.isEmpty()) {
            int currNode = q.poll();
            // O(n)
            for (int adj : adjList.getOrDefault(currNode, new ArrayList<>())) {
                nodePreqs.computeIfAbsent(adj, key -> new HashSet<>())
                    .add(currNode);
                // Add the preqs of the currNode to the current adj node O(n)
                for (int preq : nodePreqs.getOrDefault(currNode, new HashSet<>())) {
                    nodePreqs.get(adj).add(preq);
                }

                // Subtract indegree of the adjlist
                indegree[adj] -= 1;
                if (indegree[adj] == 0) q.offer(adj);
            }
        }
        
        List<Boolean> queryResults = new ArrayList<>(queries.length);
        for (int[] query : queries) {
            queryResults.add(nodePreqs.getOrDefault(query[1], new HashSet<>())
                .contains(query[0]));
        }

        // Time Complexity: O(N^3 + Q)
        // Space Complexity: O(N^2)
        return queryResults;
    }
}


// Build adj list
// start at 0 to numcourses
// then for each query check first num see if it contains
// adj list should have a set we add to to prevent loop 
