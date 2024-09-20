class Solution {
    public boolean isValidBST(TreeNode root) {
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return validate(root, null, null);
    }

    private boolean validate(TreeNode curr, Integer min, Integer max) {
        // Empty is valid
        if (curr == null) return true;

        // Compare the min so far and the max so far
        if (min != null && curr.val <= min) return false;
        if (max != null && curr.val >= max) return false;

        // Go right and update min, go left and update max
        return validate(curr.right, curr.val, max) && validate(curr.left, min, curr.val);
    }
}
