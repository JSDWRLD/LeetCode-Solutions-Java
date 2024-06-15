class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Time Complexity: O(log n)
        // Space Complexity: O(n) represents call stack
        return lca(root, p, q);
    }
    
    private TreeNode lca(TreeNode curr, TreeNode p, TreeNode q) {
        if (curr == null) return null;

        if (p.val < curr.val && q.val < curr.val) {
            // recurse left
            return lca(curr.left, p, q);
        } else if (p.val > curr.val && q.val > curr.val) {
            // recurse right
            return lca(curr.right, p, q);
        }

        // if noth if checks fail, that means p and q's values diverge
        // into different subtrees
        return curr;
    }
}
