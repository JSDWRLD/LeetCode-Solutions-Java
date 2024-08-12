/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    private HashMap<Integer, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        // Base Case empty
        if (node == null) return null; 
        // Case Two seen node already and added it to graph clone
        if (map.containsKey(node.val)) return map.get(node.val);

        // Create a copy of current node
        Node toAdd = new Node(node.val);
        map.put(node.val, toAdd); // Add to map, mark as seen

        // Iterate and run dfs on neighbors list
        for (Node neigh : node.neighbors) {
            toAdd.neighbors.add(cloneGraph(neigh));
        }

        // Time Complexity: O(v * e)
        // Space Complexity: O(v * e)
        return toAdd;
    }
}
