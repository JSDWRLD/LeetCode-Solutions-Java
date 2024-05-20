class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        // check function
        if(sameTree(root, subRoot)) return true;

        // we check if the left/right node's subtrees are equal to subroot
        // Time Complexity: O(n * m)
        // Space Complexity: O(n)
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    // This method runs in O(m) time and simply compares the trees
    private boolean sameTree(TreeNode root, TreeNode compare){
        if (root == null && compare == null) return true;
        if (root == null || compare == null || (root.val != compare.val)) return false;
        return sameTree(root.left, compare.left) && sameTree(root.right, compare.right);
    }
}
