// This problem contains two solutions, the first is the iterative approach
// the second is the recursive approach. 

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

/*
class Pair {
    TreeNode node;
    int depth;

    public Pair(TreeNode node, int depth){
        this.node = node;
        this.depth = depth;
    }
}

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        // In this iterative DFS approach, we emulate the call stack
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, 1));

        int maxDepth = 0;

        while(!stack.isEmpty()){
            Pair temp = stack.pop();
            TreeNode node = temp.node;
            int depth = temp.depth;

            if(node != null){
                maxDepth = Math.max(maxDepth, depth);
                stack.push(new Pair(node.left, depth + 1));
                stack.push(new Pair(node.right, depth + 1));
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return maxDepth;
    }
}
*/

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}


