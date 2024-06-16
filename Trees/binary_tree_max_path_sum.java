class Solution {
    private static int globalMax;

    public int maxPathSum(TreeNode root) {
        globalMax = root.val;
        maxPathSumHelper(root);

        // Time Complexity: O(n)
        // Space Complexity: O(n) 
        return globalMax;
    }

    private int maxPathSumHelper(TreeNode curr) {
        if (curr == null) return 0;

        // Perform Postorder DFS find max of left and right
        int maxL = maxPathSumHelper(curr.left);
        int maxR = maxPathSumHelper(curr.right);

        // Ignoring negative sum pathways and cut them off
        maxL = Math.max(maxL, 0);
        maxR = Math.max(maxR, 0);

        // We want to check if the current node possess the
        // biggest path sum if not we return an optimal route back to
        // parent node
        int localSum = maxL + maxR + curr.val;
        globalMax = Math.max(globalMax, localSum);

        // Return max of children plus current for biggest current path
        return Math.max(maxL, maxR) + curr.val;
    }
}
