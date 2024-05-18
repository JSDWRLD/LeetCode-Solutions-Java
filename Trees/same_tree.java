class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q== null || p.val != q.val) return false;

        // Logical AND of the results
        // Time Complexity: O(n)
        // Space Complexity: O(h)
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
