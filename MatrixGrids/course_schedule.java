class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }

        // Fill our Graph, which is represented by adjList
        for (int i = 0; i < prerequisites.length; i++) {
            adjList.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        int[] visited = new int[numCourses]; // Keep track of cyclic
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0 && isCyclic(adjList, visited, i)) {
                return false;
            }
        }

        // We visit a vertice once, and then traverse its prereqs, prereqs are marked
        // as seen so that we don't have to repeat work, thanks to our visited array.
        // Time Complexity: O(v + p)
        // Space Complexity: O(v + p)
        return true;
    }

    // Returns if a graph is cyclic using DFS, 1 = not cyclic, 2 = cyclic
    private boolean isCyclic(List<List<Integer>> adjList, int[] visited, int curr) {
        if (visited[curr] == 2) return true;

        visited[curr] = 2;

        // DFS on neighbors on vertices
        for (int neighbor : adjList.get(curr)) {
            // Not 1 means that this is a new node we will do a DFS on
            if (visited[neighbor] != 1 && isCyclic(adjList, visited, neighbor)) {
                return true;
            }
        }

        visited[curr] = 1;
        return false;
    }
}
