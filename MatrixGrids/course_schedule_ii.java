class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // AdjList for graph, and Indegree to keep track of how many
        // edges point to each vertice.
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        int[] indegree = new int[numCourses]; 
        int[] output = new int[numCourses];

        for (int i = 0; i < prerequisites.length; i++) {
            int course = prerequisites[i][0];
            int prereq = prerequisites[i][1];

            // Building a adjList that has prereqs as vertices,
            // and the courses that require them as edges
            List<Integer> temp = adjList.getOrDefault(prereq, new ArrayList<>());
            temp.add(course);
            adjList.put(prereq, temp);

            // The indegree of a course is updated each time it is found in the list
            // Indegree is how many courses require a certain prereq, how many
            // edges that point to it basically.
            indegree[course] += 1;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            // Basically we need to start our BFS, at a 
            // vertice that doesn't have any pre reqs
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        int i = 0;
        while (!queue.isEmpty()) {
            // A vertice is only in the Queue when it has a indegree of 0
            // if a vertice has a indegree of 0 that means it doens't 
            // have any courses before it, topologically
            int vertice = queue.poll();
            output[i] = vertice;
            i += 1;

            if (adjList.containsKey(vertice)) {
                for (int n: adjList.get(vertice)) {
                    indegree[n] -= 1;

                    // If the in-degree of a neighbor becomes 0, we may add it to the Q
                    // That way we can put it in our output
                    if (indegree[n] == 0) {
                        queue.add(n);
                    }
                }
            }
        }

        if (i == numCourses) {
            return output;
        }

        // Time Complexity: O(v + e)
        // Space Complexity: O(v + e)
        return new int[0];
    }
}
