class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        dfs(rooms, visited, 0); 
        
        for (int i = 0; i < visited.length; i++) {
            if (visited[i] == false) 
                return false;
        }

        // Time Complexity: O(v + e)
        // Space Complexity: O(v + e)
        return true;
    }

    public void dfs(List<List<Integer>> rooms, boolean[] visited, int curr) {
        visited[curr] = true;
    
        for (int neighbor : rooms.get(curr)) {
            if (visited[neighbor]) 
                continue;
            dfs(rooms, visited, neighbor);
        }
    }
}

// Vertices rooms
// Edges = keys
// Adj list already
// if we visit all vertices return true, else false
// DFS is fine too
