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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        inorderDFS(root, result);

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return result;
    }

    private void inorderDFS(TreeNode curr, List<Integer> result) {
        if (curr == null) return;

        inorderDFS(curr.left, result);
        result.add(curr.val);
        inorderDFS(curr.right, result);
    }
}
