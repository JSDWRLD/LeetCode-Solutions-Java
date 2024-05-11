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
    public TreeNode invertTree(TreeNode root) {

        if(root == null) return root;

        invertTree(root.left);
        invertTree(root.right);

        // this would do the final swap but would swap the trees in the recursion
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Time Complexity: O(n)
        // Space Complexity: O(h), height of tree
        return root;
    }
}
