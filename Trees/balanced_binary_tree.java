class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        // balance is height diff no more than 1
        if (getHeight(root) == -1) return false;

        // Time Complexity: O(n)
        // Space Complexity: O(h)
        return true;
    }

    private int getHeight(TreeNode root) {
        if (root == null) return 0;

        // DFS, goes down to lowest node and checks each subtree
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        if (leftHeight == -1 || rightHeight == -1) return -1;
        if (Math.abs(leftHeight - rightHeight) > 1) return -1;

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
