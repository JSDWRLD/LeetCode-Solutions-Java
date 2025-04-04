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
class Solution {
    public TreeNode lcaDeepestLeaves(TreeNode root) {

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return helper(root).getKey();
    }

    private Pair<TreeNode, Integer> helper(TreeNode node) {
        if (node == null) return new Pair<>(null, 0);
        Pair<TreeNode, Integer> left = helper(node.left);
        Pair<TreeNode, Integer> right =helper(node.right);

        // Only update the final pair if the depth is greater
        if (left.getValue() > right.getValue()) {
            return new Pair<>(left.getKey(), left.getValue() + 1);
        }

        if (right.getValue() > left.getValue()) {
            return new Pair<>(right.getKey(), right.getValue() + 1);
        }

        // Else we are on a leaf, return the current node
        return new Pair<>(node, left.getValue()+1);
    }
}
