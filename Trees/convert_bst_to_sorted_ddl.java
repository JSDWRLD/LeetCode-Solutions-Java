/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/

class Solution {
    Node first = null;
    Node last = null;

    public Node treeToDoublyList(Node root) {
        if (root == null) return root;
        dfs(root);
        
        // Finish off our Double linked list
        last.right = first;
        first.left = last;

        // First will always be the smallest node
        // which is far left, our leftmost predecessor

        // Time Complexity: O(n)
        // Space Complexity: O(n) recursion stack
        return first;
    }

    // Inorder DFS traversal, left -> node -> right
    public void dfs(Node curr) {
        if (curr != null) {
            // Go far left first
            dfs(curr.left);

            // Process middle
            if (last != null) {
                // Linking predecessor with the current node
                last.right = curr;
                curr.left = last;
            } else {
                // This means we are far left in our 
                // dfs, which means that we should save the first node
                // of the Double linked list
                first = curr;
            }

            // Instantiate our last node
            last = curr;

            // Traverse right
            dfs(curr.right);
        }
    }
}
