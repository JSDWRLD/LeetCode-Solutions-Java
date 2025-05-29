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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(root);

        while(!q.isEmpty()) {
            TreeNode num1 = q.poll();
            TreeNode num2 = q.poll();

            if (num1 == null && num2 == null) continue;
            if (num1 == null || num2 == null) return false;

            if (num1.val != num2.val) return false;
            q.add(num1.left);
            q.add(num2.right);
            q.add(num1.right);
            q.add(num2.left);
        }
        
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return true;
    }
}
