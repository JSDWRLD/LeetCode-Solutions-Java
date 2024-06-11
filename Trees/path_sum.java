class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // Implement DFS
        if (root == null) return false;

        if (root.val == targetSum && (root.left == null && root.right == null)) {
            return true;
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n), essentially the call stack
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
