class Solution {
    public int closestValue(TreeNode root, double target) {
        int closest = root.val;
        int currVal = root.val;

        while (root != null) {
            double diffOne = Math.abs(root.val - target);
            double diffTwo = Math.abs(closest - target);
            
            if (diffOne < diffTwo) closest = root.val;
            if (diffOne == diffTwo && root.val < closest) closest = root.val;

            root = root.val > target ? root.left : root.right;
        }

        // Time Complexity: O(log n)
        // Space Complexity: O(1)
        return closest;
    }
}
