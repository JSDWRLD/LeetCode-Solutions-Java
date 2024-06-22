class Solution {
    private int total;

    public int goodNodes(TreeNode root) {
        dfs(root, root.val);

        // Time Complexity: O(n)
        // Space Complexity: O(h)
        return total;
    }

    private void dfs(TreeNode curr, int max) {
        if (curr == null) return;

        if (curr.val >= max) total++;
        
        max = Math.max(curr.val, max);
        dfs(curr.left, max);
        dfs(curr.right, max);
    }
}
