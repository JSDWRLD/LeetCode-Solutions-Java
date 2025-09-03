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
    public boolean isCompleteTree(TreeNode root) {
        // bfs and when processing row, Found Null then we find another node false

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (q.peek() != null) {
            TreeNode curr = q.poll();
            q.offer(curr.left);
            q.offer(curr.right);
        }

        // remove all the nulls from Q
        while (!q.isEmpty() && q.peek() == null) {
            q.poll();
        }

        // If the q still has a non null after it is not complete
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return q.isEmpty();
    }
}
